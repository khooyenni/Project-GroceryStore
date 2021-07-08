package Beverages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LoginCustomer extends JFrame {

	private JPanel contentPane;
	protected JTextField UserNametextField;
	protected JTextField PasswordtextField;
	protected String Username;
	protected String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					LoginCustomer frame = new LoginCustomer();
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
	public LoginCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 895, 539);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Reset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		
		JButton btnRegister = new JButton("New User @ First time register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterFirst FTR = new RegisterFirst();
			    FTR.setModalExclusionType(null);
				FTR.setVisible(true);
				dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBounds(445, 487, 362, 41);
		panel.add(btnRegister);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.setBounds(12, 13, 101, 59);
		panel.add(button_1);
		
		JLabel UserNameJLabel = new JLabel("User Name");
		UserNameJLabel.setBackground(new Color(0, 0, 0));
		UserNameJLabel.setForeground(new Color(0, 0, 0));
		UserNameJLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		UserNameJLabel.setBounds(298, 205, 192, 37);
		panel.add(UserNameJLabel);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(224, 491, 153, 37);
		panel.add(button);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(298, 278, 247, 24);
		panel.add(lblPassword);
		
		UserNametextField = new JTextField();
		Username = UserNametextField.getText();
		UserNametextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		UserNametextField.setBounds(318, 237, 292, 37);
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		PasswordtextField.setColumns(10);
		PasswordtextField.setBounds(318, 299, 292, 37);
		panel.add(PasswordtextField);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.setBackground(new Color(135, 206, 250));
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = RegisterFirst.getTable();
				String un;
				String pw;
				boolean login = false;
				//2.2 Exception Handling
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 2));
						
						if(UserNametextField.getText().equals(un) && PasswordtextField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						ShopBackground s = new ShopBackground();
						s.setModalExclusionType(null);
						s.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLoginButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLoginButton.setBounds(331, 359, 260, 37);
		panel.add(btnLoginButton);
		
		JLabel lblCustomerLoginPage = new JLabel("Customer Login Page");
		lblCustomerLoginPage.setForeground(new Color(128, 0, 128));
		lblCustomerLoginPage.setFont(new Font("Brush Script MT", Font.BOLD, 71));
		lblCustomerLoginPage.setBounds(198, 26, 583, 72);
		panel.add(lblCustomerLoginPage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginCustomer.class.getResource("/BeveragesIcons/customer & admin log in.jpg")));
		lblNewLabel.setBounds(266, 97, 711, 376);
		panel.add(lblNewLabel);
	}
}