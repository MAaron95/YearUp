import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class TicTacToe {

	private JFrame frame;
	private String m_previousPlay = null;
	private JButton[][] m_allButtons = new JButton[3][3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton Btn1 = new JButton("");
		Btn1.setBounds(0, 0, 137, 90);
		Btn1.setVerticalAlignment(SwingConstants.TOP);
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Btn1);
		m_allButtons[0][0] = Btn1;

		JButton Btn2 = new JButton("");
		Btn2.setBounds(137, 0, 153, 90);
		frame.getContentPane().add(Btn2);
		m_allButtons[0][1] = Btn2;

		JButton Btn3 = new JButton("");
		Btn3.setBounds(290, 0, 186, 90);
		frame.getContentPane().add(Btn3);
		m_allButtons[0][2] = Btn3;

		JButton Btn4 = new JButton("");
		Btn4.setBounds(0, 90, 137, 87);
		frame.getContentPane().add(Btn4);
		m_allButtons[1][0] = Btn4;

		JButton Btn5 = new JButton("");
		Btn5.setBounds(137, 90, 153, 87);
		frame.getContentPane().add(Btn5);
		m_allButtons[1][1] = Btn5;

		JButton Btn6 = new JButton("");
		Btn6.setBounds(290, 90, 186, 87);
		frame.getContentPane().add(Btn6);
		m_allButtons[1][2] = Btn6;

		JButton Btn7 = new JButton("");
		Btn7.setBounds(0, 177, 137, 87);
		frame.getContentPane().add(Btn7);
		m_allButtons[2][0] = Btn7;

		JButton Btn8 = new JButton("");
		Btn8.setBounds(137, 177, 153, 87);
		frame.getContentPane().add(Btn8);
		m_allButtons[2][1] = Btn8;

		JButton Btn9 = new JButton("");
		Btn9.setBounds(290, 177, 186, 87);
		frame.getContentPane().add(Btn9);
		m_allButtons[2][2] = Btn9;
		
		AddAllEventHandlers();
	}

	private void ChangeButtonText(JButton button)
	{
		if (button != null)
		{
			if (m_previousPlay != null)
			{
				if (m_previousPlay.equals("X"))
				{
					button.setText("O");
					m_previousPlay = "O";
				}
				else
				{
					button.setText("X");
					m_previousPlay = "X";
				}
			}
			else
			{
				m_previousPlay = "X";
				button.setText("X");
			}
		}
	}
	private void DisableAllButtons()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}

	private void CheckGameWinner()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				String first = m_allButtons[i][0].getText();
				String second = m_allButtons[i][1].getText();
				String third = m_allButtons[i][2].getText();

				boolean allEmpty = first.isEmpty() && second.isEmpty() && third.isEmpty();
				boolean isSame = first.equals(second) && second.equals(third);

				if ((!allEmpty) && (isSame))
				{
					DisableAllButtons();
					m_allButtons[i][0].setBackground(Color.BLACK);
					m_allButtons[i][1].setBackground(Color.BLACK);
					m_allButtons[i][2].setBackground(Color.BLACK);
					break;
				}
			}


			for (int i = 0; i < 3; i++)
			{
				String first = m_allButtons[0][i].getText();
				String second = m_allButtons[1][i].getText();
				String third = m_allButtons[2][i].getText();

				boolean allEmpty = first.isEmpty() && second.isEmpty() && third.isEmpty();
				boolean isSame = first.equals(second) && second.equals(third);

				if ((!allEmpty) && (isSame))
				{
					DisableAllButtons();
					m_allButtons[0][i].setBackground(Color.RED);
					m_allButtons[1][i].setBackground(Color.RED);
					m_allButtons[2][i].setBackground(Color.RED);
					break;
				}
			}
			
			for (int i = 0; i < 3; i++)
			{
				String fourth = m_allButtons[0][0].getText();
				String fifth = m_allButtons[1][1].getText();
				String sixth = m_allButtons[2][2].getText();

				boolean allEmpty = fourth.isEmpty() && fifth.isEmpty() && sixth.isEmpty();
				boolean isSame = fourth.equals(fifth) && fifth.equals(sixth);

				if ((!allEmpty) && (isSame))
				{
					DisableAllButtons();
					m_allButtons[0][i].setBackground(Color.RED);
					m_allButtons[1][i].setBackground(Color.RED);
					m_allButtons[2][i].setBackground(Color.RED);
					break;
		}
	}
		}
	}

	private void AddAllEventHandlers()
	{
		if(m_allButtons !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					JButton button = m_allButtons[i][j];
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ChangeButtonText(button);
							button.setEnabled(false);
							CheckGameWinner();
						}
					});
				}
			}
		}
	}
}


