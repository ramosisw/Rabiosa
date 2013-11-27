package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table (name="tbl_Tarifa")
public class Tarifa {

	private int id;
	private double iva;
	private double ieps;
	private double llamadaLocal;
	private double llamadaLDN;
	private double llamadaLDI;
	private double llamadaCelular;
	
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
	@Column(name="iva")
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
	@Column(name="ieps")
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
	 * @return el valor de llamadaLocal
	 */
	@Basic
	@Column(name="llamadaLocal")
	public double getLlamadaLocal() {
		return llamadaLocal;
	}
	/**
	 * @param llamadaLocal asigna el valor al atributo llamadaLocal 
	 */
	public void setLlamadaLocal(double llamadaLocal) {
		this.llamadaLocal = llamadaLocal;
	}
	/**
	 * @return el valor de llamadaLDN
	 */
	@Basic
	@Column(name="llamadaLDN")
	public double getLlamadaLDN() {
		return llamadaLDN;
	}
	/**
	 * @param llamadaLDN asigna el valor al atributo llamadaLDN 
	 */
	public void setLlamadaLDN(double llamadaLDN) {
		this.llamadaLDN = llamadaLDN;
	}
	/**
	 * @return el valor de llamadaLDI
	 */
	@Basic
	@Column(name="llamdaLDI")
	public double getLlamadaLDI() {
		return llamadaLDI;
	}
	/**
	 * @param llamadaLDI asigna el valor al atributo llamadaLDI 
	 */
	public void setLlamadaLDI(double llamadaLDI) {
		this.llamadaLDI = llamadaLDI;
	}
	/**
	 * @return el valor de llamadaCelular
	 */
	@Basic
	@Column(name="llamadaCelular")
	public double getLlamadaCelular() {
		return llamadaCelular;
	}
	/**
	 * @param llamadaCelular asigna el valor al atributo llamadaCelular 
	 */
	public void setLlamadaCelular(double llamadaCelular) {
		this.llamadaCelular = llamadaCelular;
	}
	
	
}
