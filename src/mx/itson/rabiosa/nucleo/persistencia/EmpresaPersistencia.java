package mx.itson.rabiosa.nucleo.persistencia;

import mx.itson.rabiosa.nucleo.entidades.Empresa;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpresaPersistencia {
	
	public Empresa obtenerEmpresa(){
		Empresa empresa=null;
		try {
			Session session = Conexion.conectar();
			empresa = (Empresa)session.get(Empresa.class.getName(), 1);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		return empresa;
	}
	public void actualizar(Empresa empresa_o) {
		try {
			Session session = Conexion.conectar();
			session.update(empresa_o);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
		} catch (HibernateException ex) {
			System.out
					.println("Ocurrio un error durante la transacci—n: " + ex);
		}
		
	}
}
