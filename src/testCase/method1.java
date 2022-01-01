package testCase;

public class method1 {

	public static void main(String[] args) {

		System.out.println( "Hi I am main method");
		
		
		mymethod();  //static regular method call from same class
		method2.mymethod2();   //static regular method call from another class 
		                       //  classname.methodname    
	
	}

	public static void mymethod() {
		System.out.println("Hi i am static regular method from same class");
		
	}
}
