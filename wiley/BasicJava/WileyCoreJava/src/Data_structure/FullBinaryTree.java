package Data_structure;


class NodeClass{
	int data;
	NodeClass leftChild;
	NodeClass rightChild;
	
	
	public NodeClass(int item){
		data=item;
		leftChild=rightChild=null;
	}
	
}
public class FullBinaryTree {

	 NodeClass root;
	boolean isFullBinaryTree(NodeClass node)
	{
		
		if(node==null)
			return true;
		if(node.leftChild==null && node.rightChild==null)
			return true;
		if(node.leftChild!=null && node.rightChild!=null)
			return  ((isFullBinaryTree(node.leftChild)) &&( isFullBinaryTree(node.rightChild)) );
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FullBinaryTree tree= new FullBinaryTree();
		
		tree.root =new NodeClass(1);
		tree.root.leftChild =new NodeClass(2);
		tree.root.rightChild =new NodeClass(3);
		tree.root.leftChild.leftChild =new NodeClass(4);
		tree.root.rightChild.rightChild =new NodeClass(5);
//		tree.root =new NodeClass(1);
		
		 boolean ans= tree.isFullBinaryTree(tree.root);
		System.out.println(ans);

	}

}
