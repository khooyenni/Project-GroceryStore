package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class AdvertisementAndMarketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementAndMarketing frame = new AdvertisementAndMarketing();
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
	public AdvertisementAndMarketing() {
		setBackground(new Color(255, 240, 245));
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdvertisementAndMarketing.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setTitle("Cherry On Top Bakery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		
		JLabel lblAdvertisement = new JLabel("- ADVERTISEMENT -");
		lblAdvertisement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvertisement.setForeground(new Color(160, 82, 45));
		lblAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblAdvertisement.setBounds(321, 16, 295, 27);
		panel.add(lblAdvertisement);
		
		JLabel lblGreetings1 = new JLabel("Hi there!");
		lblGreetings1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreetings1.setForeground(new Color(139, 69, 19));
		lblGreetings1.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblGreetings1.setBounds(228, 64, 476, 27);
		panel.add(lblGreetings1);
		
		JLabel lblGreetings2 = new JLabel("Here are some special for you!");
		lblGreetings2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreetings2.setForeground(new Color(139, 69, 19));
		lblGreetings2.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblGreetings2.setBounds(228, 92, 476, 27);
		panel.add(lblGreetings2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(81, 135, 779, 47);
		panel.add(panel_1);
		
		JLabel lblDiscount = new JLabel("1. Discount for orders over RM30 and above!");
		lblDiscount.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblDiscount.setBounds(15, 0, 420, 46);
		panel_1.add(lblDiscount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setBounds(81, 194, 779, 47);
		panel.add(panel_2);
		
		JLabel lblFreeBun = new JLabel("2. Free 1 Mexico Coffee Bun for you if self pick up order!");
		lblFreeBun.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblFreeBun.setBounds(15, 0, 534, 46);
		panel_2.add(lblFreeBun);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_3.setBackground(new Color(255, 250, 250));
		panel_3.setBounds(81, 257, 779, 47);
		panel.add(panel_3);
		
		JLabel lblVoucher = new JLabel("3. Every purchase will get a 5% voucher for your next purchase! No minimun spend!");
		lblVoucher.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblVoucher.setBounds(15, 0, 724, 46);
		panel_3.add(lblVoucher);
		
		JLabel lblFollowUs = new JLabel("Follow us on social media!");
		lblFollowUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblFollowUs.setForeground(new Color(139, 69, 19));
		lblFollowUs.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblFollowUs.setBounds(236, 329, 476, 27);
		panel.add(lblFollowUs);
		
		JLabel lblKeepUpTo = new JLabel("Keep up to date with our latest updates!");
		lblKeepUpTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeepUpTo.setForeground(new Color(139, 69, 19));
		lblKeepUpTo.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblKeepUpTo.setBounds(236, 356, 476, 27);
		panel.add(lblKeepUpTo);
		
		JLabel lblFacebookIcon = new JLabel("");
		lblFacebookIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebookIcon.setIcon(new ImageIcon(AdvertisementAndMarketing.class.getResource("/BakeryIcons/icon facebook.png")));
		lblFacebookIcon.setBounds(148, 399, 72, 47);
		panel.add(lblFacebookIcon);
		
		JLabel lblInstagramIcon = new JLabel("");
		lblInstagramIcon.setIcon(new ImageIcon(AdvertisementAndMarketing.class.getResource("/BakeryIcons/icon instagram.png")));
		lblInstagramIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstagramIcon.setBounds(427, 395, 79, 47);
		panel.add(lblInstagramIcon);
		
		JLabel lblTikTokIcon = new JLabel("");
		lblTikTokIcon.setIcon(new ImageIcon(AdvertisementAndMarketing.class.getResource("/BakeryIcons/icon tiktok.png")));
		lblTikTokIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTikTokIcon.setBounds(726, 399, 66, 47);
		panel.add(lblTikTokIcon);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_4.setBackground(new Color(255, 250, 250));
		panel_4.setBounds(81, 451, 208, 59);
		panel.add(panel_4);
		
		JLabel lblFacebook = new JLabel("Cherry On Top Bakery");
		lblFacebook.setBounds(15, 0, 178, 59);
		panel_4.add(lblFacebook);
		lblFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebook.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_5.setBackground(new Color(255, 250, 250));
		panel_5.setBounds(361, 447, 208, 59);
		panel.add(panel_5);
		
		JLabel lblInstagram = new JLabel("@cherryontopbakery");
		lblInstagram.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstagram.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblInstagram.setBounds(15, 0, 178, 59);
		panel_5.add(lblInstagram);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_6.setBackground(new Color(255, 250, 250));
		panel_6.setBounds(652, 450, 208, 59);
		panel.add(panel_6);
		
		JLabel lblTiktok = new JLabel("@cherryontopbakery");
		lblTiktok.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiktok.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblTiktok.setBounds(15, 0, 178, 59);
		panel_6.add(lblTiktok);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(AdvertisementAndMarketing.class.getResource("/BakeryIcons/4 back icon lavenderbrush.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(15, 12, 59, 31);
		panel.add(menuBar);
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 240, 245));
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 240, 245));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.setBackground(new Color(255, 240, 245));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setBackground(new Color(255, 240, 245));
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setBackground(new Color(255, 240, 245));
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setBackground(new Color(255, 240, 245));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("Our Products");
		mntmOurProducts.setBackground(new Color(255, 240, 245));
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
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
				dispose(); //AdvertisementAndMarketing will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Advertisement", 
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
