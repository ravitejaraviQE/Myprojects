/*
 * How can we access instance variable/non static variable in another class
 * by creating object for that class we can use vaiables accross the package or in the same package
 * //Object reference. method name
 *  //Object reference.variable
 *  How can we call another class static method(classname.static method)
 *  
 *  
 */


package variableprograms;

public class TestVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classname refvar= new classname();
		InstanceVariableDemo ivd = new InstanceVariableDemo();
		
		ivd.m1(); //Object reference. method name
		ivd.m2(); //Object reference. method name
		System.out.println("Instance Variables are:"+ivd.z+"second variable:"+ivd.x);//ivd.x= Object reference.variable
		
		// How can we call another class static method
		//Ans: classname.static method
		InstanceVariableDemo.multiply();
		
		StaticVariableDemo.printDetails();
		
		System.out.println("calling getter method in another class:"+StaticVariableDemo.getcollegeName());
		
		System.out.println("another class static variables:"+StaticVariableDemo.c+"f value is:"+StaticVariableDemo.f);

	}

}
