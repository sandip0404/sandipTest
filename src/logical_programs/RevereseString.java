package logical_programs;

public class RevereseString {

	public static void main(String[] args) {


		String normal="SANDIP";
		String reverse="";
		
		for(int i=normal.length()-1;i>=0;i--)
		{
			reverse=reverse+normal.charAt(i);
		}

		System.out.println("original  string is "+normal);
		System.out.println("reverse string is "+reverse);
	}

}
