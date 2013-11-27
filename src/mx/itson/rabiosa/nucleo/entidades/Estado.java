package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table (name="tbl_Estado")
public class Estado {

	private int id;
	private String nombre;
	
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
	@Column (name="nombre")
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre asigna el valor al atributo nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString(){
		return this.nombre;
	}
	
}
