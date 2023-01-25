import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            harsh(s,0,"");
        }
    }
    public static void harsh(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(i!=s.length()-1&&(s.charAt(i)=='p'&&s.charAt(i+1)=='i')){
            harsh(s,i+2,ans+"3.14");
        }
        else harsh(s,i+1,ans+s.charAt(i));
    }
}
