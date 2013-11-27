package mx.itson.rabiosa.nucleo.persistencia;

import java.util.List;

import mx.itson.rabiosa.nucleo.entidades.EstadoCuenta;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EstadoCuentaPersistencia {

	@SuppressWarnings("unchecked")
	public List<EstadoCuenta> obtenerLista() {

		List<EstadoCuenta> ec = null;
		try {

			Session session = Conexion.conectar();
			Query q = session
					.createQuery("from EstadoCuenta");
			ec = q.list();
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return ec;
	}

	public void guardar(EstadoCuenta ec) {
		try {
			Session session = Conexion.conectar();
			session.save(ec);
			Transaction transaction = session.beginTransaction();
			transaction.commit();

		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
	}

}
