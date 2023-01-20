import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        harsh(a,m,n-1);
    }
    public static void harsh(int a[],int m,int i){
        if(a[i]==m){
            System.out.print(i);
            return;
        }
        if(i!=0){
            harsh(a,m,i-1);
        }
        else{
            System.out.print(-1);
            return;
        }
    }
}
