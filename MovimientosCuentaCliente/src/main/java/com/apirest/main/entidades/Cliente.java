package com.apirest.main.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "cliente_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clienteId;
	
	@Column(name = "cliente_contrasena")
	private String contrasena;
	
	@Column(name = "cliente_estado")
	private String estado;

	public Cliente(int clienteId, String contrasena, String estado) {
		this.clienteId = clienteId;
		this.contrasena = contrasena;
		this.estado = estado;
	}
	
	public Cliente() {}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}
