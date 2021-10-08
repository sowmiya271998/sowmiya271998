import java.util.*;

public class HashMapPgm
{
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the size of an HashMap ");
	 int size=s.nextInt();

	
	 HashMap<Integer, String> hm=new HashMap<>();
	 System.out.println("Enter "+size+" values");
	 for(int i=0;i<size;i++)
	   {
		 int n=s.nextInt();
		 String c=s.next();
		 hm.put(n, c);
	   }
	 System.out.println("\nHashMap Pair"+hm);
	 
	 hm.put(4,"Canada");
	 System.out.println("\nHashMap After Updation"+hm);
	 
	 String remove=hm.remove(2);
	 System.out.println("\nHashMap After Deletion "+hm);
	 
	 System.out.println("\nHashMap After KeySet "+hm.keySet()); 
	 
 }
}