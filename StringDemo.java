package classDemo;

public class StringDemo {
	public static void main(String str[])
	{
		String msg;
		msg="Hello";
		
		char c1[]={'J','A'};
		String s1=new String(c1);
		
		System.out.println("Message s1 is: "+s1);
		
		byte c2[]={65,66,67,68};
		String s2=new String(c2);
		System.out.println("Message s2 is: "+s2);
		
		//find at index
		
		char ch=msg.charAt(0);
		
		System.out.println("char At is: "+ ch);
		
		//substring
		
		System.out.println("Substring is: "+ msg.substring(1,3));
		
		//concat
		
		msg += " Anshu";
		System.out.println("Substring is: "+ msg);
		
		//equals
		
		System.out.println("msg equals s1 is: "+ s1.equals(msg));
		
		//startsWith endsWith
		
		System.out.println("msg startsWith is: "+ msg.startsWith("He"));
		System.out.println("msg endsWith is: "+ msg.endsWith("Anshu"));
		
		//replace
		
		System.out.println("s1 replace is: "+ s1.replace('J', 'K'));
		
		//compare to
		
		System.out.println("compare to: "+ s2.compareTo(s1));
		
		//length
		
		System.out.println("Length of s2 : "+ s2.length());
		
		//StringBuffer
		
		StringBuffer sb=new StringBuffer("Try more");
		System.out.println("String buffer demo: "+sb);
		
		//append
		
		System.out.println("String buffer append: "+sb.append(" Yes"));
		
		//replace
		
		System.out.println("String buffer append: "+sb.replace(0, 3, "Hey"));
		
		System.out.println("String buffer length: "+sb.length() + " capacity: "+ sb.capacity());
		
		//delete
		
		System.out.println("String buffer delete: "+sb.deleteCharAt(3));
		
		//reverse
		
		System.out.println("String buffer reverse: "+sb.reverse());
	}

}
