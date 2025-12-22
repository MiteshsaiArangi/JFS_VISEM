package com.skillnext;

import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number");
        if(a%2==0){
            System.out.println(a+"Even");
        }
        else{
            System.out.println(a+"Odd");
        }
    }
}