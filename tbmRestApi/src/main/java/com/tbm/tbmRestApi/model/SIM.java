package com.tbm.tbmRestApi.model;

import javax.persistence.*;

@Entity
@Table(name = "SIMS")
public class SIM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-sim")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String iccid;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-mobileOperator", nullable = false)
    private MobileOperator mobileOperator;


    public SIM(){}

    public SIM(String iccid, String phoneNumber, MobileOperator mobileOperator) {
        this.iccid = iccid;
        this.phoneNumber = phoneNumber;
        this.mobileOperator = mobileOperator;
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
