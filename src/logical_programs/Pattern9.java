package logical_programs;

public class Pattern9 {

	public static void main(String[] args) {
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}

		
		int star1=7;
		int space1=1;
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=space1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			star1=star1-2;
			space1++;
		}
	}

}
