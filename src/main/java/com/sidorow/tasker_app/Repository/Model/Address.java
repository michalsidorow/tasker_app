package com.sidorow.tasker_app.Repository.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String street;
    private String homeNumber;
    private String appartmentNumber;
    private String postCode;
    private String city;
    private String country;

    @ManyToOne
    @JsonIgnore
    private User user;
}