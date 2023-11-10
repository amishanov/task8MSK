package com.sbt.task8MSK.repositories;

import com.sbt.task8MSK.models.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, String> {
}
