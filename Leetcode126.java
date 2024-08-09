package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode126 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int n:nums)
        {
            if(!al.contains(n))
            {
                al.add(n);
            }
        }

        int i =0;
        for(int n:al)
        {
            nums[i++]=n;
        }

        return al.size();
    }
}
