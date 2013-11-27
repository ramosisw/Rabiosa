package mx.itson.rabiosa.nucleo.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Conexion {

	static public Session conectar(){
		Configuration configuration  = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
	    SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = factory.openSession(); 
	    return session;
	}
}
