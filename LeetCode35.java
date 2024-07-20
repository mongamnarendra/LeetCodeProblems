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

        //Another method

//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        return left;
    }


}
