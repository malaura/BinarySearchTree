import java.util.Scanner;

/**
 * Program that creates a BST using user input. 
 * Supports insert, traverse, delete, search and exit commands in the following format: 
 * insert x
 * delete x
 * search x
 * traverse
 * exit
 * 
 * @author Maria Laura Rodriguez
 */
public class Main {
	
	 /**
	  * This is the main method which makes use of Scanner method. Creates
	  * a scanner, a Binary Tree and a string a. 
	  * 
	  * @param args Unused.
	  * @return Nothing.
	  */
	public static void main(String[] args) {
	     BinaryTree tree = new BinaryTree();
	     Scanner sc = new Scanner(System.in);
	     String a = null;
	     Scanner(tree, sc, a);
	 	 sc.close();
	     System.out.println("Exiting");
	}
	
	 /**
	  * Scans the users input and according to the commands calls functions
	  * of the BinaryTree.
	  * 
	  * @param tree BinaryTree
	  * @param sc Scanner
	  * @param a string 
	  * 
	  * @return Nothing.
	  */
	public static void Scanner(BinaryTree tree, Scanner sc, String a){
	    int i = 0;
    	a = sc.next();
	     while(!a.equals("exit")){
	    	if(a.equals("insert")){
	    		i = sc.nextInt();
			    tree.insert(i);
	    	}
	    	else if(a.equals("traverse")){
			    tree.traverse();
	    	}
	    	
	    	else if(a.equals("search")){
	    		i = sc.nextInt();
			    tree.search(i);
	    	}
	    	else if(a.equals("delete")){
	    		i = sc.nextInt();
			    tree.delete(i);
	    	}
	    	a = sc.next();

	     }
	}
	     
	
	
	
	}

