package com.apirest.main.servicios;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.apirest.main.dtos.MovimientoDTO;
import com.apirest.main.entidades.Movimientos;
import com.apirest.main.repositorios.RepositorioMovimientos;

@Service
public class ServicioMovimientos implements ServicioObjetoMovimientos<MovimientoDTO> {
	
	private RepositorioMovimientos repositorioMovimientos;

	public ServicioMovimientos(RepositorioMovimientos repositorioMovimientos) {
		this.repositorioMovimientos = repositorioMovimientos;
	}

	@Override
	public MovimientoDTO consultar(int movimiento_Id) {
		Optional<Movimientos> cOptional = repositorioMovimientos.findById(movimiento_Id);
		MovimientoDTO aux = new MovimientoDTO();

		try {

			Movimientos movimientos = cOptional.get();
			aux.setMovimientoId(movimientos.getMovimientoId());
			aux.setFecha(movimientos.getFecha());
			aux.setTipoMovimiento(movimientos.getTipoMovimiento());
			aux.setSaldo(movimientos.getSaldo());
			aux.setValor(movimientos.getValor());

		} catch (Exception e) {

			System.out.println("No existe el id");
		}
		return aux;
	}

	@Override
	public MovimientoDTO guardar(MovimientoDTO t) {

		Movimientos movimientos = new Movimientos();
		
		movimientos.setMovimientoId(t.getMovimientoId());
		movimientos.setFecha(t.getFecha());
		movimientos.setTipoMovimiento(t.getTipoMovimiento());
		movimientos.setSaldo(t.getSaldo());
		movimientos.setValor(t.getValor());
		
		repositorioMovimientos.save(movimientos);
		t.setMovimientoId(movimientos.getMovimientoId());

		return t;
	}

	@Override
	public MovimientoDTO actualizar(MovimientoDTO t, int movimiento_Id) {
		Optional<Movimientos> aOptional = repositorioMovimientos.findById(movimiento_Id);
		Movimientos movimientos = new Movimientos();

		try {

			movimientos = aOptional.get();
			
			movimientos.setFecha(t.getFecha());
			movimientos.setTipoMovimiento(t.getTipoMovimiento());
			movimientos.setSaldo(t.getSaldo());
			movimientos.setValor(t.getValor());
						
			repositorioMovimientos.save(movimientos);
			t.setMovimientoId(movimientos.getMovimientoId());
			
		} catch (Exception e) {

			System.out.println("No existe");
		}
		
		return t;
	}

	@Override
	public boolean eliminar(int movimiento_Id) {
		try {
			
			repositorioMovimientos.deleteById(movimiento_Id);
			
		} catch (Exception e) {
			
			return false;
		}
		
		return true;
	}

}