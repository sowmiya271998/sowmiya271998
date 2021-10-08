import java.util.LinkedList;

class LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> li=new LinkedList<>();
		li.add(2);
		li.add(5);
		li.add(7);
		li.add(1,3);

		System.out.println(li+"\n");

		System.out.println("After adding first element : ");
		li.addFirst(1);
		System.out.println(li+"\n");

		System.out.println("After adding last element : ");
		li.addLast(10);
		System.out.println(li+"\n");

		System.out.println("After deleting First element : ");
		li.removeFirst();
		System.out.println(li+"\n");

		System.out.println("After deleting last element : ");
		li.removeLast();
		System.out.println(li+"\n");

		System.out.println("After remove elements using index value 2 ");
		li.remove(2);
		System.out.println(li+"\n");

		System.out.println("Size of the array is : "+li.size());
	

	}
}
