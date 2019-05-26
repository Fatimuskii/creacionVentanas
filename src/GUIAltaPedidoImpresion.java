
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Choice;
import java.awt.List;

public class GUIAltaPedidoImpresion extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtnRecogerALocal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAltaPedidoImpresion frame = new GUIAltaPedidoImpresion();
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
	public GUIAltaPedidoImpresion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		setTitle("ALTA PEDIDO IMPRESION");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 681, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 653, 40);
		panel.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 GUIPedidoImpresionImp imp; 
				imp= new  GUIPedidoImpresionImp(); 
				imp.setVisible(true); 
				dispose();
			}
		});
		mnArchivo.add(mntmVolverAlMenu);
		mnArchivo.add(mntmSalir);
		
		JMenu mnPedidoimpresion = new JMenu("PedidoImpresion");
		menuBar.add(mnPedidoimpresion);
		
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIBajaPedidoImpresion baja; 
				baja= new GUIBajaPedidoImpresion(); 
				baja.setVisible(true);
				dispose();
			}
		});
		mnPedidoimpresion.add(mntmBaja);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIBuscarPedido buscar;
				buscar= new GUIBuscarPedido(); 
				buscar.setVisible(true);
				dispose();
			}
		});
		mnPedidoimpresion.add(mntmBuscar);
		
		JMenu mnModificar = new JMenu("Modificar");
		mnPedidoimpresion.add(mnModificar);
		
		JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
		mntmPedidoImpresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificarPedido modificar;
				modificar= new GUIModificarPedido(); 
				modificar.setVisible(true);
				dispose();
			}
		});
		mnModificar.add(mntmPedidoImpresion);
		
		JMenuItem mntmEnvio = new JMenuItem("Envio");
		mntmEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificarEnvio envio;
				envio= new GUIModificarEnvio(); 
				envio.setVisible(true);
				dispose();
			}
		});
		mnModificar.add(mntmEnvio);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		menuBar.add(lblLogo);
		
		JLabel lblCompra = new JLabel("imagen");
		lblCompra.setBounds(35, 69, 160, 155);
		panel.add(lblCompra);
		ImageIcon fot1 = new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\commerce-and-shopping.png");
		Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(lblCompra.getWidth(), lblCompra.getHeight(), Image.SCALE_DEFAULT));
		lblCompra.setIcon(icono1);
		
		JButton btnContinuar = new JButton("Aceptar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnContinuar.setBounds(497, 345, 126, 40);
		panel.add(btnContinuar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(246, 92, 56, 16);
		panel.add(lblUsuario);
		
		JLabel lblImpresora = new JLabel("Impresora:");
		lblImpresora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblImpresora.setBounds(246, 150, 84, 16);
		panel.add(lblImpresora);
		
		JLabel lblDiseo = new JLabel("Dise\u00F1o:");
		lblDiseo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDiseo.setBounds(246, 121, 56, 16);
		panel.add(lblDiseo);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(246, 179, 56, 16);
		panel.add(lblFecha);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCantidad.setBounds(246, 208, 72, 16);
		panel.add(lblCantidad);
		
		JLabel lblNewLabel = new JLabel("Material de impresi\u00F3n:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(246, 237, 143, 16);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 13));
		spinner.setModel(new SpinnerNumberModel(1, null, 5, 1));
		spinner.setBounds(314, 206, 44, 22);
		panel.add(spinner);
		
		JLabel lblLocal = new JLabel("Local: ");
		lblLocal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocal.setBounds(246, 266, 143, 16);
		panel.add(lblLocal);
		this.repaint();
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
