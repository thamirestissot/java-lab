package com.github.thamirestissot.builder;

import com.github.thamirestissot.entity.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonBuilderTest {

    @Test
    public void createPersonWhithNameTest() {
        String name = "Thamires";
        Person person = PersonBuilder.builder()
                .whithName(name)
                .build();

        assertEquals(name, person.getName());
    }

    @Test
    public void createPersonWithAgeTest() {
        Integer age = 22;
        Person person = PersonBuilder.builder()
                .withAge(age)
                .build();

        assertEquals(age, person.getAge());
    }

    @Test
    public void createPersonWithAddressTest() {
        Integer number = 11;
        String street = "Av. Brasil";
        String city = "Porto Alegre";
        String country = "Brasil";
        Person person = PersonBuilder.builder()
                .withAddress(number, street, city, country)
                .build();

        assertEquals(number, person.getAddress().getNumber());
        assertEquals(street, person.getAddress().getStreet());
        assertEquals(city, person.getAddress().getCity());
        assertEquals(country, person.getAddress().getCountry());
    }
}