package es.curso.springboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.springboot.springboot.entities.NaveEspacialEntity;

public interface NaveRepository extends JpaRepository<NaveEspacialEntity, Long> {
}