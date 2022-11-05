package com.emincingoz.KodlamaioDevs.business.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TechnologyGetDto {
    private Long id;
    private String name;
    private Long languageId;
}
