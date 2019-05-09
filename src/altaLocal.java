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
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class altaLocal extends JFrame {

	private JPanel contentPane;

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
		setResizable(false);

		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\local1.png"));
		setTitle("FORMULARIO DE CREACION DE LOCAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* DATOS DEL LOCAL EN SI: */

		JLabel lblDatosDelLocal = new JLabel("Datos del Local:");
		lblDatosDelLocal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelLocal.setBounds(28, 100, 130, 16);
		contentPane.add(lblDatosDelLocal);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(63, 149, 119, 29);
		contentPane.add(lblNombre);

		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(194, 152, 175, 22);
		contentPane.add(nombre);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(63, 179, 119, 29);
		contentPane.add(lblTelefono);

		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(194, 182, 116, 22);
		contentPane.add(telefono);

		JLabel lblCif = new JLabel("CIF:");
		lblCif.setBounds(63, 209, 119, 29);
		contentPane.add(lblCif);

		CIF = new JTextField();
		CIF.setColumns(10);
		CIF.setBounds(194, 212, 175, 22);
		contentPane.add(CIF);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(63, 240, 119, 29);
		contentPane.add(lblDireccin);

		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(194, 243, 175, 22);
		contentPane.add(direccion);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setBounds(63, 271, 119, 29);
		contentPane.add(lblCdigoPostal);

		CP = new JTextField();
		CP.setColumns(10);
		CP.setBounds(194, 274, 116, 22);
		contentPane.add(CP);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(63, 299, 119, 29);
		contentPane.add(lblLocalidad);

		localidad = new JTextField();
		localidad.setColumns(10);
		localidad.setBounds(194, 303, 116, 22);
		contentPane.add(localidad);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(341, 327, 116, 36);
		contentPane.add(btnAceptar);
		
		JLabel lblLogoaltalocal = new JLabel("logoAltaLocal");
		lblLogoaltalocal.setBounds(327, 42, 76, 74);
		Icon icono = new ImageIcon(new ImageIcon("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\altaLocal.png").getImage().getScaledInstance(lblLogoaltalocal.getWidth(), lblLogoaltalocal.getHeight(), Image.SCALE_DEFAULT));
		lblLogoaltalocal.setIcon(icono);
		this.repaint();
		
		contentPane.add(lblLogoaltalocal);

		
		
	}
}
