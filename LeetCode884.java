package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LeetCode884 {
    public static void main(String[] args) {
        String s1="this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm1 = new HashMap<>();


        for(String n:s1.split(" "))
        {
            hm1.put(n,hm1.getOrDefault(n,0)+1);
        }

        for(String n:s2.split(" ")) {
            hm1.put(n, hm1.getOrDefault(n, 0) + 1);
        }

        List<String> al = new LinkedList<>();

        for(String n: hm1.keySet())
        {
            if(hm1.get(n)==1)
            {
                al.add(n);
            }
        }

        return (al.toArray(new String[al.size()]));
    }
}
