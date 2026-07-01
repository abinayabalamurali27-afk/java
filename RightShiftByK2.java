import java.util.Arrays;
class RightShiftByK2 
{
	public static void rightShift(int arr[],int b[],int k)
	{
		int n=arr.length;
		
		for (int i=0;i<n ;i++ )
		{
			b[(i+k)%n]=arr[i];
		}
		
	}
	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50};
		int b[]=new int [arr.length];
		int k=3;
		rightShift(arr,b,k);
	    System.out.println(Arrays.toString(b));
	}
}
	
