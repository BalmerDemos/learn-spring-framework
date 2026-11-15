package com.balmerdemos.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.balmerdemos.learn_spring_framework.animal.Dog;
import com.balmerdemos.learn_spring_framework.thing.ThingMoving;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// Create a concrete Dog object.
		// The application explicitly decides which implementation to use.
		var dog = new Dog("Yummpy", "Balmer");

		// ThingMoving depends directly on the Dog class.
		// This is an example of tight coupling.
		// If we wanted to use a Cat instead, we would need to modify the code.
		var thingMoving = new ThingMoving(dog);

		// Execute the behavior of the Dog through ThingMoving.
		thingMoving.run();
	}
}