package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Cat extends Feline{
    @Override
    public void makeNoise() {
        System.out.println("The cat meows");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats " + Food.GRASS);
    }
}
