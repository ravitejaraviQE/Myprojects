
/*
 * How to concatinate and join the numbers using string
 */
package datatypesprograms;

public class StringDemo {
private static String s="selenium";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ravi";
		
		String s2=s1+s;
        System.out.println("s2 value after joining s and s1 value:"+s2);
		
		String s3=s+45;
		System.out.println("s3 value is:"+s3);
		
		String s4=s+4+5;
		System.out.println("s4 value is:"+s4);
		
		String s5=s1+(5+4);
		System.out.println("s5 value is:"+s5);
		
		String s6=3+4+s1;
		System.out.println("the output of 3+4+1 is:"+s6);
		
		String s7="3"+"5"+s1;
		System.out.println("the output of s7 is:"+s7);
		
		
	}

}
