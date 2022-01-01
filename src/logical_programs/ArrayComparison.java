package logical_programs;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		
		int ar1[]= {1,2,3};
		int ar2[]= {4,5,6};
		int ar3[]= {1,2,3};
		
		System.out.println(" Is ar1 and ar2 array are equal "+Arrays.equals(ar1, ar2));
		
		System.out.println(" Is ar1 and ar3 array are equal "+Arrays.equals(ar1,ar3));

	}

}
