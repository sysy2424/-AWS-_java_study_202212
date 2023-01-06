package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 706, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.setBounds(290, 166, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("버튼2");
		btnNewButton2.setBounds(400, 166, 97, 23);
		contentPane.add(btnNewButton2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("네");
		rdbtnNewRadioButton.setBounds(175, 60, 121, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("아니오");
		rdbtnNewRadioButton_1.setBounds(175, 109, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
}
