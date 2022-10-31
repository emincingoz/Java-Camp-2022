package com.emincingoz.KodlamaioDevs.webApi.controllers;

import com.emincingoz.KodlamaioDevs.business.abstracts.IProgrammingLanguageService;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageCreateRequest;
import com.emincingoz.KodlamaioDevs.business.requests.programmingLanguage.ProgrammingLanguageUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/programming-languages")
@RequiredArgsConstructor
public class ProgrammingLanguageController {

    private final IProgrammingLanguageService programmingLanguageService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllProgrammingLanguages() {
        return new ResponseEntity<>(programmingLanguageService.getProgrammingLanguages(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getProgrammingLanguageById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<>(programmingLanguageService.getProgrammingLanguageById(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addProgrammingLanguage(@RequestBody ProgrammingLanguageCreateRequest programmingLanguageCreateRequest) throws Exception {
        programmingLanguageService.addProgrammingLanguage(programmingLanguageCreateRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/remove-programming-language/{id}")
    public ResponseEntity<?> removeProgrammingLanguage(@PathVariable("id") Long id) throws Exception {
        programmingLanguageService.deleteProgrammingLanguage(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update-programming-language/{id}")
    public ResponseEntity<?> updateProgrammingLanguage(@PathVariable("id") Long id, @RequestBody ProgrammingLanguageUpdateRequest programmingLanguageUpdateRequest) throws Exception {
        programmingLanguageService.updateProgrammingLanguage(id, programmingLanguageUpdateRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
