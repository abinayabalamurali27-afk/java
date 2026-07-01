import java.util.Arrays;
class LeftShift 
{
	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int first=arr[0];
		
		for (int i=1;i<n ;i++ )
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=first;
		System.out.println(Arrays.toString(arr));
	}
}
