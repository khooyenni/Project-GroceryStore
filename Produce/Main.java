package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 458, 585);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel image = new JLabel("image");
		image.setBounds(0, 0, 459, 585);
		panel.add(image);
		image.setIcon(new ImageIcon(Main.class.getResource("/ProduceIcons/grocerystore (3).jpg")));
		
		JLabel logo = new JLabel("logo");
		logo.setBounds(573, 31, 248, 257);
		contentPane.add(logo);
		logo.setIcon(new ImageIcon(Main.class.getResource("/ProduceIcons/naturelogowithoutbg.png")));
		
		JLabel lblNewLabel = new JLabel("Buy groceries and feed yourself");
		lblNewLabel.setFont(new Font("Blackadder ITC", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(233, 150, 122));
		lblNewLabel.setBounds(486, 330, 446, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Even on the road");
		lblNewLabel_1.setFont(new Font("Blackadder ITC", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(new Color(233, 150, 122));
		lblNewLabel_1.setBounds(486, 407, 374, 48);
		contentPane.add(lblNewLabel_1);
		
		JButton welcomeButton = new JButton("WELCOME");
		welcomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login welcome = new Login();
				welcome.setModalExclusionType(null);
				welcome.setVisible(true);
				dispose();
			}
		});
		welcomeButton.setBackground(new Color(255, 182, 193));
		welcomeButton.setFont(new Font("Century751 No2 BT", Font.BOLD, 24));
		welcomeButton.setForeground(new Color(245, 255, 250));
		welcomeButton.setBounds(604, 480, 199, 61);
		contentPane.add(welcomeButton);
		
		setTitle("Nature Paradise Grocery Store");
	}
}
