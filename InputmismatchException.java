import java.util.*;

class InputmismatchException 
{
	public void checkMarriageCriteria(int age)
	{
	try
	{
		if(age>0)
		{
			if(age<20)
			{
				throw new Exception();
			}
			else if(age>20 && age<30)
			{		
			System.out.println("Perfect age to Marry!");
			}
			else if(age>30)
			{
				System.out.println("No Need to Marry!");
			}
		}
		else
		{
			System.out.println("Enter the valid Age");
		}	
	}
	catch(Exception e)
	{
		System.out.println("At this age,you are not eligible to Marry!");
	}
	}
	
	public static void main(String[] args) 
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age Here");
		int age=s.nextInt();
		InputmismatchException a=new InputmismatchException();
		a.checkMarriageCriteria(age);	
		}
		catch (InputMismatchException e)
		{
			System.out.println("Enter the Integer Value");
		}
	}
}
