package datatypesprograms;

public class PracticeTasks {
	
/*	protected static int i=10, j=12, k=13;//defining static variable
	
	 float f=1.24F; //defining non static variable
	
	 public void test(){
		 
		 float r=i+f;
		 System.out.println("reminder value is:"+r);
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = i+j+k;
		System.out.println("double value is:" +x);
		
		PracticeTasks obj = new PracticeTasks();
		obj.test();
		
		

	}
	*/
	//concanite the numbers with string
	
	protected static String s= "Ravi";
	
	public static void main(String[] args) {
		
		String s1="Teja";
		String s2=s+s1;
		System.out.println("the value of s is:"+s2);
		
		String s3=s1+"4"+"5";
		System.out.println("the value of s is:"+s3);
		
		String s4=s+4+5;
		System.out.println("the vale of s is:"+s4);
		
		String s5=s+(4+5);
		System.out.println("the vale of s is:"+s5);
		
}
}
