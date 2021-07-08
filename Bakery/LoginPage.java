package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_username;
	private JRadioButton rdbtnCustomer;
	private JRadioButton rdbtnStaff;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setBackground(new Color(255, 228, 225));
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setTitle("Cherry On Top Bakery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 245, 238));
		panel.setBorder(null);
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBakeryImage = new JLabel("");
		lblBakeryImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Cherry On Top Bakery.png")));
		lblBakeryImage.setBounds(600, 0, 349, 536);
		panel.add(lblBakeryImage);
		
		JLabel lbWelcome = new JLabel("Welcome to Cherry On Top Bakery");
		lbWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lbWelcome.setForeground(new Color(139, 69, 19));
		lbWelcome.setFont(new Font("Gabriola", Font.BOLD, 40));
		lbWelcome.setBounds(44, 16, 510, 89);
		panel.add(lbWelcome);
		
		JLabel lblPremium = new JLabel("P R E M I U M   F R E S H L Y   B A K E D");
		lblPremium.setForeground(new Color(160, 82, 45));
		lblPremium.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremium.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblPremium.setBounds(137, 90, 295, 27);
		panel.add(lblPremium);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(139, 69, 19));
		lblUsername.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		lblUsername.setBounds(119, 153, 123, 33);
		panel.add(lblUsername);
		
		JLabel lblUsernameicon = new JLabel("");
		lblUsernameicon.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/icon username.png")));
		lblUsernameicon.setBounds(129, 199, 29, 29);
		panel.add(lblUsernameicon);
		
		textField_username = new JTextField();
		textField_username.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_username.setBounds(183, 192, 300, 38);
		panel.add(textField_username);
		textField_username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(139, 69, 19));
		lblPassword.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		lblPassword.setBounds(119, 246, 123, 33);
		panel.add(lblPassword);
		
		JLabel lblPasswordIcon = new JLabel("");
		lblPasswordIcon.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/icon password.png")));
		lblPasswordIcon.setBounds(129, 290, 29, 29);
		panel.add(lblPasswordIcon);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		passwordField.setBounds(183, 283, 300, 38);
		panel.add(passwordField);
		
		JLabel lblInvisiblePassword = new JLabel("");
		lblInvisiblePassword.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Password Invisible.png")));
		lblInvisiblePassword.setBounds(487, 283, 28, 36);
		panel.add(lblInvisiblePassword);
		
		JLabel lblVisiblePassword = new JLabel("");
		lblVisiblePassword.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Password Visible.png")));
		lblVisiblePassword.setBounds(487, 283, 28, 36);
		panel.add(lblVisiblePassword);
		
		JLabel lblLoginAs = new JLabel("Login as");
		lblLoginAs.setForeground(new Color(139, 69, 19));
		lblLoginAs.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
		lblLoginAs.setBounds(119, 345, 123, 36);
		panel.add(lblLoginAs);
		
		rdbtnCustomer = new JRadioButton("Customer");
		rdbtnCustomer.setForeground(new Color(139, 69, 19));
		rdbtnCustomer.setBackground(new Color(255, 245, 238));
		rdbtnCustomer.setFont(new Font("Yu Gothic UI", Font.PLAIN, 21));
		rdbtnCustomer.setBounds(242, 350, 129, 29);
		panel.add(rdbtnCustomer);
		
		rdbtnStaff = new JRadioButton("Staff");
		rdbtnStaff.setForeground(new Color(139, 69, 19));
		rdbtnStaff.setFont(new Font("Yu Gothic UI", Font.PLAIN, 21));
		rdbtnStaff.setBackground(new Color(255, 245, 238));
		rdbtnStaff.setBounds(392, 350, 91, 29);
		panel.add(rdbtnStaff);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(188, 143, 143));
		btnLogin.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnLogin.setBounds(129, 436, 145, 40);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(188, 143, 143));
		btnReset.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnReset.setBounds(332, 436, 145, 40);
		panel.add(btnReset);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//
		
		lblInvisiblePassword.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				lblVisiblePassword.setVisible(true);
				lblInvisiblePassword.setVisible(false);
				passwordField.setEchoChar((char)0);
			}
		});
		
		lblVisiblePassword.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				lblVisiblePassword.setVisible(false);
				lblInvisiblePassword.setVisible(true);
				passwordField.setEchoChar('\u2022');
			}
		});
		
		rdbtnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCustomer.isSelected()) {
					rdbtnStaff.setSelected(false);
				}
			}
		});
		
		rdbtnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnStaff.isSelected()) {
					rdbtnCustomer.setSelected(false);
				}
			}
		});

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(rdbtnCustomer.isSelected()) {
						if(textField_username.getText().equals("cherrycustomer") && passwordField.getText().equals("cherrycustomer123")) {
							JOptionPane.showMessageDialog(null, "Login successfully.");
							
							//calling another frame -> Customer_HomePage
							Customer_HomePage frame = new Customer_HomePage();
							frame.setModalExclusionType(null);
							frame.setVisible(true);
							dispose(); //LoginPage will disappear
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again or reset it.");
						}
					}
					
					else if(rdbtnStaff.isSelected()) {
						if(textField_username.getText().equals("cherrystaff") && passwordField.getText().equals("cherrystaff123")) {
							JOptionPane.showMessageDialog(null, "Login successfully.");
							
							//calling another frame -> Staff_HomePage
							Staff_HomePage frame = new Staff_HomePage();
							frame.setModalExclusionType(null);
							frame.setVisible(true);
							dispose(); //LoginPage will disappear
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again or reset it.");
						}
					}
				} 
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again or reset it.");
				}
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_username.setText("");
				passwordField.setText("");
				rdbtnCustomer.setSelected(false);
				rdbtnStaff.setSelected(false);
			}
		});
	}
}
