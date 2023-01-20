import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        harsh(s,0,"");
    }
    public static void harsh(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        harsh(s,i+1,ans+(char)(s.charAt(i)-'0'+64));
        if(i<s.length()-1){
            if(s.charAt(i)-'0'<3&&(s.charAt(i)-'0'!=2||s.charAt(i+1)-'0'<7)){
                harsh(s,i+2,ans+(char)((s.charAt(i)-'0')*10+s.charAt(i+1)-'0'+64));
            }
        }
    }
}
