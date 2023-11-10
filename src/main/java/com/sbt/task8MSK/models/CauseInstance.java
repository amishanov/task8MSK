package com.sbt.task8MSK.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "causeInstances")
public class CauseInstance {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String causeId;
    LocalTime timeCreated;
    String author;
    @ManyToOne(fetch = FetchType.LAZY)
    Incident incident;
}
