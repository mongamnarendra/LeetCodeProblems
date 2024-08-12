package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode242_Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));

    }

    public static boolean isAnagram(String s, String t)
    {
        char[] S=s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);

        return Arrays.equals(S,T);

    }

//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character,Integer> hm1 = new HashMap<>();
//        HashMap<Character,Integer> hm2 = new HashMap<>();
//        for(char c:s.toCharArray())
//        {
//            if(hm1.containsKey(c))
//            {
//                hm1.put(c,hm1.getOrDefault(c,0)+1);
//            }
//            else {
//                hm1.put(c,1);
//            }
//        }
//
//        for(char c:t.toCharArray())
//        {
//
//                hm1.put(c,hm1.getOrDefault(c,0)-1);
//
//
//        }
//
//
//        for(int v: hm1.values())
//        {
//            if(v!=0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
}
