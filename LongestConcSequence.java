package InterviewPrograms;

import java.util.HashSet;

public class LongestConcSequence {
	public static int LongestSequence(int[] input) {
		int seqLen = 0;
		int start;
		HashSet<Integer> data = new HashSet<Integer>();
		for(int i =0; i<input.length; i++)
		{
			data.add(input[i]);
		}
		for(int i=0; i<input.length; i++) {
			if(!data.contains(input[i]-1)) {
				start = input[i];
				int temp = 1;
				while(data.contains(start+1)) {
					temp = temp + 1;
					start = start + 1;
				}
				if(seqLen < temp) {
					seqLen = temp;
				}
			}
		}
		return seqLen;
	}
	public static void main(String[] args) {
		//int[] arr = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		int[] arr = {100, 4, 200, 1, 3, 2};
		System.out.println("Length of the Longest Sequence of Numbers : " + LongestSequence(arr));
	}
}
