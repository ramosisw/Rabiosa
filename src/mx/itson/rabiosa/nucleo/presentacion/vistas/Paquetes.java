package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import mx.itson.rabiosa.nucleo.entidades.Paquete;
import mx.itson.rabiosa.nucleo.persistencia.PaquetePersistencia;
import mx.itson.rabiosa.nucleo.presentacion.vistas.add.AddPaquete;
import mx.itson.rabiosa.nucleo.presentacion.vistas.modific.ModificPaquete;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paquetes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton buttonAgregar;
	private JButton buttonModificar;
	private JButton buttonEliminar;
	private JList<Paquete> listPaquetes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paquetes frame = new Paquetes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void loadPaquetes() {
		PaquetePersistencia pp = new PaquetePersistencia();
		List<Paquete> paquetes = pp.obtenerLista();
		DefaultListModel<Paquete> lst_paquete = new DefaultListModel<Paquete>();
		for (Paquete paquete : paquetes) {
			lst_paquete.addElement(paquete);
		}
		this.listPaquetes.setModel(lst_paquete);
	}

	/**
	 * Create the frame.
	 */
	public Paquetes() {
		setTitle("Paquetes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 307, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(10, 11, 46, 14);
		contentPane.add(lblBuscar);

		textField = new JTextField();
		textField.setBounds(66, 8, 184, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		listPaquetes = new JList<Paquete>();
		listPaquetes.setBounds(20, 36, 146, 215);
		contentPane.add(listPaquetes);

		buttonAgregar = new JButton("Agregar");
		buttonAgregar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new AddPaquete(null, true).show();
				loadPaquetes();
			}
		});
		buttonAgregar.setBounds(176, 93, 89, 23);
		contentPane.add(buttonAgregar);

		buttonModificar = new JButton("Modificar");
		buttonModificar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				int index = listPaquetes.getSelectedIndex();
				if (index == -1) {
					return;
				}
				Paquete paquete = listPaquetes.getSelectedValue();
				new ModificPaquete(null, true).setCliente(paquete).show();
				loadPaquetes();

			}
		});
		buttonModificar.setBounds(176, 127, 89, 23);
		contentPane.add(buttonModificar);

		buttonEliminar = new JButton("Eliminar");
		buttonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index=listPaquetes.getSelectedIndex();
				if(index==-1)
					return;
				PaquetePersistencia pp = new PaquetePersistencia();
				pp.borrar(listPaquetes.getSelectedValue());
				loadPaquetes();
			}
		});
		buttonEliminar.setBounds(176, 161, 89, 23);
		contentPane.add(buttonEliminar);
		loadPaquetes();
	}
}
