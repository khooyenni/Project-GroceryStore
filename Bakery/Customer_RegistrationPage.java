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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Customer_RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_hpNo;
	private JTextField textField_address;
	private JTextField textField_city;
	private JTextField textField_postcode;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_RegistrationPage frame = new Customer_RegistrationPage();
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
	public Customer_RegistrationPage() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setTitle("Cherry On Top Bakery");
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Customer_RegistrationPage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(255, 245, 238));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_customerRegistration = new JLabel("Customer Registration");
		lbl_customerRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_customerRegistration.setForeground(new Color(139, 69, 19));
		lbl_customerRegistration.setFont(new Font("Gabriola", Font.BOLD, 40));
		lbl_customerRegistration.setBounds(292, 16, 369, 47);
		panel.add(lbl_customerRegistration);
		
		JLabel lbl_information = new JLabel("Please provide us with your information.");
		lbl_information.setForeground(new Color(160, 82, 45));
		lbl_information.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_information.setBounds(30, 72, 333, 27);
		panel.add(lbl_information);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(30, 102, 333, 334);
		panel.add(panel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(15, 17, 89, 26);
		lblName.setForeground(new Color(139, 69, 19));
		lblName.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		textField_name = new JTextField();
		textField_name.setBackground(new Color(245, 255, 250));
		textField_name.setBounds(111, 16, 206, 26);
		textField_name.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_name.setColumns(10);
		
		JLabel lblHPNo = new JLabel("HP No");
		lblHPNo.setBounds(15, 60, 89, 26);
		lblHPNo.setForeground(new Color(139, 69, 19));
		lblHPNo.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		textField_hpNo = new JTextField();
		textField_hpNo.setBackground(new Color(245, 255, 250));
		textField_hpNo.setBounds(111, 59, 206, 26);
		textField_hpNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_hpNo.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(15, 102, 89, 26);
		lblAddress.setForeground(new Color(139, 69, 19));
		lblAddress.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		textField_address = new JTextField();
		textField_address.setBackground(new Color(245, 255, 250));
		textField_address.setBounds(111, 101, 206, 26);
		textField_address.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_address.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(15, 144, 89, 26);
		lblCity.setForeground(new Color(139, 69, 19));
		lblCity.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		textField_city = new JTextField();
		textField_city.setBackground(new Color(245, 255, 250));
		textField_city.setBounds(111, 143, 206, 26);
		textField_city.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_city.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(15, 186, 89, 26);
		lblState.setForeground(new Color(139, 69, 19));
		lblState.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(15, 228, 89, 26);
		lblPostcode.setForeground(new Color(139, 69, 19));
		lblPostcode.setFont(new Font("Dubai", Font.PLAIN, 20));
		
		textField_postcode = new JTextField();
		textField_postcode.setBackground(new Color(245, 255, 250));
		textField_postcode.setBounds(111, 227, 206, 26);
		textField_postcode.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_postcode.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(lblName);
		panel_1.add(textField_name);
		panel_1.add(lblHPNo);
		panel_1.add(textField_hpNo);
		panel_1.add(lblAddress);
		panel_1.add(textField_address);
		panel_1.add(lblCity);
		panel_1.add(textField_city);
		panel_1.add(lblState);
		
		JComboBox cmBox_state = new JComboBox();
		cmBox_state.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		cmBox_state.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_state.setBackground(new Color(245, 255, 250));
		cmBox_state.setBounds(111, 185, 206, 26);
		panel_1.add(cmBox_state);
		panel_1.add(lblPostcode);
		panel_1.add(textField_postcode);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBackground(new Color(230, 230, 250));
		btnSave.setFont(new Font("Dubai", Font.BOLD, 18));
		btnSave.setBounds(111, 282, 106, 35);
		panel_1.add(btnSave);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBounds(392, 102, 530, 334);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "HP No.", "Address", "City", "State", "Postcode"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpload.setBackground(new Color(230, 230, 250));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(202)
					.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(204, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(12)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
					.addGap(12))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addGap(13)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(230, 230, 250));
		btnUpdate.setBounds(30, 464, 125, 40);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(341, 464, 125, 40);
		panel.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dubai", Font.BOLD, 18));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(186, 464, 125, 40);
		panel.add(btnReset);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setFont(new Font("Dubai", Font.BOLD, 18));
		btnOrder.setBackground(new Color(230, 230, 250));
		btnOrder.setBounds(493, 464, 125, 40);
		panel.add(btnOrder);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Dubai", Font.BOLD, 18));
		btnPrint.setBackground(new Color(230, 230, 250));
		btnPrint.setBounds(646, 464, 125, 40);
		panel.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Dubai", Font.BOLD, 18));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(797, 464, 125, 40);
		panel.add(btnExit);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Customer_RegistrationPage.class.getResource("/BakeryIcons/1 back icon seashell.png")));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBackground(new Color(253, 245, 230));
		btnBack.setBounds(906, 16, 28, 28);
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 245, 238));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 245, 238));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setForeground(new Color(139, 69, 19));
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setBackground(new Color(255, 245, 238));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.setForeground(new Color(139, 69, 19));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setBackground(new Color(255, 245, 238));
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAboutUs.setBackground(new Color(255, 245, 238));
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setBackground(new Color(255, 245, 238));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("OurProducts");
		mntmOurProducts.setBackground(new Color(255, 245, 238));
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmOurProducts);
		
		JMenuItem mntmOrderHere = new JMenuItem("OrderHere");
		mntmOrderHere.setForeground(new Color(139, 69, 19));
		mntmOrderHere.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOrderHere.setBackground(new Color(255, 245, 238));
		mnHome.add(mntmOrderHere);
		
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
				textField_hpNo.setText(model.getValueAt(i, 1).toString());
				textField_address.setText(model.getValueAt(i, 2).toString());
				textField_city.setText(model.getValueAt(i, 3).toString());
				cmBox_state.setSelectedItem(model.getValueAt(i, 4).toString());
				textField_postcode.setText(model.getValueAt(i, 5).toString());
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					if(textField_name.getText().equals("") 
							|| textField_name.getText().equals("") 
							|| textField_hpNo.getText().equals("") 
							|| textField_address.getText().equals("") 
							|| textField_city.getText().equals("") 
							|| cmBox_state.getSelectedItem().equals("Select...") 
							|| textField_postcode.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill in all the information.");
					}
					
					else {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						
						model.addRow(new Object[]{
								textField_name.getText(),
								textField_hpNo.getText(),
								textField_address.getText(),
								textField_city.getText(),
								cmBox_state.getSelectedItem(),
								textField_postcode.getText(),
						});

						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Information updated.", "Customer Registration Management", JOptionPane.OK_OPTION);
							}
						}
					}
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill in all the information.");
				}
				
			}
		});

		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					File file = new File("C:\\Users\\Asus\\Desktop\\Text File\\Customer Registration.txt");
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

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField_name.getText(),i,0);
			    	model.setValueAt(textField_hpNo.getText(),i,1);
			    	model.setValueAt(textField_address.getText(),i,2);
			    	model.setValueAt(textField_city.getText(),i,3);
			    	model.setValueAt(cmBox_state.getSelectedItem(),i,4);
			    	model.setValueAt(textField_postcode.getText(),i,5);
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
				textField_name.setText("");
				textField_hpNo.setText("");
				textField_address.setText("");
				textField_city.setText("");
				cmBox_state.setSelectedItem("Select...");
				textField_postcode.setText("");
			}
		});

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"There is no data to delete.",
								"Customer Registration Management", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Please select a row to delete.",
								"Customer Registration Management", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		btnOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) { 
					try {
						if(table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Please register first.");
						}
						else {

							//calling another frame -> Customer_OrderPage
							Customer_OrderPage frame = new Customer_OrderPage();
							frame.setModalExclusionType(null);
							frame.setVisible(true);
							dispose(); //Customer_RegistrationPage will disappear
						}
					} 
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Please register first.");
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
				//back to home page frame -> Customer_HomePage
				Customer_HomePage frame = new Customer_HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_RegistrationPage will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					
					frame.setVisible(true);
					dispose();
				}
			}
		});
		
		mntmCHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customer_HomePage frame = new Customer_HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BakeryBackground frame = new BakeryBackground();
				frame.setVisible(true);
				dispose();
			}
		});

		mntmAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementAndMarketing frame = new AdvertisementAndMarketing();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmOurProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription frame = new ProductDescription();
				frame.setVisible(true);
				dispose();
			}
		});
		
		mntmOrderHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_RegistrationPage frame = new Customer_RegistrationPage();
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
