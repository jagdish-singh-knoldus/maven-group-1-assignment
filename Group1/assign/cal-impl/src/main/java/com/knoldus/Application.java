package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Calculator cal=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println("Addition of "+num1+" and "+num2+" is "+cal.sum(num1,num2));
        System.out.println("Subtraction of "+num1+" from "+num2+" is "+cal.sub(num1,num2));
        System.out.println("Multiplication of "+num1+" with "+num2+" is "+cal.mul(num1,num2));
        System.out.println("Division of "+num1+" by "+num2+" is "+cal.div(num1,num2));
    }
}
