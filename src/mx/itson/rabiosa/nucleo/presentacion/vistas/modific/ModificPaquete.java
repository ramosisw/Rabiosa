package mx.itson.rabiosa.nucleo.presentacion.vistas.modific;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JButton;

import mx.itson.rabiosa.nucleo.entidades.Paquete;
import mx.itson.rabiosa.nucleo.persistencia.PaquetePersistencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ModificPaquete extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textLlamadasLocales;
	private JTextField textMinutosLDN;
	private JTextField textMinutosLDI;
	private JTextField textVelocidad;
	private JTextField textPrecio;
	private JTextField textMinutosCelular;
	private JCheckBox checkBoxServiciosD;
	private JCheckBox checkBoxInfinitum;
	private Paquete paquete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificPaquete dialog = new ModificPaquete(null, true);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificPaquete(javax.swing.JFrame parent, boolean modal) {
		super(parent, modal);
		setTitle("Add Paquete");
		setBounds(100, 100, 382, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 347, 272);
		contentPanel.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblNombre = new JLabel("Nombre:");
		panel.add(lblNombre, "2, 2, right, default");

		textNombre = new JTextField();
		panel.add(textNombre, "4, 2, fill, default");
		textNombre.setColumns(10);

		JLabel lblServiciosDigitales = new JLabel("Servicios Digitales:");
		panel.add(lblServiciosDigitales, "2, 4");

		checkBoxServiciosD = new JCheckBox("");
		panel.add(checkBoxServiciosD, "4, 4, left, default");

		JLabel lblLlamadasLocales = new JLabel("Llamadas Locales:");
		panel.add(lblLlamadasLocales, "2, 6, right, default");

		textLlamadasLocales = new JTextField();
		panel.add(textLlamadasLocales, "4, 6, left, default");
		textLlamadasLocales.setColumns(10);

		JLabel lblMinutosLdn = new JLabel("Minutos LDN:");
		panel.add(lblMinutosLdn, "2, 8, right, default");

		textMinutosLDN = new JTextField();
		panel.add(textMinutosLDN, "4, 8, left, default");
		textMinutosLDN.setColumns(10);

		JLabel lblMinutosLdn_1 = new JLabel("Minutos LDI:");
		panel.add(lblMinutosLdn_1, "2, 10, right, default");

		textMinutosLDI = new JTextField();
		panel.add(textMinutosLDI, "4, 10, left, default");
		textMinutosLDI.setColumns(10);

		JLabel lblMinutosCelular = new JLabel("Minutos Celular:");
		panel.add(lblMinutosCelular, "2, 12, right, default");

		textMinutosCelular = new JTextField();
		panel.add(textMinutosCelular, "4, 12, left, default");
		textMinutosCelular.setColumns(10);

		JLabel lblInfinitum = new JLabel("Infinitum:");
		panel.add(lblInfinitum, "2, 14, right, default");

		checkBoxInfinitum = new JCheckBox("");
		checkBoxInfinitum.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textVelocidad.setEnabled(checkBoxInfinitum.isSelected());
			}
		});
		panel.add(checkBoxInfinitum, "4, 14, left, default");

		JLabel lblVelocidad = new JLabel("Velocidad:");
		panel.add(lblVelocidad, "2, 16, right, default");

		textVelocidad = new JTextField();
		textVelocidad.setEnabled(false);
		panel.add(textVelocidad, "4, 16, left, default");
		textVelocidad.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio:");
		panel.add(lblPrecio, "2, 18, right, default");

		textPrecio = new JTextField();
		panel.add(textPrecio, "4, 18, left, default");
		textPrecio.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paquete paquete_o = paquete;
				try {
					String nombre = textNombre.getText();
					double precio = Double.parseDouble(textPrecio.getText());
					int totalLlamadasLocales = Integer
							.parseInt(textLlamadasLocales.getText());
					int minutosLDN = Integer.parseInt(textMinutosLDN.getText());
					int minutosLDI = Integer.parseInt(textMinutosLDI.getText());
					int minutosCelular = Integer.parseInt(textMinutosCelular
							.getText());
					boolean infinitum = checkBoxInfinitum.isSelected();
					boolean serviciosDigitales = checkBoxServiciosD
							.isSelected();
					int mbInfinitum = 0;
					if (infinitum)
						mbInfinitum = Integer.parseInt(textVelocidad.getText());
					paquete_o.setNombre(nombre);
					paquete_o.setPrecio(precio);
					paquete_o.setTotalLlamadasLocales(totalLlamadasLocales);
					paquete_o.setMinutosLDN(minutosLDN);
					paquete_o.setMinutosLDI(minutosLDI);
					paquete_o.setMinutosCelular(minutosCelular);
					paquete_o.setInfinitum(infinitum);
					paquete_o.setServiciosDigitales(serviciosDigitales);
					paquete_o.setMbInfinitum(mbInfinitum);
					PaquetePersistencia pp = new PaquetePersistencia();
					pp.actualizar(paquete_o);
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
		btnGuardar.setBounds(92, 294, 89, 23);
		contentPanel.add(btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(191, 294, 89, 23);
		contentPanel.add(btnCancelar);
	}

	public Component setCliente(Paquete paquete) {
		this.paquete=paquete;
		this.textNombre.setText(paquete.getNombre());
		this.textPrecio.setText(paquete.getPrecio() + "");
		this.textLlamadasLocales
				.setText(paquete.getTotalLlamadasLocales() + "");
		this.textMinutosLDN.setText(paquete.getMinutosLDN() + "");
		this.textMinutosLDI.setText(paquete.getMinutosLDI() + "");
		this.textMinutosCelular.setText(paquete.getMinutosCelular() + "");
		this.checkBoxInfinitum.setSelected(paquete.isInfinitum());
		this.checkBoxServiciosD.setSelected(paquete.isServiciosDigitales());
		this.textVelocidad.setEnabled(paquete.isInfinitum());
		if (paquete.isInfinitum())
			this.textVelocidad.setText(paquete.getMbInfinitum() + "");
		else
			this.textVelocidad.setText("");

		return this;
	}
}
