package logical_programs;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first name");
		String first = sc.next();
		
		System.out.println("Enter last name");
		String last = sc.next();
		
		System.out.println("full name is "+first+" "+last);

	}

}
