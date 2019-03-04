package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    Long expectedId;
    String expectedName;
    Address personAddress;

    /**
     * @param id      - id of person
     * @param name    - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        if(id==null) {
            this.expectedId = 0L;
            this.expectedName = name;
        }
        if(address==null) {
            this.personAddress = new Address();
            this.expectedName = name;
        }
        else {
            this.expectedId = id;
            this.expectedName = name;
            this.personAddress = address;
        }
    }

    public Person() {
        this.expectedId = Long.MIN_VALUE;
        this.expectedName = "";
        this.personAddress = new Address();
    }

    public Long getId() {
        return expectedId;
    }

    public void setId(Long id) {
        this.expectedId = id;
    }

    public String getName() {
        return expectedName;
    }

    public void setName(String name) {
        this.expectedName = name;
    }

    public Address getAddress() {
        return personAddress;
    }

    public void setAddress(Address address) {
        this.personAddress = address;
    }

    @Override
    public boolean equals(Object o) {

        if(o==this)
            return true;
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;
        Person newPerson =(Person)o;
        Long id1= new Long(newPerson.expectedId);
        Long id2= new Long(this.expectedId);
        return(id1.equals(id2) &&
                newPerson.expectedName.equals(this.expectedName) &&
                newPerson.personAddress.equals(this.personAddress));

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + expectedId +
                ", name='" + expectedName + '\'' +
                ", address=" + personAddress +
                '}';
    }
}