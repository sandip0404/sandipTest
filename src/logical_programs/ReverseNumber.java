package logical_programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=12345;
		
		String strnum = Integer.toString(num);
		
		String reverse ="";
		
		for(int i=strnum.length()-1;i>=0;i--) {
			reverse=reverse+strnum.charAt(i);
		}
      

       int revnum = Integer.parseInt(reverse);
       
       System.out.println(revnum);
	}

}
