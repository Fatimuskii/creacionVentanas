import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class altaRepresentante extends JFrame {

	private JPanel contentPane;

	private JTextField rep_nombreCompleto;
	private JTextField telefonoPersonal;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaRepresentante frame = new altaRepresentante();
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
	public altaRepresentante() {
		setTitle("ALTA LOCAL");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 499, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatosDelPropietario = new JLabel("Datos del Propietario:");
		lblDatosDelPropietario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelPropietario.setBounds(55, 60, 154, 16);
		contentPane.add(lblDatosDelPropietario);
		
		JLabel lblNombreRepresentante = new JLabel("Nombre y Apellidos:");
		lblNombreRepresentante.setBounds(90, 89, 143, 36);
		contentPane.add(lblNombreRepresentante);
		
		rep_nombreCompleto = new JTextField();
		rep_nombreCompleto.setBounds(210, 96, 186, 22);
		contentPane.add(rep_nombreCompleto);
		rep_nombreCompleto.setColumns(10);
	
		
		JLabel lblTelefonoPersonal = new JLabel("Telefono personal:");
		lblTelefonoPersonal.setBounds(90, 117, 143, 36);
		contentPane.add(lblTelefonoPersonal);
		
		telefonoPersonal = new JTextField();
		telefonoPersonal.setColumns(10);
		telefonoPersonal.setBounds(210, 124, 186, 22);
		contentPane.add(telefonoPersonal);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(90, 147, 70, 36);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 154, 186, 22);
		contentPane.add(textField);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonAceptar.setBounds(318, 205, 111, 42);
		contentPane.add(botonAceptar);
		
		JButton button = new JButton("<- Atr\u00E1s");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(183, 205, 111, 42);
		contentPane.add(button);
		
		
		JLabel lblLogoaltaRep = new JLabel("logoAltaLocal");
		lblLogoaltaRep.setBounds(347, 31, 49, 44);
		Icon icono = new ImageIcon(new ImageIcon("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\loginRepresentante.png").getImage().getScaledInstance(lblLogoaltaRep.getWidth(), lblLogoaltaRep.getHeight(), Image.SCALE_DEFAULT));
		lblLogoaltaRep.setIcon(icono);
		this.repaint();
		
		contentPane.add(lblLogoaltaRep);
	}
	
	
}
