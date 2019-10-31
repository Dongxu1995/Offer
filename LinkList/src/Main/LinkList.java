package Main;
import java.util.ArrayList;
public class LinkList {
	class Node{
		int val;
		Node next = null;
		Node(int val){
			this.val = val;
		}
	}
	
	Node head = null;
	
	public void Add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	
	public static void main(String []args) {
		ArrayList al = new ArrayList();
		LinkList ll = new LinkList();
		for(int i = 0; i < 10; i++) {
			ll.Add(i);
		}
		LinkList tmp = new LinkList();
		tmp.head = ll.head;
		while(tmp.head != null) {
			al.add(0, tmp.head.val);
			tmp.head = tmp.head.next;
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t");
		}
	}

}
