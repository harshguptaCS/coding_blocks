import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        harsh(s,"","");
    }
    static int h=0;
    public static void harsh(String s,String s1,String s2){
        if(s.length()<2){
            System.out.println(h);
            System.out.println(s1+s);
            System.out.println(s2+s);
            return;
        }
        if(s.charAt(0)=='h'&&s.charAt(1)=='i'){
            h++;
            harsh(s.substring(2),s1,s2+"bye");
        }
        else{
            harsh(s.substring(1),s1+s.charAt(0),s2+s.charAt(0));
        }
    }
}
