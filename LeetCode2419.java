package LeetCodeProblems;

public class LeetCode2419 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int maxAND=0;
        for(int n:nums)
        {
            maxAND=Math.max(maxAND,n);
        }
        int curLen=0;
        int maxLen=0;
        for(int n:nums)
        {
            if(n==maxAND)
            {
                curLen++;
                maxLen=Math.max(maxLen,curLen);
            }
            else {
                curLen=0;
            }
        }
        return maxLen;
    }
}
