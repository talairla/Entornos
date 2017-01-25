package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ConversorVentana  {

	private JFrame frame;
	private ConversorDivisas convDiv;
	private JTextField txtDivOrig;
	private JTextField txtDivDest;
	private JTextField txtCantidad;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorVentana window = new ConversorVentana();
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
	public ConversorVentana() {
		convDiv = new ConversorDivisas();
		convDiv.insertarDivisa("EUR", 1);
		convDiv.insertarDivisa("USD", 1.07592);
		convDiv.insertarDivisa("JPY", 121.904);
		convDiv.insertarDivisa("GBP", 0.85416);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtDivOrig = new JTextField();
		frame.getContentPane().add(txtDivOrig, BorderLayout.WEST);
		txtDivOrig.setColumns(10);
		
		txtDivDest = new JTextField();
		frame.getContentPane().add(txtDivDest, BorderLayout.CENTER);
		txtDivDest.setColumns(10);
		
		txtCantidad = new JTextField();
		frame.getContentPane().add(txtCantidad, BorderLayout.EAST);
		txtCantidad.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Se ha pulsado el botón");
				String divOrigen = txtDivOrig.getText();
			    String divDestino = txtDivDest.getText();
			    String str_cantidad = txtCantidad.getText();
			    double cantidad = Double.parseDouble(str_cantidad);
			    lblResultado.setText("Resultado: "+convDiv.convertir(divOrigen, divDestino, cantidad));
			    System.out.println("Conversión: "+convDiv.convertir(divOrigen, divDestino, cantidad));
			}
		});
		frame.getContentPane().add(btnConvertir, BorderLayout.SOUTH);
		
		lblResultado = new JLabel("Resultado: ");
		frame.getContentPane().add(lblResultado, BorderLayout.NORTH);
	}

}
