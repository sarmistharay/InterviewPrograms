package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverseNum(int n) {
		int rnum = 0;
		while(n!=0) {
			rnum = (rnum * 10) + (n%10);
			n = n/10;
		}
		return rnum;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scn.nextInt();
		int rev = reverseNum(num);
		System.out.println("Reverse of the given number is : " + rev);
		scn.close();
	}
}
