package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import mx.itson.rabiosa.nucleo.entidades.Cliente;
import mx.itson.rabiosa.nucleo.persistencia.ClientePersistencia;
import mx.itson.rabiosa.nucleo.presentacion.vistas.add.AddCliente;
import mx.itson.rabiosa.nucleo.presentacion.vistas.modific.ModificCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class Clientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JList<Cliente> listClientes;
	private JButton btnSearch;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void loadClientes(){
		ClientePersistencia cp = new ClientePersistencia();
		DefaultListModel<Cliente>lst_cliente_model=new DefaultListModel<Cliente>();
		List<Cliente> clientes=cp.getClientes();
		for(Cliente cliente:clientes){
			lst_cliente_model.addElement(cliente);
		}
		this.listClientes.setModel(lst_cliente_model);
	}
	/**
	 * Create the frame.
	 */
	public Clientes() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 306, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(10, 23, 36, 14);
		contentPane.add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(56, 20, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		listClientes = new JList<Cliente>();
		listClientes.setBounds(20, 48, 155, 202);
		contentPane.add(listClientes);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				new AddCliente(null,true).show();
				loadClientes();
			}
		});
		btnAgregar.setBounds(185, 99, 89, 23);
		contentPane.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				int index=listClientes.getSelectedIndex();
				if(index==-1){
					return;
				}
				Cliente cliente=listClientes.getSelectedValue();
				new ModificCliente(null,true).setCliente(cliente).show();
				loadClientes();
				
			}
		});
		btnModificar.setBounds(185, 133, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index=listClientes.getSelectedIndex();
				if(index==-1)
					return;
				ClientePersistencia cp = new ClientePersistencia();
				cp.borrar(listClientes.getSelectedValue());
				loadClientes();
			}
		});
		btnEliminar.setBounds(185, 167, 89, 23);
		contentPane.add(btnEliminar);
		
		btnSearch = new JButton("Buscar");
		btnSearch.setBounds(175, 19, 89, 23);
		contentPane.add(btnSearch);
		loadClientes();
	}
}
