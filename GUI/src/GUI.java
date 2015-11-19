import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField tF1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(24, 24, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(24, 68, 46, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblSport = new JLabel("HOBBY");
		lblSport.setBounds(24, 115, 46, 14);
		frame.getContentPane().add(lblSport);
		
		textField = new JTextField();
		textField.setBounds(131, 21, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		tF1 = new JTextField();
		tF1.setBounds(131, 68, 86, 20);
		frame.getContentPane().add(tF1);
		tF1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 112, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Who're You?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_3.setText("Your name is " + textField.getText() + ", you are " + tF1.getText() + " and your favorite hobby is " + textField_2.getText());
			}
		});
		btnNewButton.setBounds(96, 170, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(29, 204, 395, 47);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_3.setText(" ");
				tF1.setText(" ");
				textField_2.setText(" ");
				textField.setText(" ");
			}
		});
		btnClear.setBounds(293, 170, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
