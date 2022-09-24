package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.AVL;
import com.tbm.tbmRestApi.model.repositories.AVLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/avl")
@RestController
public class AVLController {

    private final AVLRepository avlRepository;

    @Autowired
    public AVLController(AVLRepository avlRepository) {
        this.avlRepository = avlRepository;
    }

    @PostMapping
    public void addAVL(@RequestBody AVL avl) {
        avlRepository.save(avl);
    }

    @GetMapping
    public List<AVL> getAllAvls() {
        return avlRepository.findAll();
    }
}
