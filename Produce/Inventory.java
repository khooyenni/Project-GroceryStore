package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField appleText;
	private JTextField melonText;
	private JTextField potatoText;
	private JTextField yamText;
	private JTextField lettuceText;
	private JTextField spinachText;
	private JTable table;
	private JTextField yearText;
	static double totalInventory;
	private JTextField totalInventoryText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1198, 599);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		panel.setBackground(new Color(255, 192, 203));
		panel.setBounds(12, 13, 660, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVENTORY");
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 0, 506, 86);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(12, 245, 306, 218);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(73, 13, 161, 60);
		panel_1.add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FRUITS");
		lblNewLabel_1.setBounds(0, 0, 160, 60);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JLabel lblNewLabel_2 = new JLabel("Apple");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(28, 89, 148, 46);
		panel_1.add(lblNewLabel_2);
		
		appleText = new JTextField();
		appleText.setBounds(105, 97, 177, 37);
		panel_1.add(appleText);
		appleText.setColumns(10);
		
		JLabel lblMelon = new JLabel("Melon");
		lblMelon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMelon.setBounds(28, 155, 148, 46);
		panel_1.add(lblMelon);
		
		melonText = new JTextField();
		melonText.setColumns(10);
		melonText.setBounds(105, 155, 177, 37);
		panel_1.add(melonText);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_3.setBackground(new Color(255, 250, 250));
		panel_3.setBounds(330, 191, 306, 339);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_4.setBackground(new Color(255, 250, 250));
		panel_4.setBounds(73, 13, 161, 60);
		panel_3.add(panel_4);
		
		JLabel lblVegetables = new JLabel("VEGETABLES\r\n");
		lblVegetables.setHorizontalAlignment(SwingConstants.CENTER);
		lblVegetables.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblVegetables.setBounds(0, 0, 161, 60);
		panel_4.add(lblVegetables);
		
		JLabel lblPotato = new JLabel("Potato");
		lblPotato.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPotato.setBounds(28, 89, 148, 46);
		panel_3.add(lblPotato);
		
		potatoText = new JTextField();
		potatoText.setColumns(10);
		potatoText.setBounds(105, 97, 177, 37);
		panel_3.add(potatoText);
		
		JLabel lblYam = new JLabel("Yam");
		lblYam.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblYam.setBounds(28, 155, 148, 46);
		panel_3.add(lblYam);
		
		yamText = new JTextField();
		yamText.setColumns(10);
		yamText.setBounds(105, 155, 177, 37);
		panel_3.add(yamText);
		
		JLabel lblLettuce = new JLabel("Lettuce");
		lblLettuce.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLettuce.setBounds(12, 214, 148, 46);
		panel_3.add(lblLettuce);
		
		JLabel lblSpinach = new JLabel("Spinach");
		lblSpinach.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSpinach.setBounds(12, 273, 148, 46);
		panel_3.add(lblSpinach);
		
		lettuceText = new JTextField();
		lettuceText.setColumns(10);
		lettuceText.setBounds(105, 214, 177, 37);
		panel_3.add(lettuceText);
		
		spinachText = new JTextField();
		spinachText.setColumns(10);
		spinachText.setBounds(105, 273, 177, 37);
		panel_3.add(spinachText);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage admin=new AdminHomePage();
				admin.setModalExclusionType(null);
				admin.setVisible(true);
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 182, 193));
		btnExit.setBounds(179, 476, 145, 54);
		contentPane.add(btnExit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(255, 192, 203), 4));
		panel_5.setBackground(new Color(255, 240, 245));
		panel_5.setBounds(648, 191, 511, 339);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Year", "Apple", "Melon", "Potato", "Yam", "Lettuce", "Spinach"
			}
		));
		table.setBounds(12, 13, 487, 235);
		panel_5.add(table);
		
		JButton btnNewButton = new JButton("Upload");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\MAY NG\\Documents\\UUM\\SEMESTER 2 A202\\PROGRAMMING 2\\Assignment\\Inventory.txt");
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
						}
						 catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(180, 261, 155, 54);
		panel_5.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_6.setBackground(new Color(255, 250, 250));
		panel_6.setBounds(12, 110, 137, 60);
		contentPane.add(panel_6);
		
		JLabel lblMonth = new JLabel("MONTH");
		lblMonth.setBounds(0, 0, 133, 60);
		panel_6.add(lblMonth);
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.setBackground(new Color(255, 182, 193));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(12, 183, 137, 49);
		contentPane.add(comboBox);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						comboBox.getSelectedItem(),
						yearText.getText(),
						appleText.getText(),
						melonText.getText(),
						potatoText.getText(),
						yamText.getText(),
						lettuceText.getText(),
						spinachText.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "inventory updated", "Inventory",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(255, 182, 193));
		btnUpdate.setBounds(12, 476, 155, 54);
		contentPane.add(btnUpdate);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_7.setBackground(new Color(255, 250, 250));
		panel_7.setBounds(179, 110, 139, 60);
		contentPane.add(panel_7);
		
		JLabel lblYear = new JLabel("YEAR");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblYear.setBounds(0, 0, 139, 60);
		panel_7.add(lblYear);
		
		yearText = new JTextField();
		yearText.setBounds(179, 183, 139, 35);
		contentPane.add(yearText);
		yearText.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_8.setBackground(new Color(255, 250, 250));
		panel_8.setBounds(684, 13, 468, 163);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(255, 182, 193), 5));
		panel_9.setBackground(new Color(255, 250, 250));
		panel_9.setBounds(12, 13, 286, 60);
		panel_8.add(panel_9);
		
		JLabel lblTotalInventory = new JLabel("TOTAL INVENTORY");
		lblTotalInventory.setBounds(12, 0, 266, 60);
		panel_9.add(lblTotalInventory);
		lblTotalInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalInventory.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		totalInventoryText = new JTextField();
		totalInventoryText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalInventoryText.setColumns(10);
		totalInventoryText.setBounds(22, 91, 259, 37);
		panel_8.add(totalInventoryText);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double apple = Double.parseDouble(appleText.getText());
					double melon = Double.parseDouble(melonText.getText());
					double potato = Double.parseDouble(potatoText.getText());
					double yam = Double.parseDouble(yamText.getText());
					double lettuce = Double.parseDouble(lettuceText.getText());
					double spinach = Double.parseDouble(spinachText.getText());
					
					double totalInventory = apple+melon+potato+yam+lettuce+spinach;
					totalInventoryText.setText(String.format("%.2f", totalInventory));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnShow.setForeground(Color.WHITE);
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShow.setBackground(new Color(255, 182, 193));
		btnShow.setBounds(311, 76, 145, 54);
		panel_8.add(btnShow);
		
		setTitle("Inventory");
		
	}
}
