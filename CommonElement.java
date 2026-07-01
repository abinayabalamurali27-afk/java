import java.util.Arrays;
class CommonElement 
	{
    public static void commonElement(int a[],int b[])
	 {
		int n=a.length;
	    int i=0;
		int j=0;
		while (i < a.length && j < b.length)
			{

            if (a[i] == b[j])
			{
				System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if (a[i] < b[j]) 
			{
                i++;
            }
            else 
			{
                j++;
            }
        }
	}
		public static void main(String[] args)
		{
		int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 3, 5, 7, 9};
		commonElement(a,b);
	   }
}
