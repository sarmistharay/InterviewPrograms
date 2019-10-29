package InterviewPrograms;

import java.util.Arrays;

public class SumToSpecificNumber {
	public static void findPair(int[] arr, int sum) {
		Arrays.sort(arr);
		int begin = 0;
		int end = arr.length-1;
		while(begin<end) {
			if(arr[begin] + arr[end] == sum) {
				System.out.println("The two pair of numbers are : " + arr[begin] + " and " + arr[end]);
				return;
			}else if (arr[begin] + arr[end] < sum) {
				begin = begin + 1;
			}else {
				end = end - 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int input[] = {23,8,6,11,9,4,5};
		int num = 34;
		findPair(input,num);
	}
}
