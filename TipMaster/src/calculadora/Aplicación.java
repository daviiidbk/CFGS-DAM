package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Aplicación {

	private JFrame frame;
	private JTextField importe;
	private JTextField total;
	double first;
	double propina;
	double result;
	String operation;
	String answer;
	private JTextField propinaSolo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicación window = new Aplicación();
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
	public Aplicación() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 400, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		importe = new JTextField();
		importe.setHorizontalAlignment(SwingConstants.CENTER);
		importe.setBackground(new Color(102, 153, 204));
		importe.setEditable(false);
		importe.setFont(new Font("Tahoma", Font.PLAIN, 35));
		importe.setBounds(10, 98, 366, 65);
		frame.getContentPane().add(importe);
		importe.setColumns(10);
		
		JTextArea txtrBienvenidALa = new JTextArea();
		txtrBienvenidALa.setForeground(new Color(255, 255, 255));
		txtrBienvenidALa.setBackground(new Color(204, 153, 102));
		txtrBienvenidALa.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		txtrBienvenidALa.setEditable(false);
		txtrBienvenidALa.setText("¡Bienvenid@ a la Calculadora de Propinas!");
		txtrBienvenidALa.setBounds(13, 10, 361, 40);
		frame.getContentPane().add(txtrBienvenidALa);
		
		JButton btn5p = new JButton("5%");
		btn5p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.05;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn5p.setForeground(new Color(17, 128, 20));
		btn5p.setBackground(new Color(255, 255, 255));
		btn5p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5p.setBounds(25, 424, 85, 58);
		frame.getContentPane().add(btn5p);
		
		JButton btn10p = new JButton("10%");
		btn10p.setForeground(new Color(21, 157, 24));
		btn10p.setBackground(new Color(255, 255, 255));
		btn10p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.10;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn10p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn10p.setBounds(146, 424, 85, 58);
		frame.getContentPane().add(btn10p);
		
		JButton btn20p = new JButton("15%");
		btn20p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.15;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn20p.setForeground(new Color(26, 187, 30));
		btn20p.setBackground(new Color(255, 255, 255));
		btn20p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn20p.setBounds(273, 424, 85, 58);
		frame.getContentPane().add(btn20p);
		
		JButton btn30p = new JButton("20%");
		btn30p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.20;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn30p.setForeground(new Color(62, 215, 73));
		btn30p.setBackground(new Color(255, 255, 255));
		btn30p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn30p.setBounds(25, 508, 85, 58);
		frame.getContentPane().add(btn30p);
		
		JButton btn40p = new JButton("25%");
		btn40p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.25;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn40p.setForeground(new Color(72, 230, 77));
		btn40p.setBackground(new Color(255, 255, 255));
		btn40p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn40p.setBounds(146, 508, 85, 58);
		frame.getContentPane().add(btn40p);
		
		JButton btn50p = new JButton("30%");
		btn50p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(importe.getText());
				propina = first * 0.30;
				double coste = first + propina;
				propinaSolo.setText(String.format("%.2f", propina));
				total.setText(String.format("%.2f", coste));
			}
		});
		btn50p.setForeground(new Color(115, 236, 118));
		btn50p.setBackground(new Color(255, 255, 255));
		btn50p.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn50p.setBounds(273, 508, 85, 58);
		frame.getContentPane().add(btn50p);
		
		total = new JTextField();
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setBackground(new Color(102, 153, 204));
		total.setFont(new Font("Tahoma", Font.PLAIN, 35));
		total.setEditable(false);
		total.setColumns(10);
		total.setBounds(211, 612, 165, 65);
		frame.getContentPane().add(total);
		
		JTextArea txtrPropina = new JTextArea();
		txtrPropina.setForeground(new Color(255, 255, 255));
		txtrPropina.setBackground(new Color(204, 153, 102));
		txtrPropina.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		txtrPropina.setText("Propina:");
		txtrPropina.setEditable(false);
		txtrPropina.setBounds(63, 576, 58, 30);
		frame.getContentPane().add(txtrPropina);
		
		JTextArea txtrTotalconPropina = new JTextArea();
		txtrTotalconPropina.setForeground(new Color(255, 255, 255));
		txtrTotalconPropina.setBackground(new Color(204, 153, 102));
		txtrTotalconPropina.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		txtrTotalconPropina.setText("Total:");
		txtrTotalconPropina.setEditable(false);
		txtrTotalconPropina.setBounds(272, 576, 42, 30);
		frame.getContentPane().add(txtrTotalconPropina);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(204, 153, 102));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn1.getText();
				importe.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(30, 173, 110, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(204, 153, 102));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn2.getText();
				importe.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(138, 173, 110, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(204, 153, 102));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn3.getText();
				importe.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(246, 173, 110, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(204, 153, 102));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn4.getText();
				importe.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(30, 221, 110, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(204, 153, 102));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn5.getText();
				importe.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(138, 221, 110, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(204, 153, 102));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn6.getText();
				importe.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(246, 221, 110, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnComa = new JButton(".");
		btnComa.setForeground(new Color(255, 255, 255));
		btnComa.setBackground(new Color(204, 153, 102));
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btnComa.getText();
				importe.setText(number);
			}
		});
		btnComa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnComa.setBounds(30, 314, 110, 50);
		frame.getContentPane().add(btnComa);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(204, 153, 102));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn0.getText();
				importe.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(138, 314, 110, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setBackground(new Color(204, 153, 102));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				importe.setText(null);
				propinaSolo.setText(null);
				total.setText(null);
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLimpiar.setBounds(246, 314, 110, 50);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(204, 153, 102));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn7.getText();
				importe.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(30, 266, 110, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(204, 153, 102));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn8.getText();
				importe.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(138, 266, 110, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(204, 153, 102));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = importe.getText()+btn9.getText();
				importe.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(246, 266, 110, 50);
		frame.getContentPane().add(btn9);
		
		propinaSolo = new JTextField();
		propinaSolo.setHorizontalAlignment(SwingConstants.CENTER);
		propinaSolo.setBackground(new Color(102, 153, 204));
		propinaSolo.setFont(new Font("Tahoma", Font.PLAIN, 35));
		propinaSolo.setEditable(false);
		propinaSolo.setColumns(10);
		propinaSolo.setBounds(10, 612, 165, 65);
		frame.getContentPane().add(propinaSolo);
		
		JLabel lblNewLabel = new JLabel("1º Introduczca el importe total de la factura:");
		lblNewLabel.setBackground(new Color(102, 153, 204));
		lblNewLabel.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblNewLabel.setBounds(54, 60, 279, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSeleccioneEl = new JLabel("2º Seleccione el porcentaje de propina que desea ofrecer:");
		lblSeleccioneEl.setBackground(new Color(102, 153, 204));
		lblSeleccioneEl.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblSeleccioneEl.setBounds(10, 374, 366, 40);
		frame.getContentPane().add(lblSeleccioneEl);
	}
}
