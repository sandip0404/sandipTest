package logical_programs;

public class Pattern6 {

	public static void main(String[] args) {

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
		
		
		
		int star1=2;
	    int space1=4;
	    for(int i=1;i<=5;i++) {
	    	
	    	for(int j=1;j<=space1;j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k=2;k<=star1;k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star1++;
	    	space1--;
	    }

	}

}
