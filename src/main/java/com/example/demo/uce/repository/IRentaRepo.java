package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Renta;

public interface IRentaRepo {
	
	public void insertar(Renta renta,String placa, String dedula, String numTarjeta, int numDias );
	

}
