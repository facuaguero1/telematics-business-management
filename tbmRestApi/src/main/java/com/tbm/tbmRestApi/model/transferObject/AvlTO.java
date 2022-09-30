package com.tbm.tbmRestApi.model.transferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tbm.tbmRestApi.model.AVL;

public class AvlTO extends AVL {

    private Integer simId;
    private Integer avlModelId;

    public AvlTO(@JsonProperty("imeiNumber") String imeiNumber,
                 @JsonProperty("serialNumber") String serialNumber,
                 @JsonProperty("simId") Integer simId,
                 @JsonProperty("avlModelId") Integer avlModelId) {
        super(imeiNumber, serialNumber);
        this.simId = simId;
        this.avlModelId = avlModelId;
    }

    public Integer getSimId() {
        return simId;
    }

    public void setSimId(Integer simId) {
        this.simId = simId;
    }

    public Integer getAvlModelId() {
        return avlModelId;
    }

    public void setAvlModelId(Integer avlModelId) {
        this.avlModelId = avlModelId;
    }
}