package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTotalIncome;
	private JTextField textFieldTotalSalary;
	private JTextField textFieldTotalIncidentCharge;
	private JTextField textFieldInventory;
	private JTable tableFinance;
	private JTextField textFieldDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1223, 747);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(458, 11, 273, 100);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBackground(new Color(255, 192, 203));
		
		JLabel FinanceLabel = new JLabel("Finance");
		FinanceLabel.setForeground(Color.BLACK);
		FinanceLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 60));
		FinanceLabel.setBounds(31, 26, 230, 56);
		panel_1.add(FinanceLabel);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(11, 115, 552, 381);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBackground(new Color(253, 245, 230));
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblTotalIncome.setBounds(15, 71, 229, 39);
		panel_2.add(lblTotalIncome);
		
		textFieldTotalIncidentCharge = new JTextField();
		textFieldTotalIncidentCharge.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldTotalIncidentCharge.setColumns(10);
		textFieldTotalIncidentCharge.setBounds(313, 238, 229, 39);
		panel_2.add(textFieldTotalIncidentCharge);
		
		JLabel lblTotalIncidentCharge = new JLabel("Total Incident Charge");
		lblTotalIncidentCharge.setBounds(15, 233, 368, 46);
		panel_2.add(lblTotalIncidentCharge);
		lblTotalIncidentCharge.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		
		JLabel lblTotalSalary = new JLabel("Total Salary");
		lblTotalSalary.setBounds(15, 128, 229, 39);
		panel_2.add(lblTotalSalary);
		lblTotalSalary.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		
		textFieldTotalIncome = new JTextField();
		textFieldTotalIncome.setBounds(313, 68, 229, 40);
		panel_2.add(textFieldTotalIncome);
		textFieldTotalIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldTotalIncome.setColumns(10);
		
		textFieldTotalSalary = new JTextField();
		textFieldTotalSalary.setBounds(313, 127, 229, 39);
		panel_2.add(textFieldTotalSalary);
		textFieldTotalSalary.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldTotalSalary.setColumns(10);
		
		JLabel lblTotalInventory = new JLabel("Total Inventory");
		lblTotalInventory.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblTotalInventory.setBounds(15, 175, 368, 46);
		panel_2.add(lblTotalInventory);
		
		textFieldInventory = new JTextField();
		textFieldInventory.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldInventory.setColumns(10);
		textFieldInventory.setBounds(313, 182, 229, 39);
		panel_2.add(textFieldInventory);
		
		JButton buttonshow = new JButton("Show");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldTotalIncome.setText(String.format("%.2f", PlaceOrder.totalIncome));
				textFieldTotalSalary.setText(String.format("%.2f", EmployeeManagement.totalSalary));
				textFieldInventory.setText(String.format("%.2f", Inventory.totalInventory));
			}
		});
		buttonshow.setFont(new Font("Tahoma", Font.PLAIN, 32));
		buttonshow.setBackground(new Color(255, 250, 205));
		buttonshow.setBounds(154, 308, 197, 47);
		panel_2.add(buttonshow);
		
		JLabel labelDate = new JLabel("Date");
		labelDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		labelDate.setBounds(15, 13, 229, 39);
		panel_2.add(labelDate);
		
		textFieldDate = new JTextField();
		textFieldDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(313, 10, 229, 40);
		panel_2.add(textFieldDate);
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background9.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1200, 800, 150);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(570, 116, 603, 378);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 17, 577, 291);
		panel.add(scrollPane);
		
		tableFinance = new JTable();
		tableFinance.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Total Income (RM)", "Total Salary (RM)", "Total Inventory (RM)", "Total Incident Charge (RM)", "Total Profit (RM)"
			}
		));
		tableFinance.getColumnModel().getColumn(0).setPreferredWidth(105);
		tableFinance.getColumnModel().getColumn(1).setPreferredWidth(283);
		tableFinance.getColumnModel().getColumn(2).setPreferredWidth(266);
		tableFinance.getColumnModel().getColumn(3).setPreferredWidth(318);
		tableFinance.getColumnModel().getColumn(4).setPreferredWidth(403);
		tableFinance.getColumnModel().getColumn(5).setPreferredWidth(256);
		scrollPane.setViewportView(tableFinance);
		
		JButton button = new JButton("Upload");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\khooy\\Programming 2\\Assignment3\\Finance.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableFinance.getRowCount(); i++) {
						for (int j=0; j<tableFinance.getColumnCount(); j++) {
							bw.write(tableFinance.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
						}
						
				 catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button.setBackground(new Color(255, 250, 205));
		button.setBounds(201, 321, 197, 47);
		panel.add(button);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(52, 503, 229, 68);
		contentPane.add(panel_3);
		
		JButton button_1 = new JButton("Add Record");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double totalProfit = Double.parseDouble(textFieldTotalIncome.getText()) - ((Double.parseDouble(textFieldInventory.getText()) + Double.parseDouble(textFieldTotalSalary.getText()) + Double.parseDouble(textFieldTotalIncidentCharge.getText()))); 
				String totalFinalProfit = Double.toString(totalProfit);
				
				DefaultTableModel model = (DefaultTableModel) tableFinance.getModel();
				
				model.addRow(new Object[]{
						textFieldDate.getText(),
						textFieldTotalIncome.getText(),
						textFieldTotalSalary.getText(),
						textFieldInventory.getText(),
						textFieldTotalIncidentCharge.getText(),
						totalFinalProfit,
						
				});
				
				if (tableFinance.getSelectedRow() == -1) {
					if (tableFinance.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Add Successful", "Finance",
								JOptionPane.OK_OPTION);
					}
				}
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_1.setBackground(new Color(230, 230, 250));
		button_1.setBounds(10, 10, 207, 47);
		panel_3.add(button_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.BLACK, 5));
		panel_4.setBackground(new Color(255, 250, 250));
		panel_4.setBounds(285, 503, 165, 68);
		contentPane.add(panel_4);
		
		JButton button_2 = new JButton("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableFinance.getModel();
				if(tableFinance.getSelectedRow()==-1) {
					if(tableFinance.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableFinance.getSelectedRow());
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_2.setBackground(new Color(230, 230, 250));
		button_2.setBounds(10, 10, 144, 46);
		panel_4.add(button_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(453, 503, 165, 68);
		contentPane.add(panel_5);
		
		JButton button_3 = new JButton("Update");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableFinance.getModel();
				int i = tableFinance.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldDate.getText(), i, 0);
			    	model.setValueAt(textFieldTotalIncidentCharge.getText(), i, 4);
		
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_3.setBackground(new Color(230, 230, 250));
		button_3.setBounds(10, 10, 143, 47);
		panel_5.add(button_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_6.setBounds(622, 503, 165, 68);
		contentPane.add(panel_6);
		
		JButton button_4 = new JButton("Print");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableFinance.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_4.setBackground(new Color(230, 230, 250));
		button_4.setBounds(10, 10, 144, 47);
		panel_6.add(button_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setBounds(791, 503, 165, 68);
		contentPane.add(panel_7);
		
		JButton button_5 = new JButton("Reset");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDate.setText("");
				textFieldTotalIncidentCharge.setText("");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_5.setBackground(new Color(230, 230, 250));
		button_5.setBounds(11, 8, 143, 47);
		panel_7.add(button_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_8.setBounds(960, 503, 165, 68);
		contentPane.add(panel_8);
		
		JButton button_6 = new JButton("Exit");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_6.setBackground(new Color(230, 230, 250));
		button_6.setBounds(10, 9, 142, 47);
		panel_8.add(button_6);
		
		JLabel lblNewLabelFinanceIcon = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/finance.png")).getImage();
		Image n1photo = photo1.getScaledInstance(80, 80, 150);
		lblNewLabelFinanceIcon.setIcon(new ImageIcon(n1photo));
		lblNewLabelFinanceIcon.setBounds(354, 0, 96, 100);
		contentPane.add(lblNewLabelFinanceIcon);
		
		JLabel lblNewLabelBackground = new JLabel("");
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(0, 0, 1187, 585);
		contentPane.add(lblNewLabelBackground);
	}
}
