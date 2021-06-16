package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.print(maximumWealth(accounts));
    }


    public static int maximumWealth(int[][] accounts) {

        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for ( int account : customer)
                wealth += account;
            max = Math.max(max, wealth);
        }
        return max;
    }
}


