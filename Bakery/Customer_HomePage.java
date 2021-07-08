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
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Customer_HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_HomePage frame = new Customer_HomePage();
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
	public Customer_HomePage() {
		setBackground(new Color(255, 228, 225));
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Customer_HomePage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setTitle("Cherry On Top Bakery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCherrylogo = new JLabel("");
		lblCherrylogo.setIcon(new ImageIcon(Customer_HomePage.class.getResource("/BakeryIcons/Cherry Logo 1.png")));
		lblCherrylogo.setBounds(424, 28, 50, 50);
		contentPane.add(lblCherrylogo);
		
		JLabel lblBakery = new JLabel("Cherry On Top Bakery");
		lblBakery.setHorizontalAlignment(SwingConstants.CENTER);
		lblBakery.setForeground(new Color(139, 69, 19));
		lblBakery.setFont(new Font("Gabriola", Font.BOLD, 42));
		lblBakery.setBounds(198, 68, 510, 89);
		contentPane.add(lblBakery);
		
		JLabel lblPremium = new JLabel("P R E M I U M   F R E S H L Y   B A K E D");
		lblPremium.setHorizontalAlignment(SwingConstants.CENTER);
		lblPremium.setForeground(new Color(160, 82, 45));
		lblPremium.setFont(new Font("Dubai", Font.PLAIN, 13));
		lblPremium.setBounds(306, 141, 295, 27);
		contentPane.add(lblPremium);
		
		JLabel lblSlogan = new JLabel("Baked with love. Let us be the Cherry On Top of your day!");
		lblSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlogan.setForeground(new Color(160, 82, 45));
		lblSlogan.setFont(new Font("Gabriola", Font.ITALIC, 23));
		lblSlogan.setBounds(240, 475, 457, 27);
		contentPane.add(lblSlogan);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.setBounds(176, 227, 228, 68);
		contentPane.add(btnAboutUs);
		btnAboutUs.setForeground(new Color(139, 69, 19));
		btnAboutUs.setBackground(new Color(255, 240, 245));
		btnAboutUs.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		
		JButton btnAd = new JButton("Advertisement");
		btnAd.setForeground(new Color(139, 69, 19));
		btnAd.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnAd.setBackground(new Color(255, 240, 245));
		btnAd.setBounds(506, 227, 228, 68);
		contentPane.add(btnAd);
		
		JButton btnProduct = new JButton("Our Products");
		btnProduct.setForeground(new Color(139, 69, 19));
		btnProduct.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnProduct.setBackground(new Color(255, 240, 245));
		btnProduct.setBounds(176, 332, 228, 68);
		contentPane.add(btnProduct);
		
		JButton btnOrder = new JButton("Order Here");
		btnOrder.setForeground(new Color(139, 69, 19));
		btnOrder.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnOrder.setBackground(new Color(255, 240, 245));
		btnOrder.setBounds(506, 332, 228, 68);
		contentPane.add(btnOrder);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Customer_HomePage.class.getResource("/BakeryIcons/2 back icon mistyrose.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		contentPane.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 228, 225));
		menuBar.setBounds(15, 13, 59, 31);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 228, 225));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setBackground(new Color(255, 228, 225));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setBackground(new Color(255, 228, 225));
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mntmAboutUs.setBackground(new Color(255, 228, 225));
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setBackground(new Color(255, 228, 225));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("Our Products");
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setBackground(new Color(255, 228, 225));
		mnHome.add(mntmOurProducts);
		
		JMenuItem mntmOrderHere = new JMenuItem("Order Here");
		mntmOrderHere.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOrderHere.setForeground(new Color(139, 69, 19));
		mntmOrderHere.setBackground(new Color(255, 228, 225));
		mnHome.add(mntmOrderHere);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//
		
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling another frame -> BakeryBackground
				BakeryBackground frame = new BakeryBackground();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_HomePage will disappear
			}
		});
		
		btnAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calling another frame -> AdvertisementAndMarketing
				AdvertisementAndMarketing frame = new AdvertisementAndMarketing();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_HomePage will disappear
			}
		});
		
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calling another frame -> ProductDescription
				ProductDescription frame = new ProductDescription();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_HomePage will disappear
			}
		});

		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calling another frame -> Customer_RegistrationPage
				Customer_RegistrationPage frame = new Customer_RegistrationPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_HomePage will disappear
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to another frame -> LoginPage
				LoginPage frame = new LoginPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_HomePage will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Home", 
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
