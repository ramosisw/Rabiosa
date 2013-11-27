package mx.itson.rabiosa.nucleo.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import mx.itson.rabiosa.nucleo.enumeradores.Estatus;
import mx.itson.rabiosa.nucleo.enumeradores.Mes;

@Entity
@Table(name="tbl_EstadoCuenta")
public class EstadoCuenta {

	private int id;
	private String folio;
	private String numFacatura;
	private Cliente cliente;
	private Date vencimiento;
	private Mes mes;
	private int anio;
	private Cargo cargo;
	private double total;
	private double pago;
	private Estatus estatus;
	private Paquete paquete;
	private List<Local> llamadasLocales;
	private List<Celular> llamadasCelular;
	private List<LDN> llamadasLDN;
	private List<LDI> llamadasLDI;
	
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
	 * @return el valor de folio
	 */
	@Basic
	@Column (name="folio")
	public String getFolio() {
		return folio;
	}
	/**
	 * @param folio asigna el valor al atributo folio 
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}
	/**
	 * @return el valor de numFacatura
	 */
	@Basic
	@Column(name="numeroFactura")
	public String getNumFacatura() {
		return numFacatura;
	}
	/**
	 * @param numFacatura asigna el valor al atributo numFacatura 
	 */
	public void setNumFacatura(String numFacatura) {
		this.numFacatura = numFacatura;
	}
	/**
	 * @return el valor de cliente
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idCliente")
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente asigna el valor al atributo cliente 
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return el valor de vencimiento
	 */
	@Basic
	@Column(name="vencimiento")
	public Date getVencimiento() {
		return vencimiento;
	}
	/**
	 * @param vencimiento asigna el valor al atributo vencimiento 
	 */
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	/**
	 * @return el valor de mes
	 */
	@Column (name="mes")
	@Enumerated(EnumType.ORDINAL)
	public Mes getMes() {
		return mes;
	}
	/**
	 * @param mes asigna el valor al atributo mes 
	 */
	public void setMes(Mes mes) {
		this.mes = mes;
	}
	/**
	 * @return el valor de anio
	 */
	@Basic
	@Column (name="anio")
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio asigna el valor al atributo anio 
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return el valor de cargo
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idCargo")
	public Cargo getCargo() {
		return cargo;
	}
	/**
	 * @param cargo asigna el valor al atributo cargo 
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	/**
	 * @return el valor de total
	 */
	@Basic
	@Column (name="total")
	public double getTotal() {
		return total;
	}
	/**
	 * @param total asigna el valor al atributo total 
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * @return el valor de pago
	 */
	@Basic
	@Column (name="pago")
	public double getPago() {
		return pago;
	}
	/**
	 * @param pago asigna el valor al atributo pago 
	 */
	public void setPago(double pago) {
		this.pago = pago;
	}
	/**
	 * @return el valor de estatus
	 */
	@Column (name="estatus")
	@Enumerated(EnumType.ORDINAL)
	public Estatus getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus asigna el valor al atributo estatus 
	 */
	public void setEstatus(Estatus estatus) {
		this.estatus = estatus;
	}
	/**
	 * @return el valor de paquete
	 */
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="idPaquete")
	public Paquete getPaquete() {
		return paquete;
	}
	/**
	 * @param paquete asigna el valor al atributo paquete 
	 */
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	/**
	 * @return el valor de llamadasLocales
	 */
	@OneToMany(orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "idEstadoCuenta")
	public List<Local> getLlamadasLocales() {
		return llamadasLocales;
	}
	/**
	 * @param llamadasLocales asigna el valor al atributo llamadasLocales 
	 */
	public void setLlamadasLocales(List<Local> llamadasLocales) {
		this.llamadasLocales = llamadasLocales;
	}
	/**
	 * @return el valor de llamadasCelular
	 */
	@OneToMany(orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "idEstadoCuenta")
	public List<Celular> getLlamadasCelular() {
		return llamadasCelular;
	}
	/**
	 * @param llamadasCelular asigna el valor al atributo llamadasCelular 
	 */
	public void setLlamadasCelular(List<Celular> llamadasCelular) {
		this.llamadasCelular = llamadasCelular;
	}
	/**
	 * @return el valor de llamadasLDN
	 */
	@OneToMany(orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "idEstadoCuenta")
	public List<LDN> getLlamadasLDN() {
		return llamadasLDN;
	}
	/**
	 * @param llamadasLDN asigna el valor al atributo llamadasLDN 
	 */
	public void setLlamadasLDN(List<LDN> llamadasLDN) {
		this.llamadasLDN = llamadasLDN;
	}
	/**
	 * @return el valor de llamadasLDI
	 */
	@OneToMany(orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "idEstadoCuenta")
	public List<LDI> getLlamadasLDI() {
		return llamadasLDI;
	}
	/**
	 * @param llamadasLDI asigna el valor al atributo llamadasLDI 
	 */
	public void setLlamadasLDI(List<LDI> llamadasLDI) {
		this.llamadasLDI = llamadasLDI;
	}
	
	@Override
	public String toString(){
		return this.folio+" , "+this.cliente.getNombre();
	}
	
}
