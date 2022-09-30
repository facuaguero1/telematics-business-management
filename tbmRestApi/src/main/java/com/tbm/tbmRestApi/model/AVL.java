package com.tbm.tbmRestApi.model;

import com.tbm.tbmRestApi.model.transferObject.AvlTO;
import java.time.LocalDateTime;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-avlModel", nullable = false)
    private AvlModel avlModel;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-sim")
    private SIM SIM;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name="id-avlStateHistory")
    private AvlStateHistory state;


    public AVL(){}

    public AVL(String imeiNumber, String serialNumber)
    {
        this.imeiNumber = imeiNumber;
        this.serialNumber = serialNumber;
    }
    public AVL(AvlTO avlTO)
    {   this.imeiNumber = avlTO.getImeiNumber();
        this.serialNumber = avlTO.getSerialNumber();
    }

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
