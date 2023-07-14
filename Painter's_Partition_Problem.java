import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int k=inp.nextInt(),n=inp.nextInt(),l=1,r=0,m;
		int board[]=new int[n];
		for(int i=0;i<n;i++){
    		board[i]=inp.nextInt();
    		r+=board[i];
		}
		while(l<r){
		    m=l+(r-l)/2;
		    if(harsh(board,m,k)) r=m;
		    else l=m+1;
		}
		System.out.print(l);
	}
	public static boolean harsh(int board[],int m,int k){
	    int sum=0;
	    for(int i=0;i<board.length;i++){
	        sum+=board[i];
	        if(sum>m){
	            k--;
	            sum=0;
	            i--;
	        }
	        if(k==0) return false;
	    }
	    return true;
	}
}
