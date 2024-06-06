package variableprograms;

public class StaticVariableDemo {
	
	public static String collegeName="SVU";
	
	protected static char c='R';
	
	private static int x=10;
	
	static float f=5.5F;
	
	private void sampleTest() {  //non static method
		
		double d= x+c+f;
		
		System.out.println("d value is:"+d);
	}
	
	protected static String getcollegeName() { //without void, method is calling(static method)
		//this method returns string type variable
		return collegeName;
	}
	
	
	static void printDetails() {
		System.out.println("collegename is:"+collegeName+" x value is;"+x+" char c value is:"+c+" float value is:"+f);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDetails();
		String s=getcollegeName();
		System.out.println("collegename calling with method;"+s);
		

	}

}
