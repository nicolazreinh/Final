package Project;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Serif", Font.PLAIN, 16));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(33, 66, 92, 22);
		contentPane.add(lblUsername);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 198, 378, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 53, 391, 2);
		contentPane.add(separator_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(33, 125, 92, 24);
		contentPane.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(211, 68, 144, 24);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(211, 126, 144, 23);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(pass)
				App1 app=new App1();
				app.main(null);
			}
		});
		btnLogIn.setFont(new Font("Serif", Font.BOLD, 16));
		btnLogIn.setBounds(33, 211, 92, 39);
		contentPane.add(btnLogIn);
		
		JButton btnRest = new JButton("Rest");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText(null);
				passwordField.setText(null);
			}
		});
		btnRest.setFont(new Font("Serif", Font.BOLD, 16));
		btnRest.setBounds(173, 212, 92, 38);
		contentPane.add(btnRest);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Serif", Font.BOLD, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","log in system",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					System.exit(0);
			}
		});
		btnExit.setBounds(313, 212, 92, 38);
		contentPane.add(btnExit);
		
		JLabel lblLogInSystem = new JLabel("Log in system");
		lblLogInSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogInSystem.setFont(new Font("Serif", Font.PLAIN, 16));
		lblLogInSystem.setBounds(134, 11, 132, 22);
		contentPane.add(lblLogInSystem);
	}
}
