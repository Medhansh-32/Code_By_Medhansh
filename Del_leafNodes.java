package binary_tree;

import java.util.LinkedList;
import java.util.Queue;



public class Del_leafNodes {
	static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
	public static void levelorder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q=new LinkedList<>();
	q.add(root);
	q.add(null);
	
	while(!q.isEmpty()) {
		Node curr=q.remove();
		if(curr==null) {
			System.out.println();
			if(q.isEmpty()) {
				break;
			}else {
				q.add(null);
			}
		}else {
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				q.add(curr.left);
			}
			if(curr.right!=null) {
				q.add(curr.right);
			}
		}
	}
	}
	

	public static void del(Node root ,int data) {
		if(root==null) {
			return; 
		}
		Node temp=root;
		if(root.data==data) {
			if(root.left==null&&root.right==null) {
				temp=null;
			}
				
			
		}
		if(temp!=null) {
			System.out.println(temp.data);	
		}
		
		del(root.left,data);
		del(root.right,data);
		
	}
	public static void main(String[] args) {
	
/*
        
        1
      /   \
     3     3
    / \    
   3   2   
   
        */
       Node n1=new Node(1);
       n1.left=new Node(3);
       n1.right=new Node(3);
       n1.left.left=new Node(3);
       n1.left.right=new Node(2);
     
del(n1,3);
//levelorder(n1);
	}

}
