package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode1310 {
    public static void main(String[] args) {
        int[] arr = {4,8,2,10};
        int[][] queries = {{2,3},{1,3},{0,0},{0,3}};
        System.out.println(Arrays.toString(xorQueries(arr,queries)));

    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int index=0;
        for(int i=0;i<queries.length;i++)
        {
            int left = queries[i][0];
            int right = queries[i][1];
            int temp=0;
            while(left<=right)
            {
                temp^=arr[left++];
            }
            result[index++]=temp;
        }
        return result;
    }
}
