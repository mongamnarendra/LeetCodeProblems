package LeetCodeProblems;
import java.util.HashMap;
public class LeetCode169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm  =new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int res =0;
        int major=0;
        for(int i:nums)
        {
            int n = hm.get(i);
            if(n>res)
            {
                major=i;
                res=hm.get(i);
            }
        }

        return major;

        /*Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];*/
    }
}
