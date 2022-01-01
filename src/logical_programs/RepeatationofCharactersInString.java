package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class RepeatationofCharactersInString {

	public static void main(String[] args) {
	
		String s1="abcdabcdabcdcde";
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			char charValue = s1.charAt(i);
			
		if(hm.containsKey(charValue))
		{	
			hm.put(charValue,hm.get(charValue)+1);	
		}
		else {
			hm.put(charValue, 1);
		}
		
		}

	Set<Character> keys = hm.keySet();	
	for(Character key:keys) {
		System.out.println(key+":"+hm.get(key));
	}
		
		
		
		
		
	}

}
