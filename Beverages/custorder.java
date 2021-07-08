package Beverages;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class custorder extends JFrame {

	double[] itemcost = new double[7]; // array of total items

	private JPanel contentPane;
	private JTextField texttea;
	private JTextField textcoffee;
	private JTextField textmilk;
	private JTextField total;
	private Object scrollPane;
	private JTable table;
	private JTextField textsyrup;
	private JTextField textjuice;
	private JTextField textwater;
	private JTextField cashtext;
	private JTextField changetext;
	private JTextField nameetext;
	private JTextField addresstext;
	private String p, p2, p3, p4, p5, p6;
	private JTextField sub;
	private JTextField dis;
	static double tot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custorder frame = new custorder();
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
	public custorder() { // constructor without argument
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// if the item is chosee than only the textbox will be open
				texttea.setEnabled(false);
				textcoffee.setEnabled(false);
				textmilk.setEnabled(false);
				textwater.setEnabled(false);
				textsyrup.setEnabled(false);
				textjuice.setEnabled(false);
				nameetext.setEnabled(false);
				addresstext.setEnabled(false);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1096, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 128, 114));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1080, 625);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(76, 77, 809, 223);
		panel.add(panel_2);
		panel_2.setLayout(null);

		textsyrup = new JTextField();
		textsyrup.setBounds(453, 137, 89, 20);
		panel_2.add(textsyrup);
		textsyrup.setText("0");
		textsyrup.setHorizontalAlignment(SwingConstants.CENTER);
		textsyrup.setColumns(10);

		textmilk = new JTextField();
		textmilk.setBounds(77, 137, 86, 20);
		panel_2.add(textmilk);
		textmilk.setHorizontalAlignment(SwingConstants.CENTER);
		textmilk.setText("0");
		textmilk.setColumns(10);

		textcoffee = new JTextField();
		textcoffee.setBounds(279, 58, 86, 20);
		panel_2.add(textcoffee);
		textcoffee.setHorizontalAlignment(SwingConstants.CENTER);
		textcoffee.setText("0");
		textcoffee.setColumns(10);

		JCheckBox teabox = new JCheckBox("tea");
		teabox.setBounds(77, 28, 86, 23);
		panel_2.add(teabox);

		JTextArea textreceipt = new JTextArea();
		textreceipt.setBounds(745, 311, 300, 301);
		panel.add(textreceipt);

		JButton btnNewButton_3 = new JButton("Delete"); // Delete Button
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Membership Management System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_3.setBounds(76, 578, 89, 23);
		panel.add(btnNewButton_3);

		JCheckBox waterbox = new JCheckBox("Water");
		waterbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (waterbox.isSelected()) {

					textwater.setEnabled(true);
					textwater.setText("");
					textwater.requestFocus();
				} else {
					textwater.setEnabled(false);
					textwater.setText("0");
				}
			}
		});
		waterbox.setBounds(279, 107, 86, 23);
		panel_2.add(waterbox);

		textwater = new JTextField();
		textwater.setBounds(279, 137, 86, 20);
		panel_2.add(textwater);
		textwater.setText("0");
		textwater.setHorizontalAlignment(SwingConstants.CENTER);
		textwater.setColumns(10);

		JCheckBox juicebox = new JCheckBox("Orang Juice");
		juicebox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (juicebox.isSelected()) {

					textjuice.setEnabled(true);
					textjuice.setText("");
					textjuice.requestFocus();
				} else {
					textjuice.setEnabled(false);
					textjuice.setText("0");
				}
			}
		});
		juicebox.setBounds(456, 28, 86, 23);
		panel_2.add(juicebox);

		textjuice = new JTextField();
		textjuice.setBounds(456, 58, 86, 20);
		panel_2.add(textjuice);
		textjuice.setText("0");
		textjuice.setHorizontalAlignment(SwingConstants.CENTER);
		textjuice.setColumns(10);

		JCheckBox syrupbox = new JCheckBox("Syrup");
		syrupbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (syrupbox.isSelected()) {

					textsyrup.setEnabled(true);
					textsyrup.setText("");
					textsyrup.requestFocus();
				} else {
					textsyrup.setEnabled(false);
					textsyrup.setText("0");
				}
			}
		});
		syrupbox.setBounds(456, 107, 86, 23);
		panel_2.add(syrupbox);

		JCheckBox milkbox = new JCheckBox("milk");
		milkbox.setBounds(77, 107, 86, 23);
		panel_2.add(milkbox);

		JCheckBox coffeebox = new JCheckBox("coffee");
		coffeebox.setBounds(279, 28, 86, 23);
		panel_2.add(coffeebox);

		texttea = new JTextField();
		texttea.setBounds(77, 58, 86, 20);
		panel_2.add(texttea);
		texttea.setHorizontalAlignment(SwingConstants.CENTER);
		texttea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		texttea.setText("0");
		texttea.setColumns(10);

		JButton order = new JButton("ORDER"); // Order Button
		order.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 20));
		order.setBounds(263, 174, 122, 23);
		panel_2.add(order);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/tea.png")));
		lblNewLabel.setBounds(3, 28, 86, 54);
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/coffee.png")));
		lblNewLabel_1.setBounds(185, 11, 79, 83);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/milk-icon.png")));
		lblNewLabel_2.setBounds(3, 93, 60, 74);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/orange juice.png")));
		lblNewLabel_3.setBounds(390, 16, 60, 62);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/Bucket-Water-icon.png")));
		lblNewLabel_4.setBounds(195, 107, 79, 72);
		panel_2.add(lblNewLabel_4);

		JButton btnTotal = new JButton("SubTotal");
		btnTotal.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 17));
		btnTotal.setBounds(584, 11, 111, 23);
		panel_2.add(btnTotal);

		total = new JTextField();
		total.setBounds(705, 15, 86, 20);
		panel_2.add(total);
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		total.setText("0");
		total.setColumns(10);

		JButton btnAddRecore = new JButton("Receipt");
		btnAddRecore.setBounds(606, 174, 96, 23);
		panel_2.add(btnAddRecore);

		JLabel lblNewLabel_5 = new JLabel("Changes");
		lblNewLabel_5.setBounds(620, 107, 74, 23);
		panel_2.add(lblNewLabel_5);

		cashtext = new JTextField();
		cashtext.setBounds(705, 74, 86, 20);
		panel_2.add(cashtext);
		cashtext.setColumns(10);

		JLabel lblNewLabel_5_1 = new JLabel("Cash");
		lblNewLabel_5_1.setBounds(631, 73, 74, 23);
		panel_2.add(lblNewLabel_5_1);

		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				itemcost[0] = Double.parseDouble(texttea.getText()) * 12.00;
				itemcost[1] = Double.parseDouble(textcoffee.getText()) * 13.00;
				itemcost[2] = Double.parseDouble(textmilk.getText()) * 8.00;
				itemcost[3] = Double.parseDouble(textwater.getText()) * 9.50;
				itemcost[4] = Double.parseDouble(textsyrup.getText()) * 16.70;
				itemcost[5] = Double.parseDouble(textjuice.getText()) * 7.00;

				itemcost[6] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5];

				String itotal = String.format(" RM %.2f", itemcost[6]);
				total.setText(itotal);

				Discount d = new ordering(); // create new object for the discount

				if (itemcost[6] > 160) {
					dis.setText("40%");
					double finalPrice = itemcost[6] * d.discountpercent(); // Discount from interface class
					double f = itemcost[6] - finalPrice;
					sub.setText(String.format("%.2f", f));
					double cash = Double.parseDouble(cashtext.getText());
					double dd = cash - f;
					changetext.setText(String.format("%.2f", dd));
				} else {
					dis.setText("0");
					sub.setText(String.format("%.2f", itotal));
					double cash = Double.parseDouble(cashtext.getText());
					double dd = cash - itemcost[6];
					changetext.setText(String.format("%.2f", dd));
				}

			}
		});

		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String quan = " ";
				String Beverage = " ";
				String priceM = " ";
				double pricetea = 12.00;
				double pricecoffee = 13.00;
				double pricemilk = 8.00;
				double pricewater = 9.50;
				double syrupprice = 16.70;
				double juiceprice = 7.00;

				if (teabox.isSelected()) {
					Beverage = teabox.getText();
					quan = texttea.getText();
					priceM = Double.toString(pricetea);
				}
				if (coffeebox.isSelected()) {
					Beverage = coffeebox.getText();
					quan = textcoffee.getText();
					priceM = Double.toString(pricecoffee);
				}
				if (milkbox.isSelected()) {
					Beverage = milkbox.getText();
					quan = textmilk.getText();
					priceM = Double.toString(pricemilk);
				}
				if (waterbox.isSelected()) {
					Beverage = waterbox.getText();
					quan = textwater.getText();
					priceM = Double.toString(pricewater);
				}
				if (syrupbox.isSelected()) {
					Beverage = syrupbox.getText();
					quan = textsyrup.getText();
					priceM = Double.toString(syrupprice);
				}
				if (juicebox.isSelected()) {
					Beverage = juicebox.getText();
					quan = textjuice.getText();
					priceM = Double.toString(juiceprice);
				}

				double totalPrice = Double.parseDouble(priceM) * Double.parseDouble(quan); // convert String to double
				String totalPriceStr = Double.toString(totalPrice);

				model.addRow(new Object[] {

						Beverage, priceM, quan, totalPriceStr, nameetext.getText(), addresstext.getText(),

				});

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "order Update confirmed", "order System",
								JOptionPane.OK_OPTION);
					}
				}
			}

		});
		teabox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (teabox.isSelected()) {
					texttea.setEnabled(true);
					texttea.setText("");
					texttea.requestFocus();
				} else {
					texttea.setEnabled(false);
					texttea.setText("0");
				}
			}
		});
		coffeebox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (coffeebox.isSelected()) {

					textcoffee.setEnabled(true);
					textcoffee.setText("");
					textcoffee.requestFocus();
				} else {
					textcoffee.setEnabled(false);
					textcoffee.setText("0");
				}
			}
		});
		milkbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milkbox.isSelected()) {

					textmilk.setEnabled(true);
					textmilk.setText("");
					textmilk.requestFocus();
				} else {
					textmilk.setEnabled(false);
					textmilk.setText("0");
				}
			}
		});

		JButton btnNewButton_1 = new JButton("pay"); // Pay Button
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				itemcost[0] = Double.parseDouble(texttea.getText()) * 12.00;
				itemcost[1] = Double.parseDouble(textcoffee.getText()) * 13.00;
				itemcost[2] = Double.parseDouble(textmilk.getText()) * 8.00;
				itemcost[3] = Double.parseDouble(textwater.getText()) * 9.50;
				itemcost[4] = Double.parseDouble(textsyrup.getText()) * 16.70;
				itemcost[5] = Double.parseDouble(textjuice.getText()) * 7.00;

				itemcost[6] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5];

				double itotal = itemcost[6];
				Discount d = new ordering(); // discount
				if (itotal > 160) {
					dis.setText("40%");
					double finalPrice = itotal * (d.discountpercent());
					double f = itotal - finalPrice;
					sub.setText(String.format("%.2f", f));
					double cash = Double.parseDouble(cashtext.getText());
					double dd = cash - f;
					changetext.setText(String.format("%.2f", dd));
				} else {
					dis.setText("0");
					sub.setText("0");
					double cash = Double.parseDouble(cashtext.getText());
					double dd = cash - itotal;
					changetext.setText(String.format("%.2f", dd));
				}

			}
		});
		btnNewButton_1.setBounds(606, 141, 89, 23);
		panel_2.add(btnNewButton_1);

		changetext = new JTextField();
		changetext.setBounds(705, 108, 86, 20);
		panel_2.add(changetext);
		changetext.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBounds(570, 0, 4, 223);
		panel_2.add(panel_4);

		JButton btnTotal_1 = new JButton("Total");
		btnTotal_1.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 17));
		btnTotal_1.setBounds(584, 45, 111, 23);
		panel_2.add(btnTotal_1);

		sub = new JTextField();
		sub.setText("0");
		sub.setHorizontalAlignment(SwingConstants.CENTER);
		sub.setColumns(10);
		sub.setBounds(705, 46, 86, 20);
		panel_2.add(sub);

		dis = new JTextField();
		dis.setBounds(705, 192, 86, 20);
		panel_2.add(dis);
		dis.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(custorder.class.getResource("/BeveragesIcons/syrup.jpg")));
		lblNewLabel_13.setBounds(390, 96, 60, 83);
		panel_2.add(lblNewLabel_13);

		JLabel lblNewLabel_5_1_1 = new JLabel("Discount");
		lblNewLabel_5_1_1.setBounds(621, 195, 74, 23);
		panel_2.add(lblNewLabel_5_1_1);

		JButton btnNewButton = new JButton("reset");
		btnNewButton.setBounds(307, 578, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				texttea.setText("0");
				textcoffee.setText("0");
				textmilk.setText("0");
				textwater.setText("0");
				textsyrup.setText("0");
				textjuice.setText("0");
				total.setText("0");
				sub.setText("0");
				nameetext.setText("0");
				addresstext.setText("0");

				textreceipt.setText(" ");
				cashtext.setText("");
				changetext.setText("");

				texttea.setEnabled(false);
				textcoffee.setEnabled(false);
				textmilk.setEnabled(false);
				textwater.setEnabled(false);
				textsyrup.setEnabled(false);
				textjuice.setEnabled(false);

				teabox.setSelected(false);
				coffeebox.setSelected(false);
				milkbox.setSelected(false);
				waterbox.setSelected(false);
				syrupbox.setSelected(false);
				juicebox.setSelected(false);

			}
		});

		JButton btnNewButton_4 = new JButton("Update"); // Update Button
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String quan = " ";
				String Beverage = " ";
				String priceM = " ";
				double pricetea = 12.00;
				double pricecoffee = 13.00;
				double pricemilk = 8.00;
				double pricewater = 9.50;
				double syrupprice = 16.70;
				double juiceprice = 7.00;

				if (teabox.isSelected()) {
					Beverage = teabox.getText();
					quan = texttea.getText();
					priceM = Double.toString(pricetea);
				} else if (coffeebox.isSelected()) {
					Beverage = coffeebox.getText();
					quan = textcoffee.getText();
					priceM = Double.toString(pricecoffee);
				} else if (milkbox.isSelected()) {
					Beverage = milkbox.getText();
					quan = textmilk.getText();
					priceM = Double.toString(pricemilk);
				} else if (waterbox.isSelected()) {
					Beverage = waterbox.getText();
					quan = textwater.getText();
					priceM = Double.toString(pricewater);
				} else if (syrupbox.isSelected()) {
					Beverage = syrupbox.getText();
					quan = textsyrup.getText();
					priceM = Double.toString(syrupprice);
				} else if (juicebox.isSelected()) {
					Beverage = juicebox.getText();
					quan = textjuice.getText();
					priceM = Double.toString(juiceprice);
				}

				double totalPrice = Double.parseDouble(priceM) * Double.parseDouble(quan); // convert String to double
				String totalPriceStr = Double.toString(totalPrice);

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(texttea.getText(), i, 2);
					model.setValueAt(textcoffee.getText(), i, 2);
					model.setValueAt(textmilk.getText(), i, 2);
					model.setValueAt(textwater.getText(), i, 2);
					model.setValueAt(textsyrup.getText(), i, 2);
					model.setValueAt(textjuice.getText(), i, 2);
					model.setValueAt(quan, i, 2);
					model.setValueAt(totalPriceStr, i, 3);
					model.setValueAt(nameetext.getText(), i, 4);
					model.setValueAt(addresstext.getText(), i, 5);
					JOptionPane.showMessageDialog(null, "Update Successfully");

					tot = 0; // full total amount
					for (i = 0; i < table.getRowCount(); i++) {
						tot = tot + Double.parseDouble(table.getValueAt(i, 3).toString());
						total.setText(String.format("%.2f", tot));

					}
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnNewButton_4.setBounds(187, 578, 89, 23);
		panel.add(btnNewButton_4);

		btnAddRecore.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				itemcost[0] = Double.parseDouble(texttea.getText()) * 12.00;
				itemcost[1] = Double.parseDouble(textcoffee.getText()) * 13.00;
				itemcost[2] = Double.parseDouble(textmilk.getText()) * 8.00;
				itemcost[3] = Double.parseDouble(textwater.getText()) * 9.50;
				itemcost[4] = Double.parseDouble(textsyrup.getText()) * 16.70;
				itemcost[5] = Double.parseDouble(textjuice.getText()) * 7.00;

				itemcost[6] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5];

				String itotal = String.format(" RM %.2f", itemcost[6]);
				total.setText(itotal);

				Discount d = new ordering(); // create new object for discount
				itotal = String.format(" RM %.2f", itemcost[6]);
				total.setText(itotal);
				textreceipt.setEnabled(true);

				itotal = String.format("RM %.2f", itemcost[6]);
				String subtotall = String.format("RM %.2f", (itemcost[6] - (itemcost[6] * d.discountpercent())));

				textreceipt.setEnabled(true);

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH : mm : ss ;");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd -MMM-yyyy");
				Tdate.format(timer.getTime());

				if (itemcost[6] > 160) { // if the price more than RM160 the receipt will show both subtotal and total

					textreceipt.append("\n==================RECEIPT==================" + "\n"
							+ "\n========VANI's Non- Alcholic Beverage Shop===========\t" +

							" \n Subtotal :\t" + itotal + " \n Total :\t" + subtotall +

							"\n***********************************************************\t" + "  \n Tea : "
							+ texttea.getText() + "\t\t Date : " + Tdate.format(timer.getTime()) + "\n Coffee :"
							+ textcoffee.getText() + "\t\t Time :" + tTime.format(timer.getTime()) + "\n Milk : "
							+ textmilk.getText() + "\n Juice : " + textjuice.getText() + "\n Water : "
							+ textwater.getText() + "\n Syrup : " + textsyrup.getText() +

							"\n==========================================\t" +

							"\n cash :RM " + cashtext.getText() +

							"\n changes :RM " + changetext.getText() + "\n=========================================="
							+ "\n\n ----------------- THANK YOU !! & COME AGAIN ----------------");

					String tot = total.getText(); // pass total sales value to sales frame
					String subtot = sub.getText();
					Sales obj = new Sales(); // create new object for sales class
					obj.my_updatee(subtot, tot);

				} else // If the price less than RM160 it will show only the totall price without
						// discount
					textreceipt.append("\n==================RECEIPT==================" + "\n"
							+ "\n========VANI's Non- Alcholic Beverage Shop===========\t" +

							" \n Subtotal : \t" + itotal +

							"\n***********************************************************\t" + "  \n Tea : "
							+ texttea.getText() + "\t\t Date : " + Tdate.format(timer.getTime()) + "\n Coffee :"
							+ textcoffee.getText() + "\t\t Time :" + tTime.format(timer.getTime()) + "\n Milk : "
							+ textmilk.getText() + "\n Juice : " + textjuice.getText() + "\n Water : "
							+ textwater.getText() + "\n Syrup : " + textsyrup.getText() +

							"\n==========================================\t" +

							"\n cash :RM " + cashtext.getText() +

							"\n changes :RM " + changetext.getText() + "\n=========================================="
							+ "\n\n ----------------- THANK YOU !! & COME AGAIN ----------------");

				String tot = total.getText(); // pass total sales value to sales frame
				String subtot = sub.getText();
				Sales obj = new Sales();
				obj.my_updatee(subtot, tot);
				obj.setVisible(true);
			}
		});
		panel.add(btnNewButton);

		JButton btnNewButton_5 = new JButton("Upload");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Asus\\Documents\\gui\\order.txt");

					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < table.getRowCount(); i++) {
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
						}

						bw.write("\n________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		});
		btnNewButton_5.setBounds(431, 578, 89, 23);
		panel.add(btnNewButton_5);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(48, 409, 653, 158);
		panel.add(panel_1);
		panel_1.setBackground(new Color(205, 133, 63));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 633, 136);
		panel_1.add(scrollPane_1);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, },
				new String[] { "Beverage", "price", "Quantity", "Total", "Name", "Addresss" }));
		scrollPane_1.setViewportView(table);

		JComboBox Role = new JComboBox();
		Role.setBounds(10, 308, 106, 22);
		panel.add(Role);
		Role.setForeground(new Color(128, 0, 0));
		Role.setBackground(Color.WHITE);
		Role.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Role.getSelectedItem().equals("online")) {

					nameetext.setEnabled(true);
					nameetext.setText("");
					nameetext.requestFocus();
					addresstext.setEnabled(true);
					addresstext.setText("");
					addresstext.requestFocus();
				} else {
					nameetext.setEnabled(false);
					nameetext.setText("0");
					addresstext.setEnabled(false);
					addresstext.setText("0");
				}
			}
		});
		Role.setModel(new DefaultComboBoxModel(new String[] { "Ordering", "online", "walkin" }));

		JButton btnNewButton_1_3 = new JButton("Name");
		btnNewButton_1_3.setBackground(new Color(255, 160, 122));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setBounds(10, 341, 89, 23);
		panel.add(btnNewButton_1_3);

		nameetext = new JTextField();
		nameetext.setBounds(127, 342, 149, 20);
		panel.add(nameetext);
		nameetext.setColumns(10);

		JButton btnNewButton_1_1 = new JButton("Address");
		btnNewButton_1_1.setBackground(new Color(255, 160, 122));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(10, 375, 89, 23);
		panel.add(btnNewButton_1_1);

		addresstext = new JTextField();
		addresstext.setBounds(127, 376, 153, 20);
		panel.add(addresstext);
		addresstext.setColumns(10);

		JButton btnNewButton_2 = new JButton("confirm");
		btnNewButton_2.setBackground(new Color(255, 160, 122));
		btnNewButton_2.setBounds(290, 375, 89, 23);
		panel.add(btnNewButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 192, 203));
		panel_3.setBounds(10, 11, 1034, 55);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Beverage Ordering System");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_6.setBounds(217, 11, 519, 43);
		panel_3.add(lblNewLabel_6);

		JButton btnNewButton_6 = new JButton("back");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ShopBackground frame = new ShopBackground();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(552, 578, 89, 23);
		panel.add(btnNewButton_6);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(
				new ImageIcon(custorder.class.getResource("/BeveragesIcons/customer orddr background.jpg")));
		lblNewLabel_8.setBounds(0, 341, 567, 312);
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(
				new ImageIcon
				("C:\\Users\\Asus\\Desktop\\project picture (icon)\\customer orddr background.jpg"));
		lblNewLabel_9.setBounds(524, -21, 574, 305);
		panel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(
				new ImageIcon(custorder.class.getResource("/BeveragesIcons/customer orddr background.jpg")));
		lblNewLabel_10.setBounds(534, 203, 584, 339);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(
				new ImageIcon(custorder.class.getResource("/BeveragesIcons/customer orddr background.jpg")));
		lblNewLabel_11.setBounds(552, 483, 546, 153);
		panel.add(lblNewLabel_11);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(
				new ImageIcon(custorder.class.getResource("/BeveragesIcons/customer orddr background.jpg")));
		lblNewLabel_7.setBounds(0, 141, 567, 257);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(
				new ImageIcon(custorder.class.getResource("/BeveragesIcons/customer orddr background.jpg")));
		lblNewLabel_12.setBounds(0, 0, 587, 262);
		panel.add(lblNewLabel_12);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nameetext.getText();
				addresstext.getText();

				if (Role.getSelectedItem().equals("online")) {
					JOptionPane.showMessageDialog(null, "YOU CONFIRM YOUR ORDER AS ONLINE ORDER");

				}
			}
		});
	}
}
