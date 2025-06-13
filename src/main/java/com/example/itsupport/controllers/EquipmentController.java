package com.example.itsupport.controllers;


import com.example.itsupport.dto.EquipmentDto;
import com.example.itsupport.services.EquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
@CrossOrigin("*")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public EquipmentDto createEquipment(@RequestBody EquipmentDto equipmentDto) {
        return equipmentService.save(equipmentDto);

    }

    @GetMapping("/allEq")
    public List<EquipmentDto> getAllEquipment() {
        return equipmentService.getAllEquipment();
    }

    @GetMapping("/{id}")
    public EquipmentDto getEquipmentById(@PathVariable Long id){
        return equipmentService.getEquipmentById(id);
    }

    @PutMapping("/{id}")
    public EquipmentDto updateEquipment(@PathVariable Long id, @RequestBody EquipmentDto equipmentDto) {
        return equipmentService.updateEquipment(id, equipmentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteEquipment(id);
    }
}
