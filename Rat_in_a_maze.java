import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        String grid[]=new String[r];
        for(int i=0;i<r;i++)
        grid[i]=sc.next();
        int ans[][]=new int[r][c];
        int visit[][]=new int[r][c];
        ans[0][0]=1;
        visit[0][0]=1;
        harsh(grid,0,0,visit,ans,r,c);
        if(fl==1)
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        else System.out.println("-1");
    }
    static int fl=0;
    public static void harsh(String grid[],int i,int j,int visit[][],int ans[][],int r,int c){
        if(i==r-1&&j==c-1){
            fl=1;
            return;
        }
        if(fl==1) return;
        if((j!=c-1&&grid[i].charAt(j+1)!='X')&&visit[i][j+1]==0){
            visit[i][j+1]=1;
            ans[i][j+1]=1;
            harsh(grid,i,j+1,visit,ans,r,c);
            if(fl==0) ans[i][j+1]=0;
        }
        if(fl==1) return;
        if((i!=r-1&&grid[i+1].charAt(j)!='X')&&visit[i+1][j]==0){
            visit[i+1][j]=1;
            ans[i+1][j]=1;
            harsh(grid,i+1,j,visit,ans,r,c);
            if(fl==0) ans[i+1][j]=0;
        }
    }
}
