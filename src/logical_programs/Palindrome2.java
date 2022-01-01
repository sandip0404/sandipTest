package logical_programs;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter string value");
	     String given=sc.next();
	     String reverse="";
	     for(int i=given.length()-1;i>=0;i--){
	         reverse=reverse+given.charAt(i);
	     }
	     if(given.equalsIgnoreCase(reverse)){
	         System.out.println("Given string is palindrome");
	     }
	     else{
	         System.out.println("Given String is not palindrome");
	     }

	}

}
