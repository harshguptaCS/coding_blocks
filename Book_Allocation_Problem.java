import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int t=inp.nextInt();
		for(int j=0;j<t;j++){
    		int n=inp.nextInt(),s=inp.nextInt(),l,r=0,m;
    		int book[]=new int[n];
    		for(int i=0;i<n;i++){
        		book[i]=inp.nextInt();
        		r+=book[i];
    		}
    		l=book[n-1];
    		while(l<r){
    		    m=l+(r-l)/2;
    		    if(harsh(book,m,s)) r=m;
    		    else l=m+1;
    		}
    		System.out.println(l);
		}
	}
	public static boolean harsh(int book[],int m,int s){
	    int sum=0;
	    for(int i=0;i<book.length;i++){
	        sum+=book[i];
	        if(sum>m){
	            s--;
	            sum=book[i];
	        }
	        if(s==0) return false;
	    }
	    return true;
	}
}
