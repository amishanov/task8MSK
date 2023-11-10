package com.sbt.task8MSK.dto;

import com.sbt.task8MSK.models.CauseInstance;
import com.sbt.task8MSK.models.NonFinEffectInstance;
import com.sbt.task8MSK.models.RecoveryInstance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IncidentDTO {
    String incidentId;
    @NotBlank
    String sourceSystem;
    String riskProfile;
    @Size(max=500)
    String incidentName;
    @Size(max=2000)
    String incidentDescription;
    //TODO сделать доп. валидацию через ENUM?
    @NotBlank
    String incidentStatus;
    @NotBlank
    String author;
    String owner;
    String verifier;
    @NotBlank
    LocalTime timeCreated;
    LocalTime dateNotified;
    LocalTime dateDiscovered;
    LocalTime dateOfIncident;
    LocalTime dateFinished;
    LocalTime dateExpired;
    LocalTime timeFirstValidated;
    LocalTime timeLastValidated;
    @NotBlank
    String clientType;
    List<NonFinEffectInstanceDTO> nonFinEffectInstances;
    List<RecoveryInstanceDTO> recoveryInstances;
    List<CauseInstanceDTO> causeInstances;
}
