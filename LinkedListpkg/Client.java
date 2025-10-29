package LinkedListpkg;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ListNode n1= new ListNode(10);
//		ListNode n2= new ListNode(20);
//		ListNode n3= new ListNode(10);
////		System.out.println(n1.data);
//		
//		n1.next=n2;
//		n2.next=n3;
		
		MyLinkedList list= new MyLinkedList();
		list.insertAtBegin(10);
		list.insertAtBegin(20);
		list.insertAtBegin(30);
		list.display();
		
		
	}

}
