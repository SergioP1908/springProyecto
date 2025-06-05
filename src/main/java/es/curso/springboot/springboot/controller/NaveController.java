package es.curso.springboot.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.springboot.springboot.entities.NaveEspacialEntity;
import es.curso.springboot.springboot.repository.NaveRepository;

@Controller
public class NaveController {

    @Autowired
    private NaveRepository naveRepo;


    // Guardar nave (se llama desde el formulario)
    @PostMapping("/naves")
    public String guardarNave(@RequestParam String nombre,
                              @RequestParam String tipo,
                              @RequestParam int vida,
                              @RequestParam int ataque,
                              @RequestParam int defensa) {

        NaveEspacialEntity nuevaNave = new NaveEspacialEntity(nombre, tipo,vida, ataque, defensa);
        naveRepo.save(nuevaNave);
        System.out.println("Esta registrando las naves");
        return "redirect:/ListadoVehiculo";  // Redirige a la página que lista las naves
    }

    // Mostrar lista de naves
    @GetMapping("/listaNaves")
    public String listarNaves(Model model) {
        List<NaveEspacialEntity> naves = naveRepo.findAll();
        model.addAttribute("naves", naves);
        System.out.println("Esta entrando en lista naves");
        return "listaNaves"; // Aquí cargamos un template Thymeleaf llamado listaNaves.html
    }
    
    @GetMapping("/AnadirVehiculo")
    public String mostrarFormulario() {
        return "AnadirVehiculo";  // Debes crear este archivo HTML
    }
    @PostMapping("/anadirVehiculo")
    public String guardarVehiculo(
        @RequestParam String nombre,
        @RequestParam String tipo,
        @RequestParam int vida,
        @RequestParam int ataque,
        @RequestParam int defensa
) {

        NaveEspacialEntity nuevo = new NaveEspacialEntity(nombre, tipo,vida, ataque, defensa);
        naveRepo.save(nuevo);

        return "redirect:/listadoVehiculo";
    }
    
    @GetMapping("/listadoVehiculo")
    public String mostrarListado(Model model) {
        List<NaveEspacialEntity> vehiculos = naveRepo.findAll(); // Recupera todos de BD
        model.addAttribute("vehiculos", vehiculos);              // Añade a modelo para Thymeleaf
        return "listadoVehiculo";                                // Nombre de la vista (sin .html)
    }


}