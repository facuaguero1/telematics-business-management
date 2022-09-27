package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.AvlModel;
import com.tbm.tbmRestApi.model.transferObject.AvlModelTO;
import com.tbm.tbmRestApi.service.crudServices.AvlModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/avl-model")
@RestController
public class AvlModelController {

    private final AvlModelService avlModelService;

    @Autowired
    public AvlModelController(AvlModelService avlModelService) {
        this.avlModelService = avlModelService;
    }

    @PostMapping
    public void addAvlModel(@RequestBody AvlModelTO avlModelTO)
    {
        avlModelService.addAvlModel(avlModelTO);
    }


    @GetMapping("all")
    public List<AvlModel> getAllAvlModels() {
        return avlModelService.getAllAvlModels();
    }
}
