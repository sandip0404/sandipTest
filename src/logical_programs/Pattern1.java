package logical_programs;

public class Pattern1 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******   row=6  col=max 6
		
		int star=1;
		for(int i=1;i<=6;i++ ) {
			
		for(int j=1;j<=star;j++) {
			System.out.print("*");
			
		}
			System.out.println();
			
			star++;
		}
		
		
	}

}
