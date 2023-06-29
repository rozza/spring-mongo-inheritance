package com.example.springmongoinheritance.models;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    private PayerReturn payerReturn;

    public Customer() {}

    public Customer(final String firstName, final String lastName, final PayerReturn payerReturn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payerReturn = payerReturn;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payerReturn=" + payerReturn +
                '}';
    }
}
