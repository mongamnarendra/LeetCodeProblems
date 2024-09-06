package LeetCodeProblems;

public class Leetcode58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                len++;
            }
            if(s.charAt(i)==' ' && len!=0)
            {
                return len;
            }
        }
        return len;
    }
}
