package javaprograms;

public class StaticDemo {
	
	
	//accessmodifier static datatype variablename;
	private static int x;
	
	static {
		x=25;
		System.out.println("First static block starts here...");
		byte bt=10;
		x=x+bt;
		System.out.println("x value is:" +x);
		System.out.println("change the bt value:"+(bt*5));
		System.out.println("First static block ends here...");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main starts here");
		long l=100;
		l=l-x;
		System.out.println("current l value is:"+1);
	}
	static {
		System.out.println("Second static block starts here...");
		x=25;
		byte bt=10;
		x=x-bt;
		System.out.println("x value is:" +x);
		System.out.println("change the bt value:"+(bt+5));
		
		
		
	}

}
