package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int[] n={0,0,1,0,3,12};
        moveZeroes(n);
        System.out.println(Arrays.toString(n));
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
