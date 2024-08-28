package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n:nums1)
        {
            s1.add(n);
        }

        for(int n:nums2)
        {
            s2.add(n);
        }

        s1.retainAll(s2);
        int[] res=new int[s1.size()];
        int i=0;
        for(int s:s1)
        {
            res[i++]=s;
        }
        return res;
    }
}
