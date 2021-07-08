package PersonalCare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

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
		setBackground(Color.GRAY);
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminHomePage.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(31, 267, 543, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton EmployeeManagementButton = new JButton("Employee Management");
		EmployeeManagementButton.setBounds(10, 14, 523, 95);
		panel_1.add(EmployeeManagementButton);
		EmployeeManagementButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmployeeManagement EManagement = new EmployeeManagement(); //calling another frame/window
				EManagement.setModalExclusionType(null);
				EManagement.setVisible(true);
			}
		});
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/employee.png")).getImage();
		Image n1photo = photo1.getScaledInstance(80, 80, 1);
		EmployeeManagementButton.setIcon(new ImageIcon(n1photo));
		EmployeeManagementButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		EmployeeManagementButton.setBackground(new Color(255, 240, 245));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(31, 441, 543, 121);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton Inventorybutton = new JButton("Inventory");
		Inventorybutton.setBounds(10, 14, 521, 95);
		panel_3.add(Inventorybutton);
		Image photo3 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/list.png")).getImage();
		Image n3photo = photo3.getScaledInstance(80, 80, 50);
		Inventorybutton.setIcon(new ImageIcon(n3photo));
		Inventorybutton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		Inventorybutton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(586, 441, 543, 121);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton FinanceButton = new JButton("Finance");
		FinanceButton.setBounds(10, 14, 521, 95);
		panel_4.add(FinanceButton);
		FinanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Finance finances = new Finance(); //calling another frame/window
				finances.setModalExclusionType(null);
				finances.setVisible(true);
			}
		});
		Image photo4 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Money.png")).getImage();
		Image n4photo = photo4.getScaledInstance(80, 80, 50);
		FinanceButton.setIcon(new ImageIcon(n4photo));
		FinanceButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		FinanceButton.setBackground(new Color(255, 240, 245));
		
		JLabel AdminLabel = new JLabel("New label");
		AdminLabel.setBounds(465, 23, 205, 211);
		contentPane.add(AdminLabel);
		Image aphoto = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/admin.png")).getImage();
		Image anphoto = aphoto.getScaledInstance(200, 200, 200);
		AdminLabel.setIcon(new ImageIcon(anphoto));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(586, 266, 543, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Productbutton = new JButton("Product");
		Productbutton.setBounds(10, 14, 522, 95);
		panel.add(Productbutton);
		Productbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProductSetPrice setPrice = new ProductSetPrice(); //calling another frame/window
				setPrice.setModalExclusionType(null);
				setPrice.setVisible(true);
			}
		});
		Image photo2 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Product1.png")).getImage();
		Image n2photo = photo2.getScaledInstance(60, 60, 60);
		Productbutton.setIcon(new ImageIcon(n2photo));
		Productbutton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		Productbutton.setBackground(new Color(230, 230, 250));
		
		JLabel lblNewLabelBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background9.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1300, 620, 150);
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(0, 0, 1165, 613);
		contentPane.add(lblNewLabelBackground);
		
		
	}
}
