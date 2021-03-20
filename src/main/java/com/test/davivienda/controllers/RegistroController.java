package com.test.davivienda.controllers;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.davivienda.models.entity.Registro;
import com.test.davivienda.models.service.IRegistroService;


@RestController
@RequestMapping("/api")
public class RegistroController {
	
    Logger logger = LoggerFactory.getLogger(RegistroController.class);

	
	@Autowired
	private IRegistroService registroService;
	
	@GetMapping("/registros")
	public List<Registro> index(){
		return registroService.findAll();
	
	}
	
	@GetMapping("/registros/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Registro show(@PathVariable Long id) {
		return registroService.findById(id);
	}
	
	@PostMapping("/registros")
	@ResponseStatus(HttpStatus.CREATED)
	public Registro create(@RequestBody Registro registro) {
		return registroService.save(registro);
	}
	
	@PutMapping("/registros/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Registro update(@RequestBody Registro registro,@PathVariable Long id) {
		Registro registroActual = registroService.findById(id);
		try {
			registroActual.setCiudad(registro.getCiudad());
			registroActual.setCodigoPostal(registro.getCodigoPostal());
			registroActual.setDepartamento(registro.getDepartamento());
			registroActual.setNombreCalle(registro.getNombreCalle());
			registroActual.setNumeroCalle(registro.getNumeroCalle());
			registroActual.setPerfil(registro.getPerfil());
			registroActual.setTipoDireccion(registro.getTipoDireccion());
			
		} catch (Exception e) {
			logger.error("An ERROR Message");
			e.printStackTrace();
		}
		return registroService.save(registroActual);
	}
	
	@DeleteMapping("/registros/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		try {
			registroService.delete(id);
		} catch (Exception e) {
			logger.error("An ERROR Message");
			e.printStackTrace();
		}
	}
	
	
}
