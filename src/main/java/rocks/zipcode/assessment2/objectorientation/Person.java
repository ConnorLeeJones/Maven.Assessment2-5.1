package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private Address address;



    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        return (Objects.equals(this.id, ((Person) o).getId()) &&
                Objects.equals(this.name, ((Person) o).getName()) &&
                Objects.equals(this.address, ((Person) o).getAddress()));
    }



    @Override
    public String toString(){
        return "Person{id=" + this.id + ", name='" + this.name +
                "', address=" + this.address.toString() + "}";
    }
}