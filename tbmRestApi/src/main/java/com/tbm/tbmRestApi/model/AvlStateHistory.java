package com.tbm.tbmRestApi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "AVL_STATE_HISTORIES")
public class AvlStateHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-avlStateHistory")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-avl", nullable = false)
    private AVL avl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id-avlState", nullable = false)
    private AvlState state;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column
    private LocalDateTime endDate;


    public AvlStateHistory(){}

    public AvlStateHistory(AVL avl,LocalDateTime startDate) {
        /* The state has to be assigned by a service class, so as to not give the model access
            to a repository. */
        this.avl = avl;
        this.startDate = startDate;
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


    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
