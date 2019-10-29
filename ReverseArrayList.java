package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ReverseArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(10);
		System.out.println("Printing the list : ");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.reverse(list);
		System.out.println("Printing the reverse List : ");
		Iterator itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
