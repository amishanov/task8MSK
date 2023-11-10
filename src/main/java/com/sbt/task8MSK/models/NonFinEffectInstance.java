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
@Table(name = "nonFinEffectInstances")
public class NonFinEffectInstance {
    // TODO по-идее, тут ID'шник должен не генерироваться сам, а только вставляться ручками (т.к. он в передаваемых данных)
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nonFinEffectId")
    String nonFinEffectId;
    String author;
    @Column(insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    Incident incident;
}
