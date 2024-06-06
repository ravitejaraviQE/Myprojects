package javaprograms;

class DefaultAccessModifier {

	void message() {
		System.out.println("This is a Deafult access");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing the public class
		DefaultAccessModifier defaultaccessModifiers = new DefaultAccessModifier();
		
		
		//accessing the public method
		defaultaccessModifiers.message();
			}

}

/*class Test{//default class
 *default static variable //syntax:accessmodifier static datatype variablename=value;
 *eg: static int i=5;
 * default non static variable: //syntax: //accessmodifier datatype variablename=value;
 * eg: float f=3.4F;
 * default static method://syntax: //accessmodifier static void methodname(){l+s}
 * eg: static void m2(){l+s}
 * 
 * 
 * */
