package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Reverse Number");
        System.out.println("*************");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int rev=0,rem;

        while(num!=0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}
