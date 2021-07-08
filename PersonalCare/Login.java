package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import java.awt.Choice;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField UserNametextField;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setBackground(Color.WHITE);
		setTitle("KYN Grocery Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JPanel panel = new JPanel();
		panel.setBounds(98, 186, 953, 360);
		contentPane.add(panel);
		panel.setBackground(new Color(255, 250, 240));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.setLayout(null);
		
		
		JRadioButton AdminNewRadioButton = new JRadioButton("Admin");
		AdminNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		AdminNewRadioButton.setBounds(573, 29, 297, 47);
		panel.add(AdminNewRadioButton);
		buttonGroup.add(AdminNewRadioButton);
		AdminNewRadioButton.setBackground(new Color(255, 250, 240));
		
		JRadioButton CustomerNewRadioButton = new JRadioButton("Customer");
		CustomerNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		CustomerNewRadioButton.setBounds(363, 29, 211, 47);
		panel.add(CustomerNewRadioButton);
		buttonGroup.add(CustomerNewRadioButton);
		CustomerNewRadioButton.setBackground(new Color(255, 250, 240));
		
		JLabel SelectLabel = new JLabel("Please select one:");
		SelectLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		SelectLabel.setBounds(53, 33, 289, 39);
		panel.add(SelectLabel);
		
		JLabel UserNameLabel = new JLabel("User Name");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Username.png")).getImage();
		Image n1photo = photo1.getScaledInstance(60, 60, 150);
		UserNameLabel.setIcon(new ImageIcon(n1photo));
		UserNameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		UserNameLabel.setBounds(97, 105, 264, 65);
		panel.add(UserNameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		Image photo2 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Password.png")).getImage();
		Image n2photo = photo2.getScaledInstance(60, 60, 150);
		PasswordLabel.setIcon(new ImageIcon(n2photo));
		PasswordLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		PasswordLabel.setBounds(97, 181, 206, 45);
		panel.add(PasswordLabel);
		
		
		UserNametextField = new JTextField();
		UserNametextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		UserNametextField.setBounds(354, 114, 276, 47);
		panel.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (AdminNewRadioButton.isSelected()) {
						if(UserNametextField.getText().equals("admin567") && passwordField.getText().equals("abc")) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							
							AdminHomePage AdminHome = new AdminHomePage(); //calling another frame/window
							AdminHome.setModalExclusionType(null);
							AdminHome.setVisible(true);
					
							
						}else
							JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}
					else if(CustomerNewRadioButton.isSelected()) {
						if(UserNametextField.getText().equals("user567") && passwordField.getText().equals("abc")) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							
							UserHomePage UserHome = new UserHomePage(); //calling another frame/window
							UserHome.setModalExclusionType(null);
					        UserHome.setVisible(true);
							
						
						}else
							JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}else {
						JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
				}
		
			}
	
		});
		LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		LoginButton.setBackground(new Color(230, 230, 250));
		LoginButton.setForeground(new Color(0, 0, 0));
		LoginButton.setBounds(219, 276, 197, 47);
		panel.add(LoginButton);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonGroup.clearSelection();
				UserNametextField.setText("");
				passwordField.setText("");
				
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ResetButton.setForeground(Color.BLACK);
		ResetButton.setBackground(new Color(230, 230, 250));
		ResetButton.setBounds(480, 276, 197, 47);
		panel.add(ResetButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		passwordField.setBounds(354, 183, 276, 47);
		panel.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('\u2022');
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		rdbtnNewRadioButton.setBackground(new Color(255, 250, 240));
		rdbtnNewRadioButton.setBounds(640, 180, 297, 47);
		panel.add(rdbtnNewRadioButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(415, 44, 256, 124);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBackground(new Color(255, 192, 203));
		
		JLabel TitleLabel = new JLabel("Login");
		TitleLabel.setForeground(new Color(0, 0, 0));
		TitleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
		TitleLabel.setBounds(120, 33, 246, 63);
		panel_1.add(TitleLabel);
		
		JLabel lblNewLabelLoginNPass = new JLabel("");
		lblNewLabelLoginNPass.setBounds(19, 16, 172, 90);
		panel_1.add(lblNewLabelLoginNPass);
		Image photo3 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/user-login.png")).getImage();
		Image n3photo = photo3.getScaledInstance(90, 90, 150);
		lblNewLabelLoginNPass.setIcon(new ImageIcon(n3photo));
		
		JLabel lblNewLabelBackground = new JLabel("");
		lblNewLabelBackground.setBounds(0, 0, 1119, 607);
		contentPane.add(lblNewLabelBackground);
		Image photo4 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background16.jpg")).getImage();
		Image n4photo = photo4.getScaledInstance(1119, 607, 150);
		lblNewLabelBackground.setIcon(new ImageIcon(n4photo));
		
	}
}
