package com.tbm.tbmRestApi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.tbm.tbmRestApi.model.transferObject.AvlModelTO;

import javax.persistence.*;

@Entity
@Table(name = "AVL_MODELS",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "name", "id-avlBrand" }) })
public class AvlModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-avlModel")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-avlBrand", nullable = false)
    private AvlBrand avlBrand;


    public AvlModel(){}

    public AvlModel(String name)
    {
        this.name = name;
    }

    public AvlModel(AvlModelTO avlModelTO)
    {
        this.name = avlModelTO.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AvlBrand getAvlBrand() {
        return avlBrand;
    }

    public void setAvlBrand(AvlBrand avlBrand) {
        this.avlBrand = avlBrand;
    }
}
