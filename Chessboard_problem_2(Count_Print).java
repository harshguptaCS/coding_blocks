import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=1,r=n*n;
        int mat[]=new int[r];
        for(int i=1;i<r;i++){
            if(mat[i]==-1) continue;
            mat[i]=c;
            c=3-c;
            int x=2;
            while((i+1)*x<=r){
                mat[(i+1)*x-1]=-1;
                x++;
            }
        }
        harsh(n,0,0,"",mat);
        System.out.print("\n"+h);
    }
    static int h=0;
    public static void harsh(int n,int i,int j,String ans,int mat[]){
        if(i<0||j<0||i>=n||j>=n||mat[i*n+j]==1) return;
        ans+="{"+i+"-"+j+"}";
        if(i==n-1&&j==n-1){
            h++;
            System.out.print(ans+" ");
            return;
        }
        if(mat[i*n+j]==2)harsh(n,n-1,n-1,ans+"P",mat);
        harsh(n,i+2,j+1,ans+"K",mat);
        harsh(n,i+1,j+2,ans+"K",mat);
        int k=1;
        while(true)
        if((i==0||i==n-1||j==0)&&j!=n-k){
            harsh(n,i,j+k,ans+"R",mat);
            k++;
        }
        else break;
        k=1;
        while(true)
        if((j==0||j==n-1||i==0)&&i!=n-k){
            harsh(n,i+k,j,ans+"R",mat);
            k++;
        }
        else break;
        k=1;
        while(true)
        if((i!=n-k&&j!=n-k)&&(i==j||i+j==n-1)){
            harsh(n,i+k,j+k,ans+"B",mat);
            k++;
        }
        else break;
    }
}
