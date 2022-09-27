package com.tbm.tbmRestApi.api.CRUDcontrollers;

import com.tbm.tbmRestApi.model.MobileOperator;
import com.tbm.tbmRestApi.model.repositories.MobileOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RequestMapping("api/mobile-operator")
@RestController
public class MobileOperatorController {
    private final MobileOperatorRepository mobileOperatorRepository;

    @Autowired
    public MobileOperatorController(MobileOperatorRepository mobileOperatorRepository) {
        this.mobileOperatorRepository = mobileOperatorRepository;
    }

    @PostMapping
    public void addMobileOperator(@RequestBody MobileOperator mobileOperator) {
        mobileOperatorRepository.save(mobileOperator);
    }

    @GetMapping("all")
    public List<MobileOperator> getAllMobileOperators() {
        return mobileOperatorRepository.findAll();
    }

    @GetMapping
    public Optional<MobileOperator> getMobileOperator(@RequestParam(name = "id") Integer id) {
        return mobileOperatorRepository.findById(id);
    }
}