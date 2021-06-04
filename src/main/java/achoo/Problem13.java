package achoo;
import java.util.*;
import java.text.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem13 {
    public static void main(String args[]){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = a.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double i = a.nextDouble()/(double)100;
        System.out.print("Enter the number of years: ");
        double yr = a.nextDouble();
        System.out.print("What is the number of time the interest is compounded per year? ");
        double t = a.nextDouble();
        double amt = Math.round(p*Math.pow((1+i/t),t*yr)*100)/(double)100;
        System.out.println("After "+yr+" years at "+i*100+"% interest compounded "+t+" times per year, the investment will be worth "+nf.format(amt));
    }
}