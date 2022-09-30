package com.tbm.tbmRestApi.model;

import com.tbm.tbmRestApi.model.transferObject.SimTO;
import javax.persistence.*;

@Entity
@Table(name = "SIMS")
public class SIM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-sim")
    private Integer id;

    /*
        Both iccid and phoneNumber are strings, because even though they are numbers, you are never
        supposed to run mathematical operations with them. Treating them as numbers can cause unnecessary
        trouble when it comes down to storing and presenting the data.
        The controller class is the one in charge of validating that they are numerical before creating
        a new instance.
    */
    @Column(unique = true, nullable = false)
    private String iccid;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-mobileOperator", nullable = false)
    private MobileOperator mobileOperator;


    public SIM(){}

    public SIM(String iccid, String phoneNumber) {
        this.iccid = iccid;
        this.phoneNumber = phoneNumber;
    }

    public SIM(SimTO simTO) {
        this.iccid = simTO.getIccid();
        this.phoneNumber = simTO.getPhoneNumber();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MobileOperator getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(MobileOperator mobileOperator) {
        this.mobileOperator = mobileOperator;
    }
}
