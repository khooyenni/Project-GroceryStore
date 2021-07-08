package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JTextField priceText;
	private JTextField quantityText;
	private JTextField totalPriceText;
	private JTextField discountText;
	private JTextField finalPriceText;
	private JTable table;
	static double totalSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new LineBorder(Color.ORANGE, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 204, 51), 4));
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(187, 13, 564, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER ORDER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 38));
		lblNewLabel.setBounds(12, 0, 531, 90);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 215, 0), 4));
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(12, 118, 344, 339);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 16, 119, 32);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Fruits", "Vegetables"}));
		comboBox.setBounds(123, 15, 197, 32);
		panel_1.add(comboBox);
		
		JLabel lblProducts = new JLabel("Products");
		lblProducts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblProducts.setBounds(12, 65, 119, 32);
		panel_1.add(lblProducts);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Apple", "Melon", "Potato", "Yam", "Lettuce", "Spinach"}));
		comboBoxProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxProduct.setBounds(123, 61, 197, 32);
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
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(12, 110, 119, 32);
		panel_1.add(lblPrice);
		
		priceText = new JTextField();
		priceText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		priceText.setBounds(123, 110, 197, 29);
		panel_1.add(priceText);
		priceText.setColumns(10);
		comboBoxProduct.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if (comboBoxProduct.getSelectedItem().equals("Apple")) {
		    		priceText.setText(String.format("%.2f", SetPrice.apple));
		    	}
		    	else if (comboBoxProduct.getSelectedItem().equals("Melon")) {
		    		priceText.setText(String.format("%.2f", SetPrice.melon));
		    	}
		    	else if (comboBoxProduct.getSelectedItem().equals("Potato")) {
		    		priceText.setText(String.format("%.2f", SetPrice.potato));
		    	}
		    	else if (comboBoxProduct.getSelectedItem().equals("Yam")) {
		    		priceText.setText(String.format("%.2f", SetPrice.yam));
		    	}
		    	else if(comboBoxProduct.getSelectedItem().equals("Lettuce")) {
		    		priceText.setText(String.format(".2f", SetPrice.lettuce));
		    	}
		    	else if(comboBoxProduct.getSelectedItem().equals("Spinach")) {
		    		priceText.setText(String.format(".2f", SetPrice.spinach));
		    	}

		    }
		});
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuantity.setBounds(12, 155, 119, 32);
		panel_1.add(lblQuantity);
		
		quantityText = new JTextField();
		quantityText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double price = Double.parseDouble(priceText.getText());
					int qty = Integer.parseInt(quantityText.getText());
					
					double totalPrice = price*qty;
					totalPriceText.setText(Double.toString(totalPrice));
					
					if (totalPrice>150) {
						discountText.setText("10%");
						Discount dis = new Discount1();
						double d = dis.discountRate();
						
						double finalPrice = totalPrice*(1-d);
						finalPriceText.setText(String.format("%.2f", finalPrice));
					} else if(totalPrice>500) {
						discountText.setText("20%");
						Discount dis = new Discount2();
						double d = dis.discountRate();
						
						double finalPrice = totalPrice*(1-d);
						finalPriceText.setText(String.format("%.2f", finalPrice));
					}
					else {
						discountText.setText("N/A");
						finalPriceText.setText(String.format("%.2f", totalPrice));
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
				}
			}
		});
		quantityText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		quantityText.setColumns(10);
		quantityText.setBounds(123, 152, 197, 29);
		panel_1.add(quantityText);
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalPrice.setBounds(12, 200, 119, 32);
		panel_1.add(lblTotalPrice);
		
		totalPriceText = new JTextField();
		totalPriceText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		totalPriceText.setColumns(10);
		totalPriceText.setBounds(123, 200, 197, 29);
		panel_1.add(totalPriceText);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDiscount.setBounds(12, 245, 119, 32);
		panel_1.add(lblDiscount);
		
		discountText = new JTextField();
		discountText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		discountText.setColumns(10);
		discountText.setBounds(123, 245, 197, 29);
		panel_1.add(discountText);
		
		JLabel lblFinalPrice = new JLabel("Final Price");
		lblFinalPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFinalPrice.setBounds(12, 290, 119, 32);
		panel_1.add(lblFinalPrice);
		
		finalPriceText = new JTextField();
		finalPriceText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		finalPriceText.setColumns(10);
		finalPriceText.setBounds(123, 290, 197, 29);
		panel_1.add(finalPriceText);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 215, 0), 4));
		panel_2.setBackground(new Color(255, 250, 205));
		panel_2.setBounds(368, 116, 579, 341);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Category", "Products", "Price", "Quantity", "Total Price", "Discount", "Final Price"
			}
		));
		table.setBounds(12, 13, 555, 254);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton("Upload");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\MAY NG\\Documents\\UUM\\SEMESTER 2 A202\\PROGRAMMING 2\\Assignment\\Sales.txt");
					//image.setIcon(new ImageIcon("C:\\Users\\MAY NG\\Downloads\\pink-home.jpg"));
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						totalSales=0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double sales = Double.parseDouble(model.getValueAt(i, 8).toString());
							totalSales=sales+totalSales;
						}
						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(221, 282, 142, 46);
		panel_2.add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						comboBox.getSelectedItem(),
						comboBoxProduct.getSelectedItem(),
						priceText.getText(),
						quantityText.getText(),
						totalPriceText.getText(),
						discountText.getText(),
						finalPriceText.getText()
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "New Order Added", "Sales",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBackground(new Color(255, 215, 0));
		btnAdd.setBounds(343, 470, 142, 46);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					int i = table.getSelectedRow();
					
					String tableCategory= model.getValueAt(i, 0).toString();
					if (tableCategory.equals("Fruits")) {
						comboBox.setSelectedIndex(1);
					}
					else if (tableCategory.equals("Vegetables")) {
						comboBox.setSelectedIndex(2);
					}
					
					
					String tableProducts = model.getValueAt(i, 1).toString();
					if (tableProducts.equals("Apple")) {
						comboBoxProduct.setSelectedItem("Apple");
					}
					else if (tableProducts.equals("Melon")) {
						comboBoxProduct.setSelectedItem("Melon");
					}
					else if (tableProducts.equals("Potato")) {
						comboBoxProduct.setSelectedItem("Potato");
					}
					else if (tableProducts.equals("Yam")) {
						comboBoxProduct.setSelectedItem("Yam");
					}
					else if (tableProducts.equals("Lettuce")) {
						comboBoxProduct.setSelectedItem("Lettuce");
					}
					else if (tableProducts.equals("Spinach")) {
						comboBoxProduct.setSelectedItem("Spinach");
					}
					
					priceText.setText(model.getValueAt(i, 2).toString());
					quantityText.setText(model.getValueAt(i, 3).toString());
					totalPriceText.setText(model.getValueAt(i, 4).toString());
					discountText.setText(model.getValueAt(i, 5).toString());
					finalPriceText.setText(model.getValueAt(i, 6).toString());
					
				}
			
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBackground(new Color(255, 215, 0));
		btnUpdate.setBounds(497, 470, 142, 46);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data available to delete",
								"Order Details", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Order Details", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(new Color(255, 215, 0));
		btnDelete.setBounds(651, 470, 142, 46);
		contentPane.add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Please Select");
				comboBoxProduct.setSelectedItem("Please Select");
				priceText.setText("");
				quantityText.setText("");
				totalPriceText.setText("");
				discountText.setText("");
				finalPriceText.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBackground(new Color(255, 215, 0));
		btnReset.setBounds(805, 470, 142, 46);
		contentPane.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (Exception e) {
					System.err.format("No printer found, pls try again", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrint.setBackground(new Color(255, 215, 0));
		btnPrint.setBounds(651, 561, 142, 46);
		contentPane.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage user=new UserHomePage();
				user.setModalExclusionType(null);
				user.setVisible(true);
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(new Color(255, 215, 0));
		btnExit.setBounds(805, 561, 142, 46);
		contentPane.add(btnExit);
		
		JLabel image = new JLabel("image");
		image.setBounds(98, 438, 169, 137);
		contentPane.add(image);
		image.setIcon(new ImageIcon(Sales.class.getResource("/ProduceIcons/yellow (2).jfif")));
		
		JLabel lblNewLabel_2 = new JLabel("STAY CONNECTED");
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.BOLD, 26));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(37, 559, 281, 48);
		contentPane.add(lblNewLabel_2);
		
		setTitle("Sales");
	}
}
