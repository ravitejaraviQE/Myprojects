package javaprograms;

public class Exercises { //class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome to the Java World");
		System.out.println(10);//Here system acts as a class and out as variable
		System.out.println(true);
		System.out.println('R');
		System.out.print("Ravi");
		System.out.print("Good");
		System.out.print(5);
		System.err.println("Teja"); //Here system acts as a class and err as variable
		System.out.println(5.07);
		System.out.println("*************************");
		String UserWorkingDirpath=System.getProperty("user.dir");
		//Here UserWorkingDirpath as variable, System as class getProperty as static method
        System.out.println("User working dir:"+UserWorkingDirpath);
	}

}
