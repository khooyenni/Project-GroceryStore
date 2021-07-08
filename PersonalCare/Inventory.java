package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Inventory extends JFrame {

	private JPanel contentPane;
	static double totalInventory;
	private JTextField textFieldDate;
	private JTextField textFieldPrice;
	private JTable tableInventory;
	private double total = 0;

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
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inventory.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1223, 741);
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(18, 120, 539, 358);
		contentPane.add(panel);
		
		JLabel labelTypeOfProduct = new JLabel("Type of Product");
		labelTypeOfProduct.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		labelTypeOfProduct.setBounds(15, 83, 223, 36);
		panel.add(labelTypeOfProduct);
		
		JComboBox comboBoxList = new JComboBox();
		comboBoxList.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		comboBoxList.setBounds(250, 151, 276, 42);
		panel.add(comboBoxList);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Cosmetic", "Shampoo"}));
		comboBoxProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final DefaultComboBoxModel Cosmetic = new DefaultComboBoxModel(new String[]{"Please Select", "Kate Eyebrow Colour 3D", "3CE Eyebrow Mascara", "Tail Lasting Brush Liner"});
		    	final DefaultComboBoxModel Shampoo = new DefaultComboBoxModel(new String[]{"Please Select", "Rejoice Frizz Repair Shampoo", "Sunsilk Super Collagen Shampoo Power Shine", "Pantene Pro-V Anti Dandruff Shampoo"});
		    	
		        if (comboBoxProduct.getSelectedItem().equals("Cosmetic")){
		            comboBoxList.setModel(Cosmetic);    
		        } 
		        else if (comboBoxProduct.getSelectedItem().equals("Shampoo")){
		        	comboBoxList.setModel(Shampoo);  
		        
		        }
			}
		});
		comboBoxProduct.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		comboBoxProduct.setBounds(250, 80, 276, 42);
		panel.add(comboBoxProduct);
		
		JLabel labelList = new JLabel("List of Product");
		labelList.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		labelList.setBounds(15, 154, 223, 36);
		panel.add(labelList);
		
		
		
		JLabel lblProductCode = new JLabel("Date");
		lblProductCode.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblProductCode.setBounds(15, 20, 189, 39);
		panel.add(lblProductCode);
		
		textFieldDate = new JTextField();
		textFieldDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(250, 15, 276, 45);
		panel.add(textFieldDate);
		
		JLabel labelQuantity = new JLabel("Quantity");
		labelQuantity.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		labelQuantity.setBounds(15, 212, 138, 39);
		panel.add(labelQuantity);
		
		JSpinner spinnerQuantity = new JSpinner();
		spinnerQuantity.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerQuantity.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		spinnerQuantity.setBounds(250, 207, 70, 46);
		panel.add(spinnerQuantity);
		
		JLabel lblPrice = new JLabel("Price (RM)");
		lblPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblPrice.setBounds(15, 271, 223, 39);
		panel.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(250, 266, 276, 45);
		panel.add(textFieldPrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(570, 120, 603, 358);
		contentPane.add(panel_1);
		
		JScrollPane scrollPaneInventory = new JScrollPane();
		scrollPaneInventory.setBounds(11, 17, 577, 266);
		panel_1.add(scrollPaneInventory);
		
		tableInventory = new JTable();
		tableInventory.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Type Of Product", "List Of Product", "Quantity", "Price Per Product (RM)", "Total Price (RM)"
			}
		));
		tableInventory.getColumnModel().getColumn(0).setPreferredWidth(106);
		tableInventory.getColumnModel().getColumn(1).setPreferredWidth(259);
		tableInventory.getColumnModel().getColumn(2).setPreferredWidth(227);
		tableInventory.getColumnModel().getColumn(3).setPreferredWidth(139);
		tableInventory.getColumnModel().getColumn(4).setPreferredWidth(355);
		tableInventory.getColumnModel().getColumn(5).setPreferredWidth(252);
		scrollPaneInventory.setViewportView(tableInventory);
		
		JButton button = new JButton("Upload");
		button.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\khooy\\Programming 2\\Assignment3\\Inventory.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableInventory.getRowCount(); i++) {
						for (int j=0; j<tableInventory.getColumnCount(); j++) {
							bw.write(tableInventory.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
						
						DefaultTableModel model = (DefaultTableModel)tableInventory.getModel();
						totalInventory=0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double product = Double.parseDouble(model.getValueAt(i, 5).toString());
							totalInventory=product+totalInventory;
						}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button.setBackground(new Color(255, 250, 205));
		button.setBounds(211, 297, 197, 47);
		panel_1.add(button);
		
		JPanel panel_5 = new JPanel();
		panel_5.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(52, 492, 229, 68);
		contentPane.add(panel_5);
		
		JButton button_2 = new JButton("Add Record");
		button_2.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double totalPrice = Double.parseDouble(textFieldPrice.getText()) * (Integer) spinnerQuantity.getValue(); 
				String totalPriceFinal = Double.toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) tableInventory.getModel();
				
				model.addRow(new Object[]{
						textFieldDate.getText(),
						comboBoxProduct.getSelectedItem(),
						comboBoxList.getSelectedItem(),
						spinnerQuantity.getValue(),
						textFieldPrice.getText(),
						totalPriceFinal,
						
				});
				
				if (tableInventory.getSelectedRow() == -1) {
					if (tableInventory.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Add Successful", "Inventory",
								JOptionPane.OK_OPTION);
					}
				}
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_2.setBackground(new Color(230, 230, 250));
		button_2.setBounds(10, 10, 207, 47);
		panel_5.add(button_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Color.BLACK, 5));
		panel_6.setBackground(new Color(255, 250, 250));
		panel_6.setBounds(285, 492, 165, 68);
		contentPane.add(panel_6);
		
		JButton button_3 = new JButton("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableInventory.getModel();
				if(tableInventory.getSelectedRow()==-1) {
					if(tableInventory.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableInventory.getSelectedRow());
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_3.setBackground(new Color(230, 230, 250));
		button_3.setBounds(10, 10, 144, 46);
		panel_6.add(button_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setBounds(622, 492, 165, 68);
		contentPane.add(panel_7);
		
		JButton button_4 = new JButton("Print");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableInventory.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_4.setBackground(new Color(230, 230, 250));
		button_4.setBounds(10, 10, 144, 47);
		panel_7.add(button_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_8.setBounds(453, 492, 165, 68);
		contentPane.add(panel_8);
		
		JButton button_5 = new JButton("Update");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableInventory.getModel();
				int i = tableInventory.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldDate.getText(), i, 0);
			    	model.setValueAt(comboBoxProduct.getSelectedItem(), i, 1);
			    	model.setValueAt(comboBoxList.getSelectedItem(), i, 2);
			    	model.setValueAt(spinnerQuantity.getValue(),i, 3);
			    	model.setValueAt(textFieldPrice.getText(), i, 4);
		
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_5.setBackground(new Color(230, 230, 250));
		button_5.setBounds(10, 10, 143, 47);
		panel_8.add(button_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_9.setBounds(791, 492, 165, 68);
		contentPane.add(panel_9);
		
		JButton button_6 = new JButton("Reset");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDate.setText("");
				comboBoxProduct.setSelectedItem("Please Select");
				comboBoxList.setSelectedItem("Please Select");
				spinnerQuantity.setValue(0);
				textFieldPrice.setText("");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_6.setBackground(new Color(230, 230, 250));
		button_6.setBounds(11, 8, 143, 47);
		panel_9.add(button_6);
		
		JPanel panel_10 = new JPanel();
		panel_10.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_10.setBounds(960, 492, 165, 68);
		contentPane.add(panel_10);
		
		JButton button_7 = new JButton("Exit");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Inventory", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_7.setBackground(new Color(230, 230, 250));
		button_7.setBounds(10, 9, 142, 47);
		panel_10.add(button_7);
		
		JLabel label = new JLabel("");
		label.setBounds(170, 78, 138, 39);
		contentPane.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 192, 203));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(420, 16, 275, 84);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		lblNewLabel.setBounds(46, 10, 213, 55);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabelInventory = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/shopping-bag.png")).getImage();
		Image n1photo = photo1.getScaledInstance(80, 80, 150);
		lblNewLabelInventory.setIcon(new ImageIcon(n1photo));
		lblNewLabelInventory.setBounds(319, 19, 97, 81);
		contentPane.add(lblNewLabelInventory);
		
		JLabel lblNewLabelBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background9.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1200, 800, 150);
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(10, -44, 1187, 638);
		contentPane.add(lblNewLabelBackground);
		
		
	}
}
