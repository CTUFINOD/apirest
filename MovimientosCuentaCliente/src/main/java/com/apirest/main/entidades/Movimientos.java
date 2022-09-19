package com.apirest.main.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimientos")
public class Movimientos {

	@Id
	@Column(name = "movimientos_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movimientoId;
	
	@Column(name = "movimientos_fecha")
	private String fecha;
	
	@Column(name = "movimientos_tipoMovimiento")
	private String tipoMovimiento;
	
	@Column(name = "movimientos_valor")
	private float valor;
	
	@Column(name = "movimientos_saldo")
	private float saldo;

	public Movimientos(int movimientoId, String fecha, String tipoMovimiento, float valor, float saldo) {
		this.movimientoId = movimientoId;
		this.fecha = fecha;
		this.tipoMovimiento = tipoMovimiento;
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public Movimientos() {}

	public int getMovimientoId() {
		return movimientoId;
	}

	public void setMovimientoId(int movimientoId) {
		this.movimientoId = movimientoId;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}	
	
}
