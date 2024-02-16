package binary_tree;
import java.util.*;
public class Build_tree {
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
static class BinaryTree{
	static int idx=-1;
	public static Node buildTree(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}else {
			Node newnode= new Node(nodes[idx]);
			newnode.left=buildTree(nodes);
			newnode.right=buildTree(nodes);
			return newnode;
		}
	}
	
}
	public static void main(String[] args) {
	int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	BinaryTree tree=new BinaryTree();
	Node root=tree.buildTree(node);
		System.out.println(root.data);
	}

}
