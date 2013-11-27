package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table(name="tbl_LDI")
@PrimaryKeyJoinColumn (name="idLlamada")
public class LDI extends Llamada{

	private String poblacion;
	private String pais;
	/**
	 * @return el valor de poblacion
	 */
	@Basic
	@Column(name="poblacion")
	public String getPoblacion() {
		return poblacion;
	}
	/**
	 * @param poblacion asigna el valor al atributo poblacion 
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	/**
	 * @return el valor de pais
	 */
	@Basic
	@Column (name="pais")
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais asigna el valor al atributo pais 
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
