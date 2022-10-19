package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.services.SucursalService;

@Controller
public class SucursalController {

	@Autowired
	private SucursalService service;

//	http://localhost:9000/sucursal/getAll
	@GetMapping({ "/sucursal/getAll", "/sucursales" })
	public String listarSucursales(Model model) {
		model.addAttribute("Sucursal", service.getAll());
		return "index"; // te devueve el html
	}

//	http://localhost:9000/sucursal/add
	@GetMapping({ "/sucursal/add" })
	public String editarFruta(Model model) {
		Sucursal sucursal = new Sucursal();
		model.addAttribute("Sucursal", sucursal);
		return "update"; // te devueve el html
	}

	@PostMapping("/sucursales")
	public String addSucursal(@ModelAttribute("fruita") Sucursal sucursal) {
		service.add(sucursal);
		return "redirect:/sucursales";
	}

//	http://localhost:9000/sucursal/update
	@GetMapping("/sucursal/update/{id}")
	public String mostrarFormularioEdicion(@PathVariable int id, Model model) {
		model.addAttribute("Sucursal", service.getOne(id));
		return "editar";

	}

	@PostMapping("/sucursales/{id}")
	public String actualizarSucursal(@PathVariable int id, @ModelAttribute("sucursal") Sucursal sucursal, Model model) {
		Sucursal sucursalE = service.getOne(id);
		sucursalE.setPk_SucursalID(sucursal.getPk_SucursalID());
		sucursalE.setNomSucursal(sucursal.getNomSucursal());
		sucursalE.setPaisSucursal(sucursal.getPaisSucursal());
		service.update(sucursalE);
		return "redirect:/sucursal/getAll";

	}

//	http://localhost:9000/sucursal/delete/{id}
	@GetMapping("/sucursal/delete/{id}")
	public String eliminarFruita(@PathVariable int id) {
		service.delete(id);
		return "redirect:/sucursales";
	}

//	http://localhost:9000/sucursal/getOne/{id}
	@GetMapping("/sucursal/getOne/{id}")
	public String getSucursal(@PathVariable int id, Model model) {
		model.addAttribute("Sucursal", service.getOne(id));
		return "index";
	}
//	http://localhost:9000/sucursal/EU/{id}
	@GetMapping("/sucursal/EU/{id}")
	public String getEu(@PathVariable int id, Model model) {
		Sucursal sucursalE = service.getOne(id);
		SucursalDTO dto = new SucursalDTO(sucursalE.getPk_SucursalID(),sucursalE.getNomSucursal(),sucursalE.getPaisSucursal() ) ;
		model.addAttribute("Sucursal", dto);
		
		return "EU";
	}

}
