public class BinaryTree {
	/**
	 * root of the Binary Tree
	 */
	public Node root; 
	
	
	/**
	 * Inserts the specified int to the Binary Tree. Has only one parameter
	 * since this is the function that will be called initially and it will 
	 * be only given an int. 
	 * 
	 * @param data an int that will be inserted to the Binary tree
	 */
	public void insert(int data)
    {
        root = insert(root, data);

    }
  
	/**
	 * Inserts int data to a given node if it is null. 
	 * 
	 * @param node node from the Binary Tree
	 * @param data an int that will be inserted to the Binary tree
	 * @return node with the inserted value
	 */
    private Node insert(Node node, int data)
    {
        if (node == null){
            node = new Node();
        	node.data = data;
    		System.out.println(data + " was inserted succesfully!");

        }
        else //test if there are no duplicates
        {
            if (data < node.data)
                node.left = insert(node.left, data);
            else if (data > node.data)
                node.right = insert(node.right, data);
        }
        return node;
    }		
    
    /**
     * Calls the traverse function to traverse a Binary Tree given its root 
     */
    public void traverse()
    {
    	traverse(root);
    	System.out.println(" ");
    }
    
    
    /**
     * Traverses a Binary Tree recursively and prints its values.
     * 
     * @param node node of a Binary Tree
     */
    private void traverse(Node node)
    {
        if (node != null)
        {
        	traverse(node.left);
            System.out.print(node.data +" ");
            traverse(node.right);
        }
    }
    
    
    /**
     * Calls delete function given an int that will be deleted.
     * 
     *  @param data int that will be deleted
     */
    public void delete(int data)
    {
    	if (root.data == data){
    		if(root.left != null){
    			Node backup = root.right;
    			root = root.left;
        		Node node = root;
    			while(node.right != null){
    	    		node = node.right;
    	    	}
    	    	node.right = backup;
    	    }
    		else if(root.right != null){
    			Node backup = root.left;
    			root = root.right;
        		Node node = root;
    			while(node.left != null){
    	    		node = node.left;
    	    	}
    	    	node.left = backup;
    	    }
    		else{
    			root = null;
    		}
	    	System.out.println("Root deleted!"); 
	    	return;
    	}
        delete(root, data);
    }
    
    /**
     * Deletes a node of a Binary Tree using recursion
     * 
     *  @param data int that will be deleted
     *  @param node node of Binary Tree
     */
    private void delete(Node node, int data)
    {
    	if(node == null){
    		System.out.println(data +" does not exist");
      		return;	
    	}
    	
    	if (data < node.data){
    		if (node.left.data == data){
    		//deletes left node
    			Node backup = node.left.right;
    			node.left = node.left.left;
    	    	while(node.left != null){
    	    		node = node.left;
    	    	}
    	    	node.left = backup;
    	        System.out.println(data +" deleted successfully!");
    			return;
    		}
    		delete(node.left, data);
    	
    	}
    	if (data > node.data){
    		if (node.right.data == data){
    		//deletes left node
    			Node backup = node.right.right;
    			node.right = node.right.left;
    			while(node.right != null){
    	    		node = node.right;
    	    	}
    	    	node.right = backup;
    	        System.out.println(data +" deleted successfully!");
    			return;
    		}
    		delete(node.right, data);
    	}
    }
    
    

    /**
     * Calls the search function and prints "data does not exist" if the
     * int does not exist
     * 
     *  @param data int that will be deleted
     */
    public void search(int data)
    {
        if(!search(root, data))
        	System.out.println(data + " does not exist");

    }
    
    /**
     * Searches iteratively for an int data
     * 
     * 	@param node node where the search starts from
     *  @param data int that will be searched
     *  
     *  @return boolean true if it is found false otherwise.
     */
    private boolean search(Node node, int data)
    {
       while(node!= null){
    	   if(node.data == data){
    	     System.out.println("Found " + data + "!");
    	   	 return true;
    	   }
    	   if(data < node.data)
    	   	 node = node.left;
    	   else
    		  node = node.right;

       }
       return false;


    	}
       
    }
    


	