package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Perfect Number");
        System.out.println("**************");
        System.out.println(" ");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        /* Identifying the Factors of the number */
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
