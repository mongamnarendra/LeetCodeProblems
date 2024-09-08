package LeetCodeProblems;

public class LeetCode1768 {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="pq";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length())
        {
            result+=word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        if(j<word2.length())
        {
            result+=word2.substring(j,word2.length());
        }
        if(i<word1.length())
        {
            result+=word1.substring(i,word1.length());
        }
        return result;
    }

    private String method2(String word1,String word2)
    {
        StringBuilder result = new StringBuilder();
        int i=0;
        int j=0;
        int len1=word1.length();
        int len2=word2.length();
        while(i<len1 || j<len2)
        {
            if(i<len1)
            {
                result.append(word1.charAt(i++));
            }
            if(j<len2)
            {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
}
