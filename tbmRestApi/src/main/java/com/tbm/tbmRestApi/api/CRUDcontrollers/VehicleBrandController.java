package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.VehicleBrand;
import com.tbm.tbmRestApi.model.repositories.VehicleBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RequestMapping("api/vehicle-brand")
@RestController
public class VehicleBrandController {
    private final VehicleBrandRepository vehicleBrandRepository;

    @Autowired
    public VehicleBrandController(VehicleBrandRepository vehicleBrandRepository) {
        this.vehicleBrandRepository = vehicleBrandRepository;
    }

    @PostMapping
    public void addVehicleBrand(@RequestBody VehicleBrand vehicleBrand) {
        vehicleBrandRepository.save(vehicleBrand);
    }

    @GetMapping("all")
    public List<VehicleBrand> getAllVehicleBrands() {
        return vehicleBrandRepository.findAll();
    }

    @GetMapping
    public Optional<VehicleBrand> getVehicleBrand(@RequestParam(name = "id") Integer id) {
        return vehicleBrandRepository.findById(id);
    }
}