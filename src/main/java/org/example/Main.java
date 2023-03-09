package org.example;

import java.util.Scanner;

public class Main {

    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public static void main(String[] args) {
        Main main=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Square root function - √x");
        System.out.println("2.Factorial function - x!");
        System.out.println("3.Natural logarithm (base е) - ln(x)");
        System.out.println("4.Power function - xb");
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter Number:");
                Double num=sc.nextDouble();
                System.out.println("Square root of "+num+" is "+main.sqrt(num));
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:

        }

    }


}