package com.firstThymeLeaf.first.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    private Integer id;
    private String name;
    private Integer level;
    private Boolean evolves;
}
