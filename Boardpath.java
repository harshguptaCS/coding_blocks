import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int n=sc.nextInt();
		harsh(n,target,"",0);
		System.out.print("\n"+h);
	}
	static int h=0;
	public static void harsh(int n,int target,String s,int sum){
	    if(sum==target){
            System.out.print(s+" ");
            h++;
	        return;
	    }
	    for(int i=1;i<=n;i++){
            if(sum+i>target) return;
	        harsh(n,target,s+i,sum+i);
	    }
	}
}
