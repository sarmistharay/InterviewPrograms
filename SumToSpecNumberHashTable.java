package InterviewPrograms;

import java.util.HashSet;

public class SumToSpecNumberHashTable {
	public static void findPairs(int[] arr, int sum) {
		HashSet<Integer> data = new HashSet<Integer>();
		for(int i =0; i<arr.length; i++) {
			int diff = sum - arr[i];
			if(data.contains(diff)) {
				System.out.println("The two pair of numbers are : " + arr[i] + " and " + diff);
			}
			data.add(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] input = {23,45,67,3,9,11,16,29};
		int sum = 32;
		findPairs(input, sum);
	}
}
