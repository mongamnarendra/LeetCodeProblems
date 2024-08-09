package LeetCodeProblems;

public class Leetcode3190 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int count=0;
        for(int n:nums)
        {
            if((n-1)%3==0 || (n+1)%3==0)
            {
                count++;
            }
        }
        return count;
    }
}
