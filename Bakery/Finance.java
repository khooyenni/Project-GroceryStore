package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textField_ordersIncome;
	private JTextField textField_purchase;
	private JTextField textField_incidental;
	private JTextField textField_emSalary;
	private JTextField textField_totalProfit;
	private JTextField textField_totalExpenses;
	private JTable table;

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
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setTitle("Cherry On Top Bakery");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		
		JLabel lblFinancialManagement = new JLabel("Financial Management");
		lblFinancialManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinancialManagement.setForeground(new Color(139, 69, 19));
		lblFinancialManagement.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblFinancialManagement.setBounds(300, 16, 369, 46);
		panel.add(lblFinancialManagement);
		
		JLabel lblPleaseFill_In = new JLabel("Please fill in the financial details.");
		lblPleaseFill_In.setForeground(new Color(160, 82, 45));
		lblPleaseFill_In.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPleaseFill_In.setBounds(30, 65, 333, 27);
		panel.add(lblPleaseFill_In);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(30, 94, 333, 233);
		panel.add(panel_1);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(new Color(139, 69, 19));
		lblMonth.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblMonth.setBounds(15, 17, 119, 26);
		panel_1.add(lblMonth);
		
		JComboBox cmBox_month = new JComboBox();
		cmBox_month.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_month.setBackground(new Color(245, 255, 250));
		cmBox_month.setModel(new DefaultComboBoxModel(new String[] {"Select...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		cmBox_month.setBounds(204, 16, 113, 26);
		panel_1.add(cmBox_month);
		
		JLabel lblOrdersIncome = new JLabel("Orders income");
		lblOrdersIncome.setForeground(new Color(139, 69, 19));
		lblOrdersIncome.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblOrdersIncome.setBounds(15, 59, 119, 26);
		panel_1.add(lblOrdersIncome);
		
		textField_ordersIncome = new JTextField();
		textField_ordersIncome.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_ordersIncome.setColumns(10);
		textField_ordersIncome.setBackground(new Color(245, 255, 250));
		textField_ordersIncome.setBounds(204, 58, 113, 26);
		textField_ordersIncome.setEditable(false);
		panel_1.add(textField_ordersIncome);
		
		JLabel lblInventoryPurchase = new JLabel("Inventory purchase");
		lblInventoryPurchase.setForeground(new Color(139, 69, 19));
		lblInventoryPurchase.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInventoryPurchase.setBounds(15, 102, 158, 26);
		panel_1.add(lblInventoryPurchase);
		
		textField_purchase = new JTextField();
		textField_purchase.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_purchase.setColumns(10);
		textField_purchase.setBackground(new Color(245, 255, 250));
		textField_purchase.setBounds(204, 101, 113, 26);
		textField_purchase.setEditable(false);
		panel_1.add(textField_purchase);
		
		JLabel lblInd = new JLabel("Incidental charges");
		lblInd.setForeground(new Color(139, 69, 19));
		lblInd.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblInd.setBounds(15, 144, 158, 26);
		panel_1.add(lblInd);
		
		textField_incidental = new JTextField();
		textField_incidental.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_incidental.setColumns(10);
		textField_incidental.setBackground(new Color(245, 255, 250));
		textField_incidental.setBounds(204, 143, 113, 26);
		panel_1.add(textField_incidental);
		
		JLabel lblEmployessSalary = new JLabel("Employees salary");
		lblEmployessSalary.setForeground(new Color(139, 69, 19));
		lblEmployessSalary.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblEmployessSalary.setBounds(15, 186, 143, 26);
		panel_1.add(lblEmployessSalary);
		
		textField_emSalary = new JTextField();
		textField_emSalary.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_emSalary.setColumns(10);
		textField_emSalary.setBackground(new Color(245, 255, 250));
		textField_emSalary.setBounds(205, 185, 113, 26);
		textField_emSalary.setEditable(false);
		panel_1.add(textField_emSalary);
		
		JLabel lblEmSalaryRM = new JLabel("RM");
		lblEmSalaryRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmSalaryRM.setForeground(Color.BLACK);
		lblEmSalaryRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblEmSalaryRM.setBounds(155, 185, 45, 26);
		panel_1.add(lblEmSalaryRM);
		
		JLabel lblIncidentalRM = new JLabel("RM");
		lblIncidentalRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIncidentalRM.setForeground(Color.BLACK);
		lblIncidentalRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblIncidentalRM.setBounds(155, 144, 45, 26);
		panel_1.add(lblIncidentalRM);
		
		JLabel lblMaterialsRM = new JLabel("RM");
		lblMaterialsRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMaterialsRM.setForeground(Color.BLACK);
		lblMaterialsRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblMaterialsRM.setBounds(155, 102, 45, 26);
		panel_1.add(lblMaterialsRM);
		
		JLabel lblOrdersIncomeRM = new JLabel("RM");
		lblOrdersIncomeRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOrdersIncomeRM.setForeground(Color.BLACK);
		lblOrdersIncomeRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblOrdersIncomeRM.setBounds(155, 59, 45, 26);
		panel_1.add(lblOrdersIncomeRM);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(392, 94, 530, 344);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_3.setBackground(new Color(255, 255, 224));
		panel_3.setBounds(30, 339, 333, 99);
		panel.add(panel_3);
		
		JLabel lblTotalExpenses = new JLabel("Total expenses");
		lblTotalExpenses.setBackground(new Color(255, 248, 220));
		lblTotalExpenses.setForeground(new Color(139, 69, 19));
		lblTotalExpenses.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTotalExpenses.setBounds(15, 17, 126, 26);
		panel_3.add(lblTotalExpenses);
		
		textField_totalExpenses = new JTextField();
		textField_totalExpenses.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_totalExpenses.setColumns(10);
		textField_totalExpenses.setBackground(new Color(245, 255, 250));
		textField_totalExpenses.setBounds(206, 17, 111, 26);
		textField_totalExpenses.setEditable(false);
		panel_3.add(textField_totalExpenses);
		
		JLabel lblTotalProfit = new JLabel("Total profit");
		lblTotalProfit.setForeground(new Color(139, 69, 19));
		lblTotalProfit.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTotalProfit.setBounds(15, 59, 100, 26);
		panel_3.add(lblTotalProfit);
		
		textField_totalProfit = new JTextField();
		textField_totalProfit.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_totalProfit.setColumns(10);
		textField_totalProfit.setBackground(new Color(245, 255, 250));
		textField_totalProfit.setBounds(206, 59, 111, 26);
		textField_totalProfit.setEditable(false);
		panel_3.add(textField_totalProfit);
		
		JLabel lblTotalProfitRM = new JLabel("RM");
		lblTotalProfitRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalProfitRM.setForeground(Color.BLACK);
		lblTotalProfitRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblTotalProfitRM.setBounds(166, 58, 35, 26);
		panel_3.add(lblTotalProfitRM);
		
		JLabel lblTotalExpensesRM = new JLabel("RM");
		lblTotalExpensesRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalExpensesRM.setForeground(Color.BLACK);
		lblTotalExpensesRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblTotalExpensesRM.setBounds(156, 16, 45, 26);
		panel_3.add(lblTotalExpensesRM);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpload.setBackground(new Color(230, 230, 250));
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Dubai", Font.BOLD, 18));
		btnPrint.setBackground(new Color(230, 230, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(112)
					.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
					.addGap(12))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(13)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Orders Income", "Inventory Purchase", "Incidental Charges", "Employee Salary", "Total Expenses", "Total Profit"
			}
		));
		scrollPane.setViewportView(table);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setBounds(30, 464, 125, 40);
		panel.add(btnTotal);
		btnTotal.setFont(new Font("Dubai", Font.BOLD, 18));
		btnTotal.setBackground(new Color(230, 230, 250));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Dubai", Font.BOLD, 18));
		btnSave.setBackground(new Color(230, 230, 250));
		btnSave.setBounds(182, 464, 125, 40);
		panel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(334, 464, 125, 40);
		panel.add(btnUpdate);
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(230, 230, 250));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dubai", Font.BOLD, 18));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(485, 464, 125, 40);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(640, 464, 125, 40);
		panel.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Dubai", Font.BOLD, 18));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(797, 464, 125, 40);
		panel.add(btnExit);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Finance.class.getResource("/BakeryIcons/8 back icon honeydew.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(240, 255, 240));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(240, 255, 240));
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
		mntmSHome.setForeground(new Color(139, 69, 19));
		mntmSHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmSHome.setBackground(new Color(240, 255, 240));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(240, 255, 240));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setBackground(new Color(240, 255, 240));
		mnHome.add(mntmInventory);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.setBackground(new Color(240, 255, 240));
		mntmEmployee.setForeground(new Color(139, 69, 19));
		mntmEmployee.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmEmployee);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.setForeground(new Color(139, 69, 19));
		mntmFinance.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmFinance.setBackground(new Color(240, 255, 240));
		mnHome.add(mntmFinance);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		//Receive value from another class
		textField_ordersIncome.setText(String.format("%.2f", Customer_OrderPage.sum));
		textField_purchase.setText(String.format("%.2f", Inventory.sum));
		textField_emSalary.setText(String.format("%.2f", Employee.sum));

		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//
		
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();

				cmBox_month.setSelectedItem(model.getValueAt(i, 0).toString());
				textField_ordersIncome.setText(model.getValueAt(i, 1).toString());
				textField_purchase.setText(model.getValueAt(i, 2).toString());
				textField_incidental.setText(model.getValueAt(i, 3).toString());
				textField_emSalary.setText(model.getValueAt(i, 4).toString());
				textField_totalExpenses.setText(model.getValueAt(i, 5).toString());
				textField_totalProfit.setText(model.getValueAt(i, 6).toString());
			}
		});

		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					File file = new File("C:\\Users\\Asus\\Desktop\\Text File\\Finance.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data exported.");
					}
					catch(Exception e) {
						e.printStackTrace();
					}
			}
		});

		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("There is no printer to be found.", e.getMessage());
				}
			}
		});

		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
						try {
							double materialsPurchase = Double.parseDouble(textField_purchase.getText());
							double incidentalCharges = Double.parseDouble(textField_incidental.getText());
							double employeeSalary = Double.parseDouble(textField_emSalary.getText());
							
							double totalExpenses = materialsPurchase + incidentalCharges + employeeSalary;
							textField_totalExpenses.setText(String.format("%.2f", totalExpenses));
							
							double ordersIncome = Double.parseDouble(textField_ordersIncome.getText());
							
							double totalProfit = ordersIncome - totalExpenses;
							textField_totalProfit.setText(String.format("%.2f", totalProfit));
						}
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Error : Please enter again.");
						}
			}
		});

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					if(cmBox_month.getSelectedItem().equals("Select...") 
							|| textField_ordersIncome.getText().equals("") 
							|| textField_purchase.getText().equals("") 
							|| textField_incidental.getText().equals("") 
							|| textField_emSalary.getText().equals("") 
							|| textField_totalExpenses.getText().equals("") 
							|| textField_totalProfit.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill in all the information.");
					}
					
					else {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						
						model.addRow(new Object[]{
								cmBox_month.getSelectedItem(),
								textField_ordersIncome.getText(),
								textField_purchase.getText(),
								textField_incidental.getText(),
								textField_emSalary.getText(),
								textField_totalExpenses.getText(),
								textField_totalProfit.getText(),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Information updated.", "Finance Management", JOptionPane.OK_OPTION);
							}
						}
					}
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill in all the information.");
				}
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(cmBox_month.getSelectedItem(),i,0);
			    	model.setValueAt(textField_ordersIncome.getText(),i,1);
			    	model.setValueAt(textField_purchase.getText(),i,2);
			    	model.setValueAt(textField_incidental.getText(),i,3);
			    	model.setValueAt(textField_emSalary.getText(),i,4);
			    	model.setValueAt(textField_totalExpenses.getText(),i,5);
			    	model.setValueAt(textField_totalProfit.getText(),i,6);
					JOptionPane.showMessageDialog(null, "Update successfully.");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please select a row to update.");
			    }
			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmBox_month.setSelectedItem("Select...");
				textField_incidental.setText("");
			}
		});

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"There is no data to delete.",
								"Customer Order Page", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Please select a row to delete.",
								"Customer Order Page", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Cherry On Top Bakery", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
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
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Financial Management", 
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
