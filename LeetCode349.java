package LeetCodeProblems;

import java.util.ArrayList;
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
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    al.add(nums2[i]);
                }
            }
        }
        int[] res=new int[al.size()];
        int index=0;
        for(int a:al)
        {
            res[index++]=a;
        }
        return res;

    }
}
