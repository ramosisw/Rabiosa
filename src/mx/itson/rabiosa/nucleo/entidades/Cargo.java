package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table (name="tbl_Cargo")
public class Cargo {

	private int id;
	private double iva;
	private double ieps;
	private double paquete;
	private double llamadasLocales;
	private double llamadasLDN;
	private double llamadasLDI;
	private double llamadasCelular;
	private double redondeoAnterior;
	private double redondeoFuturo;
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
	 * @return el valor de iva
	 */
	@Basic
	@Column (name = "iva")
	public double getIva() {
		return iva;
	}
	/**
	 * @param iva asigna el valor al atributo iva 
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}
	/**
	 * @return el valor de ieps
	 */
	@Basic
	@Column (name = "ieps")
	public double getIeps() {
		return ieps;
	}
	/**
	 * @param ieps asigna el valor al atributo ieps 
	 */
	public void setIeps(double ieps) {
		this.ieps = ieps;
	}
	/**
	 * @return el valor de paquete
	 */
	@Basic
	@Column (name="paquete")
	public double getPaquete() {
		return paquete;
	}
	/**
	 * @param paquete asigna el valor al atributo paquete 
	 */
	public void setPaquete(double paquete) {
		this.paquete = paquete;
	}
	/**
	 * @return el valor de llamadasLocales
	 */
	@Basic
	@Column (name = "llamadasLocales")
	public double getLlamadasLocales() {
		return llamadasLocales;
	}
	/**
	 * @param llamadasLocales asigna el valor al atributo llamadasLocales 
	 */
	public void setLlamadasLocales(double llamadasLocales) {
		this.llamadasLocales = llamadasLocales;
	}
	/**
	 * @return el valor de llamadasLDN
	 */
	@Basic
	@Column (name = "llamadasLDN")
	public double getLlamadasLDN() {
		return llamadasLDN;
	}
	/**
	 * @param llamadasLDN asigna el valor al atributo llamadasLDN 
	 */
	public void setLlamadasLDN(double llamadasLDN) {
		this.llamadasLDN = llamadasLDN;
	}
	/**
	 * @return el valor de llamadasLDI
	 */
	@Basic
	@Column (name = "llamadasLDI")
	public double getLlamadasLDI() {
		return llamadasLDI;
	}
	/**
	 * @param llamadasLDI asigna el valor al atributo llamadasLDI 
	 */
	public void setLlamadasLDI(double llamadasLDI) {
		this.llamadasLDI = llamadasLDI;
	}
	/**
	 * @return el valor de llamadasCelular
	 */
	@Basic
	@Column (name = "llamadasCelular")
	public double getLlamadasCelular() {
		return llamadasCelular;
	}
	/**
	 * @param llamadasCelular asigna el valor al atributo llamadasCelular 
	 */
	public void setLlamadasCelular(double llamadasCelular) {
		this.llamadasCelular = llamadasCelular;
	}
	/**
	 * @return el valor de redondeoAnterior
	 */
	@Basic
	@Column (name = "redondeoAnterior")
	public double getRedondeoAnterior() {
		return redondeoAnterior;
	}
	/**
	 * @param redondeoAnterior asigna el valor al atributo redondeoAnterior 
	 */
	public void setRedondeoAnterior(double redondeoAnterior) {
		this.redondeoAnterior = redondeoAnterior;
	}
	/**
	 * @return el valor de redondeoFuturo
	 */
	@Basic
	@Column (name = "redondeoFuturo")
	public double getRedondeoFuturo() {
		return redondeoFuturo;
	}
	/**
	 * @param redondeoFuturo asigna el valor al atributo redondeoFuturo 
	 */
	public void setRedondeoFuturo(double redondeoFuturo) {
		this.redondeoFuturo = redondeoFuturo;
	}
	
	
}
