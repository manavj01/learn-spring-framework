package com.manav.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
//Released in JDK 16

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Manav";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("Raju", 23, new Address("palam","delhi") );
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name and age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name(), age(), address()); // name and age
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Sector 103", "Gurugram");
    }


}
