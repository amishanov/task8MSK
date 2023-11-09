package com.sbt.task8MSK.models;

import javax.persistence.Entity;
import java.time.LocalTime;

@Entity
public class CauseInstance {
    String causeId;
    //TODO проверить тип
    LocalTime timeCreated;
    String author;
}
