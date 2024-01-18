package linked_list;
public class Search_LL {
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next=null;
	
		}
	}
	public static int size=1;
	public static int size(Node n1) {
	
		Node temp=n1;
		while(temp.next!=null) {
		temp=temp.next;
		size++;
		}
		return size;
	}
	public static int itrSearch(Node n1,int key) {
		int count =1;
		Node temp=n1;
		while(temp!=null) {
		if(temp.data==key) {
			return count;
		}
		count ++;
			temp=temp.next;
		}
	return -1;
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
int index= itrSearch(n1,6);
System.out.println(index);
	}


}
