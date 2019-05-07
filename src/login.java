import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 310);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(111, 109, 43, 16);
		contentPane.add(lblUsuario);
		
		JTextField textField = new JTextField();
		textField.setBounds(200, 106, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.addKeyListener(kl);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(200, 141, 116, 22);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		//passwordField.addKeyListener(kl);

		JLabel lblContrasenia = new JLabel("Contrase\u00F1a");
		lblContrasenia.setBounds(89, 144, 65, 16);
		contentPane.add(lblContrasenia);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(248, 212, 77, 25);
		contentPane.add(btnAceptar);
		/*btnAceptar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				log();
			}
		});*/
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(337, 212, 83, 25);
		contentPane.add(btnCancelar);
		
				JLabel lblNewLabel = new JLabel("ACCESO A TU CUENTA AVENGERIS");
				lblNewLabel
						.setIcon(new ImageIcon(
								"F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\login.png"));
				lblNewLabel.setBounds(30, 13, 390, 60);
				contentPane.add(lblNewLabel);
		/*btnCancelar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				close();
			}
		});*/
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
