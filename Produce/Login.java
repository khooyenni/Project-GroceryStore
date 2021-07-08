package Produce;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameText;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 975, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 399, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel bg = new JLabel("bg");
		bg.setBounds(0, 0, 399, 536);
		panel.add(bg);
		bg.setIcon(new ImageIcon(Login.class.getResource("/ProduceIcons/groceryillus (2).png")));
		
		
		JLabel logo = new JLabel("logo");
		logo.setBounds(433, 0, 254, 257);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon(Login.class.getResource("/ProduceIcons/naturelogowithoutbg.png")));
		
		JLabel username = new JLabel("Username");
		username.setForeground(new Color(139, 69, 19));
		username.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		username.setBounds(532, 279, 123, 35);
		contentPane.add(username);
		
		JLabel password = new JLabel("Password");
		password.setForeground(new Color(139, 69, 19));
		password.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		password.setBounds(532, 348, 123, 35);
		contentPane.add(password);
		
		usernameText = new JTextField();
		usernameText.setBounds(667, 282, 263, 35);
		contentPane.add(usernameText);
		usernameText.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(667, 348, 263, 35);
		contentPane.add(passwordField);
		
		JLabel type = new JLabel("I'm a");
		type.setHorizontalAlignment(SwingConstants.CENTER);
		type.setForeground(new Color(139, 69, 19));
		type.setFont(new Font("Futura Md BT", Font.BOLD, 30));
		type.setBounds(740, 73, 174, 61);
		contentPane.add(type);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(139, 69, 19));
		comboBox.setBackground(new Color(250, 240, 230));
		comboBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Customer", "Admin"}));
		comboBox.setBounds(721, 147, 209, 61);
		contentPane.add(comboBox);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(comboBox.getSelectedItem().equals("Customer")) {
						if(usernameText.getText().equals("naturecustomer") && passwordField.getText().equals("naturecustomer1234")) {
							JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
							
							UserHomePage customer = new UserHomePage();
							customer.setModalExclusionType(null);
							customer.setVisible(true);
							dispose();
						} else
							JOptionPane.showMessageDialog(null, "PLEASE ENTER THE CORRECT USERNAME AND PASSWORD");
					}
					else if(comboBox.getSelectedItem().equals("Admin")) {
						if(usernameText.getText().equals("natureadmin") && passwordField.getText().equals("natureadmin1234")) {
							JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
							
							AdminHomePage admin = new AdminHomePage();
							admin.setModalExclusionType(null);
							admin.setVisible(true);
							dispose();
						}
						else
							JOptionPane.showMessageDialog(null, "PLEASE ENTER THE CORRECT USERNAME AND PASSWORD");
					}
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "PLEASE ENTER THE CORRECT USERNAME AND PASSWORD");
				}
			}
		});
		loginButton.setBackground(new Color(255, 192, 203));
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		loginButton.setBounds(535, 445, 152, 42);
		contentPane.add(loginButton);
		
		JButton resetButton = new JButton("RESET");
		resetButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		resetButton.setForeground(new Color(255, 255, 255));
		resetButton.setBackground(new Color(255, 192, 203));
		resetButton.setBounds(762, 445, 152, 42);
		contentPane.add(resetButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(chckbxNewCheckBox.isSelected()) {
						passwordField.setEchoChar((char)0);
					}
					else
						passwordField.setEchoChar('*');
				} catch(Exception e) {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(667, 389, 150, 25);
		contentPane.add(chckbxNewCheckBox);
		
		
		JLabel userIcon = new JLabel("userIcon");
		userIcon.setBounds(471, 270, 49, 48);
		contentPane.add(userIcon);
		userIcon.setIcon(new ImageIcon(Login.class.getResource("/ProduceIcons/user icon.png")));
		
		JLabel passwordIcon = new JLabel("passwordIcon");
		passwordIcon.setBounds(471, 344, 49, 48);
		contentPane.add(passwordIcon);
		passwordIcon.setIcon(new ImageIcon(Login.class.getResource("/ProduceIcons/lockicon1.png")));
		
		setTitle("Login");
	}
}
