package logical_programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int num1=0;
		
		for(int i=num;i>0;i=i/10) {
			
			//System.out.println(i);
			int rem = i%10;
		num1=num1+(rem*rem*rem);
	
		}
		
		if(num1==num) {
			System.out.println("Given no."+num+" is Armstrong Number");
		}
		else {
			System.out.println("Given no. "+num+"is not Armstrong number");
		}
	}

}
