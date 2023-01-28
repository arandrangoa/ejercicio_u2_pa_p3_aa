package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(cedula);
	}

}
