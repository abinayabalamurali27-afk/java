import java.util. Arrays;
class MergeTwoSort 
{
	public static void mergeTwoSort(int a[],int b[],int c[])
	{
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
				{
				 c[k]=b[j];
				 j++;
				 k++;
				}
		}
	
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
			
	}
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int b[]={20,40,60,70,80,90};
		int c[]=new int [a.length +b.length];
		mergeTwoSort(a,b,c);
	    System.out.println(Arrays.toString(c));
	}
}
	
