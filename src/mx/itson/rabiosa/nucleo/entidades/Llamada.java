package mx.itson.rabiosa.nucleo.entidades;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="tbl_Llamada")
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Llamada {

	private int id;
	private Date fecha;
	private int lada;
	private int telefono;
	private int minutos;
	private double importe;
	
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
	 * @return el valor de fecha
	 */
	@Basic
	@Column(name="fecha")
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha asigna el valor al atributo fecha 
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return el valor de lada
	 */
	@Basic
	@Column(name="lada")
	public int getLada() {
		return lada;
	}
	/**
	 * @param lada asigna el valor al atributo lada 
	 */
	public void setLada(int lada) {
		this.lada = lada;
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
	 * @return el valor de minutos
	 */
	@Basic
	@Column (name="minutos")
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos asigna el valor al atributo minutos 
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return el valor de importe
	 */
	@Basic
	@Column(name="importe")
	public double getImporte() {
		return importe;
	}
	/**
	 * @param importe asigna el valor al atributo importe 
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
