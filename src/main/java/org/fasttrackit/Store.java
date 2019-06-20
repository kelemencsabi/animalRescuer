package org.fasttrackit;

import java.util.Calendar;

public class Store {
    private String name;
    private boolean isOpen;
    private int open;
    private int close;

    public static boolean isOpen(int open ,int close) {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(calendar.HOUR_OF_DAY);
        if (timeOfDay < close && timeOfDay > open) {
            System.out.println("The store is open!");
            return true;
        } else {
            System.out.println("the store is closed!");
        }
        return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        this.close = close;
    }
}
