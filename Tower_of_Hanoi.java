import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		harsh(n,1,2);
	}
	public static void harsh(int n,int s,int d){
	    if(n==1){
	        System.out.println("Moving ring "+n+" from "+(char)(s+64)+" to "+(char)(d+64));
	        return;
	    }
	    harsh(n-1,s,6-s-d);
	    System.out.println("Moving ring "+n+" from "+(char)(s+64)+" to "+(char)(d+64));
	    harsh(n-1,6-s-d,d);
	}
}
