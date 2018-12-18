package com.skiabox.java_apps2;

/**
 * Created by administrator on 10/10/2016.
 */
public class App2 {

    public static void main(String[] args) {

        //Separator
        System.out.println("Inheritance in action");
        System.out.println("------------------------------------------------------");
        Animal w = new Wolf();
        w.makeNoise();  //method is called from Wolf class
        w.roam();       //method is called from Canine class
        w.eat();        //method is called from Wolf class
        w.sleep();      //method is called from Animal class

        System.out.println();

        //Separator
        System.out.println("Polymorphism in action");
        System.out.println("------------------------------------------------------");

        //Now let's create an array of animals to see polymorphism in action
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();    //remember that Wolf has its own roam method
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (int i = 0; i < animals.length; i++)
        {
            animals[i].eat();
            animals[i].roam();
        }

        System.out.println();

        //Separator
        System.out.println("Polymorphic arguments");
        System.out.println("------------------------------------------------------");

        //We can have polymorphic arguments
        Vet newVet = new Vet();
        newVet.giveShot(w);
    }
}
