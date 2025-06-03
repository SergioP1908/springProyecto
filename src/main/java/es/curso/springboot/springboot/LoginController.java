package es.curso.springboot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String mostrarFormulario() {
        return "login";  // el nombre de tu plantilla login.html
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String usuario,
                               @RequestParam String contraseña,
                               Model model) {

        boolean valido = usuarioService.validarUsuario(usuario, contraseña);
        if(valido) {
            // Login correcto, redirigir a página principal o dashboard
            return "ListadoVehiculo";
        } else {
            // Login incorrecto, mostrar mensaje y volver al login
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
    }
    

	
	@RequestMapping(value="/AnadirVehiculo", method=RequestMethod.GET)
	public String metodoHTMLGuerrero () {

		return "AnadirVehiculo";
	}
}
