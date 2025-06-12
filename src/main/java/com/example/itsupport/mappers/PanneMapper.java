package com.example.itsupport.mappers;


import com.example.itsupport.dto.PanneDto;
import com.example.itsupport.entities.Panne;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PanneMapper {
    PanneDto toDto(Panne panne);
    Panne toEntity(PanneDto panneDto);
}
