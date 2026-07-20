package com.senai.revisao2.repositories;

import com.senai.revisao2.entities.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

    Optional<RecursoEntity> findById(Long aLong);
}
