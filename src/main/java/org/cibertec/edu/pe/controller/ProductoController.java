package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
	
	@Autowired
	private IProductoService prod;
	

	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Producto> lista = prod.Listado();
		m.addAttribute("productos", lista);
		return "listar";	
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("producto", new Producto());
		return "nuevo";		
			
	}

	@GetMapping("/salvar")
	public String salvar(@Validated Producto p, Model m) {
		prod.Grabar(p);
		return "redirect:/listar";
	}
}
