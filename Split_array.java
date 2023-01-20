import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s2=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s2+=a[i];
        }
        String r="";
        for(int i=0;i<n;i++){
            harsh(a,""+a[i],r,a[i],s2-a[i],i);
            r+=a[i]+" ";
        }
        System.out.print(h);
    }
    static int h=0;
    public static void harsh(int a[],String l,String r,int s1,int s2,int i){
        if(s1>s2) return;
        if(s1==s2){
            h++;
            System.out.print(l+" and "+r);
            for(int k=i+1;k<a.length;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
            return;
        }
        for(int j=i+1;j<a.length;j++){
            harsh(a,l+" "+a[j],r,s1+a[j],s2-a[j],j);
            r+=a[j]+" ";
        }
    }
}
