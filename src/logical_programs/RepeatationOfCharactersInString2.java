package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class RepeatationOfCharactersInString2 {

	public static void main(String[] args) {
		
		String s3="abcabca";
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<=s3.length()-1;i++) {
			
			char cValue = s3.charAt(i);
			
			if(hm.containsKey(cValue)) {
				hm.put(cValue, hm.get(cValue)+1);
			}
			else {
				hm.put(cValue, 1);
			}
			
		}
		
		Set<Character> keys = hm.keySet();
		for(Character key:keys) {
			System.out.println(key+":"+hm.get(key));
		}

	}

}
