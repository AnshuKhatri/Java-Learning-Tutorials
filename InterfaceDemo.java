package classDemo;

class CallCheck implements Call
{
	public int num=100;
	public void showCall()
	{
		System.out.println("CallBack Interface"+CallBack.num);
	}
	public void showCall2()
	{
		System.out.println("Call Number:" +num);
	}

}

public class InterfaceDemo{
	
	public static void main (String str[])
	{
		System.out.println("Interface Demo: ");
		CallCheck c=new CallCheck();
		c.showCall();
		c.showCall2();
	}

}
