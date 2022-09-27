package com.tbm.tbmRestApi.model.transferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tbm.tbmRestApi.model.VehicleModel;

public class VehicleModelTO extends VehicleModel {

    private Integer vehicleBrandId;

    public VehicleModelTO(@JsonProperty("name") String name,
                          @JsonProperty("vehicleBrandId") Integer vehicleBrandId) {
        super(name);
        this.vehicleBrandId = vehicleBrandId;
    }

    public Integer getVehicleBrandId() {
        return vehicleBrandId;
    }

    public void setVehicleBrandId(Integer vehicleBrandId) {
        this.vehicleBrandId = vehicleBrandId;
    }
}