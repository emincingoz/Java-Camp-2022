package com.emincingoz.KodlamaioDevs.business.concretes;

import com.emincingoz.KodlamaioDevs.business.abstracts.IProgrammingLanguageService;
import com.emincingoz.KodlamaioDevs.business.dtos.ProgrammingLanguageGetDto;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageUpdateRequest;
import com.emincingoz.KodlamaioDevs.dataAccess.abstracts.IProgrammingLanguageRepository;
import com.emincingoz.KodlamaioDevs.entities.concretes.ProgrammingLanguage;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ProgrammingLanguageManager implements IProgrammingLanguageService {

    private final IProgrammingLanguageRepository programmingLanguageRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProgrammingLanguageGetDto> getProgrammingLanguages() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();
        return modelMapper.map(programmingLanguages, new TypeToken<List<ProgrammingLanguageGetDto>>() {}.getType());
    }

    @Override
    public ProgrammingLanguageGetDto getProgrammingLanguageById(Long id) throws Exception {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getById(id);

        if (programmingLanguage == null)
            throw new Exception("No programming language found with the specified id");

        return modelMapper.map(programmingLanguage, ProgrammingLanguageGetDto.class);
    }

    @Override
    public void addProgrammingLanguage(ProgrammingLanguageCreateRequest programmingLanguageCreateRequest) throws Exception {

        if (isNameNull(programmingLanguageCreateRequest.getName()))
            throw new Exception("Programming language field can not be left blank");

        if (isNameExists(programmingLanguageCreateRequest.getName())) {
            throw new Exception("Programming language name already exists");
        }

        ProgrammingLanguage programmingLanguage = modelMapper.map(programmingLanguageCreateRequest, ProgrammingLanguage.class);

        programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void deleteProgrammingLanguage(Long id) throws Exception {
        ProgrammingLanguageGetDto programmingLanguageGetDto = getProgrammingLanguageById(id);
        programmingLanguageRepository.delete(modelMapper.map(programmingLanguageGetDto, ProgrammingLanguage.class));
    }

    @Override
    public void updateProgrammingLanguage(Long id, ProgrammingLanguageUpdateRequest programmingLanguageUpdateRequest) throws Exception {
        if (!isIdExists(id))
            throw new Exception("Programming language id not found");

        if (isNameNull(programmingLanguageUpdateRequest.getName()))
            throw new Exception("Programming language field can not be left blank");

        if (isNameExists(programmingLanguageUpdateRequest.getName()))
            throw new Exception("Programming language name already exists");

        ProgrammingLanguageGetDto programmingLanguageGetDto = getProgrammingLanguageById(id);
        programmingLanguageGetDto.setName(programmingLanguageUpdateRequest.getName());

        programmingLanguageRepository.update(modelMapper.map(programmingLanguageGetDto, ProgrammingLanguage.class));
    }

    private boolean isNameExists(String name) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
            if (programmingLanguage.getName().equals(name))
                return true;
        }
        return false;
    }

    private boolean isIdExists(Long id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
            if (Objects.equals(programmingLanguage.getId(), id))
                return true;
        }
        return false;
    }

    private boolean isNameNull(String name) {
        if (name == null || name.length() == 0)
            return true;
        return false;
    }
}
