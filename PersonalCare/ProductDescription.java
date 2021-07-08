package PersonalCare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
		setTitle("KYN Grocery Store");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductDescription.class.getResource("/PersonalCareIcons/315765f2f24666ff852e2630eef9e660.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 730);
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(333, 306, 214, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.BLACK, 5));
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(331, 33, 479, 86);
		contentPane.add(panel_1);
		
		JLabel labelTitle = new JLabel("Product Description");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
		labelTitle.setBounds(0, 20, 469, 47);
		panel_1.add(labelTitle);
		
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(null);
		panelSelection.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panelSelection.setBackground(new Color(253, 245, 230));
		panelSelection.setBounds(221, 132, 718, 166);
		contentPane.add(panelSelection);
		
		JLabel label_1 = new JLabel("Type of Product");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		label_1.setBounds(15, 16, 223, 36);
		panelSelection.add(label_1);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setBackground(new Color(255, 255, 255));
		comboBoxProduct.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Cosmetic", "Shampoo"}));
		comboBoxProduct.setBounds(247, 15, 437, 42);
		panelSelection.add(comboBoxProduct);
		
		JLabel label_2 = new JLabel("List of Product");
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		label_2.setBounds(15, 91, 223, 36);
		panelSelection.add(label_2);
		
		JComboBox comboBoxList = new JComboBox();
		comboBoxList.setBackground(new Color(255, 255, 255));
		comboBoxList.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		comboBoxList.setBounds(250, 90, 437, 42);
		panelSelection.add(comboBoxList);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBackground(new Color(253, 245, 230));
		panel_3.setBounds(221, 387, 718, 225);
		contentPane.add(panel_3);
		
		JTextArea textAreaProductDetails = new JTextArea();
		textAreaProductDetails.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textAreaProductDetails.setBackground(new Color(253, 245, 230));
		textAreaProductDetails.setBounds(31, 12, 656, 196);
		panel_3.add(textAreaProductDetails);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setLayout(null);
		panel_4.setBounds(563, 306, 227, 77);
		contentPane.add(panel_4);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					if (comboBoxProduct.getSelectedItem().equals("Cosmetic") && comboBoxList.getSelectedItem().equals("Kate Eyebrow Colour 3D")) {
						
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PC-230"
								+ "\nItem Name\t\t: Kate Eyebrow Colour 3D"
								+ "\nItem Brand\t\t: Kate Kyoto"
								+ "\nItem Colour\t\t: Natural Brown"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.KateEyebrow
								+ "\nItem NetWeight\t: 6.3gram");
					}
					
					else if (comboBoxProduct.getSelectedItem().equals("Cosmetic") && comboBoxList.getSelectedItem().equals("3CE Eyebrow Mascara")) {
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PC-350"
								+ "\nItem Name\t\t: 3CE Eyebrow Mascara"
								+ "\nItem Brand\t\t: 3CE"
								+ "\nItem Colour\t\t: Gold Brown"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.ThreeCEEyebrow
								+ "\nItem NetWeight\t: 5.5gram");
					}
					
					else if (comboBoxProduct.getSelectedItem().equals("Cosmetic") && comboBoxList.getSelectedItem().equals("Tail Lasting Brush Liner")) {
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PC-400"
								+ "\nItem Name\t\t: Tail Lasting Brush Liner"
								+ "\nItem Brand\t\t: Holika Holika"
								+ "\nItem Flavour\t\t: Real Black"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.TailLasting
								+ "\nItem NetWeight\t: 0.5gram");
					}
					
					else if (comboBoxProduct.getSelectedItem().equals("Shampoo") && comboBoxList.getSelectedItem().equals("Rejoice Frizz Repair Shampoo")) {
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PS-110"
								+ "\nItem Name\t\t: Rejoice Frizz Repair Shampoo"
								+ "\nItem Brand\t\t: Rejoice"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.Rejoice
								+ "\nItem NetWeight\t: 340ml");
					}
					
					else if (comboBoxProduct.getSelectedItem().equals("Shampoo") && comboBoxList.getSelectedItem().equals("Sunsilk Super Collagen Shampoo Power Shine")) {
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PS-115"
								+ "\nItem Name\t\t: Sunsilk Super Collagen Shampoo Power Shine"
								+ "\nItem Brand\t\t: Sunsilk"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.Sunsilk
								+ "\nItem NetWeight\t: 380ml");
					}
					
					else if (comboBoxProduct.getSelectedItem().equals("Shampoo") && comboBoxList.getSelectedItem().equals("Pantene Pro-V Anti Dandruff Shampoo")) {
						textAreaProductDetails.setText("====================Details of Product===================="
								+ "\nItem Number\t: PS-118"
								+ "\nItem Name\t\t: Pantene Pro-V Anti Dandruff Shampoo"
								+ "\nItem Brand\t\t: Pantene"
								+ "\nItem Price\t\t: RM" + ProductSetPrice.Pantene
								+ "\nItem NetWeight\t: 340ml");
					}else
						JOptionPane.showMessageDialog(null, "Please select the valid product ");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please select the valid product");
				}
				
			}
		});
		btnCheck.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnCheck.setBackground(new Color(230, 230, 250));
		btnCheck.setBounds(10, 11, 190, 57);
		panel.add(btnCheck);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnReset.setBackground(new Color(230, 230, 250));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxProduct.setSelectedItem("Please Select");
				comboBoxList.setSelectedItem(null);
				textAreaProductDetails.setText("");
			}
		});
		btnReset.setBounds(10, 12, 206, 54);
		panel_4.add(btnReset);
		
		JLabel lblNewLabelbag = new JLabel("");
		Image photo1 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/bag.png")).getImage();
		Image n1photo = photo1.getScaledInstance(120, 120, 150);
		lblNewLabelbag.setIcon(new ImageIcon(n1photo));
		lblNewLabelbag.setBounds(210, 0, 208, 146);
		contentPane.add(lblNewLabelbag);
		
		JLabel lblBackground = new JLabel("");
		Image photo7 = new ImageIcon(this.getClass().getResource("/PersonalCareIcons/Background7.jpg")).getImage();
		Image n7photo = photo7.getScaledInstance(1200, 800, 150);
		lblBackground.setIcon(new ImageIcon(n7photo));
		lblBackground.setBounds(0, 0, 1186, 627);
		contentPane.add(lblBackground);
		

	}
}
