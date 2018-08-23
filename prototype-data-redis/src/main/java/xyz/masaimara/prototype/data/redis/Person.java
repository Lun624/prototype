package xyz.masaimara.prototype.data.redis;

import com.google.common.base.MoreObjects;

public class Person {
    private String firstname;
    private String lastname;
    private Address address;

    public String getFirstname() {
        return firstname;
    }

    public Person setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Person setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Person setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstname", firstname)
                .add("lastname", lastname)
                .add("address", address)
                .toString();
    }
}
