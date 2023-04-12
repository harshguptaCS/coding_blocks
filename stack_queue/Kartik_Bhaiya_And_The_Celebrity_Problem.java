import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(),c=0,fl=0;
		int matrix[][]=new int[n][n];
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		matrix[i][j]=input.nextInt();
		for(int i=0;i<n;i++){
		    c=1;
		    for(int j=0;j<n;j++){
		        if(i==j) continue;
				if(matrix[j][i]==0){
					c=0;
					break;
				}
		    }
		    if(c==1){
				fl=1;
		        System.out.print(i);
		        break;
		    }
		}
		if(fl==0) System.out.println("No Celebrity");
    }
}
