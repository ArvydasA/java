package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class Vet {

    public void giveShot(Animal a)
    {
        System.out.println("The vet is giving a shot to " + a.getClass().getSimpleName());

        //The animal reacts to the shot
        a.makeNoise();
    }
}
