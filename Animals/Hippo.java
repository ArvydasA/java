package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Hippo extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("The hippo snarls");
    }

    @Override
    public void eat() {
        System.out.println("The hippo is eating " + Food.GRASS);
    }
}
