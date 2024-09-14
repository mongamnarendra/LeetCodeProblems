package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode2215 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> al1 = new HashSet<>();
        HashSet<Integer> al2 = new HashSet<>();
        for(int n:nums1)
        {
            al1.add(n);
        }
        for(int n:nums2)
        {
            al2.add(n);
        }
        List<Integer> l=new ArrayList<>();

        for(int n:al1)
        {
            if(!al2.contains(n))
            {
                l.add(n);
            }
        }
        list.add(l);
        List<Integer> l2=new ArrayList<>();

        for(int n:al2)
        {
            if(!al1.contains(n))
            {
                l2.add(n);
            }
        }
        list.add(l2);

        return list;
    }
}
