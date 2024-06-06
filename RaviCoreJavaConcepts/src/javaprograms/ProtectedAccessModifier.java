
/* notes
 *When methods, Constructors, and data members are declared- protected, we can access them within the same package as well as from subclasses.
 *Eg: Facebook>> If you make this status visible for Friends or Friends of friends, then your status will be only visible for your friends 
 and your friends. Not everyone presents on Facebook or Internet. [Protected Access Specifiers]
 * 
 * 
 */



package javaprograms;

class ProtectedAccessModifier {
    // protected method
    protected void display() {
        System.out.println("This is an animal class method -display");
    }
}

class Dog extends ProtectedAccessModifier {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
         // access protected method
        dog.display();
    }
}
