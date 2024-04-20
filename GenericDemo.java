package classDemo;

class Test<T extends Number>
{
T value;

Test(T v)
{
value=v;	
}
void getValue()
{

	System.out.println("Value is: "+value);
}

}

public class GenericDemo {
	
	public static void main(String str[])
	{
		
		Test<Integer> tobj=new Test<Integer>(1000);
		tobj.getValue();
		
		
		
		//Test<String> ts=new Test<String>("Hello");
		//ts.getValue();
	}

}
