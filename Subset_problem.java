import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int target=sc.nextInt();
        StringBuilder s=new StringBuilder();
		harsh(a,s,0,0,target);
		System.out.print("\n"+h);
	}
	static int h=0;
	public static void harsh(int a[],StringBuilder s,int x,int sum,int target){
        if(sum==target){
            System.out.print(s+" ");
            h++;
	        return;
	    }
	    if(sum>target) return;
	    for(int i=x;i<a.length;i++){
	        s.append(a[i]);
	        s.append(" ");
	        harsh(a,s,i+1,sum+a[i],target);
	        s.deleteCharAt(s.length()-1);
	        s.deleteCharAt(s.length()-1);
	    }
	}
}
