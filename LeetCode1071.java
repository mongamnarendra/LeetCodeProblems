package LeetCodeProblems;

public class LeetCode1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
    }
    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int j = gcd(str1.length(),str2.length());
        return str1.substring(0,j);
    }
    private static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}
