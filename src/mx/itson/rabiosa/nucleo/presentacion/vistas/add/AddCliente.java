package mx.itson.rabiosa.nucleo.presentacion.vistas.add;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import mx.itson.rabiosa.nucleo.entidades.Cliente;
import mx.itson.rabiosa.nucleo.entidades.Colonia;
import mx.itson.rabiosa.nucleo.entidades.Direccion;
import mx.itson.rabiosa.nucleo.entidades.Estado;
import mx.itson.rabiosa.nucleo.entidades.Municipio;
import mx.itson.rabiosa.nucleo.entidades.Poblacion;
import mx.itson.rabiosa.nucleo.persistencia.ClientePersistencia;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCliente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField textTelefono;
	private JTextField textRFC;
	private JLabel label;
	private JLabel lblTelefono;
	private JTextField textLada;
	private JTextField textNombre;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblCalle;
	private JTextField textCalle;
	private JLabel lblNumero;
	private JTextField textNumero;
	private JComboBox<Colonia> comboBoxColonia;
	private JComboBox<Poblacion> comboBoxPoblacion;
	private JComboBox<Municipio> comboBoxMunicipio;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JLabel lblEstado;
	private JComboBox<Estado> comboBoxEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCliente frame = new AddCliente(null, true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void loadColonias() {
		ClientePersistencia cp = new ClientePersistencia();
		List<Estado> estados = cp.getEstados();
		List<Municipio> municipios = null;
		List<Poblacion> poblaciones = null;
		List<Colonia> colonias = null;
		DefaultComboBoxModel<Estado> cbx_estados = (DefaultComboBoxModel<Estado>) this.comboBoxEstado
				.getModel();
		DefaultComboBoxModel<Municipio> cbx_municipios = (DefaultComboBoxModel<Municipio>) this.comboBoxMunicipio
				.getModel();
		DefaultComboBoxModel<Poblacion> cbx_poblaciones = (DefaultComboBoxModel<Poblacion>) this.comboBoxPoblacion
				.getModel();
		DefaultComboBoxModel<Colonia> cbx_colonias = (DefaultComboBoxModel<Colonia>) this.comboBoxColonia
				.getModel();
		if (estados != null) {
			for (Estado estado : estados) {
				cbx_estados.addElement(estado);
			}
			municipios = cp.getMunicipios(estados.get(0).getId());
			for (Municipio municipio : municipios) {
				cbx_municipios.addElement(municipio);
			}
			poblaciones = cp.getPoblaciones(municipios.get(0).getId());
			for (Poblacion poblacion : poblaciones) {
				cbx_poblaciones.addElement(poblacion);
			}
			colonias = cp.getColonias(poblaciones.get(0).getId());
			for (Colonia colonia : colonias) {
				cbx_colonias.addElement(colonia);
			}
		}

	}

	/**
	 * Create the frame.
	 */
	public AddCliente(javax.swing.JFrame parent, boolean modal) {
		super(parent, modal);
		setTitle("Add Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Direcci\u00F3n",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 117, 414, 248);
		contentPane.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("21px"), ColumnSpec.decode("73px"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(43dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("75px"),
				FormFactory.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(55dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:max(19dlu;default):grow"), },
				new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.PREF_ROWSPEC, }));

		lblCalle = new JLabel("Calle:");
		lblCalle.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblCalle, "2, 2, fill, center");

		textCalle = new JTextField();
		panel.add(textCalle, "4, 2, 5, 1, fill, top");
		textCalle.setColumns(10);

		lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNumero, "2, 4, fill, center");

		textNumero = new JTextField();
		panel.add(textNumero, "4, 4, left, top");
		textNumero.setColumns(10);

		lblEstado = new JLabel("Estado:");
		panel.add(lblEstado, "2, 6, right, default");

		comboBoxEstado = new JComboBox<Estado>();
		comboBoxEstado.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				Estado estado = (Estado) comboBoxEstado.getSelectedItem();
				ClientePersistencia cp = new ClientePersistencia();
				DefaultComboBoxModel<Municipio> cbx_municipios = new DefaultComboBoxModel<Municipio>();
				if (estado != null) {
					List<Municipio> municipios = cp.getMunicipios(estado
							.getId());
					for (Municipio municipio : municipios) {
						cbx_municipios.addElement(municipio);
					}
				}
				comboBoxMunicipio.setModel(cbx_municipios);
				municipioChage();
				poblacionChange();
			}
		});
		panel.add(comboBoxEstado, "4, 6, 3, 1, fill, default");

		JLabel lblColonia = new JLabel("Colonia:");
		lblColonia.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblColonia, "2, 12, right, default");

		comboBoxColonia = new JComboBox<Colonia>();
		panel.add(comboBoxColonia, "4, 12, 3, 1, fill, default");

		JLabel lblPoblacin = new JLabel("Poblaci\u00F3n:");
		lblPoblacin.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblPoblacin, "2, 10, right, default");

		comboBoxPoblacion = new JComboBox<Poblacion>();
		comboBoxPoblacion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				poblacionChange();
			}
		});
		panel.add(comboBoxPoblacion, "4, 10, 3, 1, fill, center");

		JLabel lblMunicipio = new JLabel("Municipio:");
		panel.add(lblMunicipio, "2, 8, right, default");

		comboBoxMunicipio = new JComboBox<Municipio>();
		comboBoxMunicipio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("");
			}
		});
		comboBoxMunicipio.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				municipioChage();
				poblacionChange();
			}
		});
		panel.add(comboBoxMunicipio, "4, 8, 3, 1, fill, default");

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n Cliente",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(10, 11, 414, 95);
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("1px"), ColumnSpec.decode("63px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("110px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("56px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("97px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("max(19dlu;default)"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("max(0dlu;default)"), }, new RowSpec[] {
				RowSpec.decode("9px"), RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC, RowSpec.decode("20px"), }));

		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		panel_1.add(textTelefono, "8, 4, fill, top");

		textRFC = new JTextField();
		textRFC.setColumns(10);
		panel_1.add(textRFC, "8, 2, 3, 1, fill, top");

		label = new JLabel("RFC:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label, "6, 2, fill, center");

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblTelefono, "6, 4, fill, center");

		textLada = new JTextField();
		textLada.setColumns(10);
		panel_1.add(textLada, "4, 4, left, top");

		textNombre = new JTextField();
		textNombre.setColumns(10);
		panel_1.add(textNombre, "4, 2, 2, 1, fill, top");

		label_2 = new JLabel("Nombre:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_2, "2, 2, fill, center");

		label_3 = new JLabel("Lada:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_3, "2, 4, fill, center");

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cliente cliente = new Cliente();
					String nombre = textNombre.getText();
					String RFC = textRFC.getText();
					int telefono = Integer.parseInt(textTelefono.getText());
					String lada = textLada.getText();
					cliente.setLada(Integer.parseInt(lada));
					cliente.setNombre(nombre);
					cliente.setRfc(RFC);
					cliente.setTelefono(telefono);
					Direccion direccion = new Direccion();
					String calle = textCalle.getText();
					String numero = textNumero.getText();
					direccion.setCalle(calle);
					direccion.setNumero(numero);
					Colonia colonia = (Colonia) comboBoxColonia
							.getSelectedItem();
					Poblacion poblacion = (Poblacion) comboBoxPoblacion
							.getSelectedItem();
					Municipio municipio = (Municipio) comboBoxMunicipio
							.getSelectedItem();
					Estado estado = (Estado) comboBoxEstado.getSelectedItem();
					municipio.setEstado(estado);
					poblacion.setMunicipio(municipio);
					colonia.setPoblacion(poblacion);
					direccion.setColonia(colonia);
					cliente.setDireccion(direccion);
					ClientePersistencia cp = new ClientePersistencia();
					cp.guardar(cliente);
					dispose();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"Ocurrio algo con un numero, modificalo.", "Error",
							JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"Ocurrio algo Mal, verifica tus parametros.",
							"Error", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		btnGuardar.setBounds(121, 376, 89, 23);
		contentPane.add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(220, 376, 89, 23);
		contentPane.add(btnCancelar);
		loadColonias();
	}

	protected void municipioChage() {
		Municipio municipio = (Municipio) comboBoxMunicipio.getSelectedItem();
		ClientePersistencia cp = new ClientePersistencia();
		DefaultComboBoxModel<Poblacion> cbx_poblaciones = new DefaultComboBoxModel<Poblacion>();
		if (municipio != null) {
			List<Poblacion> poblaciones = cp.getPoblaciones(municipio.getId());
			for (Poblacion poblacion : poblaciones) {
				cbx_poblaciones.addElement(poblacion);
			}
		}

		comboBoxPoblacion.setModel(cbx_poblaciones);
	}

	protected void poblacionChange() {
		Poblacion poblacion = (Poblacion) comboBoxPoblacion.getSelectedItem();
		ClientePersistencia cp = new ClientePersistencia();
		DefaultComboBoxModel<Colonia> cbx_colonias = new DefaultComboBoxModel<Colonia>();
		if (poblacion != null) {
			List<Colonia> colonias = cp.getColonias(poblacion.getId());
			for (Colonia colonia : colonias) {
				cbx_colonias.addElement(colonia);
			}
		}
		comboBoxColonia.setModel(cbx_colonias);
	}

}
