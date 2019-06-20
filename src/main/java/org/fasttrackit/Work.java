package org.fasttrackit;

public class Work {

    private String name;
    private int salary;
    private String position;
    private int totalHours;

    public int work(int salary, int money) {
        int dailyWage=salary/7;
        money+=dailyWage;
        System.out.println("you earned " + dailyWage+  "$. Well done !");
        return money;
    }


    public int promotion(int totalHours, int salary) {
        if (totalHours < 42) {
           this.totalHours += 8;

        } else if(salary<200){
            salary += 7;
            this.totalHours = 0;
            System.out.println("Congratulations you just earned a promotion. your weekly salary is now : " + salary + "$.");
        }
        return salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }
}
