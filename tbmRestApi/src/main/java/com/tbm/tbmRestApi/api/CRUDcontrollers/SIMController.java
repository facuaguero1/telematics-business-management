package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.SIM;
import com.tbm.tbmRestApi.model.transferObject.SimTO;
import com.tbm.tbmRestApi.service.crudServices.SIMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static com.tbm.tbmRestApi.CommonFunctions.isNumeric;

@RequestMapping("api/sim")
@RestController
public class SIMController {

    private final SIMService simService;

    @Autowired
    public SIMController(SIMService simService) {
        this.simService = simService;
    }

    @PostMapping
    public ResponseEntity<Object> addSIM(@RequestBody SimTO simTO)
    {
        if(!isNumeric(simTO.getIccid()) || !isNumeric(simTO.getPhoneNumber()))
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        simService.addSIM(simTO);
        return null;
    }


    @GetMapping("all")
    public List<SIM> getAllAvlModels() {
        return simService.getAllSIMs();
    }
}
