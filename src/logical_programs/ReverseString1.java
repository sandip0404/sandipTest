package logical_programs;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		
System.out.println("enter string which u want to reverse");
Scanner sc=new Scanner(System.in);
		String normal=sc.next();
		
		String reverse="";
		
		for(int i=normal.length()-1;i>=0;i--)
		{
			reverse=reverse+normal.charAt(i);
		}

		System.out.println("Given string is "+normal);
		System.out.println("reverse string is "+reverse);
	}

}
