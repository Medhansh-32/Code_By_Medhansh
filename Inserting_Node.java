package linked_list;
public class Inserting_Node {
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

System.out.println();
			}

	public static void insertBetween(Node n1,int pos,int data) {
		Node newNode=new Node(data);
		Node temp=n1;
		int count=1;
		while(count !=pos-1) {
			temp=temp.next;
			count++;
		}
		Node ptr=temp.next;
		newNode.next=ptr;
		temp.next=newNode;
		
	}

	public static Node insertFirst(Node n1,int data) {
		Node newNode=new Node(data);
		newNode.next=n1;
		n1=newNode;
		return n1;
	}
	public static void insertLast(Node n1,int data) {
		
		Node temp=n1;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode= new Node(data);
		newNode.data=data;
		temp.next=newNode;
		
	}
		public static void main(String[] args) {
	Node n1=new Node(1);
	n1.next=null;
	System.out.println("Before Insertion List : ");
    print(n1);
	insertLast(n1,2);
	insertLast(n1,4);
	insertLast(n1,5);
	n1=insertFirst(n1,0);
	n1=insertFirst(n1,-1);
	insertBetween(n1,5,3);
	System.out.println("After Insertion List : ");
	print(n1);


		}

}