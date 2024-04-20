package classDemo;


class Callme{
	
	//synchronized 
	void called(String msg)
	{
		System.out.print("{"+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("}");
	}
}

class Calling implements Runnable
{
	String msg;
	Callme obj;
	Thread t;
	Calling(Callme ob,String m)
	{
		msg=m;
		obj=ob; 
		 t=new Thread(this);
		t.start();
				
	}
 public void run()
 {
	 synchronized(obj) {
	 obj.called(msg);
	 }
	 
 }
}

public class SynDemo {
	
	public static void main(String str[]) {
	Callme ob=new Callme();
	Calling o1=new Calling(ob,"Hello");
	Calling o2=new Calling(ob,"Anshu");
	
	try
	{
		o1.t.join();
		o2.t.join();
	}
	catch(InterruptedException e)
	{
		System.out.println("Caught: ");
	}

}
}
