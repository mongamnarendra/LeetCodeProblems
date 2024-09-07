package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode238 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[] {4,3,2,1,2})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int product=1;
        for(int i:nums){
            product*=i;
        }
        arr[0]=product;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr[i]=product/nums[i];
            }
            else {
                int p =1;
                for(int j=0;j<nums.length;j++){
                    if(j!=i)
                    {
                        p*=nums[j];
                    }
                }
                arr[i]=p;
            }
        }

        return arr;
    }
}
