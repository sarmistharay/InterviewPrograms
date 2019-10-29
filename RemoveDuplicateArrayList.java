package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Cherry");
		list.add("Grapes");
		list.add("Apple");
		System.out.println(list.toString());
		Set<String> hashset = new HashSet<String>(list);
		list.clear();
		list.addAll(hashset);
		System.out.println(list.toString());
	}
}
