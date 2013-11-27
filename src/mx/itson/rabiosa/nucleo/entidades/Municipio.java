package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;


@Entity 
@Table (name="tbl_Municipio")
public class Municipio {

	private int id;
	private String nombre;
	private Estado estado;
	
	
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
	/**
	 * @return el valor de estado
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idEstado")
	public Estado getEstado() {
		return estado;
	}
	/**
	 * @param estado asigna el valor al atributo estado 
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public String toString(){
		return this.nombre;
	}
}
