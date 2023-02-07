import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        temp.add(0);
        temp.add(0);
        harsh(n,0,0,0,"");
        System.out.print("\n"+count);
    }
    static int count=0;
    static int r[]={-1,-2,-2,-1};
    static int c[]={-2,-1,1,2};
    static List<Integer> temp=new ArrayList<>();
    static List<List<Integer>> data=new ArrayList<>();
    public static void harsh(int n,int i,int j,int c,String s){
        if(c==n){
            count++;
            System.out.print(s+" ");
            return;
        }
        for(int I=i;I<n;I++){
            for(int J=j;J<n;J++){
                if(safe(I,J)){
                    temp.set(0,I);
                    temp.set(1,J);
                    data.add(new ArrayList<>(temp));
                    harsh(n,I,J+1,c+1,s+"{"+I+"-"+J+"} ");
                    data.remove(data.size()-1);
                }
            }
            j=0;
        }
    }
    public static boolean safe(int i,int j){
        for(int x=0;x<4;x++){
            temp.set(0,i+r[x]);
            temp.set(1,j+c[x]);
            if(data.contains(temp)) return false;
        }
        return true;
    }
}
