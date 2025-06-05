package es.curso.springboot.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.springboot.springboot.entities.UsuarioEntity;
import es.curso.springboot.springboot.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean validarUsuario (String usuario, String contraseña) {
        Optional<UsuarioEntity> usuarioBD = usuarioRepository.findByUsuario(usuario);
        if(usuarioBD.isPresent()) {
            // aquí compararías la contraseña (ideal con hash)
            return usuarioBD.get().getContrasena().equals(contraseña);
        }
        return false;
    }
}