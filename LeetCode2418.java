package Leetcode;

import java.util.Arrays;
import java.util.TreeMap;

class main
{
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer , String > hm = new TreeMap<>();
        for(int i=0;i<heights.length;i++)
        {
            hm.put(heights[i],names[i]);
        }

        String[] result = new String[names.length];
        int end = names.length-1;
        for(String name:hm.values())
        {
            result[end--] = name;
        }
        return result;
    }



}
