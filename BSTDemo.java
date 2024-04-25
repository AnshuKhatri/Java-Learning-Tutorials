package classDemo;

class Node2
{
 int data;
 Node2 left,right;
 Node2( int x)
 {
	 data=x;
	 left=right=null;
	 
 }

}


public class BSTDemo {
	Node2 root;
	
	BSTDemo()
	{
		root=null;
	}
	
	
	//insert in BST
	Node2 insert(Node2 root, int val)
	{
		if(root==null)
			root=new Node2(val);
		
		if(root.data<val)
			root.right=insert(root.right,val);
		
		else if(root.data>val)
			root.left=insert(root.left,val);	
		
		return root;
	}
	
	//search in BST
	Node2 search(Node2 root,int val)
	{
		if((root==null) ||(root.data==val))
			return root;
		if(root.data<val)
			return search(root.right,val);
		return search(root.left,val);
	
	}
	
	void printInorder(Node2 n)
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
	
	//deletion in BST
	Node2 deleteNode(Node2 root, int val)
	{
		
		//base condition
		if(root==null)
			return root;
		
		//recursive call for the ancestors
		if(root.data<val)
			{
			root.right=deleteNode(root.right, val);
			return root;
			}
		else if (root.data>val)
			{
			root.left=deleteNode(root.left, val);
			return root;
			}
		
		//reached here : root is the node to be deleted
		
		//if node has only 1 child
		if(root.left==null)
		{
			Node2 temp=root.right;
			return temp;
		}
		else if(root.right==null)
		{
			Node2 temp=root.left;
			return temp;
		}
			
		
		// if node to be deleted has both children
		
		else
		{
			Node2 parSucc=root;
			
			Node2 succ=root.right;
			
			while(succ.left!=null)
			{
				parSucc=succ;
				succ=succ.left;
			}
			
			if(parSucc!=root)
				parSucc.left=succ.right;
				
			else
				parSucc.right=succ.right;
				
				
			root.data=succ.data;
			
			
			return root;
		}
		
		
		
	}
	
	public static void main(String str[]) {
		
		BSTDemo tree=new BSTDemo();
		
		tree.root=tree.insert(tree.root,50);
		tree.insert(tree.root, 100);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 10);
        
        System.out.println("BST is: " );
        tree.printInorder(tree.root);
        
        //find  ele 10
        if(tree.search(tree.root, 10)==null)
        	System.out.println("Element not found");
        else
        	System.out.println("Element  found");
        
        
        System.out.println("Delete a Node: 10");
        tree.root = tree.deleteNode(tree.root, 50);
        
        System.out.println("Tree after deletion");
        tree.printInorder(tree.root);
		
		
	}

}
