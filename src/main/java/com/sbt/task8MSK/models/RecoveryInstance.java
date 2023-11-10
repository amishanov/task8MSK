package com.sbt.task8MSK.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recoveryInstances")
public class RecoveryInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    String recoveryId;
    String author;
    @ManyToOne(fetch = FetchType.LAZY)
    Incident incident;
}
