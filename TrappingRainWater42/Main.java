package com.Saurabh;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height)
    {
        if(height == null || height.length == 0 )
            return 0;
        int res = 0 , left = 0 , level = 0 , right = height.length - 1;
        while(left < right){
            int lower = height[height[left] < height[right] ? left ++ : right--];
            level = Math.max(level , lower);
            res += level - lower;
        }
        return res;
    }
}
