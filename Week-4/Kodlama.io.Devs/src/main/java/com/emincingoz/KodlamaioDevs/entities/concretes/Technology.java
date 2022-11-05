package com.emincingoz.KodlamaioDevs.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "technologies", schema = "rest")
@Entity
@ToString
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private ProgrammingLanguage language;
}
