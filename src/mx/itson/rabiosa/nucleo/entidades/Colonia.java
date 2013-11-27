package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tbl_Colonia")
public class Colonia {

	private int id;
	private String nombre;
	private Poblacion poblacion;
	private int codigoPostal;

	/**
	 * @return el valor de id
	 */
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            asigna el valor al atributo id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el valor de nombre
	 */
	@Basic
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            asigna el valor al atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el valor de poblacion
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idPoblacion")
	public Poblacion getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion
	 *            asigna el valor al atributo poblacion
	 */
	public void setPoblacion(Poblacion poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return el valor de codigoPostal
	 */
	@Basic
	@Column(name = "codigoPostal")
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal
	 *            asigna el valor al atributo codigoPostal
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	@Override
	public String toString(){
		return this.nombre;
	}

}
