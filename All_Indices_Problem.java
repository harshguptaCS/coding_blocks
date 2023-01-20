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
        harsh(a,m,0);
    }
    public static void harsh(int a[],int m,int i){
        if(a[i]==m){
            System.out.print(i+" ");
        }
        if(i!=a.length-1){
            harsh(a,m,i+1);
        }
        else{
            return;
        }
    }
}
