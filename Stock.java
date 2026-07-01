class Stock 
{
	public static  void maxProfit(int a[])
	{
		int n=a.length,maxPRrofit=0;
		int maxProfit=0;
		for (int i=0;i<n-1 ;i++ )
		{
			for (int j=i+1;j<n ;j++ )
			{
				int profit=a[j]-a[i];
				//System.out.println(profit);
				maxProfit=Math.max(profit,maxProfit);
			}
		}
		System.out.println(maxProfit);
	}
	public static void main(String[] args) 
	{
		int a[]={7,1,5,3,6,4};
		maxProfit(a);
	}
}
