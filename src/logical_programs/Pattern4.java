package logical_programs;

public class Pattern4 {

	public static void main(String[] args) {
//		*****
//		 ****
//		  ***
//		   **
//		    *  

		int star=5;
		int space=0;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
		System.out.println();
		star--;
		space++;
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
