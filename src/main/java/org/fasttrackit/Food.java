package org.fasttrackit;


import java.time.LocalDate;

public class Food {

    private int price;
    private int availableQuantity;
    private String name;

    public LocalDate time(String[] args, int numberOfDays, int numberOfMonths) {


        LocalDate expirationDate = (LocalDate.now().plusMonths(numberOfMonths).plusDays(numberOfDays));
        System.out.println("expiration date: " + expirationDate);
        return expirationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




















