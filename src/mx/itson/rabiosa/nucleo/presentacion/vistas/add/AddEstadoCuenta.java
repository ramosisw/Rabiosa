package mx.itson.rabiosa.nucleo.presentacion.vistas.add;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class AddEstadoCuenta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddEstadoCuenta dialog = new AddEstadoCuenta(null,true);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddEstadoCuenta(javax.swing.JFrame parent, boolean modal) {
		super(parent, modal);
		setBounds(100, 100, 450, 388);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 290);
		contentPanel.add(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(100dlu;default)"),
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblFolio = new JLabel("Folio:");
		panel.add(lblFolio, "2, 2, right, default");
		
		JLabel label = new JLabel("000");
		panel.add(label, "4, 2");
		
		JLabel lblfactura = new JLabel("#Factura:");
		panel.add(lblfactura, "2, 4, right, default");
		
		JLabel label_1 = new JLabel("12323");
		panel.add(label_1, "4, 4");
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		panel.add(lblAo, "2, 6, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 6, left, default");
		textField.setColumns(10);
		
		JLabel lblMes = new JLabel("Mes:");
		panel.add(lblMes, "2, 8, right, default");
		
		JComboBox comboBox_2 = new JComboBox();
		panel.add(comboBox_2, "4, 8, fill, default");
		
		JLabel lblCliente = new JLabel("Cliente:");
		panel.add(lblCliente, "2, 10, right, default");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "4, 10, fill, default");
		
		JLabel lblEstatus = new JLabel("Estatus:");
		panel.add(lblEstatus, "2, 12, right, default");
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1, "4, 12, fill, default");
		
		JLabel lblPaquete = new JLabel("Paquete:");
		panel.add(lblPaquete, "2, 14, right, default");
		
		JComboBox comboBox_3 = new JComboBox();
		panel.add(comboBox_3, "4, 14, fill, default");
		
		JLabel lblTotal = new JLabel("Total:");
		panel.add(lblTotal, "2, 16, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 16, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblPago = new JLabel("Pago:");
		panel.add(lblPago, "2, 18, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 18, fill, default");
		textField_2.setColumns(10);
	}
}
