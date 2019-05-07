import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ventanaMenuUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaMenuUsuario frame = new ventanaMenuUsuario();
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
	public ventanaMenuUsuario() {
		setTitle("BIENVENIDO ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDiseos = new JButton("DISE\u00D1OS");
		btnDiseos.setBounds(33, 70, 116, 37);
		contentPane.add(btnDiseos);
		
		JButton btnImpresoras = new JButton("IMPRESORAS");
		btnImpresoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImpresoras.setBounds(161, 70, 116, 37);
		contentPane.add(btnImpresoras);
		
		JButton btnLocales = new JButton("LOCALES");
		btnLocales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLocales.setBounds(289, 70, 116, 37);
		contentPane.add(btnLocales);
		
		JButton btnPedidos = new JButton("PEDIDOS");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPedidos.setBounds(161, 186, 116, 37);
		contentPane.add(btnPedidos);
		
		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBounds(33, 186, 116, 37);
		contentPane.add(btnUsuarios);
		
		JLabel lblLogodiseo = new JLabel("logoDise\u00F1o");
		lblLogodiseo.setBounds(33, 13, 116, 47);
		contentPane.add(lblLogodiseo);
		
		JLabel lblLogoimpresoras = new JLabel("logoImpresoras");
		lblLogoimpresoras.setBounds(161, 10, 116, 47);
		contentPane.add(lblLogoimpresoras);
		
		JLabel lblLogolocales = new JLabel("logoLocales");
		lblLogolocales.setBounds(289, 13, 116, 47);
		contentPane.add(lblLogolocales);
		
		JLabel lblLogousuarios = new JLabel("logoUsuarios");
		lblLogousuarios.setBounds(33, 126, 116, 47);
		contentPane.add(lblLogousuarios);
		
		JLabel lblLogopedidoimpresion = new JLabel("logoPedidoImpresion");
		lblLogopedidoimpresion.setBounds(161, 126, 116, 47);
		contentPane.add(lblLogopedidoimpresion);
	}
}
