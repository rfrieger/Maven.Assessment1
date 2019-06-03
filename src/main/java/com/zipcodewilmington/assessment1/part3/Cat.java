package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    String name;
    Integer age;
    PetOwner owner;
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
    this.name = name;
    this.age = age;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
        this.name = "Cat name";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.age = 0;
        this.name = "Cat name";
        this.owner = null;
    }


    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
