package com.tbm.tbmRestApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "MOBILE_OPERATORS")
public class MobileOperator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-mobileOperator")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;


    public MobileOperator(){}

    public MobileOperator(@JsonProperty("name") String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
