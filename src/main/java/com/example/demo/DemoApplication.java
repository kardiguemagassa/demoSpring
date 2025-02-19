package com.example.demo;

import com.example.demo.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Person person = new Person();

		person.setName("Jack");
		person.setAge(20);
		person.setGender("Male");
		person.setAddress("Beijing");

		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getAddress());

		String name = "John";
		int age = 30;

		System.out.println(String.format("My name is %s and I am %d years old", name,age));

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> squaresOfEvens = numbers.stream()
				.filter(n->n%2==0)
				.map(n->n*n)
				.toList();
		System.out.println(squaresOfEvens);
	}

}

