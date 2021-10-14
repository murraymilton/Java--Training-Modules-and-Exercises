package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Control Flow: Comparison Operators
//        int x = 3;
//        int y = 5;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x <= y);
//        System.out.println(x >= y);

        // Logical Operator
//        int temperature = 22 ;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

        // Using the or || operator, if one condition is true then isEligible will be be set to True
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//
//        // If Statements
//    int temperature = 25;
//    if (temperature > 30) {
//        System.out.println("It's warm out");
//        System.out.println("Stay hydrated");
//    }
//    else if(temperature > 20 && temperature <=30){
//        System.out.println("It's nice outside today.");
//        System.out.println("Go for a walk and enjoy the Sunset.");
//    }
//    else
//        System.out.println("It's cold outside. You might need a jacket, unless your iceman");

        //Ternary Operator
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//
//        // Switch Statement
//
//        String role = "admin";
//
//        switch(role){
//            case "admin":
//                System.out.println("Your admin rights have been enabled. ");
//                break;
//            case "user":
//                System.out.println("Your user rights have been enabled.");
//                break;
//            default:
//                System.out.println("Your guest account has been enabled with minimal access.");
//        }
//        System.out.print("Enter a number:");
//        Scanner userInput =  new Scanner(System.in);
//        int number = userInput.nextInt();
//        if(number % 3 == 0 && number % 5 == 0){
//            System.out.println("FizzBuzz");
//        } else if(number % 3 == 0){
//            System.out.println("Buzz");
//        }else if(number % 5 == 0){
//            System.out.println("Fizz");
//        }else
//            System.out.println(number);

        // For Loops
//            for(int i = 0; i < 5; i++)
//                System.out.println("Hello Murray");
        // While Loops
//        Scanner scanner = new Scanner(System.in);
//        String userInput = "";
//        while (!userInput.equals( "quit")){
//            System.out.print("Enter a word");
//            userInput = scanner.next().toLowerCase();
//            System.out.println("Word entered:" + userInput);
//        }

//        Do While Loop
//        Scanner scanner = new Scanner(System.in);
//        String userInput = "";
//        do{
//            System.out.print("Enter a word:");
//            userInput = scanner.next().toLowerCase();
//            if (userInput.equals("quit"))
//                break;
//            System.out.println("Word entered:" + "" + userInput);
//
//        }while(!userInput.equals("quit"));
        // For Loop Vs For Each Loop
        String[] tech_companies = {"Google", "Oracle", "Microsoft", "Apple", "Cisco", };

        for (int i = 0; i < tech_companies.length; i++)
        System.out.println(tech_companies[i]);

        for (String i : tech_companies){
            System.out.println(i);
        }
    }
}
