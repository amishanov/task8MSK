package com.sbt.task8MSK.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Incident {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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
    LocalDateTime timeCreated;
    LocalDateTime dateNotified;
    LocalDateTime dateDiscovered;
    LocalDateTime dateOfIncident;
    LocalDateTime dateFinished;
    LocalDateTime dateExpired;
    LocalDateTime timeFirstValidated;
    LocalDateTime timeLastValidated;
    String clientType;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    List<NonFinEffectInstance> nonFinEffectInstances;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    List<RecoveryInstance> recoveryInstances;
    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL)
    List<CauseInstance> causeInstances;
}


