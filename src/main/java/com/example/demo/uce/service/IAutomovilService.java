package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Automovil;

public interface IAutomovilService {
	
	public void agregar(Automovil automovil);
	
	public Automovil buscar(String placa);
	

}
