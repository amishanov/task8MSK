package com.sbt.task8MSK.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String incidentId;
    String sourceSystem;
    String riskProfile;
    @Column(length = 500)
    String incidentName;
    @Column(length = 2000)
    String incidentDescription;
    String incidentStatus;
    String author;
    String owner;
    String verifier;
    LocalTime timeCreated;
    LocalTime dateNotified;
    LocalTime dateDiscovered;
    LocalTime dateOfIncident;
    LocalTime dateFinished;
    LocalTime dateExpired;
    LocalTime timeFirstValidated;
    LocalTime timeLastValidated;
    String clientType;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
//    @JoinColumn(name = "nonFinEffectId")
    List<NonFinEffectInstance> nonFinEffectInstances;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    List<RecoveryInstance> recoveryInstances;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    List<CauseInstance> causeInstances;
}


