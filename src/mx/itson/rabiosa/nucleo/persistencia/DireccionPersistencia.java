package mx.itson.rabiosa.nucleo.persistencia;

import mx.itson.rabiosa.nucleo.entidades.Direccion;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DireccionPersistencia {

	public void guardar (Direccion direccion){
		
        try { 
	        Session session = Conexion.conectar();        
	        //Sólo con guardar el contacto se guarda todo, porque así está definido en nuestro diseño.
	        //Estamos aplicando el POO en el acceso a datos
			session.save(direccion);
			Transaction transaction = session.beginTransaction();
		    transaction.commit(); 
		 } catch (HibernateException ex)  {
	         System.out.println("Ocurrió un error durante la transacción: " + ex);
		 }
		}
}
