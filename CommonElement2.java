import java.util.Arrays;
class CommonElement2 
	{
    public static void commonElement2(int a[],int b[],int c[])
	 {
		int n=a.length;
	    int i=0;
		int j=0;
		int k=0;
		
		while (i < a.length && j < b.length && k < c.length)
			{

            if (a[i] == b[j] && b[j]==c[k])
			{
				System.out.print(a[i]+ " ");
                i++;
                j++;
				k++;
            }
            else if (a[i] < b[j]) 
			{
                i++;
            }
			else if (b[j]< c[k])
				{
					j++;
				}
            else 
			{
                k++;
            }
        }
	}
		public static void main(String[] args)
		{
		int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 3, 5, 7, 9}; 
		int c[]={2,4,5};
		commonElement2(a,b,c);
	   }
}