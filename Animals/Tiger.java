package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Tiger extends Feline{

    @Override
    public void makeNoise() {
        System.out.println("The tiger is growling");
    }

    @Override
    public void eat() {
        System.out.println("The tiger is eating" + Food.MEAT);
    }
}
