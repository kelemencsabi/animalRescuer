package org.fasttrackit;

public class Cat extends Pet {

    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public Cat(String furColor) {
        this.furColor = furColor;
    }
}
