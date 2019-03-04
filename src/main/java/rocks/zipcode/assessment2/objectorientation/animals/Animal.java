package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    Person petOwner;
    Long petId;
    public Animal() {
        this.petId=null;
        this.petOwner=new Person();
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.petId = id;
        this.petOwner=owner;
    }

    public Long getId() {
        return petId;
    }

    public void setId(Long id) {
        this.petId =id;
    }

    public Person getOwner() {
        return petOwner;
    }

    public void setOwner(Person owner) {
        this.petOwner=owner;
    }

    public Address getAddress() {

        return petOwner.getAddress();
    }
}
