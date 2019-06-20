package org.fasttrackit;


import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;


public class App {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Adopter adopter = new Adopter();
        adopter.setName(input.next());
        adopter.setMoney(100);

        System.out.println("Welcome " + adopter.getName() + ". You start the game with " + adopter.getMoney() +
                "$. Your goal in this game will be to take care of your pet." +
                "You can choose from the following pets:dog,cat,bird. What would you like to choose? ");

        String petType = input.next();

        Store store = new Store();
        store.setName("Katy's Pet food and toys store");
        store.setOpen(8);
        store.setClose(16);

        Vet vet1 = new Vet();
        vet1.setName("Sofia");
        vet1.setPayment(10);


        Vet vet2 = new Vet();
        vet2.setName("Alex");
        vet2.setPayment(15);

        Food food1 = new Food();
        food1.setPrice(8);
        food1.setAvailableQuantity(34);
        food1.setName("insects");
        food1.time(args, 2, 5);


        Food food2 = new Food();
        food2.setPrice(10);
        food2.setAvailableQuantity(27);
        food2.setName("seeds");
        food2.time(args, 12, 4);


        Food food3 = new Food();
        food3.setPrice(3);
        food3.setAvailableQuantity(42);
        food3.setName("dog food");
        food3.time(args, 1, 3);


        Food food4 = new Food();
        food4.setPrice(5);
        food4.setAvailableQuantity(50);
        food4.setName("premium dog food");
        food4.time(args, 14, 5);


        Food food5 = new Food();
        food5.setPrice(7);
        food5.setAvailableQuantity(30);
        food5.setName("milk");
        food5.time(args, 5, 2);


        Food food6 = new Food();
        food6.setPrice(9);
        food6.setAvailableQuantity(68);
        food6.setName("whiskas");
        food6.time(args, 2, 6);

        Toy toy1 = new Toy();
        toy1.setToyColor("blue");
        toy1.setToyType("ball of yarn");

        Toy toy2 = new Toy();
        toy2.setToyColor("red");
        toy2.setToyType("ball");

        Toy toy3 = new Toy();
        toy3.setToyColor("blue");
        toy3.setToyType("cage swing");


        Cat cat = null;
        Dog dog = null;
        Bird bird = null;

        Calendar calendar = Calendar.getInstance();


        if (petType.equals("cat")) {
            cat = new Cat();
            System.out.println("enter your pets name: ");
            cat.setName(input.next());
            System.out.println("enter your pets age: ");
            cat.setAge(input.nextInt());
            cat.setHealthStatus(1);
            cat.setHungerLevel(1);
            cat.setFavoriteFood("whiskas");
            cat.setFurColor("gray");


        } else if (petType.equals("dog")) {
            dog = new Dog();
            System.out.println("enter your pets name: ");
            dog.setName(input.next());
            System.out.println("enter your pets age: ");
            dog.setAge(input.nextInt());
            dog.setHealthStatus(1);
            dog.setHungerLevel(1);
            dog.setFavoriteFood("premium dog food");
            dog.setSize(2);


        } else {
            bird = new Bird();
            System.out.println("enter your pets name: ");
            bird.setName(input.next());
            System.out.println("enter your pets age: ");
            bird.setAge(input.nextInt());
            bird.setHealthStatus(1);
            bird.setHungerLevel(1);
            bird.setFavoriteFood("seeds");
            bird.setFeatherColor("Blue");


        }

        System.out.println("what whould you like to do? "
                + "1.buy food or toys "
                + "2.feed your pet "
                + "3.go to the vet "
                + "4.outdoor activity "
                + "5.check inventory "
                + "6.check pet status ");


        while (input.nextInt() == 1) {
            if (Store.isOpen(store.getOpen(),store.getClose())) {
            } else {
                break;
            }
            System.out.println("what food would you like to buy?");
            System.out.println("1:" + food1.getName() + ", " + food1.getPrice() + "$/kg, " + food1.getAvailableQuantity() + "kg.");
            System.out.println("2:" + food2.getName() + ", " + food2.getPrice() + "$/kg, " + food2.getAvailableQuantity() + "kg.");
            System.out.println("3:" + food3.getName() + ", " + food3.getPrice() + "$/kg, " + food3.getAvailableQuantity() + "kg.");
            System.out.println("4:" + food4.getName() + ", " + food4.getPrice() + "$/kg, " + food4.getAvailableQuantity() + "kg.");
            System.out.println("5:" + food5.getName() + ", " + food5.getPrice() + "$/l, " + food5.getAvailableQuantity() + "l.");
            System.out.println("6:" + food6.getName() + ", " + food6.getPrice() + "$/kg, " + food6.getAvailableQuantity() + "kg.");


            int foodChoice = input.nextInt();

            if (dog == null && bird == null) {

                if (foodChoice < 5) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                } else if (foodChoice % 2 == 1) {

                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food5.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");

                } else {

                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food6.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }
            if (cat == null && bird == null) {
                if (foodChoice < 3 || foodChoice > 4) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");
                } else if (foodChoice % 2 == 1) {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food3.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");
                } else {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food4.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }
            if (cat == null && dog == null) {
                if (foodChoice > 2) {
                    System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                } else if (foodChoice % 2 == 1) {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food1.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of regular food has been added to your inventory.");
                } else {
                    System.out.println("How much? ");
                    double quantity = input.nextDouble();
                    adopter.setMoney(adopter.getMoney() - 5 * food2.getPrice());
                    System.out.println("you have " + adopter.getMoney() + "$ left.");
                    adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                    System.out.println(quantity + "kg of premium food has been added to your inventory.");
                }
            }


            System.out.println("what whould you like to do? "
                    + "1.buy food or toys "
                    + "2.feed your pet "
                    + "3.go to the vet "
                    + "4.outdoor activity "
                    + "5.check inventory "
                    + "6.check pet status ");
        }
        if (input.nextInt() == 3) {

        }
        if (LocalTime.now().isAfter(vet1.getOpen()) && LocalTime.now().isBefore(vet1.getClose())) {
            cat.setHealthStatus(vet1.examination(vet1.getPayment(), cat.getHealthStatus(), adopter.getMoney()));
        } else if (LocalTime.now().isAfter(vet2.getOpen2()) && LocalTime.now().isBefore(vet2.getClose2())) {
            cat.setHealthStatus(vet2.examination(vet2.getPayment(), cat.getHealthStatus(), adopter.getMoney()));
        } else {
            System.out.println("The Veterinary Clinic is closed!");
        }


        while (input.nextInt() == 6) {

            if (dog == null && bird == null) {
                System.out.println("name: " + cat.getName());
                if (cat.getHealthStatus() == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (cat.getHealthStatus() == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (cat.getHealthStatus() == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (cat.getHealthStatus() == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (cat.getHealthStatus() == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }
            if (cat == null && bird == null) {
                System.out.println("name: " + cat.getName());
                if (dog.getHealthStatus() == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (dog.getHealthStatus() == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (dog.getHealthStatus() == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (dog.getHealthStatus() == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (dog.getHealthStatus() == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }
            if (cat == null && dog == null) {
                System.out.println("name: " + bird.getName());
                if (bird.getHealthStatus() == 1) {

                    System.out.println("your pet is extremely ill.");
                }
                if (bird.getHealthStatus() == 2) {
                    System.out.println("your pet is very sick.");
                }
                if (bird.getHealthStatus() == 3) {
                    System.out.println("your pet is sick. ");
                }
                if (bird.getHealthStatus() == 4) {
                    System.out.println("your pet is at normal health");
                }
                if (bird.getHealthStatus() == 5) {
                    System.out.println("your pet is extremely healthy");
                }

            }

        }

    }
}




