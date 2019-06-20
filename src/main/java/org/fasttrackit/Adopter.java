package org.fasttrackit;

public class Adopter {
    private int money;
    private String name;
    private double foodQuantity;
    private double premiumFoodQuantity;

    public int feeding1(double foodQuantity, int hungerLevel) {
        if (hungerLevel == 5) {
            System.out.println("your pet is full now");
        } else {
            int difference = 5 - hungerLevel;
            if ((0.30 * difference) > foodQuantity) {
                System.out.println("you dont have enough food");
                return hungerLevel;
            }
            hungerLevel = 5;
            this.foodQuantity -= 0.3 * difference;
            System.out.println("your pet is full now");
        }
        return hungerLevel;
    }

    public int feeding2(double premiumFoodQuantity, int hungerLevel) {

        if (hungerLevel == 5) {
            System.out.println("your pet is full now");
        } else {
            int difference = 5 - hungerLevel;
            if ((0.15 * difference) > premiumFoodQuantity) {
                System.out.println("you dont have enough food");
                return hungerLevel;
            }
            hungerLevel = 5;
            this.premiumFoodQuantity -= 0.15 * difference;
            System.out.println("your pet is full now");
        }
        return hungerLevel;
    }


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

