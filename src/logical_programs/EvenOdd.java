package logical_programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Given no. is even");
		}
		
		else{
			System.out.println("Given no. is odd");
		}

	}

}
