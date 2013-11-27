package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.itson.rabiosa.nucleo.entidades.EstadoCuenta;
import mx.itson.rabiosa.nucleo.persistencia.EstadoCuentaPersistencia;
import mx.itson.rabiosa.nucleo.presentacion.vistas.add.AddEstadoCuenta;

public class EstadoCuentaVista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList<EstadoCuenta> listEstadosCuenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstadoCuentaVista frame = new EstadoCuentaVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected void loadEstadosCuenta(){
		EstadoCuentaPersistencia ecp=new EstadoCuentaPersistencia();
		List<EstadoCuenta> estadosCuenta=ecp.obtenerLista();
		DefaultListModel<EstadoCuenta> lst_estados=new DefaultListModel<EstadoCuenta>();
		for(EstadoCuenta estadoCuenta:estadosCuenta){
			lst_estados.addElement(estadoCuenta);
		}
		listEstadosCuenta.setModel(lst_estados);
		
	}
	/**
	 * Create the frame.
	 */
	public EstadoCuentaVista() {
		setTitle("Estado Cuenta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listEstadosCuenta = new JList<EstadoCuenta>();
		listEstadosCuenta.setBounds(10, 11, 164, 240);
		contentPane.add(listEstadosCuenta);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new AddEstadoCuenta(null,true).show();
			}
		});
		btnAgregar.setBounds(184, 61, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(184, 95, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(184, 129, 89, 23);
		contentPane.add(btnEliminar);
		loadEstadosCuenta();
	}
}
