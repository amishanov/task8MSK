package com.sbt.task8MSK.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalTime;

@Entity
public class Incident {
    String sourceSystem;
    String riskProfile;
    String incidentName;
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




}
