package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Prime Number");
        System.out.println("************");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int count=0;

        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(num==0 || num==1){
            System.out.println(num+" is not prime nor composite");
        }
        else if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
