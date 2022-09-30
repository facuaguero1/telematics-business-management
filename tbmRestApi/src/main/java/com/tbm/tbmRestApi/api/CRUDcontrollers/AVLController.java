package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tbm.tbmRestApi.model.AVL;
import com.tbm.tbmRestApi.model.transferObject.AvlTO;
import com.tbm.tbmRestApi.service.crudServices.AVLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/avl")
@RestController
public class AVLController {

    private final AVLService avlService;

    @Autowired
    public AVLController(AVLService avlService) {
        this.avlService = avlService;
    }

    @PostMapping
    public void addAVL(@RequestBody AvlTO avlTO)
    {
        avlService.addAVL(avlTO);
    }

    @GetMapping("all")
    public List<AVL> getAllAvls() {
        return avlService.getAllAvls();
    }
}
