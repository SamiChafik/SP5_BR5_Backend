package com.example.itsupport.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eq_id;
    private String name;
    private String type;
    private StatusEquipment status;
    @Column(columnDefinition = "DATE")
    private LocalDate purchase_date;

    public Long getEq_id() {
        return eq_id;
    }

    public void setEq_id(Long eq_id) {
        this.eq_id = eq_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StatusEquipment getStatus() {
        return status;
    }

    public void setStatus(StatusEquipment status) {
        this.status = status;
    }

    public LocalDate getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDate purchase_date) {
        this.purchase_date = purchase_date;
    }
}
