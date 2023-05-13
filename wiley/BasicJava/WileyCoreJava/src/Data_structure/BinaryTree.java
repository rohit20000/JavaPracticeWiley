package Data_structure;


class Node{
	int item;
	Node left,right;
	
	public Node(int key)
	{
		item=key;
		left=right=null;
	}
}
public class BinaryTree {
	
	Node root ;
	
	public BinaryTree()
	{
		root=null;
	}
	
	//PostOrder
		
	void postOrder(Node node)
	{
		if(node==null)
			return;
		
		
		postOrder(node.left);

		postOrder(node.right);
		
		System.out.println(node.item);
	}
	//Inorder
	
	void inOrder(Node node)
	{
		if(node==null)
			return;
		
		inOrder(node.left);
		System.out.println(node.item);
		inOrder(node.right);
		
	}
	//PreOrder
	
	void preOrder(Node node)
	{
		if(node==null)
			return;
		
		System.out.println(node.item);
		preOrder(node.left);
		preOrder(node.right);
		
		
	}
	
	public static void main(String ar[])
	{
		BinaryTree tree= new BinaryTree();
		
		tree.root= new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(6);
		tree.root.left.left=new Node(2);
		tree.root.left.right=new Node(45);
		
		System.out.println("INORDER");
		
tree.inOrder(tree.root);
		System.out.println("PREORDER");

tree.preOrder(tree.root);
		
		
		System.out.println("POSTORDER");

tree.postOrder(tree.root);
		
		
		
	}
}
