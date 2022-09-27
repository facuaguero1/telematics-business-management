package com.tbm.tbmRestApi.service.crudServices;

import com.tbm.tbmRestApi.model.AVL;
import com.tbm.tbmRestApi.model.AvlModel;
import com.tbm.tbmRestApi.model.repositories.AVLRepository;
import com.tbm.tbmRestApi.model.repositories.AvlModelRepository;
import com.tbm.tbmRestApi.model.repositories.SIMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.SimpleAliasRegistry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AVLService {

    private AVLRepository avlRepository;
    private AvlModelRepository avlModelRepository;
    private SIMRepository simRepository;

    @Autowired
    public AVLService(AVLRepository avlR,
                      AvlModelRepository avlModelR,
                      SIMRepository simR)
    {
        this.avlRepository = avlR;
        this.avlModelRepository = avlModelR;
        this.simRepository = simR;
    }

    public AVL addAVL(AVL avl, Integer avlModelId, Integer simId){
        avl.setAvlModel(avlModelRepository.getReferenceById(avlModelId));
        avl.setSIM(simRepository.getReferenceById(simId));
        return avlRepository.save(avl);
    }

    public List<AVL> getAllAvls() { return avlRepository.findAll(); }
}
