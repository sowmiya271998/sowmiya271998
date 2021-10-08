class import java.util.*;

public class StringToArrayList 
{
	   public static void main(String args[]) 
	   {
	      String[] a = {"India", "USA", "UAE", "CANADA", "AUSTRALIA"};
	      
	      List<String> al = Arrays.asList(a);
	      System.out.println("\nAfter Conversion "+al);
	      
	      Collections.reverse(al);
	      System.out.println("\nAfter Reverse "+al);

	   }  
}


 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
