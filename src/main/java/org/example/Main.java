package org.example;

import java.util.Scanner;

public class Main {

    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public double log(double x){
        return Math.log(x);
    }
    public double power(Double base,Double power){
        return Math.pow(base,power);
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
                System.out.println("Factorial of "+x+" is "+main.factorial(x));
                break;
            case 3:
                System.out.print("Enter Number:");
                num=sc.nextDouble();
                System.out.println("Natural Log of "+num+" is "+main.log(num));
                break;
            case 4:
                System.out.print("Enter base Number:");
                Double base=sc.nextDouble();
                System.out.print("Enter power:");
                Double power=sc.nextDouble();
                System.out.println(base+" Power "+power+" is "+main.power(base,power));
                break;
            default:

        }

    }


}