package org.example;

import java.util.Scanner;

public class Main {

    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public double log(double x){
        return Math.log(x);
    }
    public Integer factorial(Integer num) {
        Integer x=1;
        for(int i=1;i<=num;i++){
            x=i*x;
        }
        return x;
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
                System.out.print("Enter Number:");
                Integer x=sc.nextInt();
                System.out.println(main.factorial(x));
                break;
            case 3:
                System.out.print("Enter Number:");
                num=sc.nextDouble();
                System.out.println(main.log(num));
                break;
            case 4:
                break;
            default:

        }

    }


}