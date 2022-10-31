package com.emincingoz.KodlamaioDevs.dataAccess.abstracts;

import com.emincingoz.KodlamaioDevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(Long id);
    void add(ProgrammingLanguage language);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
}
