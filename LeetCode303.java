package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode303 {
    public static void main(String[] args) {
        int[] n= {-2,0,3,-5,2,-1};
        System.out.println(sum(n));
    }

    private static int sum (int[] n)
    {
        int right =5;
        int left=2;
        for(int i=1;i<n.length;i++)
        {
            n[i]+=n[i-1];
        }
        System.out.println(Arrays.toString(n));

        if(left==0)
        {
            return n[right];
        }
        return n[right]-n[left-1];
    }
}
