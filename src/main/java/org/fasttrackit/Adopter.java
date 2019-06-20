package org.fasttrackit;

public class Adopter {
    private int money;
    private String name;
    private double foodQuantity;
    private double premiumFoodQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public double getPremiumFoodQuantity() {
        return premiumFoodQuantity;
    }

    public void setPremiumFoodQuantity(double premiumFoodQuantity) {
        this.premiumFoodQuantity = premiumFoodQuantity;
    }

}

