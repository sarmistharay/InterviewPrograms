package InterviewPrograms;

import java.util.Scanner;

public class ReverseString {
	public static String reverseStr(String s) {
		String rev = "";
		if(s.length() == 1) {
			return s;
		}else {
			rev = rev + s.substring(s.length()-1, s.length()) + reverseStr(s.substring(0, s.length()-1));
			return rev;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scn.next();
		String revStr = reverseStr(str);
		System.out.println("Reverse String : " + revStr);
		scn.close();
	}
}
