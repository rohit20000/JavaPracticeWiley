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

public class BalanceTree {
	
	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalanceTree bt = new BalanceTree();
		
		bt.root= new Node(1);

		bt.root.left= new Node(2);
		bt.root.right= new Node(3);
		bt.root.left.left= new Node(4);
		bt.root.left.right= new Node(5);
//		bt.root= new Node();
	}

}
