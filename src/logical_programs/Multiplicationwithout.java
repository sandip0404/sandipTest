package logical_programs;

import java.util.Scanner;

public class Multiplicationwithout {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();

		System.out.println("enter second number");
		int b=sc.nextInt();
	//7*8
		
		int mul=0;
		for(int i=1;i<=b;i++) {
			mul=mul+a;
		}
	System.out.println("multiplication is "+mul);
	}

}
