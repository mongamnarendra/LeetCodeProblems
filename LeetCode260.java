package LeetCodeProblems;
import java.util.Arrays;
import java.util.HashMap;
public class LeetCode260 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1,2,1,2,3,4})));
    }
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[2];

        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int index=0;
        for(int i:nums)
        {
            if(hm.get(i)==1)
            {
                arr[index++]=i;
            }
        }

        return arr;
    }
}
