package LeetCodeProblems;

public class LeetCode345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        char[] word=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        while(i<j)
        {
            while(i<j && vowels.indexOf(word[i])==-1)
            {
                i++;
            }
            while(i<j && vowels.indexOf(word[j])==-1)
            {
                j--;
            }
            char t = word[i];
            word[i]=word[j];
            word[j]=t;
            i++;
            j--;
        }
        return new String(word);



    }
}
