package org.fasttrackit;

import java.time.LocalDate;
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
        store.setClose(19);

        Work work = new Work();
        work.setName("Coffee shop");
        work.setPosition("Barista");
        work.setSalary(21);
        work.setTotalHours(0);


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
        food1.setExpirationDate(LocalDate.of((2019), (9), (3)));


        Food food2 = new Food();
        food2.setPrice(10);
        food2.setAvailableQuantity(27);
        food2.setName("seeds");
        food2.setExpirationDate(LocalDate.of((2019), (7), (3)));


        Food food3 = new Food();
        food3.setPrice(3);
        food3.setAvailableQuantity(42);
        food3.setName("dog food");
        food3.setExpirationDate(LocalDate.of((2019), (4), (12)));


        Food food4 = new Food();
        food4.setPrice(5);
        food4.setAvailableQuantity(50);
        food4.setName("premium dog food");
        food4.setExpirationDate(LocalDate.of((2019), (8), (23)));


        Food food5 = new Food();
        food5.setPrice(7);
        food5.setAvailableQuantity(30);
        food5.setName("milk");
        food5.setExpirationDate(LocalDate.of((2019), (6), (13)));


        Food food6 = new Food();
        food6.setPrice(9);
        food6.setAvailableQuantity(68);
        food6.setName("whiskas");
        food6.setExpirationDate(LocalDate.of((2019), (9), (25)));

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


        switch (petType) {

            case "cat": {
                cat = new Cat();
                System.out.println("enter your pets name: ");
                cat.setName(input.next());
                System.out.println("enter your pets age: ");
                cat.setAge(input.nextInt());
                cat.setHealthStatus(1);
                cat.setHungerLevel(1);
                cat.setFavoriteFood("whiskas");
                cat.setFurColor("gray");


                while (true) {


                    System.out.println("what whould you like to do? "
                            + "1.buy food or toys "
                            + "2.feed your pet "
                            + "3.go to the vet "
                            + "4.go to work"
                            + "5.check inventory "
                            + "6.check pet status ");

                    int numberOfAction = input.nextInt();

                    switch (numberOfAction) {
                        case 1:
                            if (Store.isOpen(store.getOpen(), store.getClose())) {
                            } else {
                                break;
                            }
                            System.out.println("what food would you like to buy?");
                            System.out.println("1:" + food1.getName() + ", " + food1.getPrice() + "$/kg, " + food1.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food1.getExpirationDate(), LocalDate.now());
                            System.out.println("2:" + food2.getName() + ", " + food2.getPrice() + "$/kg, " + food2.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food2.getExpirationDate(), LocalDate.now());
                            System.out.println("3:" + food3.getName() + ", " + food3.getPrice() + "$/kg, " + food3.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food3.getExpirationDate(), LocalDate.now());
                            System.out.println("4:" + food4.getName() + ", " + food4.getPrice() + "$/kg, " + food4.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food4.getExpirationDate(), LocalDate.now());
                            System.out.println("5:" + food5.getName() + ", " + food5.getPrice() + "$/l, " + food5.getAvailableQuantity() + "l.");
                            food1.expirationDayCheck(food5.getExpirationDate(), LocalDate.now());
                            System.out.println("6:" + food6.getName() + ", " + food6.getPrice() + "$/kg, " + food6.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food6.getExpirationDate(), LocalDate.now());
                            int foodChoice = input.nextInt();

                            if (foodChoice < 5) {
                                System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                            } else if (foodChoice % 2 == 1) {

                                System.out.println("How much? ");
                                int quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity* food5.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of regular food has been added to your inventory.");

                            } else {

                                System.out.println("How much? ");
                                int quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity* food6.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of premium food has been added to your inventory.");
                            }
                            break;
                        case 2: System.out.println("what kind of food would you like to choose ? milk or whiskas ? ");

                            switch (input.next()) {
                                case "milk":

                                    cat.setHungerLevel(adopter.feeding1(adopter.getFoodQuantity(), cat.getHungerLevel()));
                                    break;

                                case "whiskas":
                                    cat.setHungerLevel(adopter.feeding2(adopter.getPremiumFoodQuantity(), cat.getHungerLevel()));
                                    break;
                                default:
                                    System.out.println("you don't have that kind of food");
                                    break;
                            }
                            break;

                        case 3:

                            if (LocalTime.now().isAfter(vet1.getOpen()) && LocalTime.now().isBefore(vet1.getClose())) {
                                cat.setHealthStatus(vet1.examination(vet1.getPayment(), cat.getHealthStatus(), adopter.getMoney()));
                            } else if (LocalTime.now().isAfter(vet2.getOpen2()) && LocalTime.now().isBefore(vet2.getClose2())) {
                                cat.setHealthStatus(vet2.examination(vet2.getPayment(), cat.getHealthStatus(), adopter.getMoney()));
                            } else {
                                System.out.println("The Veterinary Clinic is closed!");
                                break;
                            }
                            break;
                        case 4:
                            adopter.setMoney(work.work(work.getSalary(), adopter.getMoney()));
                            work.setSalary(work.promotion(work.getTotalHours(), work.getSalary()));
                            System.out.println(adopter.getMoney());
                            System.out.println(work.getSalary());
                            break;


                        case 5:
                            System.out.println(adopter.getName() + "'s inventory:");
                            System.out.println("you have " + adopter.getMoney() + "$.");
                            System.out.println("you have " + adopter.getFoodQuantity() + "l of milk.");
                            System.out.println("you have " + adopter.getPremiumFoodQuantity() + "kg of whiskas.");
                            break;
                        case 6:

                            System.out.println("name: " + cat.getName());
                            System.out.println("age:" + cat.getAge());
                            System.out.println("pet type: " + petType);
                            switch (cat.getHealthStatus()) {

                                case 1:
                                    System.out.println("your pet is extremely ill.");
                                    break;

                                case 2:
                                    System.out.println("your pet is very sick.");
                                    break;

                                case 3:
                                    System.out.println("your pet is sick. ");
                                    break;

                                case 4:
                                    System.out.println("your pet is ok ");
                                    break;

                                case 5:
                                    System.out.println("your pet is healthy");
                                    break;
                            }
                            switch (cat.getHungerLevel()) {
                                case 1:
                                    System.out.println("your pet is starving");
                                    break;
                                case 2:
                                    System.out.println("your pet is really hungry");
                                    break;
                                case 3:
                                    System.out.println("your pet is hungry");
                                    break;
                                case 4:
                                    System.out.println("your pet is not hungry");
                                    break;
                                case 5:
                                    System.out.println("your pet is full");
                                    ;
                                    break;

                            }
                            break;

                    }

                }
            }

            case "dog": {
                dog = new Dog();
                System.out.println("enter your pets name: ");
                dog.setName(input.next());
                System.out.println("enter your pets age: ");
                dog.setAge(input.nextInt());
                dog.setHealthStatus(1);
                dog.setHungerLevel(1);
                dog.setFavoriteFood("premium dog food");
                dog.setSize(2);

                while (true) {


                    System.out.println("what whould you like to do? "
                            + "1.buy food or toys "
                            + "2.feed your pet "
                            + "3.go to the vet "
                            + "4.go to work"
                            + "5.check inventory "
                            + "6.check pet status ");

                    int numberOfAction = input.nextInt();

                    switch (numberOfAction) {
                        case 1:
                            if (Store.isOpen(store.getOpen(), store.getClose())) {
                            } else {
                                break;
                            }
                            System.out.println("what food would you like to buy?");
                            System.out.println("1:" + food1.getName() + ", " + food1.getPrice() + "$/kg, " + food1.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food1.getExpirationDate(), LocalDate.now());
                            System.out.println("2:" + food2.getName() + ", " + food2.getPrice() + "$/kg, " + food2.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food2.getExpirationDate(), LocalDate.now());
                            System.out.println("3:" + food3.getName() + ", " + food3.getPrice() + "$/kg, " + food3.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food3.getExpirationDate(), LocalDate.now());
                            System.out.println("4:" + food4.getName() + ", " + food4.getPrice() + "$/kg, " + food4.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food4.getExpirationDate(), LocalDate.now());
                            System.out.println("5:" + food5.getName() + ", " + food5.getPrice() + "$/l, " + food5.getAvailableQuantity() + "l.");
                            food1.expirationDayCheck(food5.getExpirationDate(), LocalDate.now());
                            System.out.println("6:" + food6.getName() + ", " + food6.getPrice() + "$/kg, " + food6.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food6.getExpirationDate(), LocalDate.now());
                            int foodChoice = input.nextInt();

                            if (foodChoice < 3 || foodChoice > 4) {
                                System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                            } else if (foodChoice % 2 == 1) {

                                System.out.println("How much? ");
                                int quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity * food3.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of regular food has been added to your inventory.");

                            } else {

                                System.out.println("How much? ");
                                int  quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity * food4.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of premium food has been added to your inventory.");
                            }
                            break;
                        case 2:
                            System.out.println("what kind of food would you like to choose ? Regular or premium ? ");

                            switch (input.next()) {
                                case "regular":

                                    dog.setHungerLevel(adopter.feeding1(adopter.getFoodQuantity(), dog.getHungerLevel()));
                                    break;

                                case "premium":
                                    dog.setHungerLevel(adopter.feeding2(adopter.getPremiumFoodQuantity(), dog.getHungerLevel()));
                                    break;
                                default:
                                    System.out.println("you don't have that kind of food");
                                    break;
                            }
                            break;
                        case 3:

                            if (LocalTime.now().isAfter(vet1.getOpen()) && LocalTime.now().isBefore(vet1.getClose())) {
                                dog.setHealthStatus(vet1.examination(vet1.getPayment(), dog.getHealthStatus(), adopter.getMoney()));
                            } else if (LocalTime.now().isAfter(vet2.getOpen2()) && LocalTime.now().isBefore(vet2.getClose2())) {
                                dog.setHealthStatus(vet2.examination(vet2.getPayment(), dog.getHealthStatus(), adopter.getMoney()));
                            } else {
                                System.out.println("The Veterinary Clinic is closed!");
                                break;
                            }
                            break;
                        case 4:
                            adopter.setMoney(work.work(work.getSalary(), adopter.getMoney()));
                            work.setSalary(work.promotion(work.getTotalHours(), work.getSalary()));
                            System.out.println(adopter.getMoney());
                            System.out.println(work.getSalary());
                            break;


                        case 5:
                            System.out.println(adopter.getName() + "'s inventory:");
                            System.out.println("you have " + adopter.getMoney() + "$.");
                            System.out.println("you have " + adopter.getFoodQuantity() + "kg of regular dog food.");
                            System.out.println("you have " + adopter.getPremiumFoodQuantity() + "kg of premium dog food.");
                            break;
                        case 6:

                            System.out.println("name: " + dog.getName());
                            System.out.println("age:" + dog.getAge());
                            System.out.println("pet type: " + petType);
                            switch (dog.getHealthStatus()) {

                                case 1:
                                    System.out.println("your pet is extremely ill.");
                                    break;

                                case 2:
                                    System.out.println("your pet is very sick.");
                                    break;

                                case 3:
                                    System.out.println("your pet is sick. ");
                                    break;

                                case 4:
                                    System.out.println("your pet is ok ");
                                    break;

                                case 5:
                                    System.out.println("your pet is healthy");
                                    break;
                            }
                            switch (dog.getHungerLevel()) {
                                case 1:
                                    System.out.println("your pet is starving");
                                    break;
                                case 2:
                                    System.out.println("your pet is really hungry");
                                    break;
                                case 3:
                                    System.out.println("your pet is hungry");
                                    break;
                                case 4:
                                    System.out.println("your pet is not hungry");
                                    break;
                                case 5:
                                    System.out.println("your pet is full");
                                    ;
                                    break;
                            }
                            break;
                    }
                }
            }

            case "bird": {
                bird = new Bird();
                System.out.println("enter your pets name: ");
                bird.setName(input.next());
                System.out.println("enter your pets age: ");
                bird.setAge(input.nextInt());
                bird.setHealthStatus(1);
                bird.setHungerLevel(1);
                bird.setFavoriteFood("seeds");
                bird.setFeatherColor("Blue");

                while (true) {

                    System.out.println("what whould you like to do? "
                            + "1.buy food or toys "
                            + "2.feed your pet "
                            + "3.go to the vet "
                            + "4.go to work"
                            + "5.check inventory "
                            + "6.check pet status ");

                    int numberOfAction = input.nextInt();

                    switch (numberOfAction) {
                        case 1:
                            if (Store.isOpen(store.getOpen(), store.getClose())) {
                            } else {
                                break;
                            }
                            System.out.println("what food would you like to buy?");
                            System.out.println("1:" + food1.getName() + ", " + food1.getPrice() + "$/kg, " + food1.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food1.getExpirationDate(), LocalDate.now());
                            System.out.println("2:" + food2.getName() + ", " + food2.getPrice() + "$/kg, " + food2.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food2.getExpirationDate(), LocalDate.now());
                            System.out.println("3:" + food3.getName() + ", " + food3.getPrice() + "$/kg, " + food3.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food3.getExpirationDate(), LocalDate.now());
                            System.out.println("4:" + food4.getName() + ", " + food4.getPrice() + "$/kg, " + food4.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food4.getExpirationDate(), LocalDate.now());
                            System.out.println("5:" + food5.getName() + ", " + food5.getPrice() + "$/l, " + food5.getAvailableQuantity() + "l.");
                            food1.expirationDayCheck(food5.getExpirationDate(), LocalDate.now());
                            System.out.println("6:" + food6.getName() + ", " + food6.getPrice() + "$/kg, " + food6.getAvailableQuantity() + "kg.");
                            food1.expirationDayCheck(food6.getExpirationDate(), LocalDate.now());
                            int foodChoice = input.nextInt();

                            if (foodChoice >2) {
                                System.out.println("your pet doesn't like the food you have chosen. Please choose something else.");

                            } else if (foodChoice % 2 == 1) {

                                System.out.println("How much? ");
                                int quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity * food1.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setFoodQuantity(adopter.getFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of regular food has been added to your inventory.");

                            } else {

                                System.out.println("How much? ");
                                int quantity = input.nextInt();
                                adopter.setMoney(adopter.getMoney() - quantity * food2.getPrice());
                                System.out.println("you have " + adopter.getMoney() + "$ left.");
                                adopter.setPremiumFoodQuantity(adopter.getPremiumFoodQuantity() + quantity);
                                System.out.println(quantity + "kg of premium food has been added to your inventory.");
                            }
                            break;
                        case 2:
                            System.out.println("what kind of food would you like to choose ? insects or seeds ? ");

                            switch (input.next()) {
                                case "insects":

                                    bird.setHungerLevel(adopter.feeding1(adopter.getFoodQuantity(), bird.getHungerLevel()));
                                    break;

                                case "seeds":
                                    bird.setHungerLevel(adopter.feeding2(adopter.getPremiumFoodQuantity(), bird.getHungerLevel()));
                                    break;
                                default:
                                    System.out.println("you don't have that kind of food");
                                    break;
                            }
                            break;
                        case 3:

                            if (LocalTime.now().isAfter(vet1.getOpen()) && LocalTime.now().isBefore(vet1.getClose())) {
                                bird.setHealthStatus(vet1.examination(vet1.getPayment(), bird.getHealthStatus(), adopter.getMoney()));
                            } else if (LocalTime.now().isAfter(vet2.getOpen2()) && LocalTime.now().isBefore(vet2.getClose2())) {
                                bird.setHealthStatus(vet2.examination(vet2.getPayment(), bird.getHealthStatus(), adopter.getMoney()));
                            } else {
                                System.out.println("The Veterinary Clinic is closed!");
                                break;
                            }
                            break;
                        case 4:
                            adopter.setMoney(work.work(work.getSalary(), adopter.getMoney()));
                            work.setSalary(work.promotion(work.getTotalHours(), work.getSalary()));
                            System.out.println(adopter.getMoney());
                            System.out.println(work.getSalary());
                            break;


                        case 5:
                            System.out.println(adopter.getName() + "'s inventory:");
                            System.out.println("you have " + adopter.getMoney() + "$.");
                            System.out.println("you have " + adopter.getFoodQuantity() + "kg of regular bird food.");
                            System.out.println("you have " + adopter.getPremiumFoodQuantity() + "kg of premium bird food.");
                            break;
                        case 6:

                            System.out.println("name: " + bird.getName());
                            System.out.println("age:" + bird.getAge());
                            System.out.println("pet type: " + petType);
                            switch (bird.getHealthStatus()) {

                                case 1:
                                    System.out.println("your pet is extremely ill.");
                                    break;

                                case 2:
                                    System.out.println("your pet is very sick.");
                                    break;

                                case 3:
                                    System.out.println("your pet is sick. ");
                                    break;

                                case 4:
                                    System.out.println("your pet is ok ");
                                    break;

                                case 5:
                                    System.out.println("your pet is healthy");
                                    break;
                            }
                            switch (bird.getHungerLevel()) {
                                case 1:
                                    System.out.println("your pet is starving");
                                    break;
                                case 2:
                                    System.out.println("your pet is really hungry");
                                    break;
                                case 3:
                                    System.out.println("your pet is hungry");
                                    break;
                                case 4:
                                    System.out.println("your pet is not hungry");
                                    break;
                                case 5:
                                    System.out.println("your pet is full");
                                    ;
                                    break;
                            }
                            break;
                    }
                }
            }
        }
    }
}
