import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        s=harsh(s,0,"");
        n=Integer.parseInt(s);
        System.out.print(n);
    }
    public static String harsh(String s,int i,String ans){
        if(i==s.length()){
            return ans;
        }
        if(s.charAt(i)=='0'){
            return harsh(s,i+1,ans+"5");
        }
        else return harsh(s,i+1,ans+s.charAt(i));
    }
}
