package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode2022 {
    public static void main(String[] args) {
        int[] original={1,2,3,4};
        int[][] result = construct2DArray(original,2,2);
        for(int[] n:result)
        {
            System.out.println(Arrays.toString(n));
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)
        {
            return new int[][] {};
        }
        int[][] arr = new int[m][n];
        int index=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=original[index++];
            }
        }

        return arr;
    }
}
