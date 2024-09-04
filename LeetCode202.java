package LeetCodeProblems;

import java.util.HashSet;

public class LeetCode202 {
    public static void main(String[] args) {
        System.out.println(happyNumber(61));
    }

    private static boolean happyNumber(int n)
    {
        HashSet<Integer> usedValues=new HashSet<>();

        while(true)
        {
            int sum =0;
            while (n!=0)
            {
                sum+=Math.pow(n%10,2);
                n=n/10;
            }

            if(sum==1) return true;

            n=sum;
            if(usedValues.contains(n))
            {
                return false;
            }
            usedValues.add(n);
        }

    }
}
