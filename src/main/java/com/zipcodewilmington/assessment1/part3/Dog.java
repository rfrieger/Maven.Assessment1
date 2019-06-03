package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    String name;
    Integer age;

    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        super.owner =null;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "Dog name";
        super.owner =null;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = name;
        this.age = 0;
        super.owner =null;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        super.owner =null;
        this.age = 0;
        this.name = "Dog name";
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
