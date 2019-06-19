package org.fasttrackit;

import java.util.Scanner;


public class App {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Adopter adopter = new Adopter();
        adopter.name = input.next();
        adopter.money = 100;

        System.out.println("Welcome " + adopter.name + ". You start the game with " + adopter.money +
                "$. Your goal in this game will be to take care of your pet." +
                "You can choose from the following pets:dog,cat,bird. What would you like to choose? ");

        String petType = input.next();

        Vet vet1 = new Vet();
        vet1.name = "Sofia";
        vet1.price = 10;

        Vet vet2 = new Vet();
        vet2.name = "Alex";
        vet2.price = 15;

        Food food1 = new Food();
        food1.price = 8;
        food1.availableQuantity = 34;
        food1.name = "insects";
        // food1.time(args, 2)

        Food food2 = new Food();
        food2.price = 10;
        food2.availableQuantity = 27;
        food2.name = "seeds";
        //  food2.time(args, 1)

        Food food3 = new Food();
        food3.price = 3;
        food3.availableQuantity = 42;
        food3.name = "dog food";
        // food3.time(args, 3);

        Food food4 = new Food();
        food4.price = 5;
        food4.availableQuantity = 50;
        food4.name = "premium dog food";
        //food4.time(args, 3);

        Food food5 = new Food();
        food5.price = 7;
        food5.availableQuantity = 30;
        food5.name = "milk";
        // food5.time(args, 1);

        Food food6 = new Food();
        food6.price = 9;
        food6.availableQuantity = 68;
        food6.name = "whiskas";
        // food6.time(args, 3);


        Cat cat = null;
        Dog dog = null;
        Bird bird = null;


        if (petType.equals("cat")) {
            cat = new Cat();
            System.out.println("enter your pets name: ");
            cat.name = input.next();
            System.out.println("enter your pets age: ");
            cat.age = input.nextInt();
            cat.healthStatus = 1;
            cat.hungerLevel = 1;
            cat.favoriteFood = "whiskas";


        } else if (petType.equals("dog")) {
            dog = new Dog();
            System.out.println("enter your pets name: ");
            dog.name = input.next();
            System.out.println("enter your pets age: ");
            dog.age = input.nextInt();
            dog.healthStatus = 1;
            dog.hungerLevel = 1;
            dog.favoriteFood = "premium dog food";


        } else {
            bird = new Bird();
            System.out.println("enter your pets name: ");
            bird.name = input.next();
            System.out.println("enter your pets age: ");
            bird.age = input.nextInt();
            bird.healthStatus = 1;
            bird.hungerLevel = 1;
            bird.favoriteFood = "seeds";


        }

        System.out.println("what whould you like to do? "
                + "1.buy food or toys "
                + "2.feed your pet "
                + "3.go to the vet "
                + "4.outdoor activity "
                + "5.check inventory "
                + "6.check pet status ");


        while (input.nextInt() == 1) {

            System.out.println("what food would you like to buy?");
            System.out.println("1:" + food1.name + ", " + food1.price + "$/kg, " + food1.availableQuantity + "kg.");
            food1.time(args, 24, 2);
            System.out.println("2:" + food2.name + ", " + food2.price + "$/kg, " + food2.availableQuantity + "kg.");
            food2.time(args, 11, 1);
            System.out.println("3:" + food3.name + ", " + food3.price + "$/kg, " + food3.availableQuantity + "kg.");
            food3.time(args, 12, 3);
            System.out.println("4:" + food4.name + ", " + food4.price + "$/kg, " + food4.availableQuantity + "kg.");
            food4.time(args, 3, 4);
            System.out.println("5:" + food5.name + ", " + food5.price + "$/l, " + food5.availableQuantity + "l.");
            food5.time(args, 13, 2);
            System.out.println("6:" + food6.name + ", " + food6.price + "$/kg, " + food6.availableQuantity + "kg.");
            food6.time(args, 7, 3);
            int foodChoice = input.nextInt();

            if (dog == null && bird == null) {

                if (foodChoice < 5) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                } else if (foodChoice % 2 == 1) {

                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 3 * food5.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.foodQuantity += quantity;
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");

                } else {

                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 5 * food6.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.premiumFoodQuantity += quantity;
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }
            if (cat == null && bird == null) {
                if (foodChoice < 3 || foodChoice > 4) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");
                } else if (foodChoice % 2 == 1) {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 3 * food3.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.foodQuantity += quantity;
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");
                } else {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 5 * food4.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.premiumFoodQuantity += quantity;
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }
            if (cat == null && dog == null) {
                if (foodChoice > 2) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                } else if (foodChoice % 2 == 1) {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 3 * food1.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.foodQuantity += quantity;
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");
                } else {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.money -= 5 * food2.price;
                    System.out.println("you have " + adopter.money + "$ left.");
                    adopter.premiumFoodQuantity += quantity;
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }
        }
        while (input.nextInt() == 2) {
            System.out.println("do you wish to feed your pet with regular or premium food?");
            if (input.next().equals("regular")) {

            }
        }

        System.out.println("what whould you like to do? "
                + "1.buy food or toys "
                + "2.feed your pet "
                + "3.go to the vet "
                + "4.outdoor activity "
                + "5.check inventory "
                + "6.check pet status ");

        while (input.nextInt() == 6) {

            if (dog == null && bird == null) {
                System.out.println("name: " + cat.name);
                if (cat.healthStatus == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (cat.healthStatus == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (cat.healthStatus == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (cat.healthStatus == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (cat.healthStatus == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }
            if (cat == null && bird == null) {
                System.out.println("name: " + cat.name);
                if (dog.healthStatus == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (dog.healthStatus == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (dog.healthStatus == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (dog.healthStatus == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (dog.healthStatus == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }
            if (cat == null && dog == null) {
                System.out.println("name: " + bird.name);
                if (bird.healthStatus == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (bird.healthStatus == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (bird.healthStatus == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (bird.healthStatus == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (bird.healthStatus == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }

        }

    }
}




