package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class App1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App1 frame = new App1();
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
	public App1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton lblAdd = new JButton("Add employee");
		lblAdd.setBackground(Color.LIGHT_GRAY);
		lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setBounds(112, 69, 354, 45);
		contentPane.add(lblAdd);
		
		JButton lblAddStudent = new JButton("Add student");
		lblAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAddStudent.setBackground(Color.LIGHT_GRAY);
		lblAddStudent.setBounds(112, 152, 354, 45);
		contentPane.add(lblAddStudent);
		
		JButton lblAddAdministrator = new JButton("Add administrator");
		lblAddAdministrator.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAdministrator.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAddAdministrator.setBackground(Color.LIGHT_GRAY);
		lblAddAdministrator.setBounds(112, 239, 354, 45);
		contentPane.add(lblAddAdministrator);
		
		JButton lblSearch = new JButton("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSearch.setBackground(Color.LIGHT_GRAY);
		lblSearch.setBounds(112, 317, 354, 45);
		contentPane.add(lblSearch);
		
		JButton lblReporting = new JButton("Reporting");
		lblReporting.setHorizontalAlignment(SwingConstants.CENTER);
		lblReporting.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblReporting.setBackground(Color.LIGHT_GRAY);
		lblReporting.setBounds(112, 389, 354, 45);
		contentPane.add(lblReporting);
	}

}
