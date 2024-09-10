package LeetCodeProblems;

public class LeetCode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {

        s=s.trim();
        String[] result = s.split(" ");
        String answer="";
        for(int i=result.length-1;i>=0;i--)
        {
            if(result[i]!="")
            {
                answer+=result[i]+" ";
            }
        }

        return answer.trim();
    }
}
