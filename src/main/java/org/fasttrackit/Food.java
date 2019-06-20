package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    private int price;
    private int availableQuantity;
    private String name;
    private LocalDate expirationDate;

    public void expirationDayCheck(LocalDate expirationDate, LocalDate now) {

        if (now.isBefore(expirationDate)) {
            System.out.println("this food hasn't expired yet");
        }else {
            System.out.println("this food has expired");
        }
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

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}




















