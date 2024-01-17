package linked_list;
public class Deleting_Node {
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
	public static Node delFirst(Node n1) {
		Node temp=n1;
		n1=temp.next;
		
		return n1;
	}
	public static void delBetween(Node n1,int pos) {
		Node temp=n1;
		int count=1;
		while(count !=pos-1) {
			temp=temp.next;
			count++;
		}
		Node ptr=temp.next;
		temp.next=ptr.next;
	}
	public static void delLast(Node n1) {
		Node temp=n1;
		Node ptr=null;
		while(temp.next!=null) {
			ptr=temp;
			temp=temp.next;
		}
		ptr.next=null;
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

	insertLast(n1,2);
	insertLast(n1,3);
	insertLast(n1,4);
	insertLast(n1,5);
	insertLast(n1,6);
	insertLast(n1,7);
	System.out.println("Befor Deletion list : ");
	print(n1);
	System.out.println("After Deletion List : ");
	n1 = delFirst(n1);
	delBetween(n1,3);
	delLast(n1);
	print(n1);


		}

}
