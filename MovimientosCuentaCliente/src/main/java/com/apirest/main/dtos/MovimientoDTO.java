package com.apirest.main.dtos;

public class MovimientoDTO {

	private int movimientoId;
	private String fecha;
	private String tipoMovimiento;
	private float valor;
	private float saldo;
	
	public MovimientoDTO(int movimientoId, String fecha, String tipoMovimiento, float valor, float saldo) {
		super();
		this.movimientoId = movimientoId;
		this.fecha = fecha;
		this.tipoMovimiento = tipoMovimiento;
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public MovimientoDTO() {}

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
