package methodprograms;
/**
 * This class explains about static members
 * Authoe: @raviteja
 * 
 */

public class StaticMembersDemo{
	//accessmodifier static datatype variablename=value;
	private static char c='A';
	static int i=25;
	protected static float f=2.5F;
	public static long l=100L;
	
/**
 * static void method without parameters
 * accessmodifier static void methodname(){logic}
 */
	private static void division() {
		System.out.println("startes executing the division()..");
		//datatype variablename=value;
		byte bt=5;
		final short DATA=10;
		//fetch the remainder of the values using %
		int rm=(int)(c+i+f+l)%(bt+DATA);
		System.out.println("remainder value of (c+i+f+l)%(bt+DATA)is: "+rm);
		double qtval=(l+f+c+bt+DATA)/i;
		System.out.println("qt value is:"+qtval);
	}
	/**
	 * static void method with parameters
	 * accessmodifier static void methodname()datatype p1, datatype p2){logic}
	 */
	public static void swapWithoutThirdVariable(int a, int b){
		
		System.out.println("before swapping a="+a +" b value ="+b);
		
	//step1 sum a,b and store output in a variable
		a=a+b;
		
	//step2 subtract b from a and assign to b
		
		b=a-b;
		//step3 subtract b from a and assign to a
		
		a=a-b;
		System.out.println("After swapping a="+a +" b value ="+b);
		
	}
		

/**
 * accessmodifier static datatype methodname() {logic;return value}
 * write a program to generate the random double value from 0 to 1
 * 
 */

static double generateDoubleRandomData() {
	System.out.println("Generating random double values: from 0 to 1");
	/*
	 * use java.lang.Math class static returntype method - random() which returns double
	 * datatype variablename=classname.returntypestaticmethod();
	 */
	double randVal=Math.random();
	return randVal;
}

public static void main(String[] args) {
	/**
	 * 
	 */
	division();
	swapWithoutThirdVariable(25, 50);
	
	
}
}


		
	
