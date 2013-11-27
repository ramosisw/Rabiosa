package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administrador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Administrador() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new Clientes().show();
			}
		});
		btnClientes.setBounds(10, 11, 111, 23);
		contentPane.add(btnClientes);
		
		JButton btnPaquetes = new JButton("Paquetes");
		btnPaquetes.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new Paquetes().show();
			}
		});
		btnPaquetes.setBounds(10, 42, 111, 23);
		contentPane.add(btnPaquetes);
		
		JButton btnEmpresa = new JButton("Empresa");
		btnEmpresa.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new EmpresaVista().show();
			}
		});
		btnEmpresa.setBounds(10, 76, 111, 23);
		contentPane.add(btnEmpresa);
		
		JButton btnTarifa = new JButton("Tarifa");
		btnTarifa.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new TarifaVista().show();
			}
		});
		btnTarifa.setBounds(10, 110, 111, 23);
		contentPane.add(btnTarifa);
		
		JButton btnEstadoCuenta = new JButton("Estado Cuenta");
		btnEstadoCuenta.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				new EstadoCuentaVista().show();
			}
		});
		btnEstadoCuenta.setBounds(10, 144, 111, 23);
		contentPane.add(btnEstadoCuenta);
	}
}
