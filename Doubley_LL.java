package linked_list;

public class Doubley_LL {
public static class Node{
	Node prev;
	int data;
	Node next;
           Node(int data) {
		this.prev=null;
		this.data=data;
		this.next=null;

}

}
public static Node tail;
public static void print(Node n1) {
	Node ptr=n1;
	while(ptr!=null) {
		System.out.print(ptr.data+"->");
		ptr=ptr.next;
	}
	System.out.print("null");
System.out.println();

		}
public static void printrev(Node n1) {
	Node ptr=n1;
	while(ptr!=null) {
		System.out.print(ptr.data+"->");
		ptr=ptr.prev;
	}
	System.out.print("null");
System.out.println();

		}
public static Node insertLast(Node n1,int data) {
	Node temp=new Node(data);
	Node ptr=n1;
	while(ptr.next!=null) {
	ptr=ptr.next;	
	}
	ptr.next=temp;
	temp.prev=ptr;
	 tail=temp;
return tail;	
}
public static Node removeLast(Node n1) {
Node temp=n1;
Node ptr=null;
	while(temp.next!=null) {
		 ptr=temp;
		temp=temp.next;
		
	}
	tail=ptr;
	ptr.next=null;
	return tail;
}
public static Node addFirst(Node n1,int data) {
	Node newNode=new Node(data);
	newNode.next=n1;
	n1.prev=newNode;
return newNode;
}
public static Node removeFirst(Node n1) {
	Node remove=n1;
	n1.next.prev=null;
	n1=n1.next;
	remove.next=null;
	
	return n1;
}
public static void addBetween(Node n1,int pos ,int data) {
int count =1;
Node ptr=n1;
while(count!=pos-1) {
	ptr=ptr.next;
	count ++;
}
Node newnode=new Node(data);
newnode.next=ptr.next;
ptr.next.prev=newnode;
ptr.next=newnode;
newnode.prev=ptr;

}
public static void removebetween(Node n1,int pos) {
	int count=1;
	Node  temp=n1;
	while(count!=pos-1) {
		temp=temp.next;
		count++;
	}
	Node ptr=temp.next;
	ptr.next.prev=temp;
	temp.next=ptr.next;

}
	public static void main(String[] args) {
	Node n1=new Node(1);
	Node n2=new Node(2);
	n1.next=n2;
	n2.prev=n1;
	
	tail=insertLast(n1,3);
	addBetween(n1,2,5);
	n1=addFirst(n1,0);
	tail=insertLast(n1,4);
	tail=insertLast(n1,5 );
	tail=removeLast(n1);
	n1=removeFirst(n1);
	addBetween(n1,3,5);
	removebetween(n1,3);
	print(n1);
	printrev(tail);
	
	}

}
