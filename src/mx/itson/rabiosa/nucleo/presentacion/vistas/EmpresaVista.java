package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JTextField;
import javax.swing.JButton;

import mx.itson.rabiosa.nucleo.entidades.Empresa;
import mx.itson.rabiosa.nucleo.persistencia.EmpresaPersistencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpresaVista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textCiudad;
	private JTextField textCodigoPostal;
	private JTextField textRFC;
	protected Empresa empresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpresaVista frame = new EmpresaVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected void loadEmpresa(){
		EmpresaPersistencia ep=new EmpresaPersistencia();
		empresa=ep.obtenerEmpresa();
		this.textCiudad.setText(empresa.getCiudad());
		this.textNombre.setText(empresa.getNombre());
		this.textDireccion.setText(empresa.getDireccion());
		this.textCodigoPostal.setText(empresa.getCodigoPostal());
		this.textRFC.setText(empresa.getRfc());
	}
	/**
	 * Create the frame.
	 */
	public EmpresaVista() {
		setTitle("Empresa");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 148);
		getContentPane().add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(53dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(19dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:max(60dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNombre = new JLabel("Nombre:");
		panel.add(lblNombre, "2, 2, right, default");
		
		textNombre = new JTextField();
		panel.add(textNombre, "4, 2, 3, 1, fill, default");
		textNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		panel.add(lblDireccion, "2, 4, right, default");
		
		textDireccion = new JTextField();
		panel.add(textDireccion, "4, 4, 5, 1, fill, default");
		textDireccion.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		panel.add(lblCiudad, "2, 6, right, default");
		
		textCiudad = new JTextField();
		panel.add(textCiudad, "4, 6, fill, default");
		textCiudad.setColumns(10);
		
		JLabel lblCp = new JLabel("C.P:");
		panel.add(lblCp, "2, 8, right, default");
		
		textCodigoPostal = new JTextField();
		panel.add(textCodigoPostal, "4, 8, fill, default");
		textCodigoPostal.setColumns(10);
		
		JLabel lblRfc = new JLabel("RFC:");
		panel.add(lblRfc, "2, 10, right, default");
		
		textRFC = new JTextField();
		panel.add(textRFC, "4, 10, fill, default");
		textRFC.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa empresa_o=empresa;
				String nombre=textNombre.getText();
				String direccion=textDireccion.getText();
				String ciudad=textCiudad.getText();
				String codigoPostal=textCodigoPostal.getText();
				String rfc=textRFC.getText();
				empresa.setNombre(nombre);
				empresa.setDireccion(direccion);
				empresa.setCiudad(ciudad);
				empresa.setCodigoPostal(codigoPostal);
				empresa.setRfc(rfc);
				EmpresaPersistencia ep=new EmpresaPersistencia();
				ep.actualizar(empresa_o);
				dispose();
			}
		});
		btnGuardar.setBounds(73, 211, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(172, 211, 89, 23);
		getContentPane().add(btnCancelar);
		loadEmpresa();
	}

}
