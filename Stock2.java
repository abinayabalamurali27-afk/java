class Stock2 
{
	public static  void maxProfit(int a[])
	{
		int n=a.length,maxPRrofit=0,min= Integer.MAX_VALUE;
		int maxProfit=0;
		for (int i=0;i<n-1 ;i++ )
		{
			min=Math.min(min,a[i]);
			int profit=a[i]-min;
			maxProfit=Math.max(profit,maxProfit);
			
		}
		System.out.println(maxProfit);
	}
	public static void main(String[] args) 
	{
		int a[]={7,1,5,3,6,4};
		maxProfit(a);
	}
}
