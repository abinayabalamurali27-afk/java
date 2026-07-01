class SubArray 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for (int j=i;j<n ;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=a[i]+a[j];
				
					System.out.print(a[k]+" ");
				}
				System.out.println("Maximum SubArray of sum is:" +sum);
			}
		}
	}
}
