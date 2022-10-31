package com.emincingoz.KodlamaioDevs.dataAccess.concretes;

import com.emincingoz.KodlamaioDevs.dataAccess.abstracts.IProgrammingLanguageRepository;
import com.emincingoz.KodlamaioDevs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class InMemoryProgrammingLanguageRepository implements IProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1L, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(2L, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(3L, "Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(Long id) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (Objects.equals(id, language.getId()))
                return language;
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage language) {
        language.setId((long) programmingLanguages.size() + 1);
        programmingLanguages.add(language);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.removeIf(programmingLanguage1 -> Objects.equals(programmingLanguage.getId(), programmingLanguage1.getId()));
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (Objects.equals(language.getId(), programmingLanguage.getId())) {
                language.setName(programmingLanguage.getName());
            }
        }
    }
}
