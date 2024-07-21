package Leetcode;

public class LeetCode1351 {
    public static void main(String[] args) {

        int[][] nnums={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println(findRow(nnums));
    }
    public static int findRow(int[][] nums)
    {
        int count =0;
        for(int i=0;i< nums.length;i++)
        {
            count+=findNeg(nums[i]);
        }
        return count;
    }

    private static int findNeg(int[] num) {
        int count=0;
        for(int n:num)
        {
            if(n<0)

            {
                count++;
            }
        }
        return count;
    }
}
