import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grid[][]=new int[9][9];
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++)
        grid[i][j]=sc.nextInt();
        harsh(grid,0,0);
        
    }
    static int fl=0;
    public static void harsh(int grid[][],int i,int j){
        if(i==8&&j==9){
            fl=1;
            for(int I=0;I<9;I++){
                for(int J=0;J<9;J++){
                    System.out.print(grid[I][J]+" ");
                }
                System.out.println();
            }
            return;
        }
        if(j==9){
            j=0;
            i++;
        }
        if(grid[i][j]!=0){
            harsh(grid,i,j+1);
            return;
        }
        for(int k=1;k<=9;k++){
            if(row(grid,i,k)&&col(grid,j,k)&&mat(grid,i,j,k)){
                grid[i][j]=k;
                harsh(grid,i,j+1);
                if(fl==1) break;
            }
        }
        if(fl==0) grid[i][j]=0;
    }
    public static boolean row(int grid[][],int r,int k){
        for(int i=0;i<9;i++)
        if(grid[r][i]==k) return false;
        return true;
    }
    public static boolean col(int grid[][],int c,int k){
        for(int i=0;i<9;i++)
        if(grid[i][c]==k) return false;
        return true;
    }
    public static boolean mat(int grid[][],int r,int c,int k){
        for(int i=r/3*3;i<r/3*3+3;i++)
        for(int j=c/3*3;j<c/3*3+3;j++)
        if(grid[i][j]==k) return false;
        return true;
    }
}
