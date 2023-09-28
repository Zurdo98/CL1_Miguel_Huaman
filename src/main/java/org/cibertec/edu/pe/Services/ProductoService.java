package org.cibertec.edu.pe.Services;

import java.util.List;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProducto datos;

	@Override
	public List<Producto> Listado() {
		return (List<Producto>)datos.findAll();
	}

	@Override
	public int Grabar(Producto objP) {
		int rpta = 0;
		Producto p = datos.save(objP);
		if(!p.equals(null))rpta = 1;
		return rpta;
	}
		

}
