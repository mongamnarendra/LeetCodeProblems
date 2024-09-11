package LeetCodeProblems;

public class LeetCode392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        int i=0;
        for(int j=0;j<t.length();j++)
        {
            if(t.charAt(j)==s.charAt(i) && i!=s.length())
            {
                i++;
            }
        }
        return i==s.length()?true:false;
    }
}
