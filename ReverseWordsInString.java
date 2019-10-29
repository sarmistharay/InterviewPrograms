package InterviewPrograms;

public class ReverseWordsInString {
	public static void reverseString(String str) {
		String[] temp = str.split(" ");
		String revStr ="";
		for(int i =temp.length-1; i>=0; i--) {
			revStr = revStr + temp[i].trim() + " " ;
		}
		System.out.println("The Reverse String is : " + revStr.trim());
	}
	
	public static void main(String[] args) {
		String input = "i love this program very much";
		reverseString(input);
	}
}
