package com.tbm.tbmRestApi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AVL_STATE_HISTORIES")
public class AvlStateHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-avlStateHistory")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id-avlState", nullable = false)
    private AvlState state;

    @Column(nullable = false)
    private Date startDate;

    @Column
    private Date endDate;


    public AvlStateHistory(){}

    public AvlStateHistory(AvlState state, Date startDate, Date endDate) {
        this.state = state;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AvlState getState() {
        return state;
    }

    public void setState(AvlState state) {
        this.state = state;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
