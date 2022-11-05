package com.emincingoz.KodlamaioDevs.business.abstracts;

import com.emincingoz.KodlamaioDevs.business.dtos.TechnologyGetDto;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyUpdateRequest;

import java.util.List;

public interface ITechnologyService {
    List<TechnologyGetDto> getTechnology();
    TechnologyGetDto getTechnologyById(Long id) throws Exception;
    void addTechnology(TechnologyCreateRequest technologyCreateRequest) throws Exception;
    void deleteTechnology(Long id) throws Exception;
    void updateTechnology(Long id, TechnologyUpdateRequest technologyUpdateRequest) throws Exception;
}
