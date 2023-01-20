import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
        harsh(s);
        System.out.print(h);
    }
    static int h=0;
    public static void harsh(String s){
        if(s.length()<3) return;
        if(s.charAt(0)==s.charAt(2)) h++;
        harsh(s.substring(1));
    }
}
