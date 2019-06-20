package org.fasttrackit;


import java.time.LocalTime;

public class Vet {
    private String name;
    private int payment;
    private LocalTime open = LocalTime.of(8, 0, 0);
    private LocalTime close = LocalTime.of(14, 0, 0);
    private LocalTime open2 = LocalTime.of(15, 0, 0);
    private LocalTime close2 = LocalTime.of(22, 0, 0);

    public int examination(int payment, int healthStatus, int adopterMoney) {
        if (healthStatus == 5) {
            System.out.println("your pet is healthy");
            return healthStatus;
        } else {
            int difference = 5 - healthStatus;
            healthStatus = 5;
            adopterMoney -= difference * payment;
            System.out.println("your pet is feeling much better ");
            System.out.println("you have " + adopterMoney + "$ left.");
            return healthStatus;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public LocalTime getOpen() {
        return open;
    }

    public void setOpen(LocalTime open) {
        this.open = open;
    }

    public LocalTime getClose() {
        return close;
    }

    public void setClose(LocalTime close) {
        this.close = close;
    }

    public LocalTime getOpen2() {
        return open2;
    }

    public void setOpen2(LocalTime open2) {
        this.open2 = open2;
    }

    public LocalTime getClose2() {
        return close2;
    }

    public void setClose2(LocalTime close2) {
        this.close2 = close2;
    }






}
