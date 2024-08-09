package LeetCodeProblems;

public class Leetcode2011 {
    public static void main(String[] args) {
        String[] op = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(op));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int c=0;

        for(String n:operations)
        {
            if(n.charAt(0)!='X')
            {
                if(n.charAt(0)=='-')
                {
                    --c;
                }
                else
                {
                    ++c;
                }
            }
            else
            {
                if(n.charAt(1)=='-')
                {
                    c--;
                }
                else
                {
                    c++;
                }
            }
        }

        return c;
    }
}
