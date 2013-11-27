package mx.itson.rabiosa.nucleo.persistencia;

import mx.itson.rabiosa.nucleo.entidades.Tarifa;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TarifaPersistencia {
	public Tarifa obtenertarifa(){
		Tarifa tarifa=null;
		try {
			Session session = Conexion.conectar();
			tarifa = (Tarifa)session.get(Tarifa.class.getName(), 1);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return tarifa;
	}
	public void actualizar(Tarifa tarifa_o) {
		try {
			Session session = Conexion.conectar();
			session.update(tarifa_o);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		
	}
}
