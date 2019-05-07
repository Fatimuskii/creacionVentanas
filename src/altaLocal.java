import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class altaLocal extends JFrame {

	private JPanel contentPane;
	private JTextField rep_nombreCompleto;
	private JTextField telefonoPersonal;
	private JTextField email;
	private JTextField nombre;
	private JTextField telefono;
	private JTextField CIF;
	private JTextField direccion;
	private JTextField CP;
	private JTextField localidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaLocal frame = new altaLocal();
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
	public altaLocal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\local1.png"));
		setTitle("FORMULARIO DE CREACION DE LOCAL");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreRepresentante = new JLabel("Nombre y Apellidos:");
		lblNombreRepresentante.setBounds(75, 106, 143, 36);
		contentPane.add(lblNombreRepresentante);
		
		JLabel lblDatosDelPropietario = new JLabel("Datos del Propietario:");
		lblDatosDelPropietario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelPropietario.setBounds(40, 77, 154, 16);
		contentPane.add(lblDatosDelPropietario);
		
		JLabel lblTelefonoPersonal = new JLabel("Telefono personal:");
		lblTelefonoPersonal.setBounds(75, 134, 143, 36);
		contentPane.add(lblTelefonoPersonal);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(75, 164, 70, 36);
		contentPane.add(lblEmail);
		
		rep_nombreCompleto = new JTextField();
		rep_nombreCompleto.setBounds(195, 113, 186, 22);
		contentPane.add(rep_nombreCompleto);
		rep_nombreCompleto.setColumns(10);
		
		telefonoPersonal = new JTextField();
		telefonoPersonal.setColumns(10);
		telefonoPersonal.setBounds(195, 141, 186, 22);
		contentPane.add(telefonoPersonal);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(195, 171, 186, 22);
		contentPane.add(email);
		
		JLabel lblDatosDelLocal = new JLabel("Datos del Local:");
		lblDatosDelLocal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelLocal.setBounds(40, 213, 130, 16);
		contentPane.add(lblDatosDelLocal);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(75, 233, 119, 29);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(206, 236, 175, 22);
		contentPane.add(nombre);
		
		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(206, 266, 116, 22);
		contentPane.add(telefono);
		
		CIF = new JTextField();
		CIF.setColumns(10);
		CIF.setBounds(206, 296, 175, 22);
		contentPane.add(CIF);
		
		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(206, 327, 175, 22);
		contentPane.add(direccion);
		
		CP = new JTextField();
		CP.setColumns(10);
		CP.setBounds(206, 358, 116, 22);
		contentPane.add(CP);
		
		localidad = new JTextField();
		localidad.setColumns(10);
		localidad.setBounds(206, 387, 116, 22);
		contentPane.add(localidad);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 263, 119, 29);
		contentPane.add(lblTelefono);
		
		JLabel lblCif = new JLabel("CIF:");
		lblCif.setBounds(75, 293, 119, 29);
		contentPane.add(lblCif);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(75, 324, 119, 29);
		contentPane.add(lblDireccin);
		
		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setBounds(75, 355, 119, 29);
		contentPane.add(lblCdigoPostal);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(75, 383, 119, 29);
		contentPane.add(lblLocalidad);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(353, 440, 116, 36);
		contentPane.add(btnAceptar);
		
		JLabel lblLogonuevolocal = new JLabel("LogoNuevoLocal");
		lblLogonuevolocal.setBounds(302, 13, 96, 79);
		contentPane.add(lblLogonuevolocal);
	}
}
