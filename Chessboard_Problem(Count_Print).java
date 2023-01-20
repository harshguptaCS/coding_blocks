import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        harsh(n,0,0,"");
        System.out.print("\n"+h);
    }
    static int h=0;
    public static void harsh(int n,int i,int j,String ans){
        ans+="{"+i+"-"+j+"}";
        if(i==n-1&&j==n-1){
            h++;
            System.out.print(ans+" ");
            return;
        }
        if(i<n-2&&j<n-1){
            harsh(n,i+2,j+1,ans+"K");
        }
        if(i<n-1&&j<n-2){
            harsh(n,i+1,j+2,ans+"K");
        }
        int k=1;
        while(true)
        if((i==0||i==n-1)&&j!=n-k){
            harsh(n,i,j+k,ans+"R");
            k++;
        }
        else break;
        while(true)
        if((i==0||i==n-1||j==0)&&j!=n-k){
            harsh(n,i,j+k,ans+"R");
            k++;
        }
        else break;
        k=1;
        while(true)
        if((j==0||j==n-1||i==0)&&i!=n-k){
            harsh(n,i+k,j,ans+"R");
            k++;
        }
        else break;
        k=1;
        while(true)
        if((i!=n-k&&j!=n-k)&&(i==j||i+j==n-1)){
            harsh(n,i+k,j+k,ans+"B");
            k++;
        }
        else break;
    }
}
