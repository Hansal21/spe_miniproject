package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {

    public double sqrt(double x){
        double answer=Math.sqrt(x);
        logger.info("Square root of "+x+" is "+answer);
        return answer;
    }
    public double log(double x){
        double answer=Math.log(x);
        logger.info("Natural Log of "+x+" is "+answer);
        return answer;
    }
    public double power(Double base,Double power){
        double answer=Math.pow(base,power);
        logger.info(base+" power "+power+" is "+answer);
        return answer;
    }
    public Long factorial(Integer num) {
        Long x= 1L;
        for(int i=1;i<=num;i++){
            x=i*x;
        }
        logger.info("Factorial of "+num+" is "+x);
        return x;
    }
    private static final Logger logger= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Main main=new Main();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag==true) {
            System.out.println();
            System.out.println("1.Square root function - √x");
        System.out.println("2.Factorial function - x!");
        System.out.println("3.Natural logarithm (base е) - ln(x)");
        System.out.println("4.Power function - xb");
        System.out.println("5.Exit");
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Number:");
                    Double num = sc.nextDouble();
                    System.out.println("Square root of " + num + " is " + main.sqrt(num));
                    break;
                case 2:
                    System.out.print("Enter Number:");
                    Integer x = sc.nextInt();
                    System.out.println("Factorial of " + x + " is " + main.factorial(x));
                    break;
                case 3:
                    System.out.print("Enter Number:");
                    num = sc.nextDouble();
                    System.out.println("Natural Log of " + num + " is " + main.log(num));
                    break;
                case 4:
                    System.out.print("Enter base Number:");
                    Double base = sc.nextDouble();
                    System.out.print("Enter power:");
                    Double power = sc.nextDouble();
                    System.out.println(base + " Power " + power + " is " + main.power(base, power));
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice, Please Try again");
            }
        }
    }


}