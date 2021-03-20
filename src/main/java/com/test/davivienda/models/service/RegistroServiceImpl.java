package com.test.davivienda.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.davivienda.models.dao.IRegistroDao;
import com.test.davivienda.models.entity.Registro;

@Service
public class RegistroServiceImpl implements IRegistroService {
	
	@Autowired
	private IRegistroDao registroDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Registro> findAll() {
		return (List<Registro>) registroDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Registro findById(Long id) {
		return registroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Registro save(Registro registro) {
		return registroDao.save(registro);
	}

	@Override
	@Transactional(readOnly = true)
	public void delete(Long id) {
		registroDao.deleteById(id);
	}

}
