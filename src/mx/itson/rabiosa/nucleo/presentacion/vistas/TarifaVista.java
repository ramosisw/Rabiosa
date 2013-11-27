package mx.itson.rabiosa.nucleo.presentacion.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
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

import mx.itson.rabiosa.nucleo.entidades.Tarifa;
import mx.itson.rabiosa.nucleo.persistencia.TarifaPersistencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TarifaVista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textIVA;
	private JTextField textIEPS;
	private JTextField textLlamadaLocal;
	private JTextField textLlamadaLDN;
	private JTextField textLlamadaLDI;
	private Tarifa tarifa;
	private JTextField textLlamadaCelular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TarifaVista frame = new TarifaVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void loadTarifa() {
		TarifaPersistencia tp = new TarifaPersistencia();
		this.tarifa = tp.obtenertarifa();
		this.textIVA.setText(tarifa.getIva() + "");
		this.textIEPS.setText(tarifa.getIeps() + "");
		this.textLlamadaLocal.setText(tarifa.getLlamadaLocal() + "");
		this.textLlamadaLDN.setText(tarifa.getLlamadaLDN() + "");
		this.textLlamadaLDI.setText(tarifa.getLlamadaLDI() + "");
		this.textLlamadaCelular.setText(tarifa.getLlamadaCelular() + "");

	}

	/**
	 * Create the frame.
	 */
	public TarifaVista() {
		setTitle("Terifa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 164);
		contentPane.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblIva = new JLabel("IVA:");
		panel.add(lblIva, "2, 2, right, default");

		textIVA = new JTextField();
		panel.add(textIVA, "4, 2, left, default");
		textIVA.setColumns(10);

		JLabel lblIeps = new JLabel("IEPS:");
		panel.add(lblIeps, "2, 4, right, default");

		textIEPS = new JTextField();
		panel.add(textIEPS, "4, 4, left, default");
		textIEPS.setColumns(10);

		JLabel lblLlamadaLocal = new JLabel("Llamada Local:");
		panel.add(lblLlamadaLocal, "2, 6, right, default");

		textLlamadaLocal = new JTextField();
		panel.add(textLlamadaLocal, "4, 6, left, default");
		textLlamadaLocal.setColumns(10);

		JLabel lblLlamadaLdn = new JLabel("Llamada LDN:");
		panel.add(lblLlamadaLdn, "2, 8, right, default");

		textLlamadaLDN = new JTextField();
		panel.add(textLlamadaLDN, "4, 8, left, default");
		textLlamadaLDN.setColumns(10);

		JLabel lblLlamadaLdi = new JLabel("Llamada LDI:");
		panel.add(lblLlamadaLdi, "2, 10, right, default");

		textLlamadaLDI = new JTextField();
		panel.add(textLlamadaLDI, "4, 10, left, default");
		textLlamadaLDI.setColumns(10);

		JLabel lblLlamadaCelular = new JLabel("Llamada Celular:");
		panel.add(lblLlamadaCelular, "2, 12, right, default");

		textLlamadaCelular = new JTextField();
		panel.add(textLlamadaCelular, "4, 12, left, default");
		textLlamadaCelular.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double iva = Double.parseDouble(textIVA.getText());
					double ieps = Double.parseDouble(textIEPS.getText());
					double llamadaLocal = Double.parseDouble(textLlamadaLocal
							.getText());
					double llamadaLDN = Double.parseDouble(textLlamadaLDN
							.getText());
					double llamadaLDI = Double.parseDouble(textLlamadaLDI
							.getText());
					tarifa.setIva(iva);
					tarifa.setIeps(ieps);
					tarifa.setLlamadaLocal(llamadaLocal);
					tarifa.setLlamadaLDN(llamadaLDN);
					tarifa.setLlamadaLDI(llamadaLDI);
					TarifaPersistencia tp=new TarifaPersistencia();
					tp.actualizar(tarifa);
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
		btnGuardar.setBounds(104, 228, 89, 23);
		contentPane.add(btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(203, 228, 89, 23);
		contentPane.add(btnCancelar);
		loadTarifa();
	}

}
