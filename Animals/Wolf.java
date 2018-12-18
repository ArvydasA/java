package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Wolf extends Canine{
    @Override
    public void makeNoise() {
        System.out.println("The wolf howls");
    }

    @Override
    public void eat() {
        System.out.println("The wolf is eating " + Food.MEAT);
    }

    //We can override a method from a superclass and at the same time call it like this
    public void roam()
    {
        super.roam();
        System.out.println(", and now that it is a wolf it is very dangerous for its prey");
    }

}
