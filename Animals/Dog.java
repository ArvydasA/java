package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Dog extends Canine{

    @Override
    public void makeNoise() {
        System.out.println("The dog barks");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating " + Food.GRASS);
    }
}
