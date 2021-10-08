
class ArrayExample 
{
	public static void main(String[] args) 
	{
        int a[] = {5,6,9,8,2}; 
       
         for(int i=0;i<=4;i++)
		{
        System.out.println("Element at "+i+" is : "+a[i]);
		}
		  
    for(int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]+"\t");
		}
	}
}
