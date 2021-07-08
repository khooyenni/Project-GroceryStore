package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 105, 180), 3));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(71, 23, 387, 87);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN HOME PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-118, 13, 625, 61);
		panel.add(lblNewLabel);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee em=new Employee();
				em.setModalExclusionType(null);
				em.setVisible(true);
				dispose();
			}
		});
		btnEmployee.setBackground(new Color(255, 182, 193));
		btnEmployee.setForeground(new Color(255, 255, 255));
		btnEmployee.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnEmployee.setBounds(71, 139, 389, 60);
		contentPane.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setModalExclusionType(null);
				f.setVisible(true);
				dispose();
			}
		});
		btnFinance.setBackground(new Color(255, 182, 193));
		btnFinance.setForeground(new Color(255, 255, 255));
		btnFinance.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnFinance.setBounds(69, 212, 389, 60);
		contentPane.add(btnFinance);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory inv = new Inventory();
				inv.setModalExclusionType(null);
				inv.setVisible(true);
				dispose();
			}
		});
		btnInventory.setBackground(new Color(255, 182, 193));
		btnInventory.setForeground(new Color(255, 255, 255));
		btnInventory.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnInventory.setBounds(71, 292, 389, 60);
		contentPane.add(btnInventory);
		
		JButton btnSetPrice = new JButton("Set Price");
		btnSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetPrice set=new SetPrice();
				set.setModalExclusionType(null);
				set.setVisible(true);
				dispose();
			}
		});
		btnSetPrice.setBackground(new Color(255, 182, 193));
		btnSetPrice.setForeground(new Color(255, 255, 255));
		btnSetPrice.setFont(new Font("Futura Md BT", Font.BOLD, 20));
		btnSetPrice.setBounds(71, 365, 389, 60);
		contentPane.add(btnSetPrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(513, 0, 411, 570);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel image = new JLabel("image");
		image.setBounds(0, 0, 411, 570);
		panel_1.add(image);
		image.setIcon(new ImageIcon("C:\\Users\\MAY NG\\Downloads\\pink-home.jpg"));
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
				
				dispose();
			}
		});
		Back.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Back.setBackground(new Color(255, 215, 0));
		Back.setForeground(new Color(255, 255, 255));
		Back.setBounds(353, 454, 105, 38);
		contentPane.add(Back);
		setTitle("Admin Home Page");
	}
}
