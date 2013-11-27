package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.itson.rabiosa.nucleo.entidades.Empresa;
import mx.itson.rabiosa.nucleo.entidades.EstadoCuenta;
import mx.itson.rabiosa.nucleo.factories.EstadoCuentaFactory;
import mx.itson.rabiosa.nucleo.persistencia.EmpresaPersistencia;
import mx.itson.rabiosa.nucleo.persistencia.EstadoCuentaPersistencia;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class FormEstadoCuenta {

	public void generarReporte() {

		try {

			EstadoCuentaPersistencia ecp = new EstadoCuentaPersistencia();
			EstadoCuenta ec = null;

			EmpresaPersistencia emp = new EmpresaPersistencia();
			Empresa ep = emp.obtenerEmpresa();

			EstadoCuentaFactory ecf = new EstadoCuentaFactory();

			List<EstadoCuenta> estados = new ArrayList<EstadoCuenta>();

			String nombreReporte = "mx/itson/rabiosa/nucleo/presentacion/reportes/miRepo.jasper";
			InputStream inputStream = this.getClass().getClassLoader()
					.getResourceAsStream(nombreReporte);

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("pm_mio", "A la madre!!");

			estados.add(ec);
			ecf.setEstados(estados);

			JasperPrint jp = JasperFillManager.fillReport(inputStream, map,
					new JREmptyDataSource());
			JRViewer jrv = new JRViewer(jp);
			ReporteFrame rp = new ReporteFrame();
			rp.getContentPane().add(jrv);
			rp.setVisible(true);
		} catch (JRException ex) {

		}

	}
	public static void main(String args[]){
		new FormEstadoCuenta().generarReporte();
	}

}