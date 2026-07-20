package com.senai.revisao2.repositories;

import com.senai.revisao2.entities.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {


    Optional<ReservaEntity> findById(Long aLong);
}
