package LeetCodeProblems;

public class LeetCode485 {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curMax=0;
        for(int i:nums)
        {
            if(i==0)
            {
                max=Math.max(max,curMax);
                curMax=0;
            }
            else {
                curMax++;
            }
        }
        return  Math.max(max,curMax);
    }
}
