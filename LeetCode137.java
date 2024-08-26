package LeetCodeProblems;

import java.util.HashMap;

public class LeetCode137 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
            else {
                hm.put(i,1);
            }
        }
        System.out.println(hm);
        for(int i:nums)
        {
            if(hm.get(i)==1)
            {
                return i;
            }
        }

        return 0;
    }
}
