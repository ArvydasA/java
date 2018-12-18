package com.skiabox.java_apps2;

/**
 * Created by administrator on 09/10/2016.
 */
public abstract class Animal {

    private String picture;
    private Food food;
    private int hunger;

    private int[][] boundaries;
    private int locationX;
    private int locationY;

    //getters and setters
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int[][] getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(int[][] boundaries) {
        this.boundaries = boundaries;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    //common methods
    public void sleep()
    {
        System.out.println("The animal sleeps");
    }

    //methods that must be implemented below the hierarchy
    public void roam()
    {
        System.out.println("The animal is roaming");
    }

    public abstract void makeNoise();
    public abstract void eat();
}
