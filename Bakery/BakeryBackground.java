package Bakery;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class BakeryBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BakeryBackground frame = new BakeryBackground();
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
	public BakeryBackground() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(BakeryBackground.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setTitle("Cherry On Top Bakery");
		setBackground(new Color(255, 240, 245));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCherrylogo = new JLabel("");
		lblCherrylogo.setIcon(new ImageIcon(BakeryBackground.class.getResource("/BakeryIcons/Cherry Logo 2.png")));
		lblCherrylogo.setBounds(443, 16, 50, 50);
		contentPane.add(lblCherrylogo);
		
		JLabel lblBakery = new JLabel("Cherry On Top Bakery");
		lblBakery.setHorizontalAlignment(SwingConstants.CENTER);
		lblBakery.setForeground(new Color(139, 69, 19));
		lblBakery.setFont(new Font("Gabriola", Font.BOLD, 42));
		lblBakery.setBounds(217, 56, 510, 89);
		contentPane.add(lblBakery);
		
		JLabel lblPremium = new JLabel("P R E M I U M   F R E S H L Y   B A K E D");
		lblPremium.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremium.setForeground(new Color(160, 82, 45));
		lblPremium.setFont(new Font("Dubai", Font.PLAIN, 13));
		lblPremium.setBounds(325, 125, 295, 27);
		contentPane.add(lblPremium);
		
		JLabel lblAboutUs = new JLabel("About us");
		lblAboutUs.setForeground(new Color(139, 69, 19));
		lblAboutUs.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblAboutUs.setBounds(156, 161, 131, 27);
		contentPane.add(lblAboutUs);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel.setBounds(156, 193, 633, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAbout1 = new JLabel("Our bakery was established in 2021.");
		lblAbout1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblAbout1.setBounds(15, 16, 420, 30);
		panel.add(lblAbout1);
		
		JLabel lblAbout2 = new JLabel("Now, we are based in Perak, Malaysia.");
		lblAbout2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblAbout2.setBounds(15, 49, 420, 37);
		panel.add(lblAbout2);
		
		JLabel lblContactUs = new JLabel("Contact us");
		lblContactUs.setForeground(new Color(139, 69, 19));
		lblContactUs.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblContactUs.setBounds(156, 314, 131, 27);
		contentPane.add(lblContactUs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(156, 346, 633, 102);
		contentPane.add(panel_1);
		
		JLabel lblContactNum = new JLabel("Contact number : 05-8903253");
		lblContactNum.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblContactNum.setBounds(15, 16, 420, 30);
		panel_1.add(lblContactNum);
		
		JLabel lblWebsite = new JLabel("Website               : www.cherryontopbakery.com");
		lblWebsite.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblWebsite.setBounds(15, 49, 420, 37);
		panel_1.add(lblWebsite);
		
		JLabel lblSlogan = new JLabel("Baked with love. Let us be the Cherry On Top of your day!");
		lblSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlogan.setForeground(new Color(160, 82, 45));
		lblSlogan.setFont(new Font("Gabriola", Font.ITALIC, 25));
		lblSlogan.setBounds(178, 468, 580, 38);
		contentPane.add(lblSlogan);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(BakeryBackground.class.getResource("/BakeryIcons/4 back icon lavenderbrush.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 10, 28, 28);
		contentPane.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 240, 245));
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBounds(15, 10, 59, 31);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 16));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setBackground(new Color(255, 250, 250));
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setBackground(new Color(255, 240, 245));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAboutUs.setBackground(new Color(255, 240, 245));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setBackground(new Color(255, 240, 245));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("Our Products");
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOurProducts.setBackground(new Color(255, 240, 245));
		mnHome.add(mntmOurProducts);
		
		JMenuItem mntmOrderHere = new JMenuItem("Order Here");
		mntmOrderHere.setForeground(new Color(139, 69, 19));
		mntmOrderHere.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOrderHere.setBackground(new Color(255, 240, 245));
		mnHome.add(mntmOrderHere);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to home page frame -> Customer_HomePage
				Customer_HomePage frame = new Customer_HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //BakeryBackground will disappear
				
			}
		});

		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "About Us", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					
					frame.setVisible(true);
					dispose();
				}
			}
		});
		
		mntmCHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer_HomePage frame = new Customer_HomePage();
				frame.setVisible(true);
				dispose();
			}
		});

		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BakeryBackground frame = new BakeryBackground();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementAndMarketing frame = new AdvertisementAndMarketing();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmOurProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription frame = new ProductDescription();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmOrderHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_RegistrationPage frame = new Customer_RegistrationPage();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Cherry On Top Bakery", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
