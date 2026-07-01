class MaximumValue 
{
	public static void main (String[]args)
	{
	int arr[]={5,2,6,3,10,8,7};
	int n=arr.length;
	int largest=Integer.MIN_VALUE;
	for (int i=0;i<n;i++)
	{
		if(arr[i]>largest)
			largest=arr[i];
	}
	System.out.println("largest is:"+largest);
	}
}
