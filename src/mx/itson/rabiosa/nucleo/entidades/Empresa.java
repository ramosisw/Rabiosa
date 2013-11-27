package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table(name="tbl_Empresa")
public class Empresa {

	private int id;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String codigoPostal;
	private String rfc;
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
	 * @return el valor de direccion
	 */
	@Basic
	@Column(name="direccion")
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion asigna el valor al atributo direccion 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el valor de ciudad
	 */
	@Basic
	@Column (name="ciudad")
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad asigna el valor al atributo ciudad 
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return el valor de codigoPostal
	 */
	@Basic
	@Column(name="codigoPostal")
	public String getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal asigna el valor al atributo codigoPostal 
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return el valor de rfc
	 */
	@Basic
	@Column(name="rfc")
	public String getRfc() {
		return rfc;
	}
	/**
	 * @param rfc asigna el valor al atributo rfc 
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
}
