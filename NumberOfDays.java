import java.util.Scanner;
class NumberOfDays{
	
	static void days(String month , int year)
	{
		String month_arr[] = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August",
		"September" , "October" , "November" , "December"};
		
		if((year%400 ==0) || ((year%100!=0) && (year%4==0)))
		{
			// leap year code
			int days_now = 0;

		 	for(int i=0 ; i<month_arr.length ; i++)
			{

				if(month_arr[i].equals(month))
				{
					

					if(i == 1)
					{	
						System.out.println(29);
					}
					else{
						if(i%2 == 0)
						{
							
							System.out.println(31);
						}
						else{
							System.out.println(30);
						}
						
						
					}
				}
			}
			
			
		}
		else{
			int days_now = 0;
		 	for(int i=0 ; i<month_arr.length ; i++)
			{
				if(month_arr[i].equals(month))
				{
					if(i == 1)
					{
						System.out.println(28);
					}
					else{
						if(i%2 == 0)
						{
							System.out.println(31);
						}
						else{
							System.out.println(30);
						}
					}
				}
			}
			
		}

	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
    		String month = scanner.nextLine();
		int year = scanner.nextInt();
		days(month,year);
		
	}
}
	