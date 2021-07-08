package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
				dispose();
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		btnLogin.setBounds(372, 479, 224, 47);
		contentPane.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(181, 52, 670, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToKyn = new JLabel("Welcome to KYN Grocery Store");
		lblWelcomeToKyn.setForeground(new Color(0, 0, 0));
		lblWelcomeToKyn.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		lblWelcomeToKyn.setBounds(14, 13, 637, 72);
		panel.add(lblWelcomeToKyn);
		
		JLabel lblNewLabelWelcome = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/panda.gif")).getImage();
		lblNewLabelWelcome.setIcon(new ImageIcon(photo7));
		lblNewLabelWelcome.setBounds(334, 170, 342, 276);
		contentPane.add(lblNewLabelWelcome);
		
		JLabel lblBackground = new JLabel("New label");
		Image photo = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/GroceryBackgroundn.jpg")).getImage();
		Image n1photo = photo.getScaledInstance(1013, 605, 150);
		lblBackground.setIcon(new ImageIcon(n1photo));
		lblBackground.setBounds(0, 0, 1013, 605);
		contentPane.add(lblBackground);
		
	}
}
