package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;


@Entity
@Table(name="tbl_Poblacion")
public class Poblacion {

	private int id;
	private String nombre;
	private Municipio municipio;
	
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
	 * @return el valor de nombre
	 */
	@Basic
	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre asigna el valor al atributo nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el valor de municipio
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idMunicipio")
	public Municipio getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio asigna el valor al atributo municipio 
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	@Override
	public String toString(){
		return this.nombre;
	}
	
}
