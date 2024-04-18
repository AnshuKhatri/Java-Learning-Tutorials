package classDemo;


class MyException extends Exception
{
	
	String name;
 MyException(String s)
 {
	 name=s;
 }
 
 public String toString()
 {
	return name;
	 
 }
}
public class ExceptionDemo {
	
	static void show() throws MyException
	{
		MyException n= new MyException("Own Exception");
		n.initCause(new ArithmeticException("xyz"));
		throw n;
	}
	
	public static void main(String str[])
	{
		try
		{
			show();
		}
		catch(MyException m)
		{
			System.out.println("caught: "+m);
			System.out.println("caught: "+m.getCause());
		}
		
	}

}
