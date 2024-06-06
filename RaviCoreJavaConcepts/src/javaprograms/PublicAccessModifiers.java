package javaprograms;

//AccessModifiers.javafile

//public class
public class PublicAccessModifiers {
	
//public variable
public int ballcount;
	
//public method
public void display() {
		System.out.println("This is a Cricket Tournament - display()");
		System.out.println("In Cricket Each Over Have" +ballcount+ "balls");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing the public class
		PublicAccessModifiers publicaccessModifiers = new PublicAccessModifiers();
		
		//accessing the public variable
		publicaccessModifiers.ballcount=6;
		
		//accessing the public method
		publicaccessModifiers.display();
			}

}
