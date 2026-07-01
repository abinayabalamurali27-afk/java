import java.util.Arrays;
class SortColour1 
{
	public static void sort(int a[]) 
	{
		int i=0;
		int j=a.length-1;
		int k=0;
		while(k<j)
		{
			if(a[k]==1)
			{
				k++;
			}
			else if(a[k]==2)
				{
				int temp=a[k];
			      a[k]=a[j];
				  a[j]=temp;
				  j--;
			}
			else{
				int temp1=a[k];
					a[k]=a[i];
				    a[i]=temp1;
					i++;
					k++;
			}
			
		}
	}
	public static void main (String[]args)
	{
		int a[]={1,2,0,1,0,2,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
