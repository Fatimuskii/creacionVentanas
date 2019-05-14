import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaMostrarLocal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaMostrarLocal frame = new ventanaMostrarLocal();
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
	public ventanaMostrarLocal() {
		setResizable(false);
		setTitle("LOCAL");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\altaLocal.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdlocal = new JLabel("IdLocal:");
		lblIdlocal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdlocal.setBounds(29, 28, 67, 16);
		contentPane.add(lblIdlocal);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 56, 67, 16);
		contentPane.add(lblNombre);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelfono.setBounds(29, 85, 67, 16);
		contentPane.add(lblTelfono);
		
		JLabel lblCif = new JLabel("CIF:");
		lblCif.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCif.setBounds(29, 120, 67, 16);
		contentPane.add(lblCif);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccin.setBounds(29, 143, 67, 16);
		contentPane.add(lblDireccin);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLocalidad.setBounds(29, 172, 67, 16);
		contentPane.add(lblLocalidad);
		
		JLabel lblDueo = new JLabel("Propietario:");
		lblDueo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDueo.setBounds(29, 201, 141, 16);
		contentPane.add(lblDueo);
		
		JTextPane IdLocalText = new JTextPane();
		IdLocalText.setBounds(96, 28, 74, 22);
		contentPane.add(IdLocalText);
		
		JTextPane nombreText = new JTextPane();
		nombreText.setBounds(96, 57, 101, 22);
		contentPane.add(nombreText);
		
		JTextPane telefonoText = new JTextPane();
		telefonoText.setBounds(96, 85, 84, 22);
		contentPane.add(telefonoText);
		
		JTextPane cifText = new JTextPane();
		cifText.setBounds(69, 114, 101, 22);
		contentPane.add(cifText);
		
		JTextPane dirText = new JTextPane();
		dirText.setBounds(96, 143, 141, 22);
		contentPane.add(dirText);
		
		JTextPane localidadText = new JTextPane();
		localidadText.setBounds(96, 172, 84, 22);
		contentPane.add(localidadText);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBounds(323, 163, 97, 25);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setBounds(323, 197, 97, 25);
		contentPane.add(btnEliminar);
		
		JComboBox datosPropietarioCombo = new JComboBox();
		datosPropietarioCombo.setBounds(122, 200, 135, 22);
		contentPane.add(datosPropietarioCombo);
	}
}
