package classDemo;


class MultiThread extends Thread
{
	String name;
	
	MultiThread(String s)
	{
		
		super(s);
		System.out.println("Thread name: "+this.getName() +"Priority: "+ this.getPriority());
		start();
	}
 public void run()
 {
	 try
		{
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
public class ThreadDemo {
	
	
	public static void main(String str[])
	{
		
		new MultiThread("myThread");
		
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
