/*import java.util.*;

class CheckArrayList 
{
   public static void main(String[] args)
	   {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the element to check ");
	  int b=s.nextInt();
      ArrayList<Integer> a = new ArrayList<>();
      a.add(7);
      a.add(8);
      a.add(9);
      System.out.println("The element "+ b +" is available in ArrayList? \n" + a.contains(b));
       }
}

import java.util.*;

class CheckArrayList
{
   public static void main(String[] args)
	   {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the element to check ");
		int b=s.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(7);
	    a.add(8);
        a.add(9);
		if(a.contains(b))
		   {
			System.out.println(b+" is Present in the array");
		   }
		else
		   {
			System.out.println(b+" is not Present in the array");
		   }
	   }
}
*/
import java.util.*;

class CheckArrayList
{
   public static void main(String[] args)
	   {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an Array ");
		int size=s.nextInt();

	
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++)
		   {
			a.add(s.nextInt());
		   }
		
		System.out.println("Enter the element to check ");
		int b=s.nextInt();

		if(a.contains(b))
		   {
			System.out.println(b+" is Present in the array");
		   }
		else
		   {
			System.out.println(b+" is not Present in the array");
		   }
	   }
}