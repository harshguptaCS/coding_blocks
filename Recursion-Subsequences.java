import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> l=new ArrayList<>();
        l.add("");
        harsh(s,l,s.length()-1);
        System.out.print("\n"+h);
    }
    static int h=1;
    public static void harsh(String s,List<String> l,int i){
        if(i<0) return;
        int x=l.size();
        for(int j=0;j<x;j++){
            l.add(s.charAt(i)+l.get(j));
            System.out.print(" "+s.charAt(i)+l.get(j));
            h++;
        }
        harsh(s,l,i-1);
    }
}
