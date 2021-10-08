import java.util.*;

class CollectionSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Red");
		hs1.add("Maroon");
		hs1.add("Green");
		hs1.add("Yellow");

		HashSet<String> hs2=new HashSet<>();
		hs2.add("Purple");
		hs2.add("Magenta");
		hs2.add("Maroon");
		hs2.add("Magenta");
		hs2.add("Cyan");

		System.out.println("HashSet Collection1 : "+hs1);
		System.out.println("\nHashSet Collection2 : "+hs2);

		hs1.addAll(hs2);
		System.out.println("\nResult ArrayList After Merge : "+hs1);

	}
}
