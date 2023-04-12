import java.util.*;
public class Main {
	public static void main(String args[])  {
		Scanner inp=new Scanner(System.in);
		Stack<int []> s=new Stack<>();
		int n=inp.nextInt();
		for(int i=0;i<n;i++){
			int x=inp.nextInt();
			int ans=1;
			while(!s.empty()&&x>=s.peek()[0])
			ans+=s.pop()[1];
			s.push(new int[]{x,ans});
			System.out.print(ans+" ");
		}
		System.out.print("END");
	}
}
