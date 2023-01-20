import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            harsh(s,0);
            System.out.println();
        }
    }
    public static void harsh(String s,int i){
        if(i==s.length()){
            System.out.print(s+" ");
            return;
        }
        if(s.charAt(i)=='?'){
            harsh(s.substring(0,i)+'0'+s.substring(i+1),i+1);
            harsh(s.substring(0,i)+'1'+s.substring(i+1),i+1);
        }
        else harsh(s,i+1);
    }
}
