package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String name;
    ArrayList<Pet> petsArray;
    Pet pet;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.petsArray = new ArrayList<>();




    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

       petsArray.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petsArray.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        if(petsArray.contains(pet)) {
            return true;
        } else  {
            return false;
        }

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer yougest = 0;
        for (int i = 0; i <petsArray.size() ; i++) {
            if(petsArray.get(i).age < petsArray.get(i + 1).age) {
                yougest = petsArray.get(i).age;
            }
        }
        return yougest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = 0;
        for (int i = 0; i <petsArray.size() ; i++) {
            if(petsArray.get(i).age > petsArray.get(i + 1).age) {
                oldest = petsArray.get(i).age;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0f;
        for (int i = 0; i <this.petsArray.size() ; i++) {
            sum += petsArray.get(i).age;
        }
        return sum / petsArray.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.petsArray.size();
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
        return null;
    }
}
