package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeetCode1207 {
    public static void main(String[] args) {
        int[] nums={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(nums));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:arr)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        System.out.println(hm);
        System.out.println(hm.values());
        boolean result=true;
        int prev=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList<>(hm.values());
        Collections.sort(al);
        for(int n:al)
        {
            if(n==prev)
            {
                return false;
            }
            else {
                prev=n;
            }
        }

        return result;
    }
}
