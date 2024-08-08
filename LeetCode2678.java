package LeetCodeProblems;

public class LeetCode2678 {
        public static int countSeniors(String[] details) {
            int count =0;

            for(String name:details)
            {
                if(name.charAt(11) >= '6')
                {
                    if((name.charAt(11) == '6' && name.charAt(12)== '0'))
                    {
                        continue;
                    }
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        System.out.println(countSeniors(details));
    }

}
