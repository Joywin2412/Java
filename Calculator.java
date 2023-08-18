import java.util.Scanner;  
class Calculator{
	public static void  Calculator(int choice , int choice2)
	{
        Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		switch(choice)
		{
			case 0:
				switch(choice2)
				{
					case 0:
						System.out.println(num1 + num2);
                        break;
					case 1:
						System.out.println(num1 - num2);
                        break;
					case 2:
						System.out.println(num1 / num2);
                        break;
					case 3:
						System.out.println(num1 * num2);
                        break;
                    default:
                        break;
				}
            break;
			case 1:
				switch(choice2)
				{
					case 0:
						System.out.println(num1 & num2);
                        break;
					case 1:
						System.out.println(~num1);
                        break;
					case 2:
						System.out.println(num1 ^ num2);
                        break;
                    default:
                        break;
				}
            break;
		}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int choice2 = sc.nextInt();
		Calculator(choice,choice2);
	}
}
	