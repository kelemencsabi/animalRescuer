package org.fasttrackit;


import java.time.LocalDate;

public class Food extends Store {

    public static void time(String[] args, int numberOfDays, int numberOfMonths) {


        LocalDate expirationDate = (LocalDate.now().plusMonths(numberOfMonths).plusDays(numberOfDays));
        System.out.println("expiration date: " + expirationDate);
    }

}




















