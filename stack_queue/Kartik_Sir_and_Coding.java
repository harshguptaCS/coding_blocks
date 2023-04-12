import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		List<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int x=inp.nextInt();
		    if(x==2){
				al.add(inp.nextInt());
			}
		    else{
				if(al.size()==0) System.out.println("No Code");
				else{
		        System.out.println(al.get(al.size()-1));
		        al.remove(al.size()-1);
				}
		    }
		}
    }
}
