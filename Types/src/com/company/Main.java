package com.company;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Primitive Types
//        byte age = 30;
//        long viewsCount = 7_239_357_753L;
//        float price = 289.99F;
//        char firstLetter = 'M';
//        boolean canDrive = true;

        // Reference Types Examples
        // We are calling an instances of the Date using new Date(), which will allocate space in memory
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        //Strings
        String message = "   Hello! Welcome to the Java Training Module";

        // Here we are using a method to check our string. Which will return a boolean value of true.
//        System.out.println(message.endsWith("le"));
//        //Will return a Boolean of false in this Method Call.
//        System.out.println(message.startsWith("30"));
        //Using the length Method to return the legnth of our string. We could also use the index to target a value:
//        System.out.println(message.length());
//        System.out.println(message.indexOf("Hello"));
//        // We are returning a new string. In Java strings are immutable.
//        System.out.println(message.replace("Hello", "David"));
//        System.out.println(message);
//        System.out.println(message.trim());

        //Escape Sequences
        String newHouseAddress = "1321 Victory \"Rd\"";
        System.out.println(newHouseAddress);

        // Arrays

//        int [] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 3;
//        numbers[2] = 5;
//        numbers[3] = 7;
//        numbers[4] = 9;
//        //Here we are using method overloading to print our Arrays to the console.
//        System.out.println(Arrays.toString(numbers));
//
//        float [] prices = {22.95F, 17.99F, 22.35F, 155.29F};
//        Arrays.sort(prices);
//        System.out.println(Arrays.toString(prices));
//        System.out.println(prices.length);
//
//        // multidimensional Arrays
//        float [][] loanNumbers = {{159.987F, 9875.594F, 79546.2515F},{13132.698F, 56457.6536F,3573.3573F}};
////        loanNumbers[0][0] = 298.112F;
//        System.out.println(Arrays.deepToString(loanNumbers));
//
//        //constants
//        final float PI = 3.14F;

        //Arithmetic Expressions
        // This is implicit casting
//        double result = (double)10/ (double) 3;
//
//        int x = 1;
//        ++x; // prefix
//        System.out.println(x);
//        x++; // postfix
//        System.out.println(x);
//
//        // Casting and Type Conversion
//        //Implicit cast example: We convert without lost of data byte > short > int > long
//        short y = 1;
//        int z = y + 2;
//        System.out.println(y);
//
//        // We are using explicit casting and stated that data/value lost is expected.
//        double annualInterest = 0.337;
//        int fixedRate = (int)annualInterest + 29;
//        System.out.println(fixedRate);
//
//        String bikePrice = "299";
//        int newBikePrice = Integer.parseInt(bikePrice) + 59;
//        System.out.println("With the state and Federal Tax. The Total price of the bike:" + newBikePrice);

        // The Math Class

        int result = (int)(Math.random() * 100);
        System.out.println(result);

        // Formatting numbers using method chaining
        String percentResult = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentResult);

        // User input reading

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age:");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine().trim(); // method chaining
        System.out.println("Hello:" + name);



    }
}
