import java.util.*;  
class Duplicate{

	public static void  Dup(int [] arr)
	{
        // array = ArrayUtils.remove(array, index);
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        while(i < (n-1))
        {
            if(arr[i] == arr[i+1])
            {
                arr[i] = -1;
            }
            i++;
        }

        i = 0;
        int j = 0;
        
        while(i<n)
        {
            if(arr[i] != -1)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

        for(int k=0 ; k<j ; k++)
        {
            System.out.print(arr[k]+" ");
        }
	}
	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n=in.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
        Dup(arr);
	}
}