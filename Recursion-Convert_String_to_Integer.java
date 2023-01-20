import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(harsh(s,0));
    }
    public static int harsh(String s,int ans){
        if(s.length()==0) return ans;
        ans+=(s.charAt(0)-'0')*Math.pow(10,s.length()-1);
        return harsh(s.substring(1),ans);
    }
}
