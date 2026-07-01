class WaterContainer
{
	public static void maxArea(int h[])
	{
		
		int n=a.length;
		for (int i=0;i<n ;i++)
		{
			for (int j=i+1; j<n; j++)
			{
				int w=j-i;
				int h=Math.min(a[j],a[j]);
				int area=h*w;
				waterLevel=Math.max(area,waterLevel);
				System.out.println(area);
					
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int h[]={1,8,6,2,5,4,8,3,7};
		int waterLevel=Integer.MIN_VALUE;
		System.out.println(waterLevel);
	}
}
