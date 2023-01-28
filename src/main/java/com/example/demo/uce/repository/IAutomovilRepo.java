package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Automovil;

public interface IAutomovilRepo {
	
	public void insertar(Automovil automovil);
	
	public Automovil buscar(String placa);

}
