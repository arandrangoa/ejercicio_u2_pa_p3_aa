package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.repository.IRentaRepo;

@Service
public class RentaService implements IRentaService{
	
	@Autowired
	private IRentaRepo iRentaRepo;

	@Override
	public void agregar(Renta renta, String placa, String dedula, String numTarjeta, int numDias) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta, placa, dedula, numTarjeta, numDias);
	}
	
	public void valorRenta(Automovil automovil) {
		Double valDia=automovil.getValorPorDia();
		Renta renta=new Renta();
		Integer numDias=renta.getNumeroDias();
		
		Double valRenta=numDias*valDia;
		
		System.out.println("Valor de renta: "+ valRenta); ;
	}
	

}
