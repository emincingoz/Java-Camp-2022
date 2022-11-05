package com.emincingoz.KodlamaioDevs.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "languages", schema = "rest")
@ToString
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "language")
    private Set<Technology> technologyList;

    public ProgrammingLanguage(String name) {
        this.name = name;
    }
}
