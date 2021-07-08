package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class ProductsPriceManage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBun_MexicanCoffee;
	private JTextField textFieldBun_HamCheese;
	private JTextField textFieldBun_RedBean;
	private JTextField textFieldTart_Portuguese;
	private JTextField textFieldTart_ChocoAlmond;
	private JTextField textFieldTart_Blueberry;
	private JTextField textFieldCake_HokkaidoCheese;
	private JTextField textFieldCake_MoistChoco;
	private JTextField textFieldCake_Matcha;
	protected static double priceBun_MexicanCoffee, priceBun_HamCheese, priceBun_RedBean;
	protected static double priceTart_Portuguese, priceTart_ChocoAlmond, priceTart_Blueberry;
	protected static double priceCake_HokkaidoCheese, priceCake_MoistChoco, priceCake_Matcha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductsPriceManage frame = new ProductsPriceManage();
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
	public ProductsPriceManage() {
		setTitle("Cherry On Top Bakery");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductsPriceManage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setBackground(new Color(245, 245, 220));
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductsPrice = new JLabel("Products Price Management");
		lblProductsPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductsPrice.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblProductsPrice.setForeground(new Color(139, 69, 19));
		lblProductsPrice.setBounds(248, 29, 456, 52);
		panel.add(lblProductsPrice);
		
		JLabel lblBun = new JLabel("Bun");
		lblBun.setHorizontalAlignment(SwingConstants.CENTER);
		lblBun.setForeground(new Color(139, 69, 19));
		lblBun.setFont(new Font("Dubai", Font.BOLD, 25));
		lblBun.setBounds(125, 114, 79, 31);
		panel.add(lblBun);
		
		JLabel lblTart = new JLabel("Tart");
		lblTart.setHorizontalAlignment(SwingConstants.CENTER);
		lblTart.setFont(new Font("Dubai", Font.BOLD, 25));
		lblTart.setForeground(new Color(139, 69, 19));
		lblTart.setBounds(413, 114, 79, 31);
		panel.add(lblTart);
		
		JLabel lblCake = new JLabel("Cake");
		lblCake.setHorizontalAlignment(SwingConstants.CENTER);
		lblCake.setForeground(new Color(139, 69, 19));
		lblCake.setFont(new Font("Dubai", Font.BOLD, 25));
		lblCake.setBounds(718, 114, 79, 31);
		panel.add(lblCake);
		
		textFieldBun_MexicanCoffee = new JTextField();
		textFieldBun_MexicanCoffee.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldBun_MexicanCoffee.setBounds(92, 199, 181, 31);
		panel.add(textFieldBun_MexicanCoffee);
		textFieldBun_MexicanCoffee.setColumns(10);
		
		textFieldBun_HamCheese = new JTextField();
		textFieldBun_HamCheese.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldBun_HamCheese.setBounds(92, 296, 181, 31);
		panel.add(textFieldBun_HamCheese);
		textFieldBun_HamCheese.setColumns(10);
		
		textFieldBun_RedBean = new JTextField();
		textFieldBun_RedBean.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldBun_RedBean.setBounds(92, 388, 181, 31);
		panel.add(textFieldBun_RedBean);
		textFieldBun_RedBean.setColumns(10);
		
		textFieldTart_Portuguese = new JTextField();
		textFieldTart_Portuguese.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldTart_Portuguese.setColumns(10);
		textFieldTart_Portuguese.setBounds(382, 199, 181, 31);
		panel.add(textFieldTart_Portuguese);
		
		textFieldTart_ChocoAlmond = new JTextField();
		textFieldTart_ChocoAlmond.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldTart_ChocoAlmond.setColumns(10);
		textFieldTart_ChocoAlmond.setBounds(382, 296, 181, 31);
		panel.add(textFieldTart_ChocoAlmond);
		
		textFieldTart_Blueberry = new JTextField();
		textFieldTart_Blueberry.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldTart_Blueberry.setColumns(10);
		textFieldTart_Blueberry.setBounds(382, 388, 181, 31);
		panel.add(textFieldTart_Blueberry);
		
		textFieldCake_HokkaidoCheese = new JTextField();
		textFieldCake_HokkaidoCheese.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldCake_HokkaidoCheese.setColumns(10);
		textFieldCake_HokkaidoCheese.setBounds(673, 199, 212, 31);
		panel.add(textFieldCake_HokkaidoCheese);
		
		textFieldCake_MoistChoco = new JTextField();
		textFieldCake_MoistChoco.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldCake_MoistChoco.setColumns(10);
		textFieldCake_MoistChoco.setBounds(673, 296, 212, 31);
		panel.add(textFieldCake_MoistChoco);
		
		textFieldCake_Matcha = new JTextField();
		textFieldCake_Matcha.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textFieldCake_Matcha.setColumns(10);
		textFieldCake_Matcha.setBounds(673, 388, 212, 31);
		panel.add(textFieldCake_Matcha);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(new Color(230, 230, 250));
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBounds(413, 466, 125, 40);
		panel.add(btnUpdate);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(245, 245, 220));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(245, 245, 220));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.setForeground(new Color(139, 69, 19));
		mnMenu.add(mnHome);
		
		JMenuItem mntmSHome = new JMenuItem("Home");
		mntmSHome.setForeground(new Color(139, 69, 19));
		mntmSHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmSHome.setBackground(new Color(245, 245, 220));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(245, 245, 220));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmInventory.setBackground(new Color(245, 245, 220));
		mnHome.add(mntmInventory);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmEmployee.setForeground(new Color(139, 69, 19));
		mntmEmployee.setBackground(new Color(245, 245, 220));
		mnHome.add(mntmEmployee);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.setForeground(new Color(139, 69, 19));
		mntmFinance.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmFinance.setBackground(new Color(245, 245, 220));
		mnHome.add(mntmFinance);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(ProductsPriceManage.class.getResource("/BakeryIcons/9 back icon beige.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		panel.add(btnBack);
		
		JLabel lblBun_MexicanCoffee = new JLabel("Mexican Coffee Bun");
		lblBun_MexicanCoffee.setForeground(new Color(139, 69, 19));
		lblBun_MexicanCoffee.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblBun_MexicanCoffee.setBounds(62, 162, 186, 34);
		panel.add(lblBun_MexicanCoffee);
		
		JLabel lblBun_HamCheese = new JLabel("Ham and Cheese Bun");
		lblBun_HamCheese.setForeground(new Color(139, 69, 19));
		lblBun_HamCheese.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblBun_HamCheese.setBounds(62, 260, 186, 34);
		panel.add(lblBun_HamCheese);
		
		JLabel lblBun_RedBean = new JLabel("Red Bean Bun");
		lblBun_RedBean.setForeground(new Color(139, 69, 19));
		lblBun_RedBean.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblBun_RedBean.setBounds(62, 355, 186, 34);
		panel.add(lblBun_RedBean);
		
		JLabel lblTart_Portuguese = new JLabel("Portuguese Egg Tart");
		lblTart_Portuguese.setForeground(new Color(139, 69, 19));
		lblTart_Portuguese.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTart_Portuguese.setBounds(352, 162, 186, 34);
		panel.add(lblTart_Portuguese);
		
		JLabel lblTart_ChocoAlmond = new JLabel("Chocolate Almond Tart");
		lblTart_ChocoAlmond.setForeground(new Color(139, 69, 19));
		lblTart_ChocoAlmond.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTart_ChocoAlmond.setBounds(352, 260, 192, 34);
		panel.add(lblTart_ChocoAlmond);
		
		JLabel lblTart_Blueberry = new JLabel("Blueberry Cheese Tart");
		lblTart_Blueberry.setForeground(new Color(139, 69, 19));
		lblTart_Blueberry.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTart_Blueberry.setBounds(352, 355, 186, 34);
		panel.add(lblTart_Blueberry);
		
		JLabel lblCake_HokkaidoCheese = new JLabel("Hokkaido Triple Cheese Cake");
		lblCake_HokkaidoCheese.setForeground(new Color(139, 69, 19));
		lblCake_HokkaidoCheese.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblCake_HokkaidoCheese.setBounds(640, 161, 245, 34);
		panel.add(lblCake_HokkaidoCheese);
		
		JLabel lblCake_MoistChoco = new JLabel("Moist Chocolate Cake");
		lblCake_MoistChoco.setForeground(new Color(139, 69, 19));
		lblCake_MoistChoco.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblCake_MoistChoco.setBounds(640, 260, 186, 34);
		panel.add(lblCake_MoistChoco);
		
		JLabel lblCake_Matcha = new JLabel("Matcha Ice Cream Cake");
		lblCake_Matcha.setForeground(new Color(139, 69, 19));
		lblCake_Matcha.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblCake_Matcha.setBounds(640, 355, 186, 34);
		panel.add(lblCake_Matcha);
		
		JLabel lblRM_1 = new JLabel("RM");
		lblRM_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_1.setBounds(15, 204, 69, 20);
		panel.add(lblRM_1);
		
		JLabel lblRM_2 = new JLabel("RM");
		lblRM_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_2.setBounds(15, 301, 69, 20);
		panel.add(lblRM_2);
		
		JLabel lblRM_3 = new JLabel("RM");
		lblRM_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_3.setBounds(15, 393, 69, 20);
		panel.add(lblRM_3);
		
		JLabel lblRM_4 = new JLabel("RM");
		lblRM_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_4.setBounds(304, 204, 69, 20);
		panel.add(lblRM_4);
		
		JLabel lblRM_5 = new JLabel("RM");
		lblRM_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_5.setBounds(304, 301, 69, 20);
		panel.add(lblRM_5);
		
		JLabel lblRM_6 = new JLabel("RM");
		lblRM_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_6.setBounds(304, 393, 69, 20);
		panel.add(lblRM_6);
		
		JLabel lblRM_7 = new JLabel("RM");
		lblRM_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_7.setBounds(596, 204, 69, 20);
		panel.add(lblRM_7);
		
		JLabel lblRM_8 = new JLabel("RM");
		lblRM_8.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_8.setBounds(596, 301, 69, 20);
		panel.add(lblRM_8);
		
		JLabel lblRM_9 = new JLabel("RM");
		lblRM_9.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblRM_9.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM_9.setBounds(596, 393, 69, 20);
		panel.add(lblRM_9);

		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				priceBun_MexicanCoffee = Double.parseDouble(textFieldBun_MexicanCoffee.getText().toString());
				priceBun_HamCheese = Double.parseDouble(textFieldBun_HamCheese.getText().toString());
				priceBun_RedBean = Double.parseDouble(textFieldBun_RedBean.getText().toString());
				priceTart_Portuguese = Double.parseDouble(textFieldTart_Portuguese.getText().toString());
				priceTart_ChocoAlmond = Double.parseDouble(textFieldTart_ChocoAlmond.getText().toString());
				priceTart_Blueberry = Double.parseDouble(textFieldTart_Blueberry.getText().toString());
				priceCake_HokkaidoCheese = Double.parseDouble(textFieldCake_HokkaidoCheese.getText().toString());
				priceCake_MoistChoco = Double.parseDouble(textFieldCake_MoistChoco.getText().toString());
				priceCake_Matcha = Double.parseDouble(textFieldCake_Matcha.getText().toString());
				JOptionPane.showMessageDialog(null, "Update successfully.");
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to home page frame -> Staff_HomePage
				Staff_HomePage frame = new Staff_HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Finance will disappear
			}
		});


		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Products Price Management", 
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
