package LinkedListpkg;

public class MyLinkedList {

	
	ListNode head=null;
	
	void insertAtBegin(int val) {
		
		ListNode newNode= new ListNode(val);
		newNode.next=head;
		head=newNode;
	}
	
	void display() {
		
		ListNode p1=head;	
		while(p1 !=null) {
			System.out.print(p1.data+" -> ");
			p1=p1.next;
		}
		
	}
}
