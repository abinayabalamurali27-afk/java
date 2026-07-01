import java.util.Arrays;
class WaterContainer
{
	
	public static void main(String[] args) 
	{
		int h[]={1,8,6,2,5,4,8,3,7};
		int n=a.length;
		int waterLevel=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n ;j++ )
			{
				int h=Math.min(a[i],a[j]);
				int w=j-i;
				int area=h*w;
				waterLevel=Math.max(area,waterLevel);
				System.out.println(area);
			}
		}
		System.out.println(waterLevel);
	}
}
