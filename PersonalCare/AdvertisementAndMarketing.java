package PersonalCare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
		setTitle("KYN Grocery Strore");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdvertisementAndMarketing.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 743);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage UserHome = new UserHomePage(); //calling another frame/window
				UserHome.setModalExclusionType(null);
				UserHome.setVisible(true);

			}
		});
		mnHome.add(mntmMainMenu);
		
		JMenu mnAboutUs = new JMenu("About Us");
		menuBar.add(mnAboutUs);
		
		JMenuItem mntmCompanyBackground = new JMenuItem("Company Background");
		mntmCompanyBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CBackground = new CompanyBackground(); //calling another frame/window
				CBackground.setModalExclusionType(null);
				CBackground.setVisible(true);

			}
		});
		mnAboutUs.add(mntmCompanyBackground);
		
		JMenuItem MenuItemProduct = new JMenuItem("Product");
		MenuItemProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription ProductDes = new ProductDescription(); //calling another frame/window
				ProductDes.setModalExclusionType(null);
				ProductDes.setVisible(true);
			}
		});
		mnAboutUs.add(MenuItemProduct);
		
		JMenu mnRegister = new JMenu("Register");
		menuBar.add(mnRegister);
		
		JMenuItem mntmCustomerRegistration = new JMenuItem("Customer Registration");
		mntmCustomerRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration cus = new CustomerRegistration(); //calling another frame/window
				cus.setModalExclusionType(null);
				cus.setVisible(true);
			}
		});
		mnRegister.add(mntmCustomerRegistration);
		
		JMenu mnNewMenu_1 = new JMenu("Promotion");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Advertisement");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementAndMarketing adv = new AdvertisementAndMarketing(); //calling another frame/window
				adv.setModalExclusionType(null);
				adv.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu MenuOrder = new JMenu("Order");
		menuBar.add(MenuOrder);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Place Order");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceOrder POrder = new PlaceOrder(); //calling another frame/window
				POrder.setModalExclusionType(null);
				POrder.setVisible(true);
			}
		});
		MenuOrder.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Exit");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to log out?", "Order", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login log = new Login(); //calling another frame/window
					log.setModalExclusionType(null);
					log.setVisible(true);
				}
			}
		});
		mnNewMenu.add(mntmLogOut);
		
		JMenuItem mntmNewMenuItemExit = new JMenuItem("Exit");
		mntmNewMenuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to exit?", "Order", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItemExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setBorder(new LineBorder(Color.BLACK, 5));
		panel.setBounds(170, 248, 713, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textAreaCompany = new JTextArea();
		textAreaCompany.setEditable(false);
		textAreaCompany.setBackground(new Color(253, 245, 230));
		textAreaCompany.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		textAreaCompany.setBounds(10, 12, 693, 269);
		panel.add(textAreaCompany);
		textAreaCompany.setText("\t      KYN Grocery Store\r\n\r\n            Free Shipping with no min spend. \r\n         Free gift for order RM100 and above.\r\n   Get a discount for pick up or delivery order.\r\n        Get a RM10 voucher for next purchase.");
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(160, 87, 731, 116);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBackground(new Color(255, 192, 203));
		
		JLabel AdvertisementAndMarketingLabel = new JLabel("Advertisement and Marketing");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/loudspeaker.png")).getImage();
		Image n1photo = photo1.getScaledInstance(100, 100, 100);
		AdvertisementAndMarketingLabel.setForeground(new Color(0, 0, 0));
		AdvertisementAndMarketingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdvertisementAndMarketingLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		AdvertisementAndMarketingLabel.setBounds(12, 19, 710, 77);
		panel_1.add(AdvertisementAndMarketingLabel);
		
		JLabel CompanyLabel = new JLabel("");
		CompanyLabel.setBounds(49, 86, 120, 105);
		contentPane.add(CompanyLabel);
		CompanyLabel.setIcon(new ImageIcon(n1photo));
		
		JLabel lblPresent2 = new JLabel("");
		Image photo3 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Present2.png")).getImage();
		Image n3photo = photo3.getScaledInstance(120, 120, 150);
		lblPresent2.setIcon(new ImageIcon(n3photo));
		lblPresent2.setBounds(31, 442, 112, 127);
		contentPane.add(lblPresent2);
	
		
		JLabel lblNewLabelFree = new JLabel("");
		Image photo5 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/free-delivery.png")).getImage();
		Image n5photo = photo5.getScaledInstance(150, 150, 150);
		lblNewLabelFree.setIcon(new ImageIcon(n5photo));
		lblNewLabelFree.setBounds(894, 454, 149, 127);
		contentPane.add(lblNewLabelFree);
		
		JLabel lblNewLabelBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background7.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1092, 767, 150);
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(0, 0, 1048, 621);
		contentPane.add(lblNewLabelBackground);
		
		

		
	}
}