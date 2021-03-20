package com.test.davivienda.models.service;

import java.util.List;

import com.test.davivienda.models.entity.Registro;

public interface IRegistroService {
	public List<Registro> findAll();
	public Registro findById(Long id);
	public Registro save(Registro registro);
	public void delete(Long id);
}
