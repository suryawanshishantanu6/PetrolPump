package Petrol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					//Dimensions d = new Dimensions();
					//d.setSize(1024,768);
					//frame.setSize(1376, 760);
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
	public Admin() {
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
		
		String[] nozzles = { "Nozzle 1", "Nozzle 2", "Nozzle 3", "Nozzle 4"};
		JComboBox comboBox = new JComboBox(nozzles);
		comboBox.setBounds(10, 110, 72, 26);
		contentPane.add(comboBox);
		//comboBox.addActionListener(this);
		
		/*public void actionPerformed(ActionEvent e) {
			JComboBox comboBox = (JComboBox)e.getSource()
		}*/
		
		JLabel lblSelectNozzle = new JLabel("Select Nozzle : ");
		lblSelectNozzle.setFont(new Font("Adobe Caslon Pro Bold", Font.ITALIC, 16));
		lblSelectNozzle.setBounds(10, 74, 100, 25);
		contentPane.add(lblSelectNozzle);
		
		JLabel lblNozzle = new JLabel("Nozzle 1");
		lblNozzle.setFont(new Font("Adobe Caslon Pro Bold", Font.ITALIC, 14));
		lblNozzle.setBounds(120, 77, 65, 20);
		contentPane.add(lblNozzle);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setBounds(120, 110, 65, 26);
		contentPane.add(lblCapacity);
		
		JLabel lblOutlet = new JLabel("Outlet");
		lblOutlet.setBounds(204, 110, 65, 26);
		contentPane.add(lblOutlet);
		
		JLabel lblRemaining = new JLabel("Remaining");
		lblRemaining.setBounds(283, 110, 65, 26);
		contentPane.add(lblRemaining);
		
		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 16));
		lblAdminPanel.setBounds(10, 43, 109, 20);
		contentPane.add(lblAdminPanel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new CloseListner() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnLogout.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 14));
		btnLogout.setBounds(335, 42, 89, 23);
		contentPane.add(btnLogout);
	}
}
