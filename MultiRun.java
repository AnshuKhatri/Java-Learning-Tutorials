package classDemo;

class ThreadRun implements Runnable
{
	String name;
	ThreadRun(String s)
	{
		name=s;
		Thread t=new Thread(this,name);
		t.start();
		
	}
	
	public void run()
	{
		try{
			for(int i=0;i<5;i++) 
			{
				System.out.println("Child Thread i: "+ i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Caught: "+e);
		}
	
		System.out.println("Child Thread Existing");
		
	}
}

public class MultiRun {
	public static void main(String str[])
	{
		
		new ThreadRun("ChildThread");
		

	try
	{
		for(int i=0;i<5;i++) 
		{
			System.out.println("Main Thread i: "+ i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Caught: "+e);
	}

	System.out.println("Main Thread Existing");
}

}
