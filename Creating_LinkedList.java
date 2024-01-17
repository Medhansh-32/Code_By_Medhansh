package linked_list;
public class Creating_LinkedList {
public static class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
}
public static void print(Node n1) {
	Node ptr=n1;
	while(ptr!=null) {
		System.out.print(ptr.data+"->");
		ptr=ptr.next;
	}
	System.out.print("null");


		}
	public static void main(String[] args) {
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
n6.next=null;

print(n1);




	}
}
