import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        odd(n);
        if(n>=2)
        even(n,2);
    }
    public static void odd(int n){
        if(n<0) return;
        if(n%2==0) n--;
        System.out.println(n);
        odd(n-2);
    }
    public static void even(int n,int i){
        if(i>n) return;
        System.out.println(i);
        even(n,i+2);
    }
}
