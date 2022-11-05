package com.emincingoz.KodlamaioDevs.business.concretes;

import com.emincingoz.KodlamaioDevs.business.abstracts.IProgrammingLanguageService;
import com.emincingoz.KodlamaioDevs.business.abstracts.ITechnologyService;
import com.emincingoz.KodlamaioDevs.business.dtos.ProgrammingLanguageGetDto;
import com.emincingoz.KodlamaioDevs.business.dtos.TechnologyGetDto;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyUpdateRequest;
import com.emincingoz.KodlamaioDevs.dataAccess.abstracts.TechnologyRepository;
import com.emincingoz.KodlamaioDevs.entities.concretes.ProgrammingLanguage;
import com.emincingoz.KodlamaioDevs.entities.concretes.Technology;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TechnologyManager implements ITechnologyService {

    private final TechnologyRepository technologyRepository;
    private final IProgrammingLanguageService programmingLanguageService;
    private final ModelMapper modelMapper;
    @Override
    public List<TechnologyGetDto> getTechnology() {
        List<Technology> technologyList = technologyRepository.findAll();
        return modelMapper.map(technologyList, new TypeToken<List<TechnologyGetDto>>() {}.getType());
    }

    @Override
    public TechnologyGetDto getTechnologyById(Long id) throws Exception {
        Optional<Technology> technology = technologyRepository.findById(id);

        if (technology.isEmpty())
            throw new Exception("No Technology found with the specified id");

        return modelMapper.map(technology.get(), TechnologyGetDto.class);
    }

    @Override
    public void addTechnology(TechnologyCreateRequest technologyCreateRequest) throws Exception {
        if (isNameNull(technologyCreateRequest.getName()))
            throw new Exception("Technology field can not be left blank");

        if (isNameExists(technologyCreateRequest.getName())) {
            throw new Exception("Technology name already exists");
        }

        ProgrammingLanguage language = new ProgrammingLanguage();
        ProgrammingLanguageGetDto programmingLanguageGetDto = programmingLanguageService.getProgrammingLanguageById(technologyCreateRequest.getLanguageId());

        language = modelMapper.map(programmingLanguageGetDto, ProgrammingLanguage.class);

        Technology technology = modelMapper.map(technologyCreateRequest, Technology.class);

        technology.setLanguage(language);

        technologyRepository.save(technology);
    }

    @Override
    public void deleteTechnology(Long id) throws Exception {
        TechnologyGetDto technologyGetDto = getTechnologyById(id);
        technologyRepository.delete(modelMapper.map(technologyGetDto, Technology.class));
    }

    @Override
    public void updateTechnology(Long id, TechnologyUpdateRequest technologyUpdateRequest) throws Exception {
        if (!isIdExists(id))
            throw new Exception("Technology id not found");

        if (isNameNull(technologyUpdateRequest.getName()))
            throw new Exception("Technology field can not be left blank");

        if (isNameExists(technologyUpdateRequest.getName()) && Objects.equals(technologyUpdateRequest.getLanguageId(), id))
            throw new Exception("Technology name already exists");

        ProgrammingLanguage language;
        ProgrammingLanguageGetDto programmingLanguageGetDto = programmingLanguageService.getProgrammingLanguageById(technologyUpdateRequest.getLanguageId());

        language = modelMapper.map(programmingLanguageGetDto, ProgrammingLanguage.class);

        TechnologyGetDto technologyGetDto = getTechnologyById(id);
        Technology technology = modelMapper.map(technologyGetDto, Technology.class);

        technology.setName(technologyUpdateRequest.getName());
        technology.setLanguage(language);

        technologyRepository.save(technology);
    }

    private boolean isNameExists(String name) {
        for (Technology technology : technologyRepository.findAll()) {
            if (technology.getName().equals(name))
                return true;
        }
        return false;
    }

    private boolean isIdExists(Long id) {
        for (Technology technology : technologyRepository.findAll()) {
            if (Objects.equals(technology.getId(), id))
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
