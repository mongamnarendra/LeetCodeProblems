package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode179 {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String[] stringNums = new String[nums.length];
        int i = 0;
        for (int n : nums) {
            stringNums[i++] = String.valueOf(n);
        }

        Arrays.sort(stringNums, (a, b) -> (b + a).compareTo(a + b));

        String result = "";
        for (String n : stringNums) {
            result += n;
        }
        return result.charAt(0) == '0' ? "0" : result;
    }
}
