package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class EmployeeManagementAuthority extends JFrame {

	private JPanel contentPane;
	private JTextField textField_emName;
	private JTextField textField_emID;
	private JTextField textField_position;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagementAuthority frame = new EmployeeManagementAuthority();
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
	public EmployeeManagementAuthority() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setTitle("Cherry On Top Bakery");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeeManagementAuthority.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 512);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Employee Management");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Gabriola", Font.BOLD, 40));
		label.setBounds(220, 16, 369, 47);
		contentPane.add(label);
		
		JLabel lblPleaseFillIn = new JLabel("Please fill in the following details.");
		lblPleaseFillIn.setForeground(new Color(160, 82, 45));
		lblPleaseFillIn.setFont(new Font("Dubai", Font.PLAIN, 18));
		lblPleaseFillIn.setBounds(170, 131, 295, 27);
		contentPane.add(lblPleaseFillIn);
		
		JLabel lblEmName = new JLabel("Employee name");
		lblEmName.setForeground(new Color(139, 69, 19));
		lblEmName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblEmName.setBounds(170, 180, 165, 30);
		contentPane.add(lblEmName);
		
		textField_emName = new JTextField();
		textField_emName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_emName.setColumns(10);
		textField_emName.setBounds(350, 180, 277, 30);
		contentPane.add(textField_emName);
		
		JLabel lblEmID = new JLabel("Employee ID");
		lblEmID.setForeground(new Color(139, 69, 19));
		lblEmID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblEmID.setBounds(170, 238, 123, 30);
		contentPane.add(lblEmID);
		
		textField_emID = new JTextField();
		textField_emID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_emID.setColumns(10);
		textField_emID.setBounds(350, 238, 277, 30);
		contentPane.add(textField_emID);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setForeground(new Color(139, 69, 19));
		lblPosition.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblPosition.setBounds(170, 297, 123, 30);
		contentPane.add(lblPosition);
		
		textField_position = new JTextField();
		textField_position.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		textField_position.setColumns(10);
		textField_position.setBounds(350, 297, 277, 31);
		contentPane.add(textField_position);
		
		JButton btnManageEmployee = new JButton("Manage Employee");
		btnManageEmployee.setForeground(Color.WHITE);
		btnManageEmployee.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		btnManageEmployee.setBackground(new Color(188, 143, 143));
		btnManageEmployee.setBounds(270, 378, 256, 47);
		contentPane.add(btnManageEmployee);
		
		JLabel lblAuthorityAccess = new JLabel("AUTHORITY ACCESS");
		lblAuthorityAccess.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthorityAccess.setForeground(new Color(160, 82, 45));
		lblAuthorityAccess.setFont(new Font("Dubai", Font.PLAIN, 15));
		lblAuthorityAccess.setBounds(258, 62, 295, 27);
		contentPane.add(lblAuthorityAccess);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(EmployeeManagementAuthority.class.getResource("/BakeryIcons/7 back icon floralwhite.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(757, 16, 28, 28);
		contentPane.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 250, 240));
		menuBar.setBounds(15, 16, 59, 31);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 250, 240));
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
		mntmSHome.setBackground(new Color(255, 250, 240));
		mntmSHome.setForeground(new Color(139, 69, 19));
		mntmSHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(255, 250, 240));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmInventory.setBackground(new Color(255, 250, 240));
		mnHome.add(mntmInventory);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.setForeground(new Color(139, 69, 19));
		mntmEmployee.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmEmployee.setBackground(new Color(255, 250, 240));
		mnHome.add(mntmEmployee);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.setBackground(new Color(255, 250, 240));
		mntmFinance.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmFinance.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmFinance);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//

		btnManageEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					if(textField_emName.getText().equals("Teh Yee Xin") && textField_emID.getText().equals("602876") && textField_position.getText().equals("Manager")) {
						JOptionPane.showMessageDialog(null, "Allowed to manage employee information.");
						
						//calling another frame -> Employee
						Employee frame = new Employee();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose(); //EmployeeManagementAuthority will disappear
					}
						
					else { 
						JOptionPane.showMessageDialog(null, "Not allowed to manage employee information.");
					}
					
				
				} 
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Not allowed to manage employee information.");
				}
			}
		});
		

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to home page frame -> Staff_HomePage
				Staff_HomePage frame = new Staff_HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //EmployeeManagementAuthority will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Employee Management Authority", 
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
			public void actionPerformed(ActionEvent arg0) {
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
