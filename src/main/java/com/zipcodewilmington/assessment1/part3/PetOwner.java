package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String name;
    Pet[] pets;
    Pet pet;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;






    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets.length > 0) {
            pets[pets.length +1 ] = pet;
        } else pets[0] = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        for (int i = 0; i <pets.length ; i++) {
            if (pets[i].equals(pet)) {

            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isOwned =false;
        for (int i = 0; i <pets.length ; i++) {
            if(pets[i].equals(pet)) {
                isOwned = true;
                break;
            }
        }
        return isOwned;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer yougest = 0;
        for (int i = 0; i <pets.length ; i++) {

            if(pets[i].age < pets[i + 1].age) {
                System.out.println(pets[i].name);
                System.out.println(pets[i].age);
                yougest = pets[i].age;
            }
        }
        return yougest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for (int i = 0; i <pets.length ; i++) {
            if(pets[i].age > pets[i + 1].age) {
                oldest = pets[i].age;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0f;
        for (int i = 0; i <this.pets.length ; i++) {
            sum += pets[i].age;
        }
        return sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
//        return ArrayList.toArray(petsArray);
        return pets;
    }
}
