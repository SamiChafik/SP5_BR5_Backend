package com.example.itsupport.services;


import com.example.itsupport.dto.PanneDto;
import com.example.itsupport.entities.Panne;
import com.example.itsupport.mappers.PanneMapper;
import com.example.itsupport.repositories.PanneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanneService {

    @Autowired
    private final PanneRepository panneRepository;

    @Autowired
    private final PanneMapper panneMapper;

    public PanneService(PanneRepository panneRepository, PanneMapper panneMapper) {
        this.panneRepository = panneRepository;
        this.panneMapper = panneMapper;
    }

    public PanneDto savePanne(PanneDto panneDto){
        return panneMapper.toDto(panneRepository.save(panneMapper.toEntity(panneDto)));
    }

    public List<PanneDto> getAllPanne(){
        return panneRepository.findAll().stream().map(panne -> panneMapper.toDto(panne)).toList();
    }

    public PanneDto modifierPanne (PanneDto panneDto, Long id){
        Panne panne = panneRepository.findById(id).get();
        panne.setEquipment_id(panneDto.getEquipment_id());
        panne.setDate(panneDto.getDate());

        return panneMapper.toDto(panneRepository.save(panne));
    }

    public void deletePanne(Long id){
        panneRepository.deleteById(id);
    }
}
