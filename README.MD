# Learn Spring Framework
A simple Spring Boot project created to learn the fundamentals of the Spring Framework, Dependency Injection (DI), and Inversion of Control (IoC).

# Current Topic: Tight Coupling
This project demonstrates a basic example of tight coupling using a Dog class and a ThingMoving class.

# Components

## Dog
Represents a dog with basic attributes and behaviors:

name
owner
Behaviors:

eat()
run()
sleep()
wagTail()

## ThingMoving
A class responsible for interacting with a Dog object.

private final Dog puppy;
Because ThingMoving depends directly on the concrete Dog class, it is considered tightly coupled.

# Example Execution
var dog = new Dog("Yummpy", "Balmer");
var thingMoving = new ThingMoving(dog);

thingMoving.run();

## Output:

What is running?: Dog{name='Yummpy', owner='Balmer'}
Eating...
Sleeping...
Wagging tail...

# Why Is This Tight Coupling?
ThingMoving knows about and depends directly on the Dog implementation.

public class ThingMoving {
private final Dog puppy;
}

## As a result:

The class can only work with Dog.
Supporting another animal would require code changes.
The design is less flexible.
Testing becomes more difficult.


## Next Step: Loose Coupling
The next refactoring will introduce an interface:

public interface Animal {
void run();
}

Then Dog will implement Animal, and ThingMoving will depend on the interface rather than a concrete class.

private final Animal animal;

## This will demonstrate:

Loose Coupling
Dependency Injection
Spring IoC Container


# Technologies
Java
Spring Boot
Maven
Learning Objectives
Understand Tight Coupling
Understand Loose Coupling
Learn Dependency Injection
Learn Inversion of Control (IoC)
Use Spring Framework to manage dependencies