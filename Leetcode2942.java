package LeetCodeProblems;
import java.util.ArrayList;
public class Leetcode2942 {
    public static void main(String[] args) {
        String[] words={"rmypzoyto","wvhtrbuz","dgt","tmhqswmkx","trpjwzitp","tbetdxic"};
        System.out.println(findWordsContaining(words,'t'));
    }

    public static ArrayList<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i<= words.length-1)
        {
            if(words[i].length()==j)
            {
                i++;
                j=0;
                continue;
            }
            if(words[i].charAt(j)==x)
            {
                al.add(i);
                j=0;
                i++;
            }
            else {
                j++;
            }
        }
        return al;
    }
}
