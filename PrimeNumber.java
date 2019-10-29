package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public void isPrime(int n) {
		int m = n/2;
		boolean flag = false;
		if(n==0 || n==1) {
			System.out.println(n + " is not a prime number.");
		}else {
			for(int i=2; i<=m; i++) {
				if (n%i == 0) {
					System.out.println(n + " is not a prime number.");
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(n + " is a prime number.");
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scn.nextInt();
		PrimeNumber pn = new PrimeNumber();
		pn.isPrime(num);
		scn.close();
	}
}
