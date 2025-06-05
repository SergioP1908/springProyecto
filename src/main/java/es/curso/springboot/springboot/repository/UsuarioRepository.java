package es.curso.springboot.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.springboot.springboot.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByUsuario(String usuario);
}
