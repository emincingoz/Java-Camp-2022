package com.emincingoz.KodlamaioDevs.dataAccess.abstracts;

import com.emincingoz.KodlamaioDevs.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
}
