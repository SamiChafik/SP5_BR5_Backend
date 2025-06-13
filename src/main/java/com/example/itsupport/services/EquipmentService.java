package com.example.itsupport.services;


import com.example.itsupport.dto.EquipmentDto;
import com.example.itsupport.dto.UserDto;
import com.example.itsupport.entities.Equipment;
import com.example.itsupport.mappers.EquipmentMapper;
import com.example.itsupport.repositories.EquipmentRepository;
import com.example.itsupport.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final EquipmentMapper equipmentMapper;

    public EquipmentService(EquipmentRepository equipmentRepository, EquipmentMapper equipmentMapper) {
        this.equipmentRepository = equipmentRepository;
        this.equipmentMapper = equipmentMapper;
    }

    public EquipmentDto save(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentMapper.toModel(equipmentDto);
        Equipment saved = equipmentRepository.save(equipment);
        return equipmentMapper.toDto(saved);
    }

    public List<EquipmentDto> getAllEquipment() {
        List<Equipment> equipments = equipmentRepository.findAll();
        return equipmentMapper.toDtos(equipments);
    }

    public EquipmentDto getEquipmentById(Long id){
        return equipmentRepository.findById(id)
                .map(equipmentMapper::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Equipment not found with id: " + id));
    }

    public EquipmentDto updateEquipment(Long id, EquipmentDto equipmentDto) {
        Equipment equipment = equipmentRepository.getById(id);
        equipment.setName(equipmentDto.getName());
        equipment.setType(equipmentDto.getType());
        equipment.setStatus(equipmentDto.getStatus());
        equipment.setPurchase_date(equipmentDto.getPurchase_date());
        return equipmentMapper.toDto(equipmentRepository.save(equipment));
    }
    public void deleteEquipment(Long id){
        equipmentRepository.deleteById(id);
    }
}
