import java.util.*;
import java.lang.*;
import java.io.*; 

class Node {
int data;
Node left;
Node right;
Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
}
}
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	     Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        in(root);
        System.out.println("");
        pre (root);
        System.out.println();
        post(root);
        System.out.println("The height of the binary tree 1 is ");
        printk(root,1);
         System.out.println("The height of the binary tree 2is ");printk(root,2);
        
        
        
        
        
        
	

	}
public static	void in(Node root){
	    if(root==null) return ;
	        in(root.left);
	        System.out.print(root.data+" ");
	          in(root.right);
	}
	public static void pre(Node root){
	    if (root==null) return;
	    System.out.print(root.data+" ");
	     pre(root.left);
	     pre(root.right);
	    
	}
	public static void post(Node root){
	    if (root==null) return ;
	    post(root.right);
	    System.out.print(root.data+" ");
	    post(root.left);
	}
	public static void printk(Node root,int k){
	    if (root==null)
	    return ;
	    if (k==0)System.out.print(root.data+" ");
	    printk(root.left,k-1);
	    printk(root.right,k-1);
	    
	    
	}
}














































