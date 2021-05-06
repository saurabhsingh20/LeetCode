package com.Saurabh;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {1, 2, 3, 4, 5, 6};

             ArrayRotate(nums,2);
             for(int element : nums)
                 System.out.print(element+" ");
         }


    public static void ArrayRotate(int[] nums,int k){
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int [] nums,int start ,int end)
    {
        while(start <end){
            int temp =nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
    }
}
