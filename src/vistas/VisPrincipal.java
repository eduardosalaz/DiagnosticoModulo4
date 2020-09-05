package vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VisPrincipal implements ActionListener{

	public JFrame frame;
	private JTextField textTextoAEnviar;
	private JButton btnEstado;
	private JTextArea textAreaDeTexto;
	private JLabel lblEstado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisPrincipal window = new VisPrincipal();
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
	public VisPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 906, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,51,51));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), Color.DARK_GRAY, new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(10, 10, 872, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//panel
		
		panel.setBackground(new Color(28,28,28));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(646, 108, 216, 344);
		panel.add(panel_2);
		
		textTextoAEnviar = new JTextField();
		textTextoAEnviar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String mensaje = textTextoAEnviar.getText();
					
					
					textAreaDeTexto.append(mensaje+"\n");
					textTextoAEnviar.setText("");
				}
				
			}
		});
		textTextoAEnviar.setBounds(10, 467, 486, 31);
		panel.add(textTextoAEnviar);
		textTextoAEnviar.setColumns(10);
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setRolloverEnabled(false);
		btnEnviar.setRequestFocusEnabled(false);
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)));
		btnEnviar.setBackground(new Color(51, 51, 51));
		btnEnviar.setBounds(506, 466, 130, 33);
		panel.add(btnEnviar);
		
		btnEstado = new JButton("Cambiar de estado");
		btnEstado.setRolloverEnabled(false);
		btnEstado.setRequestFocusEnabled(false);
		btnEstado.setForeground(Color.WHITE);
		btnEstado.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)));
		btnEstado.setBackground(new Color(51, 51, 51));
		btnEstado.setBounds(10, 45, 114, 31);
		panel.add(btnEstado);
		btnEstado.addActionListener(this);
		
		JButton btnSilenciarSonidos = new JButton("Silenciar Sonidos");
		btnSilenciarSonidos.setRolloverEnabled(false);
		btnSilenciarSonidos.setRequestFocusEnabled(false);
		btnSilenciarSonidos.setForeground(Color.WHITE);
		btnSilenciarSonidos.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)));
		btnSilenciarSonidos.setBackground(new Color(51, 51, 51));
		btnSilenciarSonidos.setBounds(748, 462, 114, 37);
		panel.add(btnSilenciarSonidos);
		
		JLabel lblNewLabel = new JLabel("Estado actual: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 10, 121, 31);
		panel.add(lblNewLabel);
		
		lblEstado = new JLabel("Conectado");
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEstado.setBounds(126, 10, 121, 31);
		panel.add(lblEstado);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 108, 626, 344);
		panel.add(scrollPane_1);
		
		textAreaDeTexto = new JTextArea();
		textAreaDeTexto.setEditable(false);
		scrollPane_1.setViewportView(textAreaDeTexto);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnEstado) {
			estado();
		}
	}
	
	
	private void estado() {
		String[] opciones = {"Conectado","Ausente","Desconectado"};
		String opcion = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion.\n\n","Cambiar Estado",JOptionPane.INFORMATION_MESSAGE,null, opciones,opciones[0]);
		
		if(opcion.equals("Conectado")) {
			lblEstado.setText("Conectado");
		}
		else if(opcion.equals("Ausente")) {
			lblEstado.setText("Ausente");
		}
		else {
			lblEstado.setText("Desconectado");
		}
		
	}
	
	
}

