class Sorting{
	public static void main(String [] args)
	{
		int arr[]  = {5,4,3,7,2};
		// Insertion
		for(int i=0 ; i<5 ; i++)
		{
			int curr = i;
			while(curr >= 1)
			{
				if(arr[curr-1] > arr[curr])
				{
					int temp = arr[curr-1];
					arr[curr-1] = arr[curr];
					arr[curr] = temp;
				}
			curr--;
			}
		}
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(arr[i]);
		}
		String newline = System.lineSeparator();
        	System.out.println(newline);
		int j = 4;
		for(int k=0 ; k<5 ; k++)
		{
			int min_idx = -1;
			int min_value = -1;
			for(int i=0 ; i<=j ; i++)
			{
				if(arr[i] > min_value)
				{
					min_idx = i;
					min_value = arr[i];
				}
			}
			if(min_idx!=-1)
			{
				int temp = arr[min_idx];
				arr[min_idx] = arr[j];
				arr[j] = temp;
			}
			--j;
		}

		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}