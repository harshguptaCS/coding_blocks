import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            max=0;
            harsh(a,0,n-1,0);
            System.out.println(max);
        }
    }
    static int max;
    public static void harsh(int a[],int i,int j,int m){
        if(i==j){
            if(m>max) max=m;
            return;
        }
        int s1=a[i],s2=0;
        for(int k=i+1;k<=j;k++) s2+=a[k];
        for(int k=i;k<j;k++){
            if(s1==s2){
                harsh(a,i,k,m+1);
                harsh(a,k+1,j,m+1);
                break;
            }
            s1+=a[k+1];
            s2-=a[k+1];
        }
        if(m>max) max=m;
    }
}
