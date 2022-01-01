package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class RepeatationOfCharactersInString1 {

	public static void main(String[] args) {
		String s1="abcdabcdabcdababcabc";
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			char charVal = s1.charAt(i);
			
			
			if(hm.containsKey(charVal)) {
				hm.put(charVal, hm.get(charVal)+1);
			}
			else {
				hm.put(charVal, 1);
			}
			
		}
		Set<Character> keys = hm.keySet();
		for(Character key:keys) {
			System.out.println(key+":"+hm.get(key));
		}
		
	}

}
