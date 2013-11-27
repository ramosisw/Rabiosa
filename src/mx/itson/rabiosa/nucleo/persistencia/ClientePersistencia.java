package mx.itson.rabiosa.nucleo.persistencia;

import java.util.List;

import mx.itson.rabiosa.nucleo.entidades.Cliente;
import mx.itson.rabiosa.nucleo.entidades.Colonia;
import mx.itson.rabiosa.nucleo.entidades.Estado;
import mx.itson.rabiosa.nucleo.entidades.Municipio;
import mx.itson.rabiosa.nucleo.entidades.Poblacion;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientePersistencia {

	public void guardar(Cliente cliente) {
		try {
			Session session = Conexion.conectar();
			session.save(cliente);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Colonia> getColonias(int id){
		List<Colonia> colonias=null;
		try {
			Session session = Conexion.conectar();
			colonias = session.createQuery("FROM Colonia c WHERE c.poblacion.id="+id).list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return colonias;
	}
	@SuppressWarnings("unchecked")
	public List<Municipio> getMunicipios(int id){
		List<Municipio> municipios=null;
		try {
			Session session = Conexion.conectar();
			municipios = session.createQuery("FROM Municipio m WHERE m.estado.id="+id).list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return municipios;
	}
	@SuppressWarnings("unchecked")
	public List<Poblacion> getPoblaciones(int id){
		List<Poblacion> poblacion=null;
		try {
			Session session = Conexion.conectar();
			poblacion = session.createQuery("FROM Poblacion p WHERE p.municipio.id="+id).list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return poblacion;
	}
	@SuppressWarnings("unchecked")
	public List<Estado> getEstados(){
		List<Estado> estados=null;
		try {
			Session session = Conexion.conectar();
			estados = session.createQuery("FROM Estado").list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return estados;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		List<Cliente> clientes=null;
		try {
			Session session = Conexion.conectar();
			clientes = session.createQuery("FROM Cliente").list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return clientes;
	}

	public void actualizar(Cliente cliente) {
		try {
			Session session = Conexion.conectar();
			// Sólo con guardar el contacto se guarda todo, porque así está
			// definido en nuestro diseño.
			// Estamos aplicando el POO en el acceso a datos
			session.update(cliente);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
	}

	public void borrar(Cliente cliente) {
		try {
			Session session = Conexion.conectar();
			session.delete(cliente);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
	}
	
	
	
}
