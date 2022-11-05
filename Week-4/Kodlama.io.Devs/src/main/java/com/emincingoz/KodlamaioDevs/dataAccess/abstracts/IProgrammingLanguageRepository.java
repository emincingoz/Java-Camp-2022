package com.emincingoz.KodlamaioDevs.dataAccess.abstracts;

import com.emincingoz.KodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
