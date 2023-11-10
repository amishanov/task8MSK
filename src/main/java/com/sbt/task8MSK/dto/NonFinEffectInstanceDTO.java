package com.sbt.task8MSK.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NonFinEffectInstanceDTO {
    String nonFinEffectId;
    @NotBlank
    String author;
}

