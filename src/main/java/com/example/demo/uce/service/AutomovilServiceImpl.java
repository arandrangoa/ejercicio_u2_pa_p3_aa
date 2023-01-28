package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{
	
	@Autowired
	private IAutomovilRepo automovilRepo;

	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
		
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscar(placa);
	}

}
