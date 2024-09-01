package LeetCodeProblems;

public class LeetCode2270 {
    public static void main(String[] args) {
        int[] nums={2,3,1,0};
        System.out.println(waysToSplitArray(nums));
    }
    public static int waysToSplitArray(int[] nums) {
        int sum =0;
        for(int n:nums)sum+=n;
        int curSum=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(curSum>=sum-curSum)count++;
            curSum+=nums[i];
        }

        return count;


    }
}
