package com.example.itsupport.dto;

import java.time.LocalDate;
import java.util.Date;

public class PanneDto {

    private Long id;
    private Long equipment_id;
    private LocalDate date;

    public PanneDto(Long id, Long equipment_id, LocalDate date) {
        this.id = id;
        this.equipment_id = equipment_id;
        this.date = date;
    }

    public PanneDto() {
    }

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
}
