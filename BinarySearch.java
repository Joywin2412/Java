class BinarySearch{
	public static void main(String [] args)
	{
		int arr[]  = {2,3,4,5,7,9};
		// Insertion
		int target = 4;
		int low = 0 , high = 4;
		while(low <= high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid] < target)
			{
				mid = low+1;
			}
			else if(arr[mid] > target)
			{
				mid = high-1;
			}
			else{
			System.out.println(arr[mid]);
			break;
			}
		}
	}
}