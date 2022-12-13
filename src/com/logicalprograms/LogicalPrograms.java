package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("****************");
        System.out.println("");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0,a=0,b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<num;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
}
