package com.sbt.task8MSK.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "nonFinEffectInstances")
public class NonFinEffectInstance implements Serializable {
    @Id
    @Column(name = "nonFinEffectId")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String nonFinEffectId;
    String author;
    @ManyToOne(fetch = FetchType.LAZY)
    Incident incident;
}
