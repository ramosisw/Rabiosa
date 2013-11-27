package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;


@Entity
@Table (name="tbl_Direccion")
public class Direccion {

	private int id;
	private String calle;
	private String numero;
	private Colonia colonia;
	/**
	 * @return el valor de id
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * @param id asigna el valor al atributo id 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return el valor de calle
	 */
	@Basic
	@Column (name="calle")
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle asigna el valor al atributo calle 
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return el valor de numero
	 */
	@Basic
	@Column (name="numero")
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero asigna el valor al atributo numero 
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return el valor de colonia
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idColonia")
	public Colonia getColonia() {
		return colonia;
	}
	/**
	 * @param colonia asigna el valor al atributo colonia 
	 */
	public void setColonia(Colonia colonia) {
		this.colonia = colonia;
	}
	
}
