import java.util.*; 

public class Collection   
{  
	public static void main(String[] args)   
		{

			Scanner s=new Scanner(System.in); 
			System.out.println("Enter the length of Array ");
			int l=s.nextInt();

			ArrayList<Integer> arr=new ArrayList<Integer>();
			System.out.println("\nEnter the elements of the ArrayList ");
			
			for(int i=0; i<l; i++)  
			{  
				int a=s.nextInt();
				arr.add(a);
			}  
			System.out.println("\n"+"Output : "+arr+"\n");  
		}  
}  
 