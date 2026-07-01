import java.util.Arrays;
class RightShiftByK 
{
	public static void rightShift(int[] arr,int k)
	{
		int n=arr.length;
		k=k%n;
		for(int j=1;j<=k;j++)
		{
		int last =arr[n-1];
		for(int i=n-2;i>=0;i--)
			{
			arr[i+1]=arr[i];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50};
		int k=3;
		rightShift(arr,k);
	}
}
