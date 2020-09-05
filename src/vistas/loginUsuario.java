package vistas;

import java.awt.*;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class loginUsuario implements ActionListener{

	public JFrame frame;
	private JTextField textUsuario;
	private JButton btnIngresar;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUsuario window = new loginUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 540, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,51,51));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), Color.DARK_GRAY, new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(114, 68, 299, 468);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//panel
		
		panel.setBackground(new Color(28,28,28));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 28));
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(117, 30, 84, 41);
		panel.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 17));
		lblUsuario.setBounds(119, 120, 65, 26);
		panel.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textUsuario.setBounds(37, 156, 228, 19);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Direccion IP a conectar:");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 17));
		lblContrasena.setBounds(59, 200, 191, 26);
		panel.add(lblContrasena);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)));
		btnIngresar.setFocusable(false);
		btnIngresar.setFocusTraversalPolicyProvider(true);
		btnIngresar.setRequestFocusEnabled(false);
		btnIngresar.setRolloverEnabled(false);
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBounds(76, 399, 151, 41);
		btnIngresar.setBackground(new Color(51,51,51));
		panel.add(btnIngresar);
		btnIngresar.addActionListener(this);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(Color.WHITE));
		lblNewLabel.setBounds(37, 81, 228, 1);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(37, 236, 228, 19);
		panel.add(textField);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
