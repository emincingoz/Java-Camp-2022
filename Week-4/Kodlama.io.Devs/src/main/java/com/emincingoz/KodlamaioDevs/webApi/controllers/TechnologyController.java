package com.emincingoz.KodlamaioDevs.webApi.controllers;

import com.emincingoz.KodlamaioDevs.business.abstracts.ITechnologyService;
import com.emincingoz.KodlamaioDevs.business.dtos.TechnologyGetDto;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.technology.TechnologyUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "api/technology")
@RequiredArgsConstructor
public class TechnologyController {
    private final ITechnologyService technologyService;

    @PostMapping("/add")
    public void add(TechnologyCreateRequest technologyCreateRequest) throws Exception {

        technologyService.addTechnology(technologyCreateRequest);
    }

    @DeleteMapping("/delete")
    public void delete(Long  id) throws Exception {
        technologyService.deleteTechnology(id);

    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") Long id, TechnologyUpdateRequest technologyUpdateRequest) throws Exception {

        technologyService.updateTechnology(id, technologyUpdateRequest);
    }

    @GetMapping("/findById")
    public TechnologyGetDto findTechnologyById(Long id) throws Exception {
        return technologyService.getTechnologyById(id);
    }

    @GetMapping("/getall")
    public List<TechnologyGetDto> getAll(){
        return technologyService.getTechnology();
    }
}
