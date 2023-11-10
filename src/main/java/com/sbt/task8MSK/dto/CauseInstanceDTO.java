package com.sbt.task8MSK.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CauseInstanceDTO {
    String causeId;
    @NotBlank
    LocalTime timeCreated;
    @NotBlank
    String author;
}
