package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {

        int i =0;
        int j = nums.length-1;
        int count =0;
        while(i<=j)
        {
            if(nums[i]==val)
            {
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                count++;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;
    }
}
