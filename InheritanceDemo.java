package classDemo;

abstract class Shape
{
	double height,width,length;
	Shape(double height,double width,double length)
	{
		this.height=height;
		this.width=width;
		this.length=length;
	}
	abstract void area();
}

class Rectangle extends Shape
{
	double area;
	Rectangle(double height,double width,double length)
	{
		super(height,width,length);
	}
 void area()
	{
		area=height*width;
		System.out.println("area of rectangle:"+area);
		
	}
}

class Triangle extends  Rectangle
{  
    
	double area;
	Triangle(double height,double width,double length)
	{
		super(height,width,length);
	}
	void area()
	{
		area=(height*width)/2;
		System.out.println("area of triangle:"+area);
		
}

public class InheritanceDemo {
	
	public static void main(String atr[])
	{
		Shape s;
		Rectangle r=new Rectangle(10,10,10);
		Triangle t= new Triangle(10,10,10);
		//InheritanceDemo inh=new InheritanceDemo();
		//shape refers to rectangle
		s=r;
		//calculate area of rectangle
		s.area();
		
		//shape refers to triangle
		s=t;
		//calculate area of triangle
		s.area();
		
	}
}

}
// final class - cannot be inherited
// final method- cannot be overridden
// specifier - private no modifier protected public
// use of super & this
 