package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	private JTable CustomerRegistrationtable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CustomerRegistration.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 737);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmMainMenu = new JMenuItem("Main Menu");
		mntmMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage UserHome = new UserHomePage(); //calling another frame/window
				UserHome.setModalExclusionType(null);
				UserHome.setVisible(true);

			}
		});
		mnHome.add(mntmMainMenu);
		
		JMenu mnAboutUs = new JMenu("About Us");
		menuBar.add(mnAboutUs);
		
		JMenuItem mntmCompanyBackground = new JMenuItem("Company Background");
		mntmCompanyBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CBackground = new CompanyBackground(); //calling another frame/window
				CBackground.setModalExclusionType(null);
				CBackground.setVisible(true);

			}
		});
		mnAboutUs.add(mntmCompanyBackground);
		
		JMenuItem MenuItemProduct = new JMenuItem("Product");
		MenuItemProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription ProductDes = new ProductDescription(); //calling another frame/window
				ProductDes.setModalExclusionType(null);
				ProductDes.setVisible(true);
			}
		});
		mnAboutUs.add(MenuItemProduct);
		
		JMenu mnRegister = new JMenu("Register");
		menuBar.add(mnRegister);
		
		JMenuItem mntmCustomerRegistration = new JMenuItem("Customer Registration");
		mntmCustomerRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration cus = new CustomerRegistration(); //calling another frame/window
				cus.setModalExclusionType(null);
				cus.setVisible(true);
			}
		});
		mnRegister.add(mntmCustomerRegistration);
		
		JMenu mnNewMenu_1 = new JMenu("Promotion");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Advertisement");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementAndMarketing adv = new AdvertisementAndMarketing(); //calling another frame/window
				adv.setModalExclusionType(null);
				adv.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu MenuOrder = new JMenu("Order");
		menuBar.add(MenuOrder);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Place Order");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceOrder POrder = new PlaceOrder(); //calling another frame/window
				POrder.setModalExclusionType(null);
				POrder.setVisible(true);
			}
		});
		MenuOrder.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Exit");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to log out?", "Order", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login log = new Login(); //calling another frame/window
					log.setModalExclusionType(null);
					log.setVisible(true);
				}
			}
		});
		mnNewMenu.add(mntmLogOut);
		
		JMenuItem mntmNewMenuItemExit = new JMenuItem("Exit");
		mntmNewMenuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure want to exit?", "Order", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItemExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(540, 109, 546, 351);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBackground(new Color(255, 250, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 16, 507, 254);
		panel_3.add(scrollPane);
		
		CustomerRegistrationtable = new JTable();
		CustomerRegistrationtable.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		CustomerRegistrationtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "No. Phone", "Gender"
			}
		));
		CustomerRegistrationtable.getColumnModel().getColumn(0).setPreferredWidth(118);
		CustomerRegistrationtable.getColumnModel().getColumn(1).setPreferredWidth(160);
		CustomerRegistrationtable.getColumnModel().getColumn(2).setPreferredWidth(171);
		CustomerRegistrationtable.getColumnModel().getColumn(3).setPreferredWidth(128);
		scrollPane.setViewportView(CustomerRegistrationtable);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\khooy\\Programming 2\\Assignment3\\Customer Registration.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<CustomerRegistrationtable.getRowCount(); i++) {
						for (int j=0; j<CustomerRegistrationtable.getColumnCount(); j++) {
							bw.write(CustomerRegistrationtable.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		UploadButton.setBackground(new Color(255, 250, 205));
		UploadButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		UploadButton.setBounds(173, 288, 197, 47);
		panel_3.add(UploadButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 109, 499, 351);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBackground(new Color(255, 250, 250));
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		NameLabel.setBounds(17, 21, 138, 39);
		panel_2.add(NameLabel);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldName.setBounds(157, 16, 276, 45);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel AddressLabel = new JLabel("Address");
		AddressLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		AddressLabel.setBounds(17, 85, 138, 39);
		panel_2.add(AddressLabel);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(157, 80, 276, 45);
		panel_2.add(textFieldAddress);
		
		JLabel NoPhoneLabel = new JLabel("No. Phone");
		NoPhoneLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		NoPhoneLabel.setBounds(17, 162, 138, 39);
		panel_2.add(NoPhoneLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		GenderLabel.setBounds(17, 237, 138, 39);
		panel_2.add(GenderLabel);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(157, 157, 276, 45);
		panel_2.add(textFieldPhone);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setBackground(new Color(255, 250, 250));
		comboBoxGender.setForeground(new Color(0, 0, 0));
		comboBoxGender.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Female", "Male"}));
		comboBoxGender.setBounds(157, 234, 276, 45);
		panel_2.add(comboBoxGender);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(243, 493, 165, 68);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.BLACK, 5));
		panel_4.setBackground(new Color(255, 250, 250));
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)CustomerRegistrationtable.getModel();
				if(CustomerRegistrationtable.getSelectedRow()==-1) {
					if(CustomerRegistrationtable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(CustomerRegistrationtable.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		DeleteButton.setBackground(new Color(230, 230, 250));
		DeleteButton.setBounds(10, 10, 144, 46);
		panel_4.add(DeleteButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(10, 493, 229, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton AddRecordButton = new JButton("Add Record");
		AddRecordButton.setBounds(10, 10, 207, 47);
		panel.add(AddRecordButton);
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) CustomerRegistrationtable.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAddress.getText(),
						comboBoxGender.getSelectedItem(),
						textFieldPhone.getText(),
						
				});
				
				if (CustomerRegistrationtable.getSelectedRow() == -1) {
					if (CustomerRegistrationtable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		
		});
		AddRecordButton.setBackground(new Color(230, 230, 250));
		AddRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(266, 11, 553, 86);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBackground(new Color(255, 192, 203));
		
		JLabel lblCustomerRegistration = new JLabel("Customer Registration");
		lblCustomerRegistration.setForeground(new Color(0, 0, 0));
		lblCustomerRegistration.setBackground(new Color(250, 128, 114));
		lblCustomerRegistration.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblCustomerRegistration.setBounds(9, 0, 546, 71);
		panel_1.add(lblCustomerRegistration);
		
		JLabel lblNewLabelBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background7.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1159, 575, 150);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setLayout(null);
		panel_5.setBounds(752, 493, 165, 68);
		contentPane.add(panel_5);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.setBounds(11, 8, 143, 47);
		panel_5.add(ResetButton);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAddress.setText("");
				textFieldPhone.setText("");
				comboBoxGender.setSelectedItem("Please select");
			}
			
		});
		ResetButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ResetButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_6.setLayout(null);
		panel_6.setBounds(921, 493, 165, 68);
		contentPane.add(panel_6);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.setBounds(10, 9, 142, 47);
		panel_6.add(ExitButton);
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		ExitButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setLayout(null);
		panel_7.setBounds(580, 493, 165, 68);
		contentPane.add(panel_7);
		
		JButton PrintButton = new JButton("Print");
		PrintButton.setBounds(10, 10, 144, 47);
		panel_7.add(PrintButton);
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CustomerRegistrationtable.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		PrintButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		PrintButton.setBackground(new Color(230, 230, 250));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_8.setLayout(null);
		panel_8.setBounds(411, 493, 165, 68);
		contentPane.add(panel_8);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.setBounds(10, 10, 143, 47);
		panel_8.add(UpdateButton);
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)CustomerRegistrationtable.getModel();
				int i = CustomerRegistrationtable.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(textFieldAddress.getText(), i, 1);
			    	model.setValueAt(textFieldPhone.getText(), i, 2);
			    	model.setValueAt(comboBoxGender.getSelectedItem(), i, 3);
		
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
		lblNewLabelBackground.setIcon(new ImageIcon(n7photo));
		lblNewLabelBackground.setBounds(-12, 0, 1119, 575);
		contentPane.add(lblNewLabelBackground);
	}
}
