package logical_programs;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of num1");
		int num1=sc.nextInt();
		
		System.out.println("enter value of num2");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Addition of 2 numbers is "+sum);
		
		

	}

}
