import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        temp.add(0);
        temp.add(0);
	    harsh(n,0,0);
	    System.out.println(count);
	}
	static int count=0;
	static List<Integer> temp=new ArrayList<>();
	static List<Integer> col=new ArrayList<>();
	static List<List<Integer>> dia=new ArrayList<>();
	public static void harsh(int n,int r,int c){
	    if(c==n){
	        count++;
	        return;
	    }
	    for(int i=0;i<n;i++)
        if(column(i)&&diagonal(r,i)){
            col.add(i);
            temp.set(0,r);
            temp.set(1,i);
            dia.add(new ArrayList<>(temp));
            harsh(n,r+1,c+1);
            col.remove(col.size()-1);
            dia.remove(dia.size()-1);
        }
	}
	public static boolean column(int c){
	    for(int i=0;i<col.size();i++)if(c==col.get(i)) return false;
	    return true;
	}
	public static boolean diagonal(int r,int c){
	    for(int i=0;i<dia.size();i++)
	    if(Math.abs(r-(dia.get(i)).get(0))==Math.abs(c-(dia.get(i)).get(1))) return false;
	    return true;
	}
}
