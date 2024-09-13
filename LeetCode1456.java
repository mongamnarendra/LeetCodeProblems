package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1456 {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println(maxVowels(s,3));
    }
    public static int maxVowels(String s, int k) {
        int max=0;
        int window=0;
        Set<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        for(int i=0;i<k;i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                window++;
            }
        }
        max=window;

        for(int i=k;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i-k)))
            {
                window--;
            }
            if(hs.contains(s.charAt(i)))
            {
                window++;
            }
            max=Math.max(max,window);
            if(max==k)return max;
        }
        return max;
    }
}
