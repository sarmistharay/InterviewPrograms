package InterviewPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxRepeatingChar {
	public static void findMaxRepeatChar(String str) {
		System.out.println("Input string is : " + str);
		char result=0;
		str = str.replaceAll(" ", "");
		char[] inputCharArray = str.toCharArray();
		HashMap<Character,Integer> data = new HashMap<Character,Integer>();
		for(char c : inputCharArray) {
			if(data.containsKey(c)) {
				data.put(c,data.get(c)+1);
			}else {
				data.put(c,1);
			}
		}
		int maxCount = 0;
		Set<Entry<Character,Integer>> entrySet = data.entrySet();
		for(Entry<Character,Integer> en : entrySet) {
			if(maxCount < (Integer)en.getValue()) {
				maxCount = (Integer)en.getValue();
				result = (Character)en.getKey();
			}
		}
		System.out.println("The maximun repeating character in the input string is : " + result);
		System.out.println("The count of the maximum repeating character is : " + maxCount);
	}
	
	public static void main(String[] args) {
		String inputStr = "Java J2ee Android Hibernate JSP";
		findMaxRepeatChar(inputStr);
	}
}
