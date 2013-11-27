package mx.itson.rabiosa.nucleo.factories;

import java.util.ArrayList;
import java.util.List;

import mx.itson.rabiosa.nucleo.entidades.EstadoCuenta;

public class EstadoCuentaFactory {
	List<EstadoCuenta> estados =new ArrayList<EstadoCuenta>();

	public List<EstadoCuenta> getEstados() {
		return estados;
	}

	public void setEstados(List<EstadoCuenta> estados) {
		this.estados = estados;
	}
	
}
