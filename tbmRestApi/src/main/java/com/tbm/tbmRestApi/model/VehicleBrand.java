package com.tbm.tbmRestApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE_BRANDS")
public class VehicleBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-vehicleBrand")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;


    public VehicleBrand(){}

    public VehicleBrand(@JsonProperty("name") String name) {
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
