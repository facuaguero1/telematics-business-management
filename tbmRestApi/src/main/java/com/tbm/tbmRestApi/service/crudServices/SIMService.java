package com.tbm.tbmRestApi.service.crudServices;

import com.tbm.tbmRestApi.model.SIM;
import com.tbm.tbmRestApi.model.repositories.MobileOperatorRepository;
import com.tbm.tbmRestApi.model.repositories.SIMRepository;
import com.tbm.tbmRestApi.model.transferObject.SimTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SIMService {

    private SIMRepository simRepository;
    private MobileOperatorRepository mobileOperatorRepository;

    @Autowired
    public SIMService(SIMRepository simR, MobileOperatorRepository mobileOperatorR)
    {
        this.simRepository = simR;
        this.mobileOperatorRepository = mobileOperatorR;
    }

    public SIM addSIM(SimTO simTO){
        SIM sim = new SIM(simTO);
        sim.setMobileOperator(mobileOperatorRepository.getReferenceById(simTO.getMobileOperatorId()));
        return simRepository.save(sim);
    }

    public List<SIM> getAllSIMs() { return simRepository.findAll(); }
}