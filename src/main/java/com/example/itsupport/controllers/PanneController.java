package com.example.itsupport.controllers;


import com.example.itsupport.dto.PanneDto;
import com.example.itsupport.services.PanneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/panne")
public class PanneController {

    @Autowired
    private final PanneService panneService;

    public PanneController(PanneService panneService) {
        this.panneService = panneService;
    }

    @PostMapping
    public PanneDto addPanne(@RequestBody PanneDto panneDto){
        return panneService.savePanne(panneDto);
    }

    @GetMapping
    public List<PanneDto> getAllPanne(){
        return panneService.getAllPanne();
    }

    @PutMapping
    public PanneDto modifierPanne(Long id, PanneDto panneDto){
        return panneService.modifierPanne(panneDto, id);
    }

    @DeleteMapping
    public void deletePanne(Long id){
        panneService.deletePanne(id);
    }
}
