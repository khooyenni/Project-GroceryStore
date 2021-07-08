package Bakery;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ProductDescription extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDescription frame = new ProductDescription();
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
	public ProductDescription() {
		
		//-------------------------------------------------------//
		//---------------- Initialize Components ----------------//
		//-------------------------------------------------------//
		
		setFont(new Font("Gabriola", Font.BOLD, 12));
		setTitle("Cherry On Top Bakery");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductDescription.class.getResource("/BakeryIcons/Cherry Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(0, 0, 949, 536);
		contentPane.add(panel);
		
		JLabel lblOurProduct = new JLabel("Our Products");
		lblOurProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblOurProduct.setForeground(new Color(160, 82, 45));
		lblOurProduct.setFont(new Font("Gabriola", Font.PLAIN, 40));
		lblOurProduct.setBounds(319, 16, 295, 48);
		panel.add(lblOurProduct);
		
		JLabel lblSelectCategory = new JLabel("Select a category :");
		lblSelectCategory.setForeground(new Color(160, 82, 45));
		lblSelectCategory.setFont(new Font("Dubai", Font.PLAIN, 25));
		lblSelectCategory.setBounds(56, 106, 188, 27);
		panel.add(lblSelectCategory);
		
		JComboBox cmBox_category = new JComboBox();
		cmBox_category.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Bun", "Tart", "Cake"}));
		cmBox_category.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		cmBox_category.setBackground(new Color(245, 255, 250));
		cmBox_category.setBounds(56, 142, 270, 35);
		panel.add(cmBox_category);
		
		JLabel lblSelectProduct = new JLabel("Select a product  :");
		lblSelectProduct.setForeground(new Color(160, 82, 45));
		lblSelectProduct.setFont(new Font("Dubai", Font.PLAIN, 25));
		lblSelectProduct.setBounds(56, 204, 188, 27);
		panel.add(lblSelectProduct);
		
		JComboBox cmBox_product = new JComboBox();
		cmBox_product.setModel(new DefaultComboBoxModel(new String[] {"Select..."}));
		cmBox_product.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		cmBox_product.setBackground(new Color(245, 255, 250));
		cmBox_product.setBounds(56, 240, 270, 35);
		panel.add(cmBox_product);
		
		JButton btnCheck = new JButton("CHECK");
		btnCheck.setForeground(new Color(139, 69, 19));
		btnCheck.setBackground(new Color(245, 255, 250));
		btnCheck.setFont(new Font("Dubai", Font.PLAIN, 20));
		btnCheck.setBounds(137, 315, 101, 35);
		panel.add(btnCheck);
		
		JButton btnRegisterToOrder = new JButton("REGISTER TO ORDER");
		btnRegisterToOrder.setForeground(new Color(139, 69, 19));
		btnRegisterToOrder.setFont(new Font("Dubai", Font.PLAIN, 20));
		btnRegisterToOrder.setBackground(new Color(240, 255, 240));
		btnRegisterToOrder.setBounds(79, 409, 222, 54);
		panel.add(btnRegisterToOrder);
		
		JLabel lbl_productImage = new JLabel("");
		lbl_productImage.setIcon(new ImageIcon(ProductDescription.class.getResource("/BakeryIcons/Cherry Logo 4.png")));
		lbl_productImage.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_productImage.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_productImage.setBounds(741, 60, 180, 180);
		panel.add(lbl_productImage);
		
		JLabel lbl_productName = new JLabel("");
		lbl_productName.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_productName.setFont(new Font("Gabriola", Font.BOLD, 25));
		lbl_productName.setBounds(414, 110, 289, 48);
		panel.add(lbl_productName);
		
		JLabel lbl_productPrice = new JLabel("");
		lbl_productPrice.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_productPrice.setFont(new Font("Dubai", Font.PLAIN, 20));
		lbl_productPrice.setBounds(655, 160, 48, 35);
		panel.add(lbl_productPrice);
		
		JPanel panel_descBox = new JPanel();
		panel_descBox.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(216, 191, 216)));
		panel_descBox.setBackground(new Color(255, 240, 245));
		panel_descBox.setBounds(399, 260, 522, 260);
		panel.add(panel_descBox);
		
		JLabel lblIngredients = new JLabel("Ingredients :");
		lblIngredients.setBounds(15, 107, 162, 25);
		lblIngredients.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		
		JLabel lblCalories = new JLabel("Calories :");
		lblCalories.setBounds(15, 204, 121, 34);
		lblCalories.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 46, 492, 45);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 136, 492, 45);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(107, 208, 400, 34);
		panel_descBox.setLayout(null);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(15, 16, 162, 25);
		lblDescription.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		panel_descBox.add(lblDescription);
		panel_descBox.add(scrollPane);
		
		JTextArea textArea_description = new JTextArea();
		scrollPane.setViewportView(textArea_description);
		textArea_description.setFont(new Font("Dubai", Font.PLAIN, 15));
		textArea_description.setEditable(false);
		panel_descBox.add(lblIngredients);
		panel_descBox.add(scrollPane_1);
		
		JTextArea textArea_ingredients = new JTextArea();
		scrollPane_1.setViewportView(textArea_ingredients);
		textArea_ingredients.setFont(new Font("Dubai", Font.PLAIN, 15));
		textArea_ingredients.setEditable(false);
		panel_descBox.add(lblCalories);
		panel_descBox.add(scrollPane_2);
		
		JTextArea textArea_calories = new JTextArea();
		scrollPane_2.setViewportView(textArea_calories);
		textArea_calories.setFont(new Font("Dubai", Font.PLAIN, 15));
		textArea_calories.setEditable(false);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(new Color(139, 69, 19));
		btnBack.setBackground(new Color(245, 255, 250));
		btnBack.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		btnBack.setBounds(151, 509, 69, 27);
		panel.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(139, 69, 19));
		menuBar.setFont(new Font("Dubai", Font.PLAIN, 18));
		menuBar.setBackground(new Color(255, 250, 250));
		menuBar.setBounds(15, 16, 59, 31);
		panel.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setForeground(new Color(139, 69, 19));
		mnMenu.setFont(new Font("Dubai", Font.PLAIN, 18));
		mnMenu.setBackground(new Color(255, 250, 250));
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmLogout.setForeground(new Color(139, 69, 19));
		mnMenu.add(mntmLogout);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.setForeground(new Color(139, 69, 19));
		mnHome.setBackground(new Color(255, 250, 250));
		mnMenu.add(mnHome);
		
		JMenuItem mntmCHome = new JMenuItem("Home");
		mntmCHome.setBackground(new Color(255, 250, 250));
		mntmCHome.setForeground(new Color(139, 69, 19));
		mntmCHome.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnHome.add(mntmCHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAboutUs.setForeground(new Color(139, 69, 19));
		mntmAboutUs.setBackground(new Color(255, 250, 250));
		mnHome.add(mntmAboutUs);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmAdvertisement.setForeground(new Color(139, 69, 19));
		mntmAdvertisement.setBackground(new Color(255, 250, 250));
		mnHome.add(mntmAdvertisement);
		
		JMenuItem mntmOurProducts = new JMenuItem("Our Poducts");
		mntmOurProducts.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOurProducts.setForeground(new Color(139, 69, 19));
		mntmOurProducts.setBackground(new Color(255, 250, 250));
		mnHome.add(mntmOurProducts);
		
		JMenuItem mntmOrderHere = new JMenuItem("Order Here");
		mntmOrderHere.setFont(new Font("Dubai", Font.PLAIN, 16));
		mntmOrderHere.setForeground(new Color(139, 69, 19));
		mntmOrderHere.setBackground(new Color(255, 250, 250));
		mnHome.add(mntmOrderHere);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(139, 69, 19));
		mntmExit.setFont(new Font("Dubai", Font.PLAIN, 16));
		mnMenu.add(mntmExit);
		
		JLabel lblRM = new JLabel("RM");
		lblRM.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRM.setFont(new Font("Dubai", Font.PLAIN, 20));
		lblRM.setBounds(581, 160, 69, 35);
		panel.add(lblRM);
		
		
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
					}
					
					else if(cmBox_category.getSelectedItem().equals("Tart")) {
						cmBox_product.setModel(tart);
					}
					
					else if(cmBox_category.getSelectedItem().equals("Cake")) {
						cmBox_product.setModel(cake);
					}
					
					else if(cmBox_category.getSelectedItem().equals("Select...")) {
						cmBox_product.setModel(select);
					}
				} 
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please select a category or product.");
				}
			}
		});

		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(cmBox_category.getSelectedItem().equals("Bun")) { 
						
						if(cmBox_product.getSelectedItem().equals("Mexican Coffee Bun")) {
							lbl_productName.setText("Mexican Coffee Bun");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceBun_MexicanCoffee));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Mexico Coffee Bun.png")));
							textArea_description.setText("Mexican Coffe Bun is a sweet bun with coffee topping and butter filling.");
							textArea_ingredients.setText("Flour, sugar, milk powder, butter, eggs, instant coffee, coffee essence");
							textArea_calories.setText("580cal per serving");
						}
						else if(cmBox_product.getSelectedItem().equals("Ham and Cheese Bun")) {
							lbl_productName.setText("Ham and Cheese Bun");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceBun_HamCheese));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Ham and Cheese Bun.png")));
							textArea_description.setText("Ham and Cheese Bun is a sweet bun with small pieces ham filling, grated cheddar cheese and mayonnaise topping.");
							textArea_ingredients.setText("Flour, milk powder, sugar, salt,eggs, butter, ham, grated cheddar cheese, mayonnaise");
							textArea_calories.setText("442cal per serving");
						}
						else if(cmBox_product.getSelectedItem().equals("Red Bean Bun")) {
							lbl_productName.setText("Red Bean Bun");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceBun_RedBean));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Red Bean Bun.png")));
							textArea_description.setText("Red Bean Bun are sweet buns wrapped with red bean paste.");
							textArea_ingredients.setText("Flour, milk powder, sugar, salt, eggs, butter, red bean, sesame seeds");
							textArea_calories.setText("283cal per serving");
						}
						else {
							JOptionPane.showMessageDialog(null, "Please select a category or a product.");
						}
					}
					
					else if(cmBox_category.getSelectedItem().equals("Tart")) {
						
						if(cmBox_product.getSelectedItem().equals("Portuguese Egg Tart")) {
							lbl_productName.setText("Portuguese Egg Tart");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceTart_Portuguese));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Portuguese Egg Tart.png")));
							textArea_description.setText("Crispy, flaky crust holding a creamy custard center, blisters non top from the high heat of an oven");
							textArea_ingredients.setText("Flour, butter, salt, sugar, milk, Eggs, whipping cream, vanilla extract");
							textArea_calories.setText("292cal per serving");
						}
						
						else if(cmBox_product.getSelectedItem().equals("Chocolate Almond Tart")) {
							lbl_productName.setText("Chocolate Almond Tart");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceTart_ChocoAlmond));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Chocolate Almond Tart.png")));
							textArea_description.setText("Coat crunchy toasted almond flakes in a thick base of cooking chocolate and lay them in a buttery tart shell.");
							textArea_ingredients.setText("Toasted almonds, butter, eggs, sugar, flour, chocolate, heavy cream, salt, sliced almonds");
							textArea_calories.setText("220cal per serving");
						}
						
						else if(cmBox_product.getSelectedItem().equals("Blueberry Cheese Tart")) {
							lbl_productName.setText("Blueberry Cheese Tart");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceTart_Blueberry));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Blueberry Cheese Tart.png")));
							textArea_description.setText("A rich and creamy cheesecake filling in a buttery shortcrust tart topped with blueberry filling.");
							textArea_ingredients.setText("Butter, sugar, eggs, flour, cream cheese, lemon juice, blueberries filling");
							textArea_calories.setText("275cal per serving");
						}
						else {
							JOptionPane.showMessageDialog(null, "Please select a category or a product.");
						}
					}
					
					else if(cmBox_category.getSelectedItem().equals("Cake")) {
						
						if(cmBox_product.getSelectedItem().equals("Hokkaido Triple Cheese Cake")) {
							lbl_productName.setText("Hokkaido Triple Cheese Cake");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceCake_HokkaidoCheese));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Hokkaido Triple Cheese Cake.png")));
							textArea_description.setText("Light, fluffy and moist, a truly magical combination of 3 types of premium cheese that melts in your mouth and is bursting with flavour.");
							textArea_ingredients.setText("Flour, sugar, eggs, cream cheese, whipping cream");
							textArea_calories.setText("230cal per serving");
						}
						
						else if(cmBox_product.getSelectedItem().equals("Moist Chocolate Cake")) {
							lbl_productName.setText("Moist Chocolate Cake");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceCake_MoistChoco));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Moist Chocolate Cake.png")));
							textArea_description.setText("Fluffy and moist chocolate cake with a smooth mocha / coffee filling centre, finished with melted semi-sweet chocolate.");
							textArea_ingredients.setText("Flour, sugar, cocoa powder, salt, eggs, buttermilk, butter, vanilla extract, coffee");
							textArea_calories.setText("340cal per serving");
						}
						
						else if(cmBox_product.getSelectedItem().equals("Matcha Ice Cream Cake")) {
							lbl_productName.setText("Matcha Ice Cream Cake");
							lbl_productPrice.setText(String.format("%.2f", ProductsPriceManage.priceCake_Matcha));
							lbl_productImage.setIcon(new ImageIcon(LoginPage.class.getResource("/BakeryIcons/Product - Matcha Ice Cream Cake.png")));
							textArea_description.setText("Lotus Biscuit base and chocolate crumbles. Creamy matcha ice cream with chocolate cake in the middle.");
							textArea_ingredients.setText("Matcha, egg, milk, cream, sugar, chocolate cake, lotus biscuit, butter");
							textArea_calories.setText("250cal per serving");
						}
						else {
							JOptionPane.showMessageDialog(null, "Please select a category or a product.");
						}
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Please select a category or a product.");
					}
				} 
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please select a category or a product.");
				}
			}
		});

		btnRegisterToOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//go to another frame -> Customer_RegistrationPage
				Customer_RegistrationPage frame = new Customer_RegistrationPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //ProductDescription will disappear
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//back to home page frame -> Customer_HomePage
				Customer_HomePage frame = new Customer_HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose(); //ProductDescription will disappear
			}
		});
		
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage frame = new LoginPage();
				
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Our Products", 
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
