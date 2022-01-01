package logical_programs;

public class ReplacingSpecialCharacters {

	public static void main(String[] args) {
		
		String s1="San@d&ip#@$%&*";
		
//		s1=s1.replaceAll("[@#&]", "");
//		System.out.println(s1);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
