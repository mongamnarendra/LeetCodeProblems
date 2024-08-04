package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode1508 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(rangeSum(nums,4,1,5));
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr= new int[n*(n+1)/2];
        int index= 0;
        for(int i=0;i<nums.length;i++)
        {
            int sum =0;
            for(int j = i;j<nums.length;j++)
            {
                sum += nums[j];
                arr[index++]=sum;
            }
        }
        int sum= 0;
        Arrays.sort(arr);
        int mod = (int) 1e9+7;
        while(left <= right)
        {
            sum=(sum+arr[left-1])%mod;
            left++;
        }
        return sum;
    }
}
