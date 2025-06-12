package com.example.itsupport.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private Long equipment_id;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Long equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Panne(Long id, Long equipment_id, Date date) {
        this.id = id;
        this.equipment_id = equipment_id;
        this.date = date;
    }

    public Panne() {
    }
}
