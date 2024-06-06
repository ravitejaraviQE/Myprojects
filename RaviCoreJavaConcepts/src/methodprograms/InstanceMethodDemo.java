package methodprograms;

public class InstanceMethodDemo {
	
	public static String collegeName="SVU";//static variable
	
	private int x=10,y=20; //non static global variable

	//calling variables in method
	
	public void addition() {
		float f=3.15F;//local variables
		double d=f+x+y;
		System.out.println("sum of x,y,f is:"+d);
	}
	
	private void mulitplication(int a) {
		
		int m=x*y*a;
		System.out.println("multiply of x,y,a:"+m);
		
	}
	
	protected double getAverage(float m1, float m2, float m3) {
		return(m1+m2+m3)/3;
	}
	
	
	String getcollegeName() {
		return collegeName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object for a class
		//classname refvar=new classname();
		
		InstanceMethodDemo im=new InstanceMethodDemo();
		
		
		//how to call non static methods
		//refvar.nonstaticmethod();
		  im.addition();
		  im.mulitplication(25);
		  System.out.println("average of 3 number is"+im.getAverage(5.5F, 6.5F, 7.5F));
		  System.out.println("collegename:"+im.getcollegeName());
		  System.out.println("non static variables:"+im.x+"y value is:"+im.y);
		  
		  
		  

	}

}
