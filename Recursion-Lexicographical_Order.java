import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        harsh(0,n);
    }
    public static void harsh(int x, int n)
    {
        if(x>n) return ;
        System.out.print(x+" ");
        int i=0;
        if(x==0) i=1;
        for(;i<=9;i++){
            harsh(x*10+i,n);
        }
    }

}
