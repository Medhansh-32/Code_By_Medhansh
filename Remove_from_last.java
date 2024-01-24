package linked_list;

public class Remove_from_last {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
public static Node head;

public static void print(Node n1) {
	Node ptr=n1;
	while(ptr!=null) {
		System.out.print(ptr.data+"->");
		ptr=ptr.next;
	}
	System.out.print("null");
System.out.println();

		}
public static int size(Node head) {
	int count=0;
	Node temp=head;
	while(temp!=null) {
		temp=temp.next;
		count++;
	}
	return count;
}
public static Node remove(Node head,int i) {
	if(i==size(head)){ 
		head=head.next;
	}
	else {
	
	i=size(head)-i+1;
	
	int count=1;
	Node ptr=head;
	while(count!=i-1) {
		ptr=ptr.next;
		count++;
	}
	Node temp=ptr.next;
	ptr.next=temp.next;
	}
	return head;
}
	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		n1.next=n2;
		Node n3=new Node(7);
		n2.next=n3;
		Node n4=new Node(4);
		n3.next=n4;
		Node n5=new Node(5);
		n4.next=n5;
		Node n6=new Node(6);
		n5.next=n6;
		n6.next=null;
		Node head=n1;
		print(head);
	   head=  remove(head,3);
	print(head);
		

   }
}
