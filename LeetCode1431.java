package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] c={2,3,5,1,3};
        int e = 3;
        System.out.println(kidsWithCandies(c,e));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int max = maximumInArray(candies);
        for(int n:candies)
        {
            if(n+extraCandies >=max)
            {
                al.add(true);
            }
            else {
                al.add(false);
            }
        }
        return al;
    }
    private static int  maximumInArray(int[] candies)
    {
        int max =-1;
        for(int n:candies)
        {
            if(n>max)
            {
                max=n;
            }
        }
        return max;
    }
}
