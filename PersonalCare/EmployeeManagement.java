package PersonalCare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EmployeeManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTable EmployeeInformationtable;
	private JTextField textFieldAge;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldPosition;
	private JTextField textFieldSalary;
	static double totalSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement frame = new EmployeeManagement();
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
	public EmployeeManagement() {
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeeManagement.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1194, 761);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(533, 106, 598, 401);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBackground(new Color(255, 250, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 22, 574, 291);
		panel_3.add(scrollPane);
		
		EmployeeInformationtable = new JTable();
		EmployeeInformationtable.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		EmployeeInformationtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Address", "No. Phone", "Gender", "Position", "Salary (RM)"
			}
		));
		EmployeeInformationtable.getColumnModel().getColumn(0).setPreferredWidth(118);
		EmployeeInformationtable.getColumnModel().getColumn(1).setPreferredWidth(80);
		EmployeeInformationtable.getColumnModel().getColumn(2).setPreferredWidth(139);
		EmployeeInformationtable.getColumnModel().getColumn(3).setPreferredWidth(170);
		EmployeeInformationtable.getColumnModel().getColumn(4).setPreferredWidth(129);
		EmployeeInformationtable.getColumnModel().getColumn(5).setPreferredWidth(131);
		EmployeeInformationtable.getColumnModel().getColumn(6).setPreferredWidth(183);
		scrollPane.setViewportView(EmployeeInformationtable);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(43, 106, 459, 401);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBackground(new Color(255, 250, 250));
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		NameLabel.setBounds(17, 16, 138, 39);
		panel_2.add(NameLabel);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldName.setBounds(157, 16, 276, 39);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		AddressLabel.setBounds(17, 120, 138, 39);
		panel_2.add(AddressLabel);
		
		JLabel NoPhoneLabel = new JLabel("No. Phone");
		NoPhoneLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		NoPhoneLabel.setBounds(17, 176, 138, 39);
		panel_2.add(NoPhoneLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		GenderLabel.setBounds(17, 237, 138, 39);
		panel_2.add(GenderLabel);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setBackground(new Color(255, 250, 250));
		comboBoxGender.setForeground(new Color(0, 0, 0));
		comboBoxGender.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Female", "Male"}));
		comboBoxGender.setBounds(157, 233, 276, 43);
		panel_2.add(comboBoxGender);
		
		JLabel Positionlabel = new JLabel("Position");
		Positionlabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		Positionlabel.setBounds(17, 293, 138, 39);
		panel_2.add(Positionlabel);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(157, 66, 276, 39);
		panel_2.add(textFieldAge);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(157, 120, 276, 39);
		panel_2.add(textFieldAddress);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(157, 174, 276, 39);
		panel_2.add(textFieldPhoneNumber);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblAge.setBounds(17, 66, 138, 39);
		panel_2.add(lblAge);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(157, 293, 276, 39);
		panel_2.add(textFieldPosition);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(157, 350, 276, 39);
		panel_2.add(textFieldSalary);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblSalary.setBounds(17, 350, 138, 39);
		panel_2.add(lblSalary);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(261, 19, 638, 80);
		contentPane.add(panel_1);
		panel_1.setForeground(new Color(0, 128, 0));
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBackground(new Color(255, 192, 203));
		
		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setForeground(new Color(0, 0, 0));
		lblEmployeeManagement.setBackground(new Color(255, 250, 205));
		lblEmployeeManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 55));
		lblEmployeeManagement.setBounds(6, 0, 636, 77);
		panel_1.add(lblEmployeeManagement);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\khooy\\Programming 2\\Assignment3\\Employee Management.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<EmployeeInformationtable.getRowCount(); i++) {
						for (int j=0; j<EmployeeInformationtable.getColumnCount(); j++) {
							bw.write(EmployeeInformationtable.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
						
						DefaultTableModel model = (DefaultTableModel) EmployeeInformationtable.getModel();
						totalSalary=0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double salary = Double.parseDouble(model.getValueAt(i, 6).toString());
							totalSalary = salary+totalSalary;
						}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		UploadButton.setBackground(new Color(224, 255, 255));
		UploadButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		UploadButton.setBounds(189, 321, 197, 47);
		panel_3.add(UploadButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(944, 512, 160, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.setBounds(10, 8, 139, 47);
		panel.add(ExitButton);
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ExitButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(31, 512, 234, 66);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBackground(new Color(255, 250, 250));
		
		JButton AddRecordButton = new JButton("Add Record");
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) EmployeeInformationtable.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAge.getText(),
						textFieldAddress.getText(),
						textFieldPhoneNumber.getText(),
						comboBoxGender.getSelectedItem(),
						textFieldPosition.getText(),
						textFieldSalary.getText(),
						
				});
				
				if (EmployeeInformationtable.getSelectedRow() == -1) {
					if (EmployeeInformationtable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Employee Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		
		});
		AddRecordButton.setBackground(new Color(230, 230, 250));
		AddRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		AddRecordButton.setBounds(10, 8, 216, 47);
		panel_4.add(AddRecordButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setLayout(null);
		panel_5.setBounds(775, 512, 160, 66);
		contentPane.add(panel_5);
		
		JButton PrintButton = new JButton("Print");
		PrintButton.setBounds(10, 8, 139, 47);
		panel_5.add(PrintButton);
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EmployeeInformationtable.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		PrintButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		PrintButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_6.setLayout(null);
		panel_6.setBounds(271, 512, 160, 66);
		contentPane.add(panel_6);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setBounds(10, 8, 139, 47);
		panel_6.add(DeleteButton);
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)EmployeeInformationtable.getModel();
				if(EmployeeInformationtable.getSelectedRow()==-1) {
					if(EmployeeInformationtable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(EmployeeInformationtable.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		DeleteButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setLayout(null);
		panel_7.setBounds(438, 512, 160, 66);
		contentPane.add(panel_7);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.setBounds(10, 8, 139, 47);
		panel_7.add(UpdateButton);
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)EmployeeInformationtable.getModel();
				int i = EmployeeInformationtable.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(textFieldAge.getText(), i, 1);
			    	model.setValueAt(textFieldAddress.getText(), i, 2);
			    	model.setValueAt(textFieldPhoneNumber.getText(), i, 3);
			    	model.setValueAt(comboBoxGender.getSelectedItem(), i, 4);
			    	model.setValueAt(textFieldPosition.getText(), i, 5);
			    	model.setValueAt(textFieldSalary.getText(), i, 6);
		
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
			
		});
		UpdateButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		UpdateButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_8.setLayout(null);
		panel_8.setBounds(606, 512, 160, 66);
		contentPane.add(panel_8);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.setBounds(10, 8, 139, 47);
		panel_8.add(ResetButton);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				textFieldAddress.setText("");
				textFieldPhoneNumber.setText("");
				comboBoxGender.setSelectedItem("Please select");
				textFieldPosition.setText("");
				textFieldSalary.setText("");
				
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ResetButton.setBackground(new Color(230, 230, 250));
		
	
		JLabel EmployeeLabel = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Employee2.png")).getImage();
		Image n1photo = photo1.getScaledInstance(80, 80, 1);
		EmployeeLabel.setBounds(153, 9, 88, 90);
		contentPane.add(EmployeeLabel);
		EmployeeLabel.setIcon(new ImageIcon(n1photo));
		
		JLabel lblNewLabelBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background9.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1300, 620, 150);
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(0, -33, 1200, 648);
		contentPane.add(lblNewLabelBackground);
	}
}
