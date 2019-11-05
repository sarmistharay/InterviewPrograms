package myPrograms;

import java.util.HashMap;

public class DuplicateCharInString {
	public static void findDuplicateChar(String str) {
		char[] charInput = str.toCharArray();
		HashMap<Character,Integer> tempMap = new HashMap<Character,Integer>();
		for(char ch:charInput) {
			if(tempMap.containsKey(ch)) {
				tempMap.put(ch, tempMap.get(ch)+1);
			}else {
				tempMap.put(ch, 1);
			}
		}
		System.out.println("The Duplicate Character in the given String are : ");
		for(char c : tempMap.keySet()) {
			if(tempMap.get(c) > 1 && !Character.isWhitespace(c)) {
				System.out.println(c + " --> " + tempMap.get(c));
			}
		}
	}
	public static void main(String[] args) {
		String input = "howtodoinjava dot com";
		findDuplicateChar(input);
	}
}
