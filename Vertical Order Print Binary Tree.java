import java.util.*;
public class Main {
	static Scanner inp=new Scanner(System.in);
    public static void main(String args[]) {
		BinaryTree bt=new BinaryTree();
		bt.verOrdView();
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
	        this.root=input();
	    }
		public Node input(){
			int lev=inp.nextInt();
			Queue<Node> que=new LinkedList<>();
			int data=inp.nextInt();
			Node nn=new Node(data);
			que.add(nn);
			while(!que.isEmpty()){
				Node f=que.remove();
				int x=inp.nextInt();
				if(x!=-1){
					f.left=new Node(x);
					que.add(f.left);
				}
				int y=inp.nextInt();
				if(y!=-1){
					f.right=new Node(y);
					que.add(f.right);
				}
			}
			return nn;
		}
		public void verOrdView(){
			TreeMap<Integer,ArrayList<Integer>> tmap=new TreeMap<>();
			verOrdView(root,tmap,0);
			for(int key:tmap.keySet())
			for(int x:tmap.get(key))
			System.out.print(x+" ");
		}
		private void verOrdView(Node nn,TreeMap<Integer,ArrayList<Integer>> tmap,int dis){
			if(nn==null) return;
			tmap.putIfAbsent(dis,new ArrayList<>());
			tmap.get(dis).add(nn.val);
			verOrdView(nn.left,tmap,dis-1);
			verOrdView(nn.right,tmap,dis+1);
		}
	}
}
