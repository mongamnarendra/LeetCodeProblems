package LeetCodeProblems;

public class Leetcode2390 {
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s)
    {
        String res="";
        StringBuilder sb = new StringBuilder(res);
        int index = -1;
        for(char i:s.toCharArray())
        {
            if(i=='*')
            {
                sb.deleteCharAt(index--);

            }
            else {
                sb.append(i);
                index++;
            }
        }

        return sb.toString();
    }
}
