package com.sbt.task8MSK.services;

import com.sbt.task8MSK.dto.IncidentDTO;
import com.sbt.task8MSK.dto.IncidentIdDTO;
import com.sbt.task8MSK.models.Incident;
import com.sbt.task8MSK.repositories.IncidentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class IncidentServiceImpl implements IncidentService {
    IncidentRepository incidentRepository;
    ModelMapper modelMapper;

    //TODO check
    @Override
    @Transactional
    public IncidentIdDTO createIncident(IncidentDTO incidentDTO) {
        Incident incident = modelMapper.map(incidentDTO, Incident.class);
        incident = incidentRepository.save(incident);
        return new IncidentIdDTO(incident.getIncidentId());
    }

    public IncidentIdDTO updateIncident(String id, IncidentDTO incidentDTO) {
        //TODO посмотреть возврат через Exception
        if (!incidentRepository.existsById(id))
            return new IncidentIdDTO("");
        Incident incident = modelMapper.map(incidentDTO, Incident.class);
        incident.setIncidentId(id);
        incident = incidentRepository.save(incident);
        return new IncidentIdDTO(incident.getIncidentId());
    }
}
