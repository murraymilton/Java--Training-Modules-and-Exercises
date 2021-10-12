package com.company;

public class Main {

    public static void main(String[] args) {
	// Control Flow: Comparison Operators
//        int x = 3;
//        int y = 5;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x <= y);
//        System.out.println(x >= y);

        // Logical Operators
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
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

    }
}
