import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt(),ans=0,h=0;
		List<Integer> al=new ArrayList<>();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		al.add(inp.nextInt());
		for(int i=0;i<n;i++)
		b[i]=inp.nextInt();
		for(int i=0;i<n;i++){
		    if(h==al.size()) h=0;
	        while(al.get(h)!=b[i]){
		        ans++;
		        h=(h+1)%al.size();
	        }
	        ans++;
	        al.remove(h);
		}
		System.out.println(ans);
    }
}
