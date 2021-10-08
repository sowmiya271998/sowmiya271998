import java.util.*;
public class HashMapCheck {

    public static void main(String args[])
		{
		Scanner s= new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println("Enter the size of HashMap : ");
		int size =s.nextInt();
		 
		System.out.println("Enter String values");
		int keyvalue=101;
		for(int i=0;i<size;i++)
			{
			  String a=s.next();
			  hm.put(keyvalue+i,a);
			}
        System.out.println(hm);

        System.out.println("\nPlease enter a key to check in HashMap");
        int key = s.nextInt();

        if (hm.containsKey(key)) {
            System.out.println("\nGiven key exits in HashMap");
        } else {
            System.out.println("\nGiven key doesn't exists in HashMap");
        }       


    }

}
