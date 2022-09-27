package com.tbm.tbmRestApi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "AVLS",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "serialNumber", "id-avlModel" }) })
public class AVL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-avl")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String imeiNumber;

    @Column(nullable = false)
    private String serialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-avlModel", nullable = false)
    private AvlModel avlModel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-sim")
    private SIM SIM;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-avlStateHistory", nullable = false)
    private AvlStateHistory state;


    public AVL(){}

    public AVL(@JsonProperty("imeiNumber") String imeiNumber,
               @JsonProperty("serialNumber") String serialNumber)
    {   this.imeiNumber = imeiNumber;
        this.serialNumber = serialNumber;
        this.state = new AvlStateHistory();}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public AvlModel getAvlModel() {
        return avlModel;
    }

    public void setAvlModel(AvlModel avlModel) {
        this.avlModel = avlModel;
    }

    public com.tbm.tbmRestApi.model.SIM getSIM() {
        return SIM;
    }

    public void setSIM(com.tbm.tbmRestApi.model.SIM SIM) {
        this.SIM = SIM;
    }

    public AvlStateHistory getState() {
        return state;
    }

    public void setState(AvlStateHistory state) {
        this.state = state;
    }
}
