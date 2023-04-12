import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner inp=new Scanner(System.in);
        int mat[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
        int n=inp.nextInt(),q=inp.nextInt();
        Stack<Integer> madara=new Stack<>();
        Stack<Integer> obito=new Stack<>();
        Stack<Integer> hashirama=new Stack<>();
        for(int i=0;i<n;i++)
        madara.push(inp.nextInt());
        harsh(madara,obito,hashirama,q,0,mat);
        while(!madara.empty())
        System.out.println(madara.pop());
        while(!obito.empty())
        System.out.println(obito.pop());
    }
    public static void harsh(Stack<Integer> madara,Stack<Integer> obito,Stack<Integer> hashirama,int q,int i,int mat[]){
        if(i==q) return;
        while(!madara.empty()){
            if(madara.peek()%mat[i]==0)
            hashirama.push(madara.pop());
            else obito.push(madara.pop());
        }
        while(!hashirama.empty())
        System.out.println(hashirama.pop());
        harsh(obito,madara,hashirama,q,i+1,mat);
    }
}
