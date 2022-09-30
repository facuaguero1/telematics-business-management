package com.tbm.tbmRestApi.model.transferObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tbm.tbmRestApi.model.SIM;

public class SimTO extends SIM {

    private Integer mobileOperatorId;

    public SimTO(@JsonProperty("iccid") String iccid,
                 @JsonProperty("phoneNumber") String phoneNumber,
                 @JsonProperty("mobileOperatorId") Integer mobileOperatorId) {
        super(iccid, phoneNumber);
        this.mobileOperatorId = mobileOperatorId;
    }

    public Integer getMobileOperatorId() {
        return mobileOperatorId;
    }

    public void setMobileOperatorId(Integer mobileOperatorId) {
        this.mobileOperatorId = mobileOperatorId;
    }
}
