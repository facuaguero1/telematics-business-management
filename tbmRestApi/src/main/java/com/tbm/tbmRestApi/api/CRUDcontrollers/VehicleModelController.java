package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.VehicleModel;
import com.tbm.tbmRestApi.model.transferObject.VehicleModelTO;
import com.tbm.tbmRestApi.service.crudServices.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/vehicle-model")
@RestController
public class VehicleModelController {

    private final VehicleModelService vehicleModelService;

    @Autowired
    public VehicleModelController(VehicleModelService vehicleModelService) {
        this.vehicleModelService = vehicleModelService;
    }

    @PostMapping
    public void addAvlModel(@RequestBody VehicleModelTO vehicleModelTO)
    {
        vehicleModelService.addVehicleModel(vehicleModelTO);
    }


    @GetMapping("all")
    public List<VehicleModel> getAllAvlModels() {
        return vehicleModelService.getAllVehicleModels();
    }
}