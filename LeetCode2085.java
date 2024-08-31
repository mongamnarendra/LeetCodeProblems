package LeetCodeProblems;

import java.util.HashMap;

public class LeetCode2085 {
    public static void main(String[] args) {
        String[] words1={"a","a","a","ab"};
        String[] words2 = {"a","ab"};
        System.out.println(countWords(words1,words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(String n:words1)
        {
            hm1.put(n,hm1.getOrDefault(n,0)+1);
        }
        for(String n:words2)
        {
            hm2.put(n,hm2.getOrDefault(n,0)+1);
        }

        int count = 0;
        for(String n:words1)
        {
            if(hm1.get(n)==1 && hm2.containsKey(n))
            {
                if(hm2.get(n)==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
