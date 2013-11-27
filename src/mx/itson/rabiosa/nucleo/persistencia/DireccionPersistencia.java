package mx.itson.rabiosa.nucleo.persistencia;

import mx.itson.rabiosa.nucleo.entidades.Direccion;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DireccionPersistencia {

	public void guardar (Direccion direccion){
		
        try { 
	        Session session = Conexion.conectar();        
	        //S�lo con guardar el contacto se guarda todo, porque as� est� definido en nuestro dise�o.
	        //Estamos aplicando el POO en el acceso a datos
			session.save(direccion);
			Transaction transaction = session.beginTransaction();
		    transaction.commit(); 
		 } catch (HibernateException ex)  {
	         System.out.println("Ocurri� un error durante la transacci�n: " + ex);
		 }
		}
}
