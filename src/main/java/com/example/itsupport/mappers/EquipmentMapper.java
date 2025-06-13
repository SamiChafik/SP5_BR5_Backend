package com.example.itsupport.mappers;


import com.example.itsupport.dto.EquipmentDto;
import com.example.itsupport.entities.Equipment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {

    Equipment toModel(EquipmentDto dto);
    EquipmentDto toDto(Equipment equipment);
    List<EquipmentDto> toDtos(List<Equipment> equipments);
}
