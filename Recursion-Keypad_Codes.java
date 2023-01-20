import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String digits=sc.next();
		String [] s={"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        harsh(s,digits,0,"");
        System.out.print("\n"+h);
    }
    static int h=0;
    public static void harsh(String []s,String digits,int x,String ans){
        if(ans.length()==digits.length()){
            System.out.print(ans+" ");
            h++;
            return;
        }
        for(int i=0;i<s[digits.charAt(x)-'1'].length();i++){
            harsh(s,digits,x+1,ans+s[digits.charAt(x)-'1'].charAt(i));
        }
    }
}
