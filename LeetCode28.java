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

}
