package InterviewPrograms;

public class SinglyLinkedList {
	private Node head;
	
	public void addNode(String value) {
		Node n = new Node();
		Node tmp = head;
		n.setData(value);
	
		if (head == null) {
			head = n;
		}else if(tmp.getNextnode() == null){
			tmp.setNextnode(n);
		}else {
			tmp = tmp.getNextnode();
		}
	}
	
	public void printList() {
		Node tmp = head;
		while(tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNextnode();
		}
	}
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null) {
			next = curr.getNextnode();
			curr.setNextnode(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
	}
}
