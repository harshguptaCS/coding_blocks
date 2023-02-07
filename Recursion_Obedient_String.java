import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.charAt(0)!='a'){
            System.out.print(false);
            return;
        }
        System.out.print(harsh(s));
    }
    public static boolean harsh(String s){
        if(s.length()==0) return true;
        if(s.charAt(0)=='a'&&(s.length()==1||(s.length()>=3&&(s.charAt(1)=='b'&&s.charAt(2)=='b')))){
            return harsh(s.substring(1));
        }
        if(s.length()<2) return false;
        if((s.charAt(0)=='b'&&s.charAt(1)=='b')&&(s.length()==2||(s.length()>=3&&s.charAt(2)=='a'))){
            return harsh(s.substring(2));
        }
        return false;
    }
}
