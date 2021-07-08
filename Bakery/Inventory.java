package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField_date;
	private JTextField textField_material;
	private JTextField textField_quantity;
	private JTextField textField_price;
	private JTextField textField_totalprice;
	private JTable table;
	protected static double sum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setTitle("Cherry On Top Bakery");
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inventory.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		
		JLabel lblInventoryManagement = new JLabel("Inventory Management");
		lblInventoryManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventoryManagement.setForeground(new Color(139, 69, 19));
		lblInventoryManagement.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblInventoryManagement.setBounds(306, 16, 369, 51);
		panel.add(lblInventoryManagement);
		
		JLabel lblPleaseFill_In = new JLabel("Please fill in the inventory details.");
		lblPleaseFill_In.setForeground(new Color(160, 82, 45));
		lblPleaseFill_In.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPleaseFill_In.setBounds(30, 72, 333, 27);
		panel.add(lblPleaseFill_In);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(30, 102, 333, 334);
		panel.add(panel_1);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(new Color(139, 69, 19));
		lblMonth.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblMonth.setBounds(15, 16, 167, 26);
		panel_1.add(lblMonth);
		
		JComboBox cmBox_month = new JComboBox();
		cmBox_month.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_month.setModel(new DefaultComboBoxModel(new String[] {"Select...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		cmBox_month.setBackground(new Color(245, 255, 250));
		cmBox_month.setBounds(174, 16, 143, 26);
		panel_1.add(cmBox_month);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(139, 69, 19));
		lblDate.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblDate.setBounds(15, 58, 125, 26);
		panel_1.add(lblDate);
		
		textField_date = new JTextField();
		textField_date.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_date.setColumns(10);
		textField_date.setBackground(new Color(245, 255, 250));
		textField_date.setBounds(174, 58, 143, 26);
		panel_1.add(textField_date);
		
		JLabel lblNameOfMaterial = new JLabel("Name of material");
		lblNameOfMaterial.setForeground(new Color(139, 69, 19));
		lblNameOfMaterial.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblNameOfMaterial.setBounds(15, 97, 167, 26);
		panel_1.add(lblNameOfMaterial);
		
		textField_material = new JTextField();
		textField_material.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_material.setColumns(10);
		textField_material.setBackground(new Color(245, 255, 250));
		textField_material.setBounds(174, 98, 143, 26);
		panel_1.add(textField_material);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(139, 69, 19));
		lblQuantity.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblQuantity.setBounds(15, 140, 89, 26);
		panel_1.add(lblQuantity);
		
		textField_quantity = new JTextField();
		textField_quantity.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_quantity.setColumns(10);
		textField_quantity.setBackground(new Color(245, 255, 250));
		textField_quantity.setBounds(174, 140, 143, 26);
		panel_1.add(textField_quantity);
		
		JLabel lblPricePerUnit = new JLabel("Price per unit");
		lblPricePerUnit.setForeground(new Color(139, 69, 19));
		lblPricePerUnit.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPricePerUnit.setBounds(15, 182, 108, 26);
		panel_1.add(lblPricePerUnit);
		
		JLabel lblPriceRM = new JLabel("RM");
		lblPriceRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPriceRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPriceRM.setBounds(137, 184, 34, 20);
		panel_1.add(lblPriceRM);
		
		textField_price = new JTextField();
		textField_price.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_price.setColumns(10);
		textField_price.setBackground(new Color(245, 255, 250));
		textField_price.setBounds(174, 182, 143, 26);
		panel_1.add(textField_price);
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setForeground(new Color(139, 69, 19));
		lblTotalPrice.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTotalPrice.setBounds(15, 281, 89, 26);
		panel_1.add(lblTotalPrice);
		
		JLabel lblTotalPriceRM = new JLabel("RM");
		lblTotalPriceRM.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblTotalPriceRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTotalPriceRM.setBounds(137, 284, 33, 20);
		panel_1.add(lblTotalPriceRM);
		
		textField_totalprice = new JTextField();
		textField_totalprice.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		textField_totalprice.setColumns(10);
		textField_totalprice.setBackground(new Color(245, 255, 250));
		textField_totalprice.setBounds(174, 280, 143, 27);
		textField_totalprice.setEditable(false);
		panel_1.add(textField_totalprice);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setBounds(111, 228, 94, 35);
		panel_1.add(btnTotal);
		btnTotal.setFont(new Font("Dubai", Font.BOLD, 18));
		btnTotal.setBackground(new Color(230, 230, 250));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBackground(new Color(240, 255, 240));
		panel_2.setBounds(392, 102, 530, 334);
		panel.add(panel_2);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(85, 275, 130, 40);
		btnUpload.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpload.setBackground(new Color(230, 230, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 500, 243);
		
		JLabel lblTotalPurchase = new JLabel("Total : RM");
		lblTotalPurchase.setBounds(303, 277, 85, 41);
		lblTotalPurchase.setForeground(new Color(139, 69, 19));
		lblTotalPurchase.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		JLabel lblTotalPurchase2 = new JLabel("");
		lblTotalPurchase2.setBounds(393, 275, 119, 40);
		lblTotalPurchase2.setForeground(new Color(139, 69, 19));
		lblTotalPurchase2.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Date", "Material", "Quantity", "Price per unit", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		panel_2.setLayout(null);
		panel_2.add(btnUpload);
		panel_2.add(lblTotalPurchase);
		panel_2.add(lblTotalPurchase2);
		panel_2.add(scrollPane);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(30, 464, 125, 40);
		panel.add(btnSave);
		btnSave.setFont(new Font("Dubai", Font.BOLD, 18));
		btnSave.setBackground(new Color(230, 230, 250));
		
		JButton btnUpdate = new JButton("UPDATE");	
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(230, 230, 250));
		btnUpdate.setBounds(180, 464, 125, 40);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dubai", Font.BOLD, 18));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(338, 464, 125, 40);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(492, 464, 125, 40);
		panel.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Dubai", Font.BOLD, 18));
		btnPrint.setBackground(new Color(230, 230, 250));
		btnPrint.setBounds(642, 464, 125, 40);
		panel.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Dubai", Font.BOLD, 18));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(797, 464, 125, 40);
		panel.add(btnExit);
		
		JButton btnBack = new JButton("");
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBounds(904, 16, 28, 28);
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setIcon(new ImageIcon(Inventory.class.getResource("/BakeryIcons/6 back icon oldlace.png")));
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(253, 245, 230));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setBackground(new Color(253, 245, 230));
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setBackground(new Color(253, 245, 230));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.setForeground(new Color(139, 69, 19));
		mnMenu.add(mnHome);
		
		JMenuItem mntmSHome = new JMenuItem("Home");
		mntmSHome.setForeground(new Color(139, 69, 19));
		mntmSHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmSHome.setBackground(new Color(253, 245, 230));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(253, 245, 230));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmInventory.setBackground(new Color(253, 245, 230));
		mnHome.add(mntmInventory);
		
		JMenuItem mntmEmployee = new JMenuItem("Employee");
		mntmEmployee.setBackground(new Color(253, 245, 230));
		mntmEmployee.setForeground(new Color(139, 69, 19));
		mntmEmployee.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmEmployee);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.setForeground(new Color(139, 69, 19));
		mntmFinance.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmFinance.setBackground(new Color(253, 245, 230));
		mnHome.add(mntmFinance);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		
		//-------------------------------------------------------//
		//-------------------- Create Events --------------------//
		//-------------------------------------------------------//
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();

				cmBox_month.setSelectedItem(model.getValueAt(i, 0).toString());
				textField_date.setText(model.getValueAt(i, 1).toString());
				textField_material.setText(model.getValueAt(i, 2).toString());
				textField_quantity.setText(model.getValueAt(i, 3).toString());
				textField_price.setText(model.getValueAt(i, 4).toString());
				textField_totalprice.setText(model.getValueAt(i, 5).toString());
				
			}
		});

		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int qty = Integer.parseInt(textField_quantity.getText());
					double price = Double.parseDouble(textField_price.getText());
					
					double totalPrice = qty * price;
					textField_totalprice.setText(String.format("%.2f", totalPrice));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error : Please enter again.");
				}
			}
		});

		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					File file = new File("C:\\Users\\Asus\\Desktop\\Text File\\Inventory.txt");
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

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					if(cmBox_month.getSelectedItem().equals("Select...") 
							|| textField_date.getText().equals("") 
							|| textField_material.getText().equals("") 
							|| textField_quantity.getText().equals("") 
							|| textField_price.getText().equals("") 
							|| textField_totalprice.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill in all the information.");
					}
					
					else {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						
						model.addRow(new Object[]{
								cmBox_month.getSelectedItem(),
								textField_date.getText(),
								textField_material.getText(),
								textField_quantity.getText(),
								textField_price.getText(),
								textField_totalprice.getText(),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Information updated.", "Inventory Management", JOptionPane.OK_OPTION);
							}
						}
					}
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill in all the information.");
				}
				
				sum = 0;
				for(int i = 0; i < table.getRowCount(); i++) { 
					sum = sum + Double.parseDouble(table.getValueAt(i, 5).toString());
				}
				lblTotalPurchase2.setText(String.format("%.2f", sum));
				
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(cmBox_month.getSelectedItem(),i,0);
			    	model.setValueAt(textField_date.getText(),i,1);
			    	model.setValueAt(textField_material.getText(),i,2);
			    	model.setValueAt(textField_quantity.getText(),i,3);
			    	model.setValueAt(textField_price.getText(),i,4);
			    	model.setValueAt(textField_totalprice.getText(),i,5);
					JOptionPane.showMessageDialog(null, "Update successfully.");
					
					sum = 0;
						for(int j = 0; j < table.getRowCount(); j++) { 
							sum = sum + Double.parseDouble(table.getValueAt(j, 5).toString());
						}
						lblTotalPurchase2.setText(String.format("%.2f", sum));
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
				textField_date.setText("");
				textField_material.setText("");
				textField_quantity.setText("");
				textField_price.setText("");
				textField_totalprice.setText("");
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
				}
				else {
					model.removeRow(table.getSelectedRow());
				}
				
				sum = 0;
				for(int i = 0; i < table.getRowCount(); i++) { 
					sum = sum + Double.parseDouble(table.getValueAt(i, 5).toString());
				}
				lblTotalPurchase2.setText(String.format("%.2f", sum));
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
				dispose(); //Inventory will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Inventory Management", 
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
