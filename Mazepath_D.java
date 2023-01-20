import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        harsh(0,0,n1,n2,"");
        System.out.print("\n"+h);
    }
    static int h=0;
    public static void harsh(int i,int j,int n1,int n2,String s){
        if(i==n1-1&&j==n2-1){
            System.out.print(s+" ");
            h++;
            return;
        }
        if(i!=n1-1){
            harsh(i+1,j,n1,n2,s+"V");
        }
        if(j!=n2-1){
            harsh(i,j+1,n1,n2,s+"H");
        }
        if(i!=n1-1&&j!=n2-1){
            harsh(i+1,j+1,n1,n2,s+"D");
        }
    }
}
