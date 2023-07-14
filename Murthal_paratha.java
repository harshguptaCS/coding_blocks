import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int p=inp.nextInt(),n=inp.nextInt();
		int rank[]=new int[n];
		for(int i=0;i<n;i++)
		rank[i]=inp.nextInt();
		Arrays.sort(rank);
		int l=1,r=(p*(p+1))/2*rank[0],m;
		while(l<r){
		    m=l+(r-l)/2;
		    if(harsh(rank,m,p)) r=m;
		    else l=m+1;
		}
		System.out.print(l);
	}
	public static boolean harsh(int rank[],int m,int p){
	    for(int i=0;i<rank.length;i++){
	        int in=1,x=rank[i],sum=0;
	        while(true){
	            if(in*x+sum>m) break;
	            sum+=in*x;
	            in++;
	        }
	        p-=in-1;
	    }
	    return p<=0;
	}
}
