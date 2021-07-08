package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
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
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_emID;
	private JTextField textField_emIC;
	private JTextField textField_phNum;
	private JTextField textField_salary;
	private JTextField textField_age;
	private JTextField textField_position;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JTable table;
	protected static double sum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setTitle("Cherry On Top Bakery");
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(255, 250, 240));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		
		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagement.setForeground(new Color(139, 69, 19));
		lblEmployeeManagement.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblEmployeeManagement.setBounds(298, 16, 369, 41);
		panel.add(lblEmployeeManagement);
		
		JLabel lblPleaseFill_In = new JLabel("Please fill in the employee information.");
		lblPleaseFill_In.setForeground(new Color(160, 82, 45));
		lblPleaseFill_In.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPleaseFill_In.setBounds(30, 61, 333, 27);
		panel.add(lblPleaseFill_In);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(30, 90, 333, 346);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Name");
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Dubai", Font.PLAIN, 20));
		label.setBounds(15, 17, 89, 26);
		panel_1.add(label);
		
		textField_name = new JTextField();
		textField_name.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_name.setColumns(10);
		textField_name.setBackground(new Color(245, 255, 250));
		textField_name.setBounds(138, 16, 179, 26);
		panel_1.add(textField_name);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setForeground(new Color(139, 69, 19));
		lblEmployeeId.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblEmployeeId.setBounds(15, 60, 119, 26);
		panel_1.add(lblEmployeeId);
		
		textField_emID = new JTextField();
		textField_emID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_emID.setColumns(10);
		textField_emID.setBackground(new Color(245, 255, 250));
		textField_emID.setBounds(138, 59, 179, 26);
		panel_1.add(textField_emID);
		
		JLabel lblEmployeeIc = new JLabel("IC Number");
		lblEmployeeIc.setForeground(new Color(139, 69, 19));
		lblEmployeeIc.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblEmployeeIc.setBounds(15, 102, 89, 26);
		panel_1.add(lblEmployeeIc);
		
		textField_emIC = new JTextField();
		textField_emIC.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_emIC.setColumns(10);
		textField_emIC.setBackground(new Color(245, 255, 250));
		textField_emIC.setBounds(138, 101, 179, 26);
		panel_1.add(textField_emIC);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(139, 69, 19));
		lblGender.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblGender.setBounds(15, 144, 89, 26);
		panel_1.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		rdbtnMale.setBackground(new Color(255, 250, 250));
		buttonGroupGender.add(rdbtnMale);
		rdbtnMale.setBounds(138, 142, 81, 29);
		panel_1.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(255, 250, 250));
		rdbtnFemale.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		buttonGroupGender.add(rdbtnFemale);
		rdbtnFemale.setBounds(226, 142, 91, 29);
		panel_1.add(rdbtnFemale);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(new Color(139, 69, 19));
		lblAge.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblAge.setBounds(15, 186, 89, 26);
		panel_1.add(lblAge);
		
		textField_age = new JTextField();
		textField_age.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_age.setColumns(10);
		textField_age.setBackground(new Color(245, 255, 250));
		textField_age.setBounds(138, 186, 179, 26);
		panel_1.add(textField_age);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setForeground(new Color(139, 69, 19));
		lblPhoneNumber.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(15, 228, 119, 26);
		panel_1.add(lblPhoneNumber);
		
		textField_phNum = new JTextField();
		textField_phNum.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_phNum.setColumns(10);
		textField_phNum.setBackground(new Color(245, 255, 250));
		textField_phNum.setBounds(138, 227, 179, 26);
		panel_1.add(textField_phNum);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setForeground(new Color(139, 69, 19));
		lblPosition.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPosition.setBounds(15, 266, 89, 26);
		panel_1.add(lblPosition);
		
		textField_position = new JTextField();
		textField_position.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_position.setColumns(10);
		textField_position.setBackground(new Color(245, 255, 250));
		textField_position.setBounds(138, 266, 179, 26);
		panel_1.add(textField_position);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setForeground(new Color(139, 69, 19));
		lblSalary.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblSalary.setBounds(15, 308, 89, 26);
		panel_1.add(lblSalary);
		
		JLabel lblSalaryRM = new JLabel("RM");
		lblSalaryRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSalaryRM.setForeground(new Color(0, 0, 0));
		lblSalaryRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblSalaryRM.setBounds(70, 307, 64, 26);
		panel_1.add(lblSalaryRM);
		
		textField_salary = new JTextField();
		textField_salary.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_salary.setColumns(10);
		textField_salary.setBackground(new Color(245, 255, 250));
		textField_salary.setBounds(138, 307, 179, 26);
		panel_1.add(textField_salary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBounds(392, 90, 530, 346);
		panel.add(panel_2);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(75, 287, 130, 40);
		btnUpload.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpload.setBackground(new Color(230, 230, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 500, 255);
		
		JLabel lblTotalSalary = new JLabel("Total : RM");
		lblTotalSalary.setForeground(new Color(139, 69, 19));
		lblTotalSalary.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTotalSalary.setBounds(305, 289, 85, 41);
		
		JLabel lblTotalSalary2 = new JLabel("");
		lblTotalSalary2.setForeground(new Color(139, 69, 19));
		lblTotalSalary2.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblTotalSalary2.setBounds(396, 287, 119, 40);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Employee ID", "IC Number", "Gender", "Age", "Phone number", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(table);
		panel_2.setLayout(null);
		panel_2.add(btnUpload);
		panel_2.add(lblTotalSalary);
		panel_2.add(lblTotalSalary2);
		panel_2.add(scrollPane);
		
		JButton btnSave = new JButton("SAVE");
		buttonGroupGender.add(btnSave);
		btnSave.setBounds(30, 464, 125, 40);
		panel.add(btnSave);
		btnSave.setFont(new Font("Dubai", Font.BOLD, 18));
		btnSave.setBackground(new Color(230, 230, 250));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(184, 464, 125, 40);
		panel.add(btnUpdate);
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(230, 230, 250));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dubai", Font.BOLD, 18));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(337, 464, 125, 40);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(488, 464, 125, 40);
		panel.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Dubai", Font.BOLD, 18));
		btnPrint.setBackground(new Color(230, 230, 250));
		btnPrint.setBounds(641, 464, 125, 40);
		panel.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Dubai", Font.BOLD, 18));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(797, 464, 125, 40);
		panel.add(btnExit);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Employee.class.getResource("/BakeryIcons/7 back icon floralwhite.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 250, 240));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setBackground(new Color(255, 250, 240));
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
		mntmSHome.setBackground(new Color(255, 250, 240));
		mnHome.add(mntmSHome);
		
		JMenuItem mntmProducts = new JMenuItem("Products");
		mntmProducts.setForeground(new Color(139, 69, 19));
		mntmProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmProducts.setBackground(new Color(255, 250, 240));
		mnHome.add(mntmProducts);
		
		JMenuItem mntmInventory = new JMenuItem("Inventory");
		mntmInventory.setBackground(new Color(255, 250, 240));
		mntmInventory.setForeground(new Color(139, 69, 19));
		mntmInventory.setFont(new Font("Dubai", Font.PLAIN, 16));
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

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				
				textField_name.setText(model.getValueAt(i, 0).toString());
				textField_emID.setText(model.getValueAt(i, 1).toString());
				textField_emIC.setText(model.getValueAt(i, 2).toString());
				if(model.getValueAt(i, 3).equals("Male")) {
					rdbtnMale.setSelected(true);
				}
				else if(model.getValueAt(i, 3).equals("Female")) {
					rdbtnFemale.setSelected(true);
				}
				textField_age.setText(model.getValueAt(i, 4).toString());
				textField_phNum.setText(model.getValueAt(i, 5).toString());
				textField_position.setText(model.getValueAt(i, 6).toString());
				textField_salary.setText(model.getValueAt(i, 7).toString());
			}
		});

		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					File file = new File("C:\\Users\\Asus\\Desktop\\Text File\\Employee.txt");
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
					if(textField_name.getText().equals("") 
							|| textField_emID.getText().equals("") 
							|| textField_emIC.getText().equals("") 
							|| buttonGroupGender.getSelection() == null 
							|| textField_age.getText().equals("") 
							|| textField_phNum.getText().equals("") 
							|| textField_position.getText().equals("")
							|| textField_salary.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill in all the information.");
					}
					
					else {
						String gender = " ";
						
						if (rdbtnMale.isSelected()) {
							gender = rdbtnMale.getText();
						} 
						else if (rdbtnFemale.isSelected()) {
							gender = rdbtnFemale.getText();
						}
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						
						model.addRow(new Object[]{
								textField_name.getText(),
								textField_emID.getText(),
								textField_emIC.getText(),
								gender,
								textField_age.getText(),
								textField_phNum.getText(),
								textField_position.getText(),
								textField_salary.getText(),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Information updated.", "Employee Management", JOptionPane.OK_OPTION);
							}
						}
					}	
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill in all the information.");
				}
				
				sum = 0;
				for(int i = 0; i < table.getRowCount(); i++) { 
					sum = sum + Double.parseDouble(table.getValueAt(i, 7).toString());
				}
				lblTotalSalary2.setText(String.format("%.2f", sum));
				
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String gender = " ";
				
				if (rdbtnMale.isSelected()) {
					gender = rdbtnMale.getText();
				} 
				else if (rdbtnFemale.isSelected()) {
					gender = rdbtnFemale.getText();
				}
				
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected then update
			    {
			    	model.setValueAt(textField_name.getText(),i,0);
			    	model.setValueAt(textField_emID.getText(),i,1);
			    	model.setValueAt(textField_emIC.getText(),i,2);
			    	model.setValueAt(gender,i,3);
			    	model.setValueAt(textField_age.getText(),i,4);
			    	model.setValueAt(textField_phNum.getText(),i,5);
			    	model.setValueAt(textField_position.getText(),i,6);
			    	model.setValueAt(textField_salary.getText(),i,7);
					JOptionPane.showMessageDialog(null, "Update successfully.");
					
					sum = 0;
					for(int j = 0; j < table.getRowCount(); j++) { 
						sum = sum + Double.parseDouble(table.getValueAt(j, 7).toString());
					}
					lblTotalSalary2.setText(String.format("%.2f", sum));
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please select a row to update.");
			    }
			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_name.setText("");
				textField_emID.setText("");
				textField_emIC.setText("");
				buttonGroupGender.clearSelection();
				textField_age.setText("");
				textField_phNum.setText("");
				textField_position.setText("");
				textField_salary.setText("");
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
					sum = sum + Double.parseDouble(table.getValueAt(i, 7).toString());
				}
				lblTotalSalary2.setText(String.format("%.2f", sum));
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
				//back to home page frame -> EmployeeManagementAuthority 
				EmployeeManagementAuthority frame = new EmployeeManagementAuthority();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Employee will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Employee Management", 
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
