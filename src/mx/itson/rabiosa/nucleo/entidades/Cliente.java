package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;


@Entity
@Table (name="tbl_Cliente")
public class Cliente {

	private int id;
	private String nombre;
	private Direccion direccion;
	private String rfc;
	private int telefono;
	private int lada;
	
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
	 * @return el valor de direccion
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idDireccion")
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion asigna el valor al atributo direccion 
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el valor de rfc
	 */
	@Basic
	@Column (name="rfc")
	public String getRfc() {
		return rfc;
	}
	/**
	 * @param rfc asigna el valor al atributo rfc 
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	/**
	 * @return el valor de telefono
	 */
	@Basic
	@Column(name="telefono")
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono asigna el valor al atributo telefono 
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el valor de lada
	 */
	@Basic
	@Column (name="lada")
	public int getLada() {
		return lada;
	}
	/**
	 * @param lada asigna el valor al atributo lada 
	 */
	public void setLada(int lada) {
		this.lada = lada;
	}
	@Override
	public String toString(){
		return nombre;
	}
	
}
