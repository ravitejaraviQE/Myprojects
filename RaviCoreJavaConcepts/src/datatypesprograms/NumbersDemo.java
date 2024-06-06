/**
 * static and non static variable declaration is above the method and below the class
 * one with static keyword is called static variable
 * one with non static keyword is called  non static variable
 * static variable can use in static methods and non static methods
 * non static variable can use in only non static methods
 * 
 */

package datatypesprograms;


public class NumbersDemo{    
protected static int x=10,y=20;//static variable
protected static long l;

float f=4.5F; //non static variable

public void test() {
	
	float r=f+x+y;
	System.out.println("the result is:"+r);
	
}

private static void addition() {
	short s=5;
	byte b=6;
	int add=s+b+x+y;
	System.out.println("sum of x,y,b,s is:"+add);
	
	s=(short)y;
	System.out.println("after typecasting s value is:+s");
}

public static void main(String[] args)
{
   l=x+y;
   System.out.println("l value is:"+l);
   addition();
   
   //create an object for a class
   //classname refvar=new classname();
   
   NumbersDemo nd= new NumbersDemo();
		   nd.test();
		   double d=l+x+y;
		   System.out.println("double value is:"+d);
   
}

}