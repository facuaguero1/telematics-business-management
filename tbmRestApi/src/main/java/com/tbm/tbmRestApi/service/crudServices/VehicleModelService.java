package com.tbm.tbmRestApi.service.crudServices;


import com.tbm.tbmRestApi.model.VehicleModel;
import com.tbm.tbmRestApi.model.repositories.VehicleBrandRepository;
import com.tbm.tbmRestApi.model.repositories.VehicleModelRepository;
import com.tbm.tbmRestApi.model.transferObject.VehicleModelTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleModelService {

    private VehicleModelRepository vehicleModelRepository;
    private VehicleBrandRepository vehicleBrandRepository;

    @Autowired
    public VehicleModelService(VehicleModelRepository vehicleModelR, VehicleBrandRepository vehicleBrandR)
    {
        this.vehicleModelRepository = vehicleModelR;
        this.vehicleBrandRepository = vehicleBrandR;
    }

    public VehicleModel addVehicleModel(VehicleModelTO vehicleModelTO){
        VehicleModel vehicleModel = new VehicleModel(vehicleModelTO);
        vehicleModel.setVehicleBrand(vehicleBrandRepository.getReferenceById(vehicleModelTO.getVehicleBrandId()));
        return vehicleModelRepository.save(vehicleModel);
    }

    public List<VehicleModel> getAllVehicleModels() { return vehicleModelRepository.findAll(); }
}