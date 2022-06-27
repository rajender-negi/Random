package dp;
import java.lang.*;

public class Knapsack0to1
{
    static int n=3;
    static int[] weight =new int[]{ 1,3,4,5};
    static int[] value = new int[]{1,10,4,2};
    static int W=10;

    public static void main (String args[])
    {
        Knapsack0to1 ks= new Knapsack0to1();
        int profit = ks.knapsack(weight,value,W,n);
        System.out.println("profit: "+profit);
    }

    public static int knapsack(int[] weight,int[] value,int W,int n)
    {
        if(n==0 || W==0)
            return 0;
        if(weight[n]<W){
            return Math.max(value[n-1]+knapsack(weight,value,W-weight[n-1],n-1),knapsack(weight,value,W,n-1));
        }else {
            return knapsack(weight,value,W,n-1);
        }
    }
}
