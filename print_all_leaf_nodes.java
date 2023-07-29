import java.util.*;
public class Main
{
    static Scanner inp=new Scanner(System.in);
	public static void main(String[] args) {
	    BinaryTree bt=new BinaryTree();
	    bt.Harsh();
		System.out.println("Hello World");
	}
	public static class BinaryTree{
	    public class Node{
	        Node left;
	        Node right;
	        int val;
	        public Node(){
	        }
	        public Node(int x){
	            this.val=x;
	        }
	    }
	    Node root;
	    public BinaryTree(){
	        root=new Node();
	    }
	    public void Harsh(){
	        root=Harsh(root);
	    }
	    public Node Harsh(Node root){
	        Queue<Node> q=new LinkedList<>();
	        int x=inp.nextInt();
	        if(x==-1) return null;
	        root.val=x;
	        q.add(root);
	        while(!q.isEmpty()){
	            Node front=q.remove();
	            int a=inp.nextInt();
	            if(a!=-1){
	                Node left=new Node(a);
	                front.left=left;
	                q.add(left);
	            }
	            int b=inp.nextInt();
	            if(b!=-1){
	                Node right=new Node(b);
	                front.right=right;
	                q.add(right);
	            }
	            if(a==-1&&b==-1) System.out.print(front.val+" ");
	        }
	        return root;
	    }
	}
}
