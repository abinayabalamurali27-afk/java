import java.util.Arrays;                                                 
class TwoSum 
{
	public static boolean twoSum(int a[],int target)
	{
		for (int i=0; i<a.length-1;i++ )
		{
			if(a[i]+a[i+1]==target)
			{
				return true;
			}
		}
		return false;
		}
		public static void main (String[] args)
	{
			int a[]={4,6,5,2};
			int target=7;
			System.out.println(twoSum(a,target));
	}
}
		
/// triplet summ task