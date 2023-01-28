package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.service.IAutomovilService;
import com.example.demo.uce.service.IClienteService;
import com.example.demo.uce.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3AaApplication implements CommandLineRunner{
	
	@Autowired
	private IAutomovilService automovilService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaService iRentaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil auto1=new Automovil();
		auto1.setPlaca("CHA500");
		auto1.setValorPorDia(20.50);
		
		this.automovilService.agregar(auto1);
		
		
		
		Cliente clie1=new Cliente();
		clie1.setCedula("1817145863");
		clie1.setNombre("Jose Tuquerres");
		this.clienteService.agregar(clie1);
		
		Automovil autbusqueda=this.automovilService.buscar("TCX900");
		System.out.println(autbusqueda);
		
		Cliente clienBusqueda=this.clienteService.buscar("1727193847");
		System.out.println(clienBusqueda);
		
		Renta renta=new Renta();
		renta.setAutomovil(auto1);
		renta.setCliente(clie1);
		renta.setFecha(LocalDateTime.now());
		renta.setNumeroDias(10);
		this.iRentaService.agregar(renta, autbusqueda.getPlaca(), clienBusqueda.getCedula(), "2886618", 10);
		
		
	}

}
