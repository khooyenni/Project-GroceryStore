package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class Staff_HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_HomePage frame = new Staff_HomePage();
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
	public Staff_HomePage() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Staff_HomePage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setTitle("Cherry On Top Bakery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCherrylogo = new JLabel("");
		lblCherrylogo.setIcon(new ImageIcon(Staff_HomePage.class.getResource("/BakeryIcons/Cherry Logo 3.png")));
		lblCherrylogo.setBounds(443, 34, 50, 50);
		contentPane.add(lblCherrylogo);
		
		JLabel lblBakery = new JLabel("Cherry On Top Bakery");
		lblBakery.setHorizontalAlignment(SwingConstants.CENTER);
		lblBakery.setForeground(new Color(139, 69, 19));
		lblBakery.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblBakery.setBounds(212, 78, 510, 89);
		contentPane.add(lblBakery);
		
		JLabel lblStaffPage = new JLabel("STAFF PAGE");
		lblStaffPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffPage.setForeground(new Color(160, 82, 45));
		lblStaffPage.setFont(new Font("Dubai", Font.PLAIN, 22));
		lblStaffPage.setBounds(325, 161, 295, 27);
		contentPane.add(lblStaffPage);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.setForeground(new Color(255, 250, 250));
		btnInventory.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnInventory.setBackground(new Color(188, 143, 143));
		btnInventory.setBounds(543, 252, 197, 63);
		contentPane.add(btnInventory);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setForeground(new Color(255, 250, 250));
		btnEmployee.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnEmployee.setBackground(new Color(188, 143, 143));
		btnEmployee.setBounds(200, 376, 197, 63);
		contentPane.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.setForeground(new Color(255, 250, 250));
		btnFinance.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnFinance.setBackground(new Color(188, 143, 143));
		btnFinance.setBounds(543, 376, 197, 63);
		contentPane.add(btnFinance);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Staff_HomePage.class.getResource("/BakeryIcons/3 back icon ivory.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		contentPane.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 255, 240));
		menuBar.setBounds(15, 13, 59, 31);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 255, 240));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mnHome);
		
		JMenuItem mntmSHome = new JMenuItem("Home");
		mntmSHome.setBackground(new Color(255, 255, 240));
		mntmSHome.setForeground(new Color(139, 69, 19));
		mntmSHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(255, 255, 240));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmInventory.setBackground(new Color(255, 255, 240));
		mnHome.add(mntmInventory);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.setBackground(new Color(255, 255, 240));
		mntmEmployee.setForeground(new Color(139, 69, 19));
		mntmEmployee.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmEmployee);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.setForeground(new Color(139, 69, 19));
		mntmFinance.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmFinance.setBackground(new Color(255, 255, 240));
		mnHome.add(mntmFinance);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setForeground(new Color(255, 250, 250));
		btnProduct.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnProduct.setBackground(new Color(188, 143, 143));
		btnProduct.setBounds(200, 252, 197, 63);
		contentPane.add(btnProduct);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//

		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductsPriceManage frame = new ProductsPriceManage();
				frame.setVisible(true);
				dispose();
			}
		});

		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//calling another frame -> Inventory
				Inventory frame = new Inventory();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Staff_HomePage will disappear
			}
		});
		
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//calling another frame -> EmployeeManagementAuthority
				EmployeeManagementAuthority frame = new EmployeeManagementAuthority();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Staff_HomePage will disappear
			}
		});
		
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//calling another frame -> Finance
				Finance frame = new Finance();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Staff_HomePage will disappear
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to another frame -> LoginPage
				LoginPage frame = new LoginPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Staff_HomePage will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Staff Home Page", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					
					frame.setVisible(true);
					dispose();
				}
			}
		});
		
		mntmSHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Staff_HomePage frame = new Staff_HomePage();
				frame.setVisible(true);
				dispose();
			}
		});

		mntmProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductsPriceManage frame = new ProductsPriceManage();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory frame = new Inventory();
				frame.setVisible(true);
				dispose();
			}
		});

		mntmEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagementAuthority frame = new EmployeeManagementAuthority();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
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
