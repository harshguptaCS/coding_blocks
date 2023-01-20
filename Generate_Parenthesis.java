import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		harsh(n,1,0,"(");
	}
	public static void harsh(int n,int o,int c,String s){
	    if(o==n&&c==n){
	        System.out.println(s);
	        return;
	    }
	    if(c<n&&c<o){
	        harsh(n,o,c+1,s+")");
	    }
	    if(o<n){
	        harsh(n,o+1,c,s+"(");
	    }
	}
}
