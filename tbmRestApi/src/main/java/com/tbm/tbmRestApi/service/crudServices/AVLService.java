package com.tbm.tbmRestApi.service.crudServices;

import com.tbm.tbmRestApi.model.AVL;
import com.tbm.tbmRestApi.model.AvlModel;
import com.tbm.tbmRestApi.model.AvlStateHistory;
import com.tbm.tbmRestApi.model.repositories.AVLRepository;
import com.tbm.tbmRestApi.model.repositories.AvlModelRepository;
import com.tbm.tbmRestApi.model.repositories.AvlStateRepository;
import com.tbm.tbmRestApi.model.repositories.SIMRepository;
import com.tbm.tbmRestApi.model.transferObject.AvlTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.SimpleAliasRegistry;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AVLService {

    private AVLRepository avlRepository;
    private AvlModelRepository avlModelRepository;
    private SIMRepository simRepository;
    private AvlStateRepository avlStateRepository;

    @Autowired
    public AVLService(AVLRepository avlR,
                      AvlModelRepository avlModelR,
                      SIMRepository simR,
                      AvlStateRepository avlStateR)
    {
        this.avlRepository = avlR;
        this.avlModelRepository = avlModelR;
        this.simRepository = simR;
        this.avlStateRepository = avlStateR;
    }

    public AVL addAVL(AvlTO avlTO){
        AVL avl = new AVL(avlTO);
        avl.setAvlModel(avlModelRepository.getReferenceById(avlTO.getAvlModelId()));
        avl.setSIM(simRepository.getReferenceById(avlTO.getSimId()));

        /* We must save the AVL first before we assign it a current state,
            or else a TransientPropertyValueException will be thrown. */
        avlRepository.save(avl);

        // The AvlState with id 4 will always be the "Brand new" state.
        avl.setState(new AvlStateHistory(avl, LocalDateTime.now()));
        avl.getState().setState(avlStateRepository.getReferenceById(4));

        return avlRepository.save(avl);
    }

    public List<AVL> getAllAvls() { return avlRepository.findAll(); }
}
