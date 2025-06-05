package es.curso.springboot.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.springboot.springboot.entities.NaveEspacialEntity;
import es.curso.springboot.springboot.repository.NaveRepository;
import es.curso.springboot.springboot.services.UsuarioService;

@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;
    


    @GetMapping("/login")
    public String mostrarFormulario() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String usuario,
                               @RequestParam String contraseña,
                               Model model) {

        System.out.println("Login recibido: " + usuario);

        boolean valido = usuarioService.validarUsuario(usuario, contraseña);
        System.out.println("¿Usuario válido? " + valido);
        if(valido) {
            return "redirect:/listadoVehiculo";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }

    @GetMapping("/anadirGuerrero")
    public String guerreroNuevo() {
        return "AnadirGuerrero";
    }


}