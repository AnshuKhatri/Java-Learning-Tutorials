package classDemo;


class Node{
	
	int data;
	Node left,right;
	
	Node(int x)
	{
		
		data=x;
		left=right=null;
	}
}

public class TreeImplementationDemo {
	
	Node root;
	TreeImplementationDemo()
	{
		root=null;
	}
	
	void printInorder(Node n)
	{
		if(n==null)
			return ;
		
		//print left
		
		printInorder(n.left);
		
		//print root
		System.out.println(n.data);
		
		//print right
		printInorder(n.right);
		
	}
	
	public static void main(String str[])
	{
		TreeImplementationDemo tree = new TreeImplementationDemo();
		tree.root= new Node(10);
		
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        
        
        System.out.println("Tree is: " );
        tree.printInorder(tree.root);
		
	}

}
