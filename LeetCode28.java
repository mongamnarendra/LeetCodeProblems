package LeetCodeProblems;

public class LeetCode28 {
    public static void main(String[] args) {
        String haystack = "sad";
        String needle = "sads";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

//    public static int strStr(String haystack, String needle) {
//        if(needle.isEmpty())
//        {
//            return 0;
//        }
//        if(needle.length()>haystack.length())
//        {
//            return -1;
//        }
//        for(int i=0;i<=haystack.length()-needle.length();i++)
//        {
//            if(haystack.substring(i,i+needle.length()).equals(needle))
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
}
