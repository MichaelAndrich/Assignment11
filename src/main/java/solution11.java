/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt for how many euros user has
    use formula to convert from euros to us dollars
    prompt user for the current exchange rate
    print out new converted amount in us dollars

 */


import java.util.Scanner;

public class solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        String num1 = sc.nextLine();
        int euro = Integer.parseInt("" + num1);

        System.out.println("What is the exchange rate? ");
        String num2 = sc.nextLine();
        int rate = Integer.parseInt("" + num2);

        double convert = (euro * rate);

        System.out.println(""+(euro)+" euros at an exchange rate of "+(rate)+ " is "+(convert)+ "U.S. dollars. ");

    }
}
