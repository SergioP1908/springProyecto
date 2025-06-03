package es.curso.springboot.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean validarUsuario(String usuario, String contraseña) {
        Optional<Usuario> usuarioBD = usuarioRepository.findByUsuario(usuario);
        if(usuarioBD.isPresent()) {
            // aquí compararías la contraseña (ideal con hash)
            return usuarioBD.get().getContrasena().equals(contraseña);
        }
        return false;
    }
}