import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        s=s.replace('0','5');
        n=Integer.parseInt(s);
        System.out.print(n);
    }
}
