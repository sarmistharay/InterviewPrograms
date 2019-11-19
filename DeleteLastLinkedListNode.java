package myPrograms;

//public class DeleteLastLinkedListNode {
	static class Node{
		int data;
		Node next;
		Node(int temp){
			data = temp;
		}
	}
	
	public static Node deleteLastNode(Node head) {
		if(head == null) return null;
		if(head.next == null) return null;
		Node tmp = head;
		while(tmp.next.next != null) {
			tmp = tmp.next;
		}
		tmp.next = null;	
		return head;
	}
	
	public static void printLinkedList(Node head) {
		while(head.next != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(21);
		Node n2 = new Node(35);
		Node n3 = new Node(25);
		Node n4 = new Node(29);
		Node n5 = new Node(22);
		Node n6 = new Node(30);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		System.out.print("The initial Linked List :");
		printLinkedList(n1);
		n1 = deleteLastNode(n1);
		System.out.println();
		System.out.print("The Linked List after deletion :");
		printLinkedList(n1);
	}
}
