package variableprograms;

public class InstanceVariableDemo{
	
	int x=10; //non static variable
	private int y=20;
	protected int z=30;
	
	public void m1() {
		int s=x+y+z;
		System.out.println("sum of x,y,z is:"+s);
	}
	
	protected void m2() {
		float f=5.5F;
		
		double sum=f+x+y+35.555+z;
		System.out.println("the sum is:"+sum);
		
	}
	
	static void multiply() {
		short s=5;
		//int m=s*x;  //x is a nonstatic variable, so cannot be used in static methods
		
		int m=s*10;
		System.out.println("multiplication value is:"+m);
	}
	
	
	
}
