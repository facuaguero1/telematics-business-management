package com.tbm.tbmRestApi.model.transferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tbm.tbmRestApi.model.AvlModel;

public class AvlModelTO extends AvlModel {

    private Integer avlBrandId;

    public AvlModelTO(@JsonProperty("name") String name,
                      @JsonProperty("avlBrandId") Integer avlBrandId) {
        super(name);
        this.avlBrandId = avlBrandId;
    }

    public Integer getAvlBrandId() {
        return avlBrandId;
    }

    public void setAvlBrandId(Integer avlBrandId) {
        this.avlBrandId = avlBrandId;
    }
}
