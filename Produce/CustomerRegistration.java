package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel.setBounds(41, 35, 631, 293);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Which type of a customer are you? ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 28, 582, 89);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Walk-In Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales sales=new Sales();
				sales.setModalExclusionType(null);
				sales.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(206, 130, 214, 49);
		panel.add(btnNewButton);
		
		JButton btnOnlineCustomer = new JButton("Online Customer");
		btnOnlineCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome to our grocery store, please register first. ");
				OnlineCustomer on=new OnlineCustomer();
				on.setModalExclusionType(null);
				on.setVisible(true);
				dispose();
			}
		});
		btnOnlineCustomer.setForeground(Color.WHITE);
		btnOnlineCustomer.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnOnlineCustomer.setBackground(new Color(255, 192, 203));
		btnOnlineCustomer.setBounds(206, 207, 214, 49);
		panel.add(btnOnlineCustomer);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage user=new UserHomePage();
				user.setModalExclusionType(null);
				user.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnBack.setBackground(new Color(255, 192, 203));
		btnBack.setBounds(555, 348, 117, 39);
		contentPane.add(btnBack);
		
		setTitle("Customer Registration");
	}

}
