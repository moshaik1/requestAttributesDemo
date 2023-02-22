package Model;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "Siddhant";
        this.lastName = "Naik";
        this.age = 23;
    }

    public Person(String firstName,String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
