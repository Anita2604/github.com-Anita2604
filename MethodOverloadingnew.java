package lab21;
import java.util.Scanner;
public class MethodOverloadingnew {

	public static void main(String[] args) 
		
		
		{
		     Scanner s= new Scanner(System.in);
		     Triangle a=new Triangle();
		     System.out.println("Enter the base of the Triangle:");  
		     float b= s.nextFloat();
		     System.out.println("Enter the height of the Triangle:");  
		     float h= s.nextFloat();
		     System.out.println("Enter the length of the Rectangle:");  
		     float l= s.nextFloat();
		     System.out.println("Enter the bradth of the Rectangle:");  
		     float w= s.nextFloat();
		     System.out.println("Enter the radius of the Circle:");  
		     float r= s.nextLong();

		     Triangle ob= new Triangle();
		     ob.d1(h,b);
		     Rectangle ob1= new Rectangle();
		     ob1.d2(l,w);
		     Circle ob2= new Circle();
		     ob2.d3(r);
		}

		}
		class Triangle
		{
		 void d1(float h,float b)
		 {
		double area=(.5*h*b);
		 System.out.println("Area of Triangle with base "+b+" and height "+h+" is: "+area);
		 }
		}
		class Rectangle
		{
		 void d2(float l,float w)
		 {
		double area=(2*(l*w));
		System.out.println("Area of Rectangle with length "+l+" and breadth "+w+" is: "+area);
		 }
		}
		class Circle
		{
		 void d3(float r)
		 {
		double area=(3.14*r*r);
		System.out.println("Area of Circle with radius "+r+" is: "+area);
		 }
		}



	