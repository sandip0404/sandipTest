package logical_programs;

public class CountSpaces {

	public static void main(String[] args) {
		
		String s1="San dip Ank ush Wadav kar";
		
		int count=0;
		char ref=' ';
		
		for(int i=0;i<=s1.length()-1;i++) {
			//s1.charAt(i);
			if(s1.charAt(i)==ref) {
				count++;
			}
			
		}
		System.out.println("No. of spaces are "+count);

	}

}
