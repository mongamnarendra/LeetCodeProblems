package LeetCodeProblems;

public class LeetCode1894 {
    public static void main(String[] args) {
        int[] nums={3,4,2,1};
        System.out.println((chalkReplacer(nums,8)));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i=0;i<chalk.length;i++)
        {
            sum+=chalk[i];
            if(sum>k)
            {
                break;
            }
        }
        k%=sum;
        for(int i=0;i<chalk.length;i++)
        {
            if(k<chalk[i])
            {
                return i;
            }
            k=k-chalk[i];

        }

        return 0;
    }
}
