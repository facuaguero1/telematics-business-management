package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.AvlBrand;
import com.tbm.tbmRestApi.model.repositories.AvlBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RequestMapping("api/avl-brand")
@RestController
public class AvlBrandController {
    private final AvlBrandRepository avlBrandRepository;

    @Autowired
    public AvlBrandController(AvlBrandRepository avlBrandRepository) {
        this.avlBrandRepository = avlBrandRepository;
    }

    @PostMapping
    public void addAvlBrand(@RequestBody AvlBrand avlBrand) {
        avlBrandRepository.save(avlBrand);
    }

    @GetMapping("all")
    public List<AvlBrand> getAllAvlBrands() {
        return avlBrandRepository.findAll();
    }

    @GetMapping
    public Optional<AvlBrand> getAvlBrand(@RequestParam(name = "id") Integer id) {
        return avlBrandRepository.findById(id);
    }
}