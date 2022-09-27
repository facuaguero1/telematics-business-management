package com.tbm.tbmRestApi.model;

import com.tbm.tbmRestApi.model.transferObject.VehicleModelTO;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE_MODELS")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-vehicleModel")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-vehicleBrand", nullable = false)
    private VehicleBrand vehicleBrand;


    public VehicleModel(){}

    public VehicleModel(String name) {
        this.name = name;
    }

    public VehicleModel(VehicleModelTO vehicleModelTO) {
        this.name = vehicleModelTO.getName();
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

    public VehicleBrand getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(VehicleBrand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
}
