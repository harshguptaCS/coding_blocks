import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            s=s.replace("pi","3.14");
            System.out.println(s);
        }
    }
}
