package com.rowland.engineering.basiccrud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class User {


    public String getFirstName() {
        return firstName;
    }


    public UUID getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    @NotBlank
    private final String firstName;

    @NotBlank
    private final UUID id;

    @NotBlank
    private final String lastName;

    @NotBlank
    int accountBalance;

    public User (@JsonProperty("id")UUID id,
                 @JsonProperty("firstName") String firstName,
                 @JsonProperty("lastName") String lastName,
                 @JsonProperty("accountBalance") int accountBalance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;

    }
}