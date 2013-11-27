package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;


@Entity
@Table(name="tbl_Celular")
@PrimaryKeyJoinColumn (name="idLlamada")
public class Celular extends Llamada{
	
	@Basic
	@Column(name="poblacion")
	private String poblacion;

	/**
	 * @return el valor de poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion asigna el valor al atributo poblacion 
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

}
