package logical_programs;

public class Palindrome {

	public static void main(String[] args) {
		
		String given="MALAYALAM";
		String reverse="";
		
		for(int i=given.length()-1;i>=0;i--) {
			
			reverse=reverse+given.charAt(i);
		}
		
		System.out.println("Given string is "+given);
		System.out.println("reverse string is "+reverse);
		
		if(given.equalsIgnoreCase(reverse)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}
	}

}
