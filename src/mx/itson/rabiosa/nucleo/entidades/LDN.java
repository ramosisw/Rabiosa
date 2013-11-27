package mx.itson.rabiosa.nucleo.entidades;
import javax.persistence.*;

@Entity
@Table (name="tbl_LDN")
@PrimaryKeyJoinColumn (name="idLlamada")
public class LDN extends Llamada{
	
	private String poblacion;

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
	
	

}
