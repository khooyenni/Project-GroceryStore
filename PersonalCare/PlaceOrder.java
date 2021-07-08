package PersonalCare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PlaceOrder extends JFrame {
	private JComboBox comboBoxList;
	private JComboBox comboBoxTypeOfDelivery;
	private JOptionPane spinnerQuantity;
	private JComboBox comboBoxProduct;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTable tableOrderInformation;
	private JTextField textFieldTotalPrice;
	static double totalIncome;
	private JTextField TotalPricetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaceOrder frame = new PlaceOrder();
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
	public PlaceOrder() {
		

		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PlaceOrder.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1237, 750);
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
		
		
		JPanel panelTable = new JPanel();
		panelTable.setBounds(580, 100, 603, 329);
		contentPane.add(panelTable);
		panelTable.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panelTable.setBackground(new Color(253, 245, 230));
		panelTable.setLayout(null);
		
		JScrollPane scrollPaneOrder = new JScrollPane();
		scrollPaneOrder.setBounds(11, 17, 577, 243);
		panelTable.add(scrollPaneOrder);
		
		tableOrderInformation = new JTable();
		tableOrderInformation.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Type of Product", "Product Name", "Quantity", "Delivery", "Price (RM)", "Total Price (RM)"
			}
		));
		tableOrderInformation.getColumnModel().getColumn(0).setPreferredWidth(137);
		tableOrderInformation.getColumnModel().getColumn(1).setPreferredWidth(246);
		tableOrderInformation.getColumnModel().getColumn(2).setPreferredWidth(219);
		tableOrderInformation.getColumnModel().getColumn(3).setPreferredWidth(140);
		tableOrderInformation.getColumnModel().getColumn(4).setPreferredWidth(134);
		tableOrderInformation.getColumnModel().getColumn(5).setPreferredWidth(169);
		tableOrderInformation.getColumnModel().getColumn(6).setPreferredWidth(249);
		tableOrderInformation.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		scrollPaneOrder.setViewportView(tableOrderInformation);
		
		JButton button = new JButton("Upload");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\khooy\\Programming 2\\Assignment3\\Order.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableOrderInformation.getRowCount(); i++) {
						for (int j=0; j<tableOrderInformation.getColumnCount(); j++) {
							bw.write(tableOrderInformation.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
						
						DefaultTableModel model = (DefaultTableModel)tableOrderInformation.getModel();
						totalIncome=0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double sales = Double.parseDouble(model.getValueAt(i, 6).toString());
							totalIncome=sales+totalIncome;
						}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button.setBackground(new Color(255, 250, 205));
		button.setBounds(218, 271, 197, 47);
		panelTable.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 100, 539, 329);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBackground(new Color(253, 245, 230));
		
		JLabel label = new JLabel("Type of Product");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		label.setBounds(15, 83, 223, 36);
		panel_2.add(label);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Cosmetic", "Shampoo"}));
		comboBoxProduct.setBounds(250, 80, 281, 42);
		panel_2.add(comboBoxProduct);
		
		JLabel label_1 = new JLabel("List of Product");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		label_1.setBounds(15, 154, 223, 36);
		panel_2.add(label_1);
		
		JComboBox comboBoxList= new JComboBox();
		comboBoxList.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		comboBoxList.setBounds(250, 151, 281, 42);
		panel_2.add(comboBoxList);
		
		comboBoxProduct.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
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
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(15, 20, 138, 39);
		panel_2.add(lblName);
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		textFieldName.setBounds(250, 15, 276, 45);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblQuantity.setBounds(15, 212, 138, 39);
		panel_2.add(lblQuantity);
		
		JSpinner spinnerQuantity = new JSpinner();
		spinnerQuantity.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		spinnerQuantity.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinnerQuantity.setBounds(250, 207, 70, 46);
		panel_2.add(spinnerQuantity);
		
		JLabel lblDeliveryOption = new JLabel("Delivery Option");
		lblDeliveryOption.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblDeliveryOption.setBounds(15, 271, 223, 39);
		panel_2.add(lblDeliveryOption);
		
		JComboBox comboBoxTypeOfDelivery = new JComboBox();
		comboBoxTypeOfDelivery.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Self Pick Up", "Gdex", "J&T", "Pos Laju"}));
		comboBoxTypeOfDelivery.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		comboBoxTypeOfDelivery.setBounds(250, 268, 281, 42);
		panel_2.add(comboBoxTypeOfDelivery);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(58, 504, 189, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton AddButton = new JButton("Add ");
		AddButton.setBackground(new Color(230, 230, 250));
		AddButton.setBounds(11, 10, 170, 49);
		panel_1.add(AddButton);
		AddButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
		
				String price = " ";
				double priceKateEyebrowColour3D = ProductSetPrice.KateEyebrow;
				double price3CEEyebrowMascara = ProductSetPrice.ThreeCEEyebrow;
				double priceTailLastingBrushLiner = ProductSetPrice.TailLasting;
				double priceRejoiceFrizzRepairShampoo = ProductSetPrice.Rejoice;
				double priceSunsilkSuperCollagenShampooPowerShine = ProductSetPrice.Sunsilk;
				double pricePanteneProAntiDandruffShampoo = ProductSetPrice.Pantene;
				
				if (comboBoxList.getSelectedItem().equals("Kate Eyebrow Colour 3D")) {
					price = Double. toString(priceKateEyebrowColour3D); //convert double into String			
				} else if(comboBoxList.getSelectedItem().equals("3CE Eyebrow Mascara")){
					price = Double. toString(price3CEEyebrowMascara);
				} else if(comboBoxList.getSelectedItem().equals("Tail Lasting Brush Liner")){
					price = Double. toString(priceTailLastingBrushLiner);
				} else if(comboBoxList.getSelectedItem().equals("Rejoice Frizz Repair Shampoo")){
					price = Double. toString(priceRejoiceFrizzRepairShampoo);
				} else if(comboBoxList.getSelectedItem().equals("Sunsilk Super Collagen Shampoo Power Shine")){
					price = Double. toString(priceSunsilkSuperCollagenShampooPowerShine);
				} else {
					price = Double. toString(pricePanteneProAntiDandruffShampoo);
				} 
				
				double totalPrice;
				
				if(comboBoxTypeOfDelivery.getSelectedItem().equals("Self Pick Up") ) {
					Discount disc = new Discount1();
					double d = disc.discountRate();
					totalPrice = Double.parseDouble(price) * (Integer) spinnerQuantity.getValue() - ((Double.parseDouble(price) * (Integer) spinnerQuantity.getValue())* d);
				}else {
					Discount disc = new Discount2();
					double d = disc.discountRate();
					totalPrice = Double.parseDouble(price) * (Integer) spinnerQuantity.getValue()- ((Double.parseDouble(price) * (Integer) spinnerQuantity.getValue())* d); //convert String to double
				}
				
				String totalPriceFinal = Double. toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) tableOrderInformation.getModel();
				model.addRow(new Object[]{
						textFieldName.getText(),
						comboBoxProduct.getSelectedItem(),
						comboBoxList.getSelectedItem(),
						spinnerQuantity.getValue(),
						comboBoxTypeOfDelivery.getSelectedItem(),
						price,
						totalPriceFinal,
	
												
				});
				
				if (tableOrderInformation.getSelectedRow() == -1) {
					if (tableOrderInformation.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Item Added Succesful", "Add Item",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		AddButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 182, 193));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(398, 13, 332, 73);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPlaceOrder = new JLabel("Place Order");
		lblPlaceOrder.setBounds(31, 0, 286, 61);
		panel_3.add(lblPlaceOrder);
		lblPlaceOrder.setForeground(new Color(0, 0, 0));
		lblPlaceOrder.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_8.setBounds(615, 504, 165, 68);
		contentPane.add(panel_8);
		
		JButton button_5 = new JButton("Print");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableOrderInformation.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_5.setBackground(new Color(230, 230, 250));
		button_5.setBounds(10, 10, 144, 47);
		panel_8.add(button_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_9.setBounds(784, 504, 165, 68);
		contentPane.add(panel_9);
		
		JButton button_6 = new JButton("Reset");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFieldName.setText("");
				comboBoxProduct.setSelectedItem("Please Select");
				comboBoxList.setSelectedItem("Please Select");
				spinnerQuantity.setValue(0);
				comboBoxTypeOfDelivery.setSelectedItem("Please Select");
				TotalPricetextField.setText("");
				
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_6.setBackground(new Color(230, 230, 250));
		button_6.setBounds(11, 8, 143, 47);
		panel_9.add(button_6);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_10.setBounds(953, 504, 165, 68);
		contentPane.add(panel_10);
		
		JButton button_7 = new JButton("Exit");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Place Order", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_7.setBackground(new Color(230, 230, 250));
		button_7.setBounds(10, 9, 142, 47);
		panel_10.add(button_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(251, 504, 189, 66);
		contentPane.add(panel_4);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(11, 8, 166, 49);
		panel_4.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)tableOrderInformation.getModel();
				if(tableOrderInformation.getSelectedRow()==-1) {
					if(tableOrderInformation.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Order Information", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Order Information", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableOrderInformation.getSelectedRow());
				}
			
			}
		});
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		
		JButton btnNewButton = new JButton("Total Price");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)tableOrderInformation.getModel();
				totalIncome=0;
				
				for(int i=0; i<model.getRowCount(); i++) {
					double sales = Double.parseDouble(model.getValueAt(i, 6).toString());
					totalIncome=sales+totalIncome;
						
			}
				TotalPricetextField.setText(String.format("%.2f", PlaceOrder.totalIncome));
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setBounds(331, 441, 227, 47);
		contentPane.add(btnNewButton);
		
		TotalPricetextField = new JTextField();
		TotalPricetextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		TotalPricetextField.setBounds(590, 441, 227, 45);
		contentPane.add(TotalPricetextField);
		TotalPricetextField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_7.setBounds(446, 504, 165, 68);
		contentPane.add(panel_7);
		
		JButton button_4 = new JButton("Update");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableOrderInformation.getModel();
				int i = tableOrderInformation.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(comboBoxProduct.getSelectedItem(), i, 1);
			    	model.setValueAt(comboBoxList.getSelectedItem(), i, 2);
			    	model.setValueAt(spinnerQuantity.getValue(), i, 3);
			    	model.setValueAt(comboBoxTypeOfDelivery.getSelectedItem(), i, 4);
		
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_4.setBackground(new Color(230, 230, 250));
		button_4.setBounds(10, 10, 143, 47);
		panel_7.add(button_4);
		
		
		JLabel lblNewLabelOrder = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/order1.png")).getImage();
		Image n7photo = photo7.getScaledInstance(120, 120, 150);
		lblNewLabelOrder.setIcon(new ImageIcon(n7photo));
		lblNewLabelOrder.setBounds(261, 0, 165, 98);
		contentPane.add(lblNewLabelOrder);
		
		JLabel lblBackground = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background2.jpg")).getImage();
		Image n1photo = photo1.getScaledInstance(1200, 800, 150);
		lblBackground.setIcon(new ImageIcon(n1photo));
		lblBackground.setBounds(0, 0, 1201, 588);
		contentPane.add(lblBackground);
		
		JButton button_1 = new JButton("Upload");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		button_1.setBackground(new Color(255, 250, 205));
		button_1.setBounds(760, 390, 197, 47);
		contentPane.add(button_1);
	
	}
}
