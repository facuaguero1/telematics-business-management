package com.tbm.tbmRestApi.model;

import javax.persistence.*;

@Entity
@Table(name = "AVL_STATES")
public class AvlState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-avlState")
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;


    public AvlState(){}

    public AvlState(String name) {
        this.name = name;
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
}
