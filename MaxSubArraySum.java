package InterviewPrograms;

public class MaxSubArraySum {
	public static int maxSum(int[] input) {
		int sum =input[0];
		int maxSum = input[0];
		for(int i =1; i<input.length; i++) {
			sum = Math.max(input[i], sum+input[i]);
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};//{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("The maximum sum of the sub array is : " + maxSum(arr));
	}
}
