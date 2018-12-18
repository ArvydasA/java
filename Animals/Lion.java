package com.skiabox.java_apps2;

/**
 * Created by administrator on 09/10/2016.
 */
public class Lion extends Feline{

    //Lion methods
    @Override
    public void makeNoise() {
        System.out.println("The lion is growling");
    }

    @Override
    public void eat() {
        System.out.println("The lion is eating " + Food.MEAT);
    }
}
