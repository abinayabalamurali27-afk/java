class SumOfAllPairs 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		int n=a.length;
		int maxSum=Integer.MIN_VALUE;
		for (int i=0;i<n ;i++ )
		{
			int sum=0;
			for (int j=i+1;j<n ;j++ )
			{
				sum=a[i]+a[j];
				maxSum=Math.max(sum,maxSum);
				//System.out.print(a[i]+","+a[j]+"   ");
				System.out.println(sum);
			}
		}
		
		System.out.println( "Maximum pairs of sum is:" +maxSum);
		
	}
}
