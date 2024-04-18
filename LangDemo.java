package classDemo;

import java.lang.*;

public class LangDemo {
	
	
	public static void main(String str[])
	{
	// Boolean
	boolean b=true;
	
	
	//Boolean bool1 = new Boolean(b); deprecated
	Boolean bobj=Boolean.valueOf(b);
	System.out.println("Boolean: "+bobj);
	
	//Integer in=new Integer("10");
	
	int n=10;
	Integer in=Integer.valueOf(n);
	
	System.out.println("Integer: "+in);
	
	//Float f=new Float("");
	//Double d=new Double("");
	float f=10;
	Float fobj=Float.valueOf(f);
	
	System.out.println("Integer: "+fobj);
	
	String s="111";//"Hello";
	int ns=Integer.parseInt(s);
	
	System.out.println("String parse: "+ns);
	
	Integer inobj=2;
	String sobj=Integer.toBinaryString(inobj);
	

	System.out.println("String binary: "+sobj);
	
	System.out.println("get Runtime: "+ Runtime.getRuntime());
	
	// Printing the number of total bytes
    System.out.println(
        "total memory: " + Runtime.getRuntime().totalMemory());
	
	
}
	

}
