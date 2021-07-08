package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 621);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(238, 130, 238), 3));
		panel.setBackground(new Color(255, 192, 203));
		panel.setBounds(28, 31, 407, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER HOME PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 383, 51);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(485, 0, 419, 574);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel image = new JLabel("image");
		image.setBounds(0, 0, 419, 574);
		panel_1.add(image);
		image.setIcon(new ImageIcon(UserHomePage.class.getResource("/ProduceIcons/pink-home.jpg")));
		
		JButton storeBackground = new JButton("Store Background");
		storeBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreBackground bg=new StoreBackground();
				bg.setModalExclusionType(null);
				bg.setVisible(true);
				dispose();
			}
		});
		storeBackground.setBackground(new Color(255, 182, 193));
		storeBackground.setForeground(new Color(255, 255, 255));
		storeBackground.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		storeBackground.setBounds(53, 121, 365, 63);
		contentPane.add(storeBackground);
		
		JButton btnProductDescription = new JButton("Product Description");
		btnProductDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription product=new ProductDescription();
				product.setModalExclusionType(null);
				product.setVisible(true);
				dispose();
			}
		});
		btnProductDescription.setForeground(Color.WHITE);
		btnProductDescription.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnProductDescription.setBackground(new Color(255, 182, 193));
		btnProductDescription.setBounds(53, 213, 365, 63);
		contentPane.add(btnProductDescription);
		
		JButton btnCustomerRegistration = new JButton("Customer Registration");
		btnCustomerRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration cus=new CustomerRegistration();
				cus.setModalExclusionType(null);
				cus.setVisible(true);
				dispose();
			}
		});
		btnCustomerRegistration.setForeground(Color.WHITE);
		btnCustomerRegistration.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnCustomerRegistration.setBackground(new Color(255, 182, 193));
		btnCustomerRegistration.setBounds(53, 300, 365, 63);
		contentPane.add(btnCustomerRegistration);
		
		JButton btnAdvertisementAndMarketing = new JButton("Advertisement and Marketing");
		btnAdvertisementAndMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementnMarketing ad=new AdvertisementnMarketing();
				ad.setModalExclusionType(null);
				ad.setVisible(true);
				dispose();
			}
		});
		btnAdvertisementAndMarketing.setForeground(Color.WHITE);
		btnAdvertisementAndMarketing.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnAdvertisementAndMarketing.setBackground(new Color(255, 182, 193));
		btnAdvertisementAndMarketing.setBounds(53, 383, 365, 63);
		contentPane.add(btnAdvertisementAndMarketing);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login=new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
				
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 182, 193));
		btnBack.setBounds(319, 494, 116, 54);
		contentPane.add(btnBack);
		
		setTitle("USER HOME PAGE");
	}

}
