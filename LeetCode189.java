package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode189 {
    public static void main(String[] args) {
        int[] nums={1,2};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {

        k=k%nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);

    }
    private static void reverseArray(int[] nums,int start,int end)
    {
        while (start<=end)
        {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
