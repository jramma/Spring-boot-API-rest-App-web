package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class SucursalController {
	
	@Autowired
	private SucursalService service;

	@GetMapping({ "/sucursal/getAll", "/sucursales" })
	public String listarSucursales(Model model) {
		model.addAttribute("fruites", servicio.listarFruites());
		return "index"; // te devueve el html
	}

	@GetMapping({ "/fruita/add" })
	public String editarFruta(Model model) {
		Fruita fruita = new Fruita();
		model.addAttribute("fruita", fruita);
		return "update"; // te devueve el html
	}

	@PostMapping("/fruites")
	public String guardarFruita(@ModelAttribute("fruita") Fruita fruita) {
		servicio.guardarFruita(fruita);
		return "redirect:/fruites";
	}

	@GetMapping("/fruita/update/{id}")
	public String mostrarFormularioEdicion(@PathVariable int id, Model model) {
		model.addAttribute("fruita", servicio.obtenerFruitaPorId(id));

		return "editar";

	}

	@PostMapping("/fruites/{id}")
	public String actualizarFruita(@PathVariable int id, @ModelAttribute("fruita") Fruita fruita, Model model) {
		Fruita fruitaExiste = servicio.obtenerFruitaPorId(id);
		fruitaExiste.setId(id);
		fruitaExiste.setNom(fruita.getNom());
		servicio.actualizarFruita(fruitaExiste);
		return "redirect:/fruites";

	}

	@GetMapping("/fruita/delete/{id}")
	public String eliminarFruita(@PathVariable int id) {
		servicio.eliminarFruita(id);
		return "redirect:/fruites";
	}

	@GetMapping("/fruita/getOne/{id}")
	public String getFruita(@PathVariable int id, Model model) {
		model.addAttribute("fruites", servicio.obtenerFruitaPorId(id));
		return "index";
	}
	
//	http://localhost:9000/sucursal/add
//
//		http://localhost:9000/sucursal/update
//
//		http://localhost:9000/sucursal/delete/{id}
//
//		http://localhost:9000/sucursal/getOne/{id}
//
//		http://localhost:9000/sucursal/getAll
}
