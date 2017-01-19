package wbpacket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
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
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Etiqueta2");
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblEtiqueta = new JLabel("Etiqueta1");
		frame.getContentPane().add(lblEtiqueta, BorderLayout.NORTH);
		
		lblEtiqueta.setText("Cambiado el nombre");
		
		JButton btnBoton = new JButton("Botón 1");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Has pulsado el botón");
			}
		});
		
		btnBoton.setText(btnBoton.getText()+" Cambiado");
		frame.getContentPane().add(btnBoton, BorderLayout.SOUTH);
	}

	private void cambiarTexto(){
		
	}
}
