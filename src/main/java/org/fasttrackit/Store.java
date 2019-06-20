package org.fasttrackit;

import java.util.Calendar;

public class Store {
    private String name;
    private boolean isOpen;

    public static boolean isOpen() {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(calendar.HOUR_OF_DAY);
        int open = 7;
        int close = 16;
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
}
