package com.balmerdemos.learn_spring_framework.thing;

import com.balmerdemos.learn_spring_framework.animal.Dog;

public class ThingMoving {

    // Tight Coupling:
    // This class depends directly on the concrete Dog class.
    // If we want to use a Cat or another type of animal,
    // this class must be modified.
    private final Dog puppy;

    // Constructor Injection (manual, without Spring)
    // A Dog object must be provided when creating ThingMoving.
    public ThingMoving(Dog puppy) {
        this.puppy = puppy;
    }

    // Execute behaviors of the Dog object.
    // ThingMoving delegates work to Dog.
    public void run() {

        // toString() is automatically called when printing an object.
        System.out.println("What is running?: " + puppy);

        // Dog-specific behaviors
        puppy.eat();
        puppy.sleep();
        puppy.wagTail();
    }
}