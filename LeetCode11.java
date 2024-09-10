package LeetCodeProblems;

public class LeetCode11 {
    public static void main(String[] args) {
        int[] heights={1,1};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] height) {
        int max=0;
        int j=height.length-1;
        int i=0;
        while(i<j)
        {
            int min=Math.min(height[i],height[j])*(j-i);
            max=Math.max(max,min);
            if(height[i]<height[j])
            {
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
