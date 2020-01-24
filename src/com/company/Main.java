package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(factorial(arr[i])); ;
        }
    }

    private static int factorial(int num) {
        int fact=1;
        for (int i=1;i<=num;i++)
            fact=fact*i;
        return fact;
    }
}
