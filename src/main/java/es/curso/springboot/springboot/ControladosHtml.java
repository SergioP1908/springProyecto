package es.curso.springboot.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/start")
public class ControladosHtml {

	@RequestMapping(value="/inicio", method=RequestMethod.GET)
	public String metodoHTML () {

		return "ListadoVehiculo";
	}
	
	@RequestMapping(value="/ListadoGuerrero", method=RequestMethod.GET)
	public String metodoHTMLGuerrero () {

		return "ListadoGuerreros";
	}
	
}
