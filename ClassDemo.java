package classDemo;

import java.util.Scanner;

class Box
{ 
	private int n=10;
	int x=10;
double height,width,length;
Box(double height,double width,double length)
{
	this.height=height;
	this.width=width;
	this.length=length;
}
void input(double h,double w,double l)
{
	height=h;
	width=w;
	length=l;

}
double volume()
{
 double v=length*width*height;
 return v;
}
}
public class ClassDemo {
	protected int n=11;
	public int pub_n=1000;
	public static void main(String str[])
	{
		Box b=new Box(11,11,11);
		//`b.length=10;
		//b.input(10, 10, 10);
		//b.n=100;  Private cannot be accessed
		System.out.println("Hello: " + b.x);
		
		//input values from the user:
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		b.length=sc.nextDouble();
		
		//call the area function of the box
		double vol=b.volume();
		System.out.println("area is: "+vol );
		
	}

}