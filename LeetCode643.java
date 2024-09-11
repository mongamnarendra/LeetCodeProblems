package LeetCodeProblems;

public class LeetCode643 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double max = sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max/k;
    }
}
