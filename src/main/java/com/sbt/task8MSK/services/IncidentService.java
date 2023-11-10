package com.sbt.task8MSK.services;

import com.sbt.task8MSK.dto.IncidentDTO;
import com.sbt.task8MSK.dto.IncidentIdDTO;

public interface IncidentService {
    IncidentIdDTO createIncident(IncidentDTO incidentDTO);
}
