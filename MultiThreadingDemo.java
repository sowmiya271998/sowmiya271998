class MultiThreadingDemo extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++ )
		{
		System.out.println(" I am Thread "+i+" Run by Thread Class");
		}
	}
	public static void main(String[] args) 
	{
		MultiThreadingDemo t=new MultiThreadingDemo();
		t.start();
	}
}
