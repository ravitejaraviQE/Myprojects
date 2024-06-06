package methodprograms;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object for a class
		//classname refvar=new classname();
		
		InstanceMethodDemo imd=new InstanceMethodDemo();
		
		imd.addition();
		System.out.println("another class nonstatic method:"+imd.getcollegeName());
		System.out.println("calling getter method:"+imd.getAverage(25.4F, 6.7F, 7.8F));	
		
	}

}
