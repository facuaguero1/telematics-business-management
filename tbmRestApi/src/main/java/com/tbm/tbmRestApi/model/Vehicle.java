package com.tbm.tbmRestApi.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "VEHICLES")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-vehicle")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String plate;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-customer", nullable = false)
    private Customer customer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-avl", nullable = false)
    private AVL avl;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-vehicleModel", nullable = false)
    private VehicleModel vehicleModel;


    public Vehicle(){}

    public Vehicle(String name, String plate, Date creationDate, Customer customer, AVL avl, VehicleModel vehicleModel) {
        this.name = name;
        this.plate = plate;
        this.creationDate = creationDate;
        this.customer = customer;
        this.avl = avl;
        this.vehicleModel = vehicleModel;
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AVL getAvl() {
        return avl;
    }

    public void setAvl(AVL avl) {
        this.avl = avl;
    }

    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
}
