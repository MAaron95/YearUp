import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField tF1;
	private JTextField tF2;
	private JTextField tF3;
	private JTextField tF4;
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
		
		tF1 = new JTextField();
		tF1.setBounds(131, 21, 86, 20);
		frame.getContentPane().add(tF1);
		tF1.setColumns(10);
		
		tF2 = new JTextField();
		tF2.setBounds(131, 68, 86, 20);
		frame.getContentPane().add(tF2);
		tF2.setColumns(10);
				
		
		tF3 = new JTextField();
		tF3.setBounds(131, 112, 86, 20);
		frame.getContentPane().add(tF3);
		tF3.setColumns(10);
		
		JButton WhoBtn = new JButton("Who're You?");
		WhoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if ((tF3.getText().isEmpty()) || (tF2.getText().isEmpty()) || (tF1.getText().isEmpty()))
				{
					tF4.setText("No text was entered, please try again.");
				}
				else
				{
					tF4.setText("Your name is " + tF1.getText() + ", you are " + tF2.getText() + " and your favorite hobby is " + tF3.getText());
				}
			}
		});
		WhoBtn.setBounds(96, 170, 121, 23);
		frame.getContentPane().add(WhoBtn);
		
		tF4 = new JTextField();
		tF4.setBounds(29, 204, 395, 47);
		frame.getContentPane().add(tF4);
		tF4.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				tF4.setText(" ");
				tF2.setText(" ");
				tF3.setText(" ");
				tF1.setText(" ");
			}
		});
		btnClear.setBounds(293, 170, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
