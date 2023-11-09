package com.sbt.task8MSK.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class OperationRiskIncident {
    @Id
            @GeneratedValue
    String IncidentId;
    Incident incident;
    List<NonFinEffectInstance> nonFinEffectInstances;
    List<RecoveryInstance> recoveryInstances;
    List<CauseInstance> causeInstances;

}
