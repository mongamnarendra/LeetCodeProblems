package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode1679 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(maxOperations(nums,5));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==k)
            {
                i++;
                j--;
                count++;
            }
            else if(sum>k)
            {
                j--;
            }
            else {
                i++;
            }
        }

        return count;
    }
}
