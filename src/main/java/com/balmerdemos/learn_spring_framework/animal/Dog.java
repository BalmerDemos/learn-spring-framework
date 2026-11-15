package com.balmerdemos.learn_spring_framework.animal;

public class Dog {

    // Default constructor
    // Allows creation of a Dog object without initial values.
    public Dog() {}

    // State (attributes) of the Dog object.
    private String name;
    private String owner;

    // Constructor that initializes only the dog's name.
    public Dog(String name) {
        this.name = name;
    }

    // Constructor that initializes the dog's name and owner.
    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    // Simulates the dog eating.
    public void eat() {
        System.out.println("Eating...");
    }

    // Simulates the dog running.
    public void run() {
        System.out.println("Running...");
    }

    // Simulates the dog sleeping.
    public void sleep() {
        System.out.println("Sleeping...");
    }

    // Simulates the dog wagging its tail.
    public void wagTail() {
        System.out.println("Wagging tail...");
    }

    // Returns a string representation of the object.
    // This method is automatically called when a Dog object
    // is passed to System.out.println().
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}