package mx.itson.rabiosa.nucleo.persistencia;

import java.util.List;

import mx.itson.rabiosa.nucleo.entidades.Paquete;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PaquetePersistencia {

	@SuppressWarnings("unchecked")
	public List<Paquete> obtenerLista() {

		List<Paquete> paquetes = null;
		try {
			Session session = Conexion.conectar();
			
			paquetes =(List<Paquete>) session.createQuery("from Paquete").list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}

		return paquetes;

	}

	public void guardar(Paquete paquete) {

		try {
			Session session = Conexion.conectar();
			session.save(paquete);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}

	}
	public void actualizar(Paquete paquete) {

		try {
			Session session = Conexion.conectar();
			session.update(paquete);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}

	}
	

	public void borrar(Paquete paquete) {
		try {
			Session session = Conexion.conectar();
			session.delete(paquete);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		
	}
}
