package com.example.itsupport.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private Long equipment_id;
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Panne(Long id, Long equipment_id, LocalDate date) {
        this.id = id;
        this.equipment_id = equipment_id;
        this.date = date;
    }

    public Panne() {
    }
}
