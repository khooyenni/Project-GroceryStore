package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class ProductSetPrice extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldKate;
	private JTextField textField3CE;
	private JTextField textFieldTail;
	private JTextField textFieldPantene;
	private JTextField textFieldSunsilk;
	private JTextField textFieldRejoice;
	static double KateEyebrow;
	static double ThreeCEEyebrow;
	static double TailLasting;
	static double Rejoice;
	static double Sunsilk;
	static double Pantene;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSetPrice frame = new ProductSetPrice();
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
	public ProductSetPrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductSetPrice.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setTitle("KYN Grocery Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1141, 778);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuHome = new JMenu("Home");
		menuBar.add(MenuHome);
		
		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage AdminHome = new AdminHomePage();
				AdminHome.setVisible(true);
			}
		});
		MenuHome.add(mntmMainMenu);
		
		JMenu MenuEmployee = new JMenu("Employee");
		menuBar.add(MenuEmployee);
		
		JMenuItem MenuItemEmployeeManagement = new JMenuItem("Employee Management");
		MenuItemEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmployeeManagement EManagement = new EmployeeManagement();
				EManagement.setVisible(true);
			}
		});
		MenuEmployee.add(MenuItemEmployeeManagement);
		
		JMenu mnProduct = new JMenu("Product");
		menuBar.add(mnProduct);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Price Mangement");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductSetPrice psp = new ProductSetPrice(); //calling another frame/window
				psp.setModalExclusionType(null);
				psp.setVisible(true);
			}
		});
		mnProduct.add(mntmNewMenuItem);
		
		JMenu MenuInventory = new JMenu("Inventory");
		menuBar.add(MenuInventory);
		
		JMenuItem MenuItemInventory = new JMenuItem("Inventory");
		MenuItemInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inventory = new Inventory(); //calling another frame/window
				inventory.setModalExclusionType(null);
				inventory.setVisible(true);
			}
		});
		MenuInventory.add(MenuItemInventory);
		
		JMenu MenuFinance = new JMenu("Finance");
		menuBar.add(MenuFinance);
		
		JMenuItem MenuItemFinance = new JMenuItem("Finance");
		MenuItemFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Finance finances = new Finance(); //calling another frame/window
				finances.setModalExclusionType(null);
				finances.setVisible(true);
			}
		});
		MenuFinance.add(MenuItemFinance);
		
		JMenu MenuExit = new JMenu("Exit");
		menuBar.add(MenuExit);
		
		JMenuItem MenuItemLogout = new JMenuItem("Log Out");
		MenuItemLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to log out?", "Employee Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login log = new Login(); //calling another frame/window
					log.setModalExclusionType(null);
					log.setVisible(true);
				}
			
			}
		});
		MenuExit.add(MenuItemLogout);
		
		JMenuItem MenuItemExit = new JMenuItem("Exit");
		MenuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to exit?", "Employee Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		MenuExit.add(MenuItemExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panelTitle.setBackground(new Color(255, 182, 193));
		panelTitle.setBounds(255, 18, 549, 80);
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Price Management");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		lblNewLabel.setBounds(20, 13, 511, 67);
		panelTitle.add(lblNewLabel);
		
		JLabel lblTail = new JLabel("Tail Lasting Brush Liner");
		lblTail.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblTail.setBounds(81, 286, 371, 51);
		contentPane.add(lblTail);
		
		JLabel lblRejoice = new JLabel("Rejoice Frizz Repair Shampoo");
		lblRejoice.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblRejoice.setBounds(81, 507, 452, 51);
		contentPane.add(lblRejoice);
		
		JLabel lblSunsilk = new JLabel("Sunsilk Super Collagen Shampoo ");
		lblSunsilk.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblSunsilk.setBounds(81, 435, 583, 51);
		contentPane.add(lblSunsilk);
		
		JLabel lblPantene = new JLabel("Pantene Pro-V Anti Dandruff Shampoo");
		lblPantene.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblPantene.setBounds(81, 363, 618, 39);
		contentPane.add(lblPantene);
		
		textFieldKate = new JTextField();
		textFieldKate.setBackground(new Color(255, 255, 224));
		textFieldKate.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldKate.setBounds(683, 144, 276, 45);
		contentPane.add(textFieldKate);
		textFieldKate.setColumns(10);
		
		textField3CE = new JTextField();
		textField3CE.setBackground(new Color(255, 255, 224));
		textField3CE.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textField3CE.setColumns(10);
		textField3CE.setBounds(683, 216, 276, 45);
		contentPane.add(textField3CE);
		
		textFieldTail = new JTextField();
		textFieldTail.setBackground(new Color(255, 255, 224));
		textFieldTail.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldTail.setColumns(10);
		textFieldTail.setBounds(683, 288, 276, 45);
		contentPane.add(textFieldTail);
		
		textFieldPantene = new JTextField();
		textFieldPantene.setBackground(new Color(255, 255, 224));
		textFieldPantene.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldPantene.setColumns(10);
		textFieldPantene.setBounds(683, 360, 276, 45);
		contentPane.add(textFieldPantene);
		
		textFieldSunsilk = new JTextField();
		textFieldSunsilk.setBackground(new Color(255, 255, 224));
		textFieldSunsilk.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldSunsilk.setColumns(10);
		textFieldSunsilk.setBounds(683, 432, 276, 45);
		contentPane.add(textFieldSunsilk);
		
		textFieldRejoice = new JTextField();
		textFieldRejoice.setBackground(new Color(255, 255, 224));
		textFieldRejoice.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldRejoice.setColumns(10);
		textFieldRejoice.setBounds(683, 504, 276, 45);
		contentPane.add(textFieldRejoice);
		
		JButton btnSavePrice = new JButton("Save Price");
		btnSavePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KateEyebrow =Double.parseDouble(textFieldKate.getText());
				ThreeCEEyebrow = Double.parseDouble(textField3CE.getText());
				TailLasting = Double.parseDouble(textFieldTail.getText());
				Rejoice = Double.parseDouble(textFieldPantene.getText());
				Sunsilk = Double.parseDouble(textFieldSunsilk.getText());
				Pantene = Double.parseDouble(textFieldRejoice.getText());
				
				JOptionPane.showMessageDialog(null, "Update Successfully");
			}
		});
		btnSavePrice.setForeground(new Color(0, 0, 0));
		btnSavePrice.setBackground(new Color(240, 128, 128));
		btnSavePrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		btnSavePrice.setBounds(412, 591, 197, 47);
		contentPane.add(btnSavePrice);
		
		JLabel lblBackground = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background2.jpg")).getImage();
		Image n1photo = photo1.getScaledInstance(1092, 767, 150);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(69, 115, 925, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl3ce = new JLabel("3CE Eyebrow Mascara");
		lbl3ce.setBounds(19, 114, 371, 39);
		panel.add(lbl3ce);
		lbl3ce.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		
		JLabel lblNewLabelKate = new JLabel("Kate Eyebrow Colour 3D");
		lblNewLabelKate.setBounds(19, 33, 371, 39);
		panel.add(lblNewLabelKate);
		lblNewLabelKate.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		lblBackground.setIcon(new ImageIcon(n1photo));
		lblBackground.setBounds(0, 0, 1056, 664);
		contentPane.add(lblBackground);
	}
}
