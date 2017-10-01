package Petrol;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaiPetrolium = new JLabel("Sai Petrolium");
		lblSaiPetrolium.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 22));
		lblSaiPetrolium.setBounds(157, 0, 138, 42);
		contentPane.add(lblSaiPetrolium);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 16));
		lblUsername.setBounds(71, 77, 77, 17);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBounds(71, 119, 77, 17);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 117, 86, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(175, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.setText(set.getString("Username"));
		String s = textField.getText();
		System.out.println(s);
		
		
		Admin ad = new Admin();
		ad.setVisible(true);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 16));
		btnSubmit.setBounds(172, 172, 89, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new CloseListner() {
			public void actionPerformed(ActionEvent e) {
				Admin ad = new Admin();
				ad.setVisible(true);
			}
		});
	}
}
