package LeetCodeProblems;

import java.util.HashSet;

public class LeetCode1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc"));
    }
    public static int countGoodSubstrings(String s) {
        if(s.length()<3)
        {
//            return 0;
        }
        int count =0;
        for(int i=0;i<=s.length()-3;i++)
        {
            String sub = s.substring(i,i+3);
            if(isDistinct(sub))
            {
                count++;
            }
        }
        return count;
    }

    private static boolean isDistinct(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(hs.contains(c))
            {
                return false;
            }
            hs.add(c);
        }

        return true;
    }
}
