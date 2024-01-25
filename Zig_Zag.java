package linked_list;

public class Zig_Zag {

	public static class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public static Node mid(Node head) {
	Node slow=head;
	Node fast=head.next;
	while(fast!=null&&fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
return slow;
}
public static void print(Node n1) {
	Node ptr=n1;
	while(ptr!=null) {
		System.out.print(ptr.data+"->");
		ptr=ptr.next;
	}
	System.out.print("null");


		}
public static Node rev(Node head) {
	Node prev=null;
	Node curr=head;
	Node next;
	Node mid=mid(head);

	while(curr!=null) {
		
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
return prev;
}
public static Node zig(Node head) {
Node mid=mid(head);
Node revNode=rev(mid);
Node temp=head;
Node lh,rh;
	while(temp!=null&&revNode!=null) { 
		lh=temp.next;
		rh=revNode.next;
		temp.next=revNode;
		revNode.next=lh;
		lh.next=rh;
		temp=temp.next;
		revNode=revNode.next;
}
	
return head;
}
	public static void main(String args[]) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		n1.next=n2;
		Node n3=new Node(3);
		n2.next=n3;
		Node n4=new Node(4);
		n3.next=n4;
		Node n5=new Node(5);
		n4.next=n5;
		Node n6=new Node(6);
		n5.next=n6;
		Node head=zig(n1);
		print(head);
	}
}
