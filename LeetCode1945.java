package LeetCodeProblems;

public class LeetCode1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }

    public static int getLucky(String s, int k) {
        String value="";

        for(int i=0;i<s.length();i++)
        {
            value+=(int)(s.charAt(i)-'a')+1;
        }

        while(k!=0)
        {
            int val=0;
            for(char c:value.toCharArray())
            {
                val+=c-'0';
            }
            value=Integer.toString(val);
            k--;
        }
        return Integer.parseInt(value);
    }
}
