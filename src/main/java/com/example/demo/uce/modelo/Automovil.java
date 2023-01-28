package com.example.demo.uce.modelo;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil {
	
	@Id
	@Column(name="auto_id")
	private String placa;
	
	@Column(name="auto_valor_Por_Dia")
	private Double valorPorDia;
	
	@OneToMany(mappedBy = "automovil", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Renta> renta;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(Double valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valorPorDia=" + valorPorDia + "]";
	}
	
	


}
