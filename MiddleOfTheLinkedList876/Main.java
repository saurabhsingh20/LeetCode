package com.Saurabh;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            linkedlist l = new linkedlist();
            for(int i =0 ; i<n ;i++)
                l.insertAtEnd(sc.nextInt());
            l.printMiddle();
        }
    }
}