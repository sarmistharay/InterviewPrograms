package InterviewPrograms;

public class MoveZerosToEnd {
	public static void moveZeros(int[] input) {
		int temp;
		int count =0;
		for(int i=0; i<input.length; i++) {
			if(input[i] != 0) {
				temp = input[count]; 
		        input[count] = input[i]; 
		        input[i] = temp; 
		        count = count +1;
			}
		}
		System.out.print("The output Array is : " );
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
		moveZeros(arr);
	}
}
