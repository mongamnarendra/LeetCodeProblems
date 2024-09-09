package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode88 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length>m && nums1.length-m==n)
        {
            System.arraycopy(nums2,0,nums1,m,n);
            Arrays.sort(nums1);
        }
    }
}
