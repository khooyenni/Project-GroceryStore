package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 963, 673);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(255, 182, 193)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(85, 23, 761, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCT DESCRIPTION");
		lblNewLabel.setBounds(12, 0, 749, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 39));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(26, 121, 403, 164);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 182, 193));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Fruits", "Vegetables"}));
		comboBox.setBounds(198, 13, 193, 39);
		panel_1.add(comboBox);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxProduct.setForeground(new Color(255, 255, 255));
		comboBoxProduct.setBackground(new Color(255, 182, 193));
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Apple", "Melon", "Potato", "Yam", "Lettuce", "Spinach"}));
		comboBoxProduct.setBounds(198, 65, 193, 39);
		panel_1.add(comboBoxProduct);
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	final DefaultComboBoxModel Fruits = new DefaultComboBoxModel(new String[]{"Please Select", "Apple", "Melon"});
		    	final DefaultComboBoxModel Vegetables = new DefaultComboBoxModel(new String[]{"Please Select", "Potato", "Yam", "Lettuce", "Spinach"});
		    	
		        if (comboBox.getSelectedItem().equals("Fruits")){
		            comboBoxProduct.setModel(Fruits);    
		        } 
		        else if (comboBox.getSelectedItem().equals("Vegetables")){
		        	comboBoxProduct.setModel(Vegetables);  
		        }
		    }
		});
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(25, 22, 193, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblProducts = new JLabel("Products");
		lblProducts.setForeground(new Color(255, 255, 255));
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProducts.setBounds(25, 77, 193, 21);
		panel_1.add(lblProducts);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 298, 485, 315);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel image = new JLabel("image");
		image.setBounds(0, 0, 485, 315);
		panel_2.add(image);
		image.setIcon(new ImageIcon(ProductDescription.class.getResource("/ProduceIcons/fruits1.jpg")));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.WHITE, 5));
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(533, 122, 389, 438);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.PINK);
		textArea.setBounds(12, 13, 365, 412);
		panel_3.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage user=new UserHomePage();
				user.setModalExclusionType(null);
				user.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(808, 573, 114, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(comboBox.getSelectedItem().equals("Fruits") && comboBoxProduct.getSelectedItem().equals("Apple")) {
						textArea.setText("APPLE"
								+"\nItem name\t: Granny Smith\n"
								+"Item type\t: Apple\n"
								+"Item colour\t: Green\n"
								+"Item country\t: Australia\n"
								+"Item grade\t: A\n"
								+"Item price\t: RM1.70\n"
								);
					}
					else if(comboBox.getSelectedItem().equals("Fruits") && comboBoxProduct.getSelectedItem().equals("Melon")) {
						textArea.setText("MELON"
								+"\nItem name\t: Galia Melon\n"
								+"Item type\t: Melon\n"
								+"Item colour\t: Yellow\n"
								+"Item country\t: Israel\n"
								+"Item grade\t: A\n"
								+"Item price\t: RM10.50\n"
								);
					}
					else if(comboBox.getSelectedItem().equals("Vegetables") && comboBoxProduct.getSelectedItem().equals("Potato")) {
						textArea.setText("POTATO"		
								+"\nItem name\t: Russet\n"
								+"Item type\t: Potato\n"
								+"Item colour\t: Brown\n"
								+"Item country\t: United States\n"
								+"Item grade\t: B\n"
								+"Item price\t: RM5.99\n"
								);
					}
					else if(comboBox.getSelectedItem().equals("Vegetables") && comboBoxProduct.getSelectedItem().equals("Yam")) {
						textArea.setText("YAM"	
								+"\nItem name\t: Ube\n"
								+"Item type\t: Yam\n"
								+"Item colour\t: Purple\n"
								+"Item country\t: Australia\n"
								+"Item grade\t: A\n"
								+"Item price\t: RM11.00\n"
								);
					}
					else if(comboBox.getSelectedItem().equals("Vegetables") && comboBoxProduct.getSelectedItem().equals("Lettuce")) {
						textArea.setText("LETTUCE"
								+"\nItem name\t: Butterhead Lettuce\n"
								+"Item type\t: Lettuce\n"
								+"Item colour\t: Green\n"
								+"Item country\t: Roman\n"
								+"Item grade\t: B\n"
								+"Item price\t: RM4.99\n"
								);
					}
					else if(comboBox.getSelectedItem().equals("Vegetables") && comboBoxProduct.getSelectedItem().equals("Spinach")) {
						textArea.setText("SPINACH"
								+"\nItem name\t: Semi-savoy Spinach\n"
								+"Item type\t: Spinach\n"
								+"Item colour\t: Yellow\n"
								+"Item country\t: China\n"
								+"Item grade\t: A\n"
								+"Item price\t: RM1.51\n"
								);
					} else {
						JOptionPane.showMessageDialog(null, "Please select a valid category and product");
					}
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please select a valid category and product");
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(248, 117, 143, 32);
		panel_1.add(btnNewButton);
		
		setTitle("Product Description");
		
	}
}
