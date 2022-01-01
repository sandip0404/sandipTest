package logical_programs;

public class Armstrong1 {

	public static void main(String[] args) {
		int num=153;
		int num1=0;
		for(int i=num;i>0;i=i/10){

		int rem=i%10;
		num1=num1+(rem*rem*rem);

		}

		if(num==num1){
		System.out.println("Num is Armstrong no.");
		}
		else{System.out.println("Num is not Armstrong no.");}

	}

}
