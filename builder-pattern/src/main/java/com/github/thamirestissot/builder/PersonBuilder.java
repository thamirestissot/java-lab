package com.github.thamirestissot.builder;

import com.github.thamirestissot.entity.Address;
import com.github.thamirestissot.entity.Person;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder whithName(String name) {
        this.person.setName(name);
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.person.setAge(age);
        return this;
    }

    public PersonBuilder withAddress(Integer number, String street, String city, String country) {
        Address address = new Address();
        address.setNumber(number);
        address.setStreet(street);
        address.setCity(city);
        address.setCountry(country);
        this.person.setAddress(address);
        return this;
    }

    public Person build() {
        return this.person;
    }
}
