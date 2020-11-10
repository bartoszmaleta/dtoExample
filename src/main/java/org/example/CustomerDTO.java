package org.example;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String id;
    private final String firstname;
    private final String lastname;

    public CustomerDTO(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
