package binary_tree;
public class Count_Nodes {
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
		public static int count(Node root) {
			if(root==null) {
				return 0;
			}
			
		int lc=	count(root.left)  ;
		int rc= count(root.right);
			return lc+rc+1;
			
		}
		public static int sum(Node root) {
			if(root==null) {
				return 0;
			}
			
		int lc=	sum(root.left)  ;
		int rc= sum(root.right);
			return lc+rc+root.data;
			
		
		}
	}
	public static void main(String[] args) {
	
		int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(node);
			System.out.println(tree.count(root));
			System.out.println(tree.sum(root));
	}
	}


