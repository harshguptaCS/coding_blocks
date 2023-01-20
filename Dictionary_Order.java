import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        String s2=new String(a);
        harsh(s1,s2,"");
    }
    static int fl=0;
    public static void harsh(String s1,String s2,String s){
        if(s2.length()==0){
            if(s.equals(s1)){
                fl=1;
                return;
            }
            System.out.println(s);
            return;
        }
        for(int i=0;i<s2.length();i++){
            if(fl==1) return;
            harsh(s1,s2.substring(0,i)+s2.substring(i+1),s+s2.charAt(i));
        }
    }
}
