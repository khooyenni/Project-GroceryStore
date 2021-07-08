package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Customer_OrderPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_quantity;
	private final ButtonGroup buttonGroupPreference = new ButtonGroup();
	private JTable table;
	private JTextField textField_subtotal;
	private JTextField textField_discountPercent;
	private JTextField textField_orderTotal;
	private JTextField textField_price;
	protected static double sum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_OrderPage frame = new Customer_OrderPage();
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
	public Customer_OrderPage() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setTitle("Cherry On Top Bakery");
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Customer_OrderPage.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 245, 238));
		panel.setBorder(null);
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 245, 238));
		panel_1.setBounds(0, 0, 949, 536);
		panel.add(panel_1);
		
		JLabel lblPlaceYourOrder = new JLabel("Place Your Order Here");
		lblPlaceYourOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaceYourOrder.setForeground(new Color(139, 69, 19));
		lblPlaceYourOrder.setFont(new Font("Gabriola", Font.BOLD, 40));
		lblPlaceYourOrder.setBounds(287, 16, 369, 41);
		panel_1.add(lblPlaceYourOrder);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setBounds(29, 67, 333, 448);
		panel_1.add(panel_2);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setForeground(new Color(139, 69, 19));
		lblCategory.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblCategory.setBounds(15, 17, 89, 26);
		panel_2.add(lblCategory);
		
		JComboBox cmBox_product = new JComboBox();
		cmBox_product.setModel(new DefaultComboBoxModel(new String[] {"Select..."}));
		cmBox_product.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_product.setBackground(new Color(245, 255, 250));
		cmBox_product.setBounds(111, 59, 206, 26);
		panel_2.add(cmBox_product);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setForeground(new Color(139, 69, 19));
		lblProduct.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblProduct.setBounds(15, 60, 89, 26);
		panel_2.add(lblProduct);
		
		JComboBox cmBox_category = new JComboBox();
		cmBox_category.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Bun", "Tart", "Cake"}));
		cmBox_category.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_category.setBackground(new Color(245, 255, 250));
		cmBox_category.setBounds(111, 17, 206, 26);
		panel_2.add(cmBox_category);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(139, 69, 19));
		lblPrice.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPrice.setBounds(15, 102, 89, 26);
		panel_2.add(lblPrice);
		
		JLabel lblPriceRM = new JLabel("RM");
		lblPriceRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPriceRM.setBounds(111, 102, 27, 26);
		panel_2.add(lblPriceRM);
		
		textField_price = new JTextField();
		textField_price.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_price.setColumns(10);
		textField_price.setBackground(new Color(255, 250, 250));
		textField_price.setBounds(140, 103, 177, 26);
		textField_price.setEditable(false);
		panel_2.add(textField_price);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(139, 69, 19));
		lblQuantity.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblQuantity.setBounds(15, 144, 89, 26);
		panel_2.add(lblQuantity);
		
		textField_quantity = new JTextField();
		textField_quantity.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_quantity.setColumns(10);
		textField_quantity.setBackground(new Color(245, 255, 250));
		textField_quantity.setBounds(111, 143, 206, 26);
		panel_2.add(textField_quantity);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setForeground(new Color(139, 69, 19));
		lblSubtotal.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblSubtotal.setBounds(15, 314, 89, 26);
		panel_2.add(lblSubtotal);
		
		JLabel lblSubtotalRM = new JLabel("RM");
		lblSubtotalRM.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblSubtotalRM.setBounds(111, 313, 27, 26);
		panel_2.add(lblSubtotalRM);
		
		textField_subtotal = new JTextField();
		textField_subtotal.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_subtotal.setColumns(10);
		textField_subtotal.setBackground(new Color(255, 250, 250));
		textField_subtotal.setBounds(140, 313, 177, 26);
		textField_subtotal.setEditable(false);
		panel_2.add(textField_subtotal);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setForeground(new Color(139, 69, 19));
		lblDiscount.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblDiscount.setBounds(15, 356, 89, 26);
		panel_2.add(lblDiscount);
		
		textField_discountPercent = new JTextField();
		textField_discountPercent.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		textField_discountPercent.setColumns(10);
		textField_discountPercent.setBackground(new Color(255, 250, 250));
		textField_discountPercent.setBounds(111, 355, 206, 26);
		textField_discountPercent.setEditable(false);
		panel_2.add(textField_discountPercent);
		
		JRadioButton rdbtnFoodDelivery = new JRadioButton("Food Delivery");
		rdbtnFoodDelivery.setBackground(new Color(255, 250, 250));
		buttonGroupPreference.add(rdbtnFoodDelivery);
		rdbtnFoodDelivery.setForeground(new Color(139, 69, 19));
		rdbtnFoodDelivery.setFont(new Font("Dubai", Font.PLAIN, 20));
		rdbtnFoodDelivery.setBounds(14, 225, 145, 26);
		panel_2.add(rdbtnFoodDelivery);
		
		JRadioButton rdbtnSelfPickUp = new JRadioButton("Self Pick Up");
		rdbtnSelfPickUp.setBackground(new Color(255, 250, 250));
		buttonGroupPreference.add(rdbtnSelfPickUp);
		rdbtnSelfPickUp.setFont(new Font("Dubai", Font.PLAIN, 20));
		rdbtnSelfPickUp.setForeground(new Color(139, 69, 19));
		rdbtnSelfPickUp.setBounds(176, 224, 140, 26);
		panel_2.add(rdbtnSelfPickUp);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setForeground(new Color(139, 69, 19));
		lblPaymentMethod.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblPaymentMethod.setBounds(14, 182, 145, 31);
		panel_2.add(lblPaymentMethod);
		
		JComboBox cmBox_payment = new JComboBox();
		cmBox_payment.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Online Banking", "Credit / Debit Card", "E-Wallet", "Cash On Delivery"}));
		cmBox_payment.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		cmBox_payment.setBackground(new Color(245, 255, 250));
		cmBox_payment.setBounds(162, 182, 155, 26);
		panel_2.add(cmBox_payment);
		
		JLabel lblOrderTotal = new JLabel("Order Total");
		lblOrderTotal.setForeground(new Color(139, 69, 19));
		lblOrderTotal.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblOrderTotal.setBounds(15, 398, 106, 26);
		panel_2.add(lblOrderTotal);
		
		JLabel lblOrderTotalRM = new JLabel("RM");
		lblOrderTotalRM.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblOrderTotalRM.setBounds(122, 398, 27, 26);
		panel_2.add(lblOrderTotalRM);
		
		textField_orderTotal = new JTextField();
		textField_orderTotal.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		textField_orderTotal.setColumns(10);
		textField_orderTotal.setBackground(new Color(255, 250, 250));
		textField_orderTotal.setBounds(151, 398, 166, 26);
		textField_orderTotal.setEditable(false);
		panel_2.add(textField_orderTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		panel_3.setBackground(new Color(245, 255, 250));
		panel_3.setBounds(390, 67, 530, 334);
		panel_1.add(panel_3);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(76, 275, 130, 40);
		btnUpload.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpload.setBackground(new Color(230, 230, 250));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 500, 243);
		
		JLabel lblTotalOrder = new JLabel("Total : RM");
		lblTotalOrder.setForeground(new Color(139, 69, 19));
		lblTotalOrder.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblTotalOrder.setBounds(306, 277, 85, 41);
		
		JLabel lblTotalOrder2 = new JLabel("");
		lblTotalOrder2.setForeground(new Color(139, 69, 19));
		lblTotalOrder2.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblTotalOrder2.setBounds(396, 275, 119, 40);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Category", "Product", "Price", "Quantity", "Subtotal", "Discount", "Payment Method", "Preference", "Order Total"
			}
		));
		scrollPane.setViewportView(table);
		panel_3.setLayout(null);
		panel_3.add(btnUpload);
		panel_3.add(lblTotalOrder);
		panel_3.add(lblTotalOrder2);
		panel_3.add(scrollPane);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Dubai", Font.BOLD, 18));
		btnTotal.setBackground(new Color(230, 230, 250));
		btnTotal.setBounds(100, 263, 125, 34);
		panel_2.add(btnTotal);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setBounds(424, 420, 125, 40);
		panel_1.add(btnOrder);
		btnOrder.setFont(new Font("Dubai", Font.BOLD, 18));
		btnOrder.setBackground(new Color(230, 230, 250));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Dubai", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(230, 230, 250));
		btnUpdate.setBounds(424, 475, 125, 40);
		panel_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Dubai", Font.BOLD, 18));
		btnDelete.setBackground(new Color(230, 230, 250));
		btnDelete.setBounds(762, 423, 125, 40);
		panel_1.add(btnDelete);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dubai", Font.BOLD, 18));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.setBounds(597, 423, 125, 40);
		panel_1.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Dubai", Font.BOLD, 18));
		btnPrint.setBackground(new Color(230, 230, 250));
		btnPrint.setBounds(597, 475, 125, 40);
		panel_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Dubai", Font.BOLD, 18));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.setBounds(762, 475, 125, 40);
		panel_1.add(btnExit);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(Customer_OrderPage.class.getResource("/BakeryIcons/1 back icon seashell.png")));
		btnBack.setFont(new Font("Dubai", Font.BOLD, 18));
		btnBack.setBackground(new Color(230, 230, 250));
		btnBack.setBounds(906, 16, 28, 28);
		panel_1.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 245, 238));
		menuBar.setBounds(15, 16, 59, 31);
		panel_1.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setBackground(new Color(255, 245, 238));
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmLogout.setForeground(new Color(139, 69, 19));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmCHome.setBackground(new Color(255, 245, 238));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setBackground(new Color(255, 245, 238));
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setBackground(new Color(255, 245, 238));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("Our Products");
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOurProducts.setBackground(new Color(255, 245, 238));
		mnHome.add(mntmOurProducts);
		
		JMenuItem mntmOrderHere = new JMenuItem("Order Here");
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
		
		cmBox_category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					final DefaultComboBoxModel bun = new DefaultComboBoxModel(new String[] {"Select...", "Mexican Coffee Bun", "Ham and Cheese Bun", "Red Bean Bun"});
					final DefaultComboBoxModel tart = new DefaultComboBoxModel(new String[] {"Select...", "Portuguese Egg Tart", "Chocolate Almond Tart", "Blueberry Cheese Tart"});
					final DefaultComboBoxModel cake = new DefaultComboBoxModel(new String[] {"Select...", "Hokkaido Triple Cheese Cake", "Moist Chocolate Cake", "Matcha Ice Cream Cake"});
					final DefaultComboBoxModel select = new DefaultComboBoxModel(new String[] {"Select..."});
					
					if(cmBox_category.getSelectedItem().equals("Bun")) {
						cmBox_product.setModel(bun);
						
						cmBox_product.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(cmBox_product.getSelectedItem().equals("Mexican Coffee Bun")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceBun_MexicanCoffee));
								}
								else if(cmBox_product.getSelectedItem().equals("Ham and Cheese Bun")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceBun_HamCheese));
								}
								else if(cmBox_product.getSelectedItem().equals("Red Bean Bun")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceBun_RedBean));
								}
								else if(cmBox_product.getSelectedItem().equals("Select...")) {
									textField_price.setText("");
								}
							}
						});	
					}
					
					else if(cmBox_category.getSelectedItem().equals("Tart")) {
						cmBox_product.setModel(tart);
						
						cmBox_product.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(cmBox_product.getSelectedItem().equals("Portuguese Egg Tart")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceTart_Portuguese));
								}
								
								else if(cmBox_product.getSelectedItem().equals("Chocolate Almond Tart")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceTart_ChocoAlmond));
								}
								
								else if(cmBox_product.getSelectedItem().equals("Blueberry Cheese Tart")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceTart_Blueberry));
								}
								else if(cmBox_product.getSelectedItem().equals("Select...")) {
									textField_price.setText("");
								}
							}
						});	
					}
					
					else if(cmBox_category.getSelectedItem().equals("Cake")) {
						cmBox_product.setModel(cake);
						
						cmBox_product.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(cmBox_product.getSelectedItem().equals("Hokkaido Triple Cheese Cake")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceCake_HokkaidoCheese));
								}
								
								else if(cmBox_product.getSelectedItem().equals("Moist Chocolate Cake")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceCake_MoistChoco));
								}
								
								else if(cmBox_product.getSelectedItem().equals("Matcha Ice Cream Cake")) {
									textField_price.setText(String.format("%.2f", ProductsPriceManage.priceCake_Matcha));
								}
								else if(cmBox_product.getSelectedItem().equals("Select...")) {
									textField_price.setText("");
								}
							}
						});	
					}

					else if(cmBox_category.getSelectedItem().equals("Select...")) {
						cmBox_product.setModel(select);
						textField_price.setText("");
					}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please select a category or a product.");
				}
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				
				cmBox_category.setSelectedItem(model.getValueAt(i, 0).toString());
				cmBox_product.setSelectedItem(model.getValueAt(i, 1).toString());
				textField_price.setText(model.getValueAt(i, 2).toString());
				textField_quantity.setText(model.getValueAt(i, 3).toString());
				textField_subtotal.setText(model.getValueAt(i, 4).toString());
				textField_discountPercent.setText(model.getValueAt(i, 5).toString());
				cmBox_payment.setSelectedItem(model.getValueAt(i, 6).toString());
				if(model.getValueAt(i, 7).equals("Food Delivery")) {
					rdbtnFoodDelivery.setSelected(true);
				}
				else if(model.getValueAt(i, 7).equals("Self Pick Up")) {
					rdbtnSelfPickUp.setSelected(true);
				}
				textField_orderTotal.setText(model.getValueAt(i, 8).toString());
			}
		});
		
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					if(cmBox_category.getSelectedItem().equals("Select...") || cmBox_product.getSelectedItem().equals("Select...")) {
						JOptionPane.showMessageDialog(null, "Error : Please select a category or a product.");
					}
					else {
						int qty = Integer.parseInt(textField_quantity.getText());
						double price = Double.parseDouble(textField_price.getText());
						
						double subtotal = qty * price;
						textField_subtotal.setText(String.format("%.2f", subtotal));
						
						if(subtotal < 30) {
							textField_discountPercent.setText("N/A");
							
							double orderTotal = subtotal;
							textField_orderTotal.setText(String.format("%.2f", orderTotal));
						}
						else if(subtotal >= 30 && subtotal <50) {
							textField_discountPercent.setText("5%");
							Discount disc = new Discount1();
							double d = disc.discountRate();
							
							double orderTotal = subtotal * (1 - d);
							textField_orderTotal.setText(String.format("%.2f", orderTotal));
						}
						else {
							textField_discountPercent.setText("10%");
							Discount disc = new Discount2();
							double d = disc.discountRate();
							
							double orderTotal = subtotal * (1 - d);
							textField_orderTotal.setText(String.format("%.2f", orderTotal));
						}
					}
					
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Error : Please enter again.");
				}
			}
		});
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {

					String preference = " ";
					
					if (rdbtnFoodDelivery.isSelected()) {
						preference = rdbtnFoodDelivery.getText();
					} 
					else if (rdbtnSelfPickUp.isSelected()) {
						preference = rdbtnSelfPickUp.getText();
					}
					
					if(cmBox_category.getSelectedItem().equals("Select...") 
							|| cmBox_product.getSelectedItem().equals("Select...") 
							|| textField_quantity.getText().equals("") 
							|| cmBox_payment.getSelectedItem().equals("Select...")
							|| buttonGroupPreference.getSelection() == null) {
						
						JOptionPane.showMessageDialog(null, "Please fill in all the information.");
					}
					
					else {
						
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						
						model.addRow(new Object[]{
								cmBox_category.getSelectedItem(),
								cmBox_product.getSelectedItem(),
								textField_price.getText(),
								textField_quantity.getText(),
								textField_subtotal.getText(),
								textField_discountPercent.getText(),
								cmBox_payment.getSelectedItem(),
								preference,
								textField_orderTotal.getText(),
						});

						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Information updated.", "Customer Order Management", JOptionPane.OK_OPTION);
							}
						}
					}
				}	
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill in all the information.");
				}
				
				sum = 0;
				for(int i = 0; i < table.getRowCount(); i++) { 
					sum = sum + Double.parseDouble(table.getValueAt(i, 8).toString());
				}
				lblTotalOrder2.setText(String.format("%.2f", sum)); 
			}
		});

		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agr0) {
				try {
					File file = new File("C:\\Users\\Asus\\Desktop\\Text File\\Customer Order.txt");
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
				
				String preference = " ";
				
				if (rdbtnFoodDelivery.isSelected()) {
					preference = rdbtnFoodDelivery.getText();
				} 
				else if (rdbtnSelfPickUp.isSelected()) {
					preference = rdbtnSelfPickUp.getText();
				}
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(cmBox_category.getSelectedItem(),i,0);
			    	model.setValueAt(cmBox_product.getSelectedItem(),i,1);
			    	model.setValueAt(textField_price.getText(),i,2);
			    	model.setValueAt(textField_quantity.getText(),i,3);
			    	model.setValueAt(textField_subtotal.getText(),i,4);
			    	model.setValueAt(textField_discountPercent.getText(),i,5);
			    	model.setValueAt(cmBox_payment.getSelectedItem(),i,6);
			    	model.setValueAt(preference,i,7);
			    	model.setValueAt(textField_orderTotal.getText(),i,8);
					JOptionPane.showMessageDialog(null, "Update successfully.");
					
					sum = 0;
					for(int j = 0; j < table.getRowCount(); j++) { 
						sum = sum + Double.parseDouble(table.getValueAt(j, 8).toString());
					}
					lblTotalOrder2.setText(String.format("%.2f", sum));
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please select a row to update.");
			    }
			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cmBox_category.setSelectedItem("Select...");
				cmBox_product.setSelectedItem("Select...");
				textField_price.setText("");
				textField_quantity.setText("");
				textField_subtotal.setText("");
				textField_discountPercent.setText("");
				cmBox_payment.setSelectedItem("Select...");
				buttonGroupPreference.clearSelection();
				textField_orderTotal.setText("");
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
					sum = sum + Double.parseDouble(table.getValueAt(i, 8).toString());
				}
				lblTotalOrder2.setText(String.format("%.2f", sum));
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

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to another frame -> Customer_RegistrationPage
				Customer_RegistrationPage frame = new Customer_RegistrationPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //Customer_OrderPage will disappear
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
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Order", 
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
