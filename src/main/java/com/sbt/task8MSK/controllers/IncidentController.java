package com.sbt.task8MSK.controllers;

import com.sbt.task8MSK.dto.IncidentDTO;
import com.sbt.task8MSK.dto.IncidentIdDTO;
import com.sbt.task8MSK.repositories.IncidentRepository;
import com.sbt.task8MSK.services.IncidentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/incidents")
public class IncidentController {
    IncidentService incidentService;

    @PostMapping
    public ResponseEntity<IncidentIdDTO> createIncident(@RequestBody IncidentDTO incidentDTO) {
        IncidentIdDTO incidentIdDTO = incidentService.createIncident(incidentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(incidentIdDTO);
    }

    @PostMapping("/batch")
    public ResponseEntity<List<IncidentIdDTO>> createIncidentBatch() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<IncidentIdDTO> createIncident(@PathVariable String id,
                                                        @RequestBody IncidentDTO incidentDTO) {

        return null;
    }
}
