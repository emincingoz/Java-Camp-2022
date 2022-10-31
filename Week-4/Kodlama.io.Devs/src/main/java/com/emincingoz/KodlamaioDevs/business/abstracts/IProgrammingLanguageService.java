package com.emincingoz.KodlamaioDevs.business.abstracts;

import com.emincingoz.KodlamaioDevs.business.dtos.ProgrammingLanguageGetDto;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageUpdateRequest;

import java.util.List;

public interface IProgrammingLanguageService {
    List<ProgrammingLanguageGetDto> getProgrammingLanguages();
    ProgrammingLanguageGetDto getProgrammingLanguageById(Long id) throws Exception;
    void addProgrammingLanguage(ProgrammingLanguageCreateRequest programmingLanguageCreateRequest) throws Exception;
    void deleteProgrammingLanguage(Long id) throws Exception;
    void updateProgrammingLanguage(Long id, ProgrammingLanguageUpdateRequest programmingLanguageUpdateRequest) throws Exception;
}
