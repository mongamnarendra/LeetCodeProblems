package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result=new int[nums1.length+ nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        int mid = (result.length)/2;
        if(result.length%2 ==0)
        {
            int sum=result[mid]+result[mid-1];
            return (double) sum/2;
        }
        return result[mid];
    }

    private static double Method2(int[] nums1, int[] nums2)
    {
        int[] result=new int[nums1.length+ nums2.length];
         int index=0;
         for(int n:nums1)
         {
             result[index++]=n;
         }

         for(int n:nums2)
         {
             result[index++]=n;
         }

         Arrays.sort(result);
         int mid = (result.length)/2;
         if(result.length%2 ==0)
         {
             int sum=result[mid]+result[mid-1];
             return (double) sum/2;
         }
         return (double) result[mid];
    }
}
