class MutliThreadRunnable implements Runnable
{
	public void run()
	{
		for (int i=1;i<=5;i++ )
		{
		System.out.println("I am Thread "+i+" Run by Runnable Interface");
		}
	}
	public static void main(String[] args) 
	{
		MutliThreadRunnable r=new MutliThreadRunnable();
		Thread t=new Thread(r);
		t.start();
	}
}

