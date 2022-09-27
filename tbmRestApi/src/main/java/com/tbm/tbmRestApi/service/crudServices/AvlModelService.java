package com.tbm.tbmRestApi.service.crudServices;

import com.tbm.tbmRestApi.model.AvlModel;
import com.tbm.tbmRestApi.model.repositories.AvlBrandRepository;
import com.tbm.tbmRestApi.model.repositories.AvlModelRepository;
import com.tbm.tbmRestApi.model.transferObject.AvlModelTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvlModelService {

    private AvlModelRepository avlModelRepository;
    private AvlBrandRepository avlBrandRepository;

    @Autowired
    public AvlModelService(AvlModelRepository avlModelR, AvlBrandRepository avlBrandR)
    {
        this.avlModelRepository = avlModelR;
        this.avlBrandRepository = avlBrandR;
    }

    public AvlModel addAvlModel(AvlModelTO avlModelTO){
        AvlModel avlModel = new AvlModel(avlModelTO);
        avlModel.setAvlBrand(avlBrandRepository.getReferenceById(avlModelTO.getAvlBrandId()));
        return avlModelRepository.save(avlModel);
    }

    public List<AvlModel> getAllAvlModels() { return avlModelRepository.findAll(); }
}