import java.util.*;

class ExceptionThrows 
{
	public void checkMarriageCriteria(int age) throws InputMismatchException
	{
		if(age>0)
		{
			if(age<20)
			{
				System.out.println("At this age,you are not eligible to Marry!");
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
	
	public static void main(String[] args) 
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age Here");
		int age=s.nextInt();
		ExceptionThrows a=new ExceptionThrows();
		a.checkMarriageCriteria(age);	
		}
		catch(InputMismatchException e)
		{
		e.printStackTrace();
		}
	}
}

