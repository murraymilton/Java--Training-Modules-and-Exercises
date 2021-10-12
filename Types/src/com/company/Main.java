package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	//Primitive Types
        byte age = 30;
        long viewsCount = 7_239_357_753L;
        float price = 289.99F;
        char firstLetter = 'M';
        boolean canDrive = true;

        // Reference Types Examples
        // We are calling an instances of the Date using new Date(), which will allocate space in memory
        Date now = new Date();
        now.getTime();
        System.out.println(now);
    }
}
