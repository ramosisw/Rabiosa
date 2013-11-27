package mx.itson.rabiosa.nucleo.entidades;

import javax.persistence.*;

@Entity
@Table (name="tbl_Paquete")
public class Paquete {

	private int id;
	private String nombre;
	private double precio;
	private int totalLlamadasLocales;
	private int minutosLDN;
	private int minutosLDI;
	private int minutosCelular;
	private boolean infinitum;
	private boolean serviciosDigitales;
	private int mbInfinitum;
	
	
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
	 * @return el valor de precio
	 */
	@Basic
	@Column (name="precio")
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio asigna el valor al atributo precio 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return el valor de totalLlamadasLocales
	 */
	@Basic
	@Column (name="totalLlamadasLocales")
	public int getTotalLlamadasLocales() {
		return totalLlamadasLocales;
	}
	/**
	 * @param totalLlamadasLocales asigna el valor al atributo totalLlamadasLocales 
	 */
	public void setTotalLlamadasLocales(int totalLlamadasLocales) {
		this.totalLlamadasLocales = totalLlamadasLocales;
	}
	/**
	 * @return el valor de minutosLDN
	 */
	@Basic
	@Column (name="minutosLDN")
	public int getMinutosLDN() {
		return minutosLDN;
	}
	/**
	 * @param minutosLDN asigna el valor al atributo minutosLDN 
	 */
	public void setMinutosLDN(int minutosLDN) {
		this.minutosLDN = minutosLDN;
	}
	/**
	 * @return el valor de minutosLDI
	 */
	@Basic
	@Column (name="minutosLDI")
	public int getMinutosLDI() {
		return minutosLDI;
	}
	/**
	 * @param minutosLDI asigna el valor al atributo minutosLDI 
	 */
	public void setMinutosLDI(int minutosLDI) {
		this.minutosLDI = minutosLDI;
	}
	/**
	 * @return el valor de minutosCelular
	 */
	@Basic
	@Column(name="minutosCelular")
	public int getMinutosCelular() {
		return minutosCelular;
	}
	/**
	 * @param minutosCelular asigna el valor al atributo minutosCelular 
	 */
	public void setMinutosCelular(int minutosCelular) {
		this.minutosCelular = minutosCelular;
	}
	/**
	 * @return el valor de infinitum
	 */
	@Basic
	@Column(name="infinitum")
	public boolean isInfinitum() {
		return infinitum;
	}
	/**
	 * @param infinitum asigna el valor al atributo infinitum 
	 */
	public void setInfinitum(boolean infinitum) {
		this.infinitum = infinitum;
	}
	/**
	 * @return el valor de serviciosDigitales
	 */
	@Basic
	@Column(name="serviciosDigitales")
	public boolean isServiciosDigitales() {
		return serviciosDigitales;
	}
	/**
	 * @param serviciosDigitales asigna el valor al atributo serviciosDigitales 
	 */
	public void setServiciosDigitales(boolean serviciosDigitales) {
		this.serviciosDigitales = serviciosDigitales;
	}
	/**
	 * @return el valor de mbInfinitum
	 */
	@Basic
	@Column(name="mbInfinitum")
	public int getMbInfinitum() {
		return mbInfinitum;
	}
	/**
	 * @param mbInfinitum asigna el valor al atributo mbInfinitum 
	 */
	public void setMbInfinitum(int mbInfinitum) {
		this.mbInfinitum = mbInfinitum;
	}
	@Override
	public String toString(){
		return this.nombre;
	}
	
}
