package Leetcode;

import java.util.Arrays;

public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);

        if (index < 0) {
            index = -index - 1;
        }
        return index;
    }


}
