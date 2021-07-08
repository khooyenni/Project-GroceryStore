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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class OnlineCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField phoneText;
	private JTextField emailText;
	private JTextField homeText;
	private JTextField homeText1;
	private JTable table;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineCustomer frame = new OnlineCustomer();
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
	public OnlineCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel.setBackground(new Color(255, 192, 203));
		panel.setBounds(63, 26, 810, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER REGISTRATION");
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(46, 0, 717, 76);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(26, 115, 385, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(22, 13, 142, 38);
		panel_1.add(lblNewLabel_1);
		
		nameText = new JTextField();
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nameText.setBounds(22, 54, 336, 38);
		panel_1.add(nameText);
		nameText.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(22, 93, 142, 38);
		panel_1.add(lblGender);
		
		phoneText = new JTextField();
		phoneText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		phoneText.setColumns(10);
		phoneText.setBounds(22, 196, 336, 38);
		panel_1.add(phoneText);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNumber.setBounds(22, 158, 142, 38);
		panel_1.add(lblPhoneNumber);
		
		emailText = new JTextField();
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		emailText.setColumns(10);
		emailText.setBounds(22, 272, 336, 38);
		panel_1.add(emailText);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmailAddress.setBounds(22, 235, 142, 38);
		panel_1.add(lblEmailAddress);
		
		homeText = new JTextField();
		homeText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeText.setColumns(10);
		homeText.setBounds(22, 344, 336, 38);
		panel_1.add(homeText);
		
		JLabel lblHomeAddress = new JLabel("Home Address");
		lblHomeAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHomeAddress.setBounds(22, 311, 142, 38);
		panel_1.add(lblHomeAddress);
		
		homeText1 = new JTextField();
		homeText1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homeText1.setColumns(10);
		homeText1.setBounds(22, 395, 336, 38);
		panel_1.add(homeText1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnMale.setBounds(22, 127, 127, 25);
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("Male");
		buttonGroupGender.add(rdbtnMale);
		panel_1.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnFemale.setBounds(199, 129, 127, 25);
		rdbtnFemale.setSelected(true);
		rdbtnFemale.setActionCommand("Female");
		buttonGroupGender.add(rdbtnFemale);
		panel_1.add(rdbtnFemale);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		panel_2.setBackground(new Color(255, 240, 245));
		panel_2.setBounds(423, 115, 559, 323);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "HP No.", "Email Address", "Home Address"
			}
		));
		table.setBounds(12, 13, 535, 244);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton("Upload");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\MAY NG\\Documents\\UUM\\SEMESTER 2 A202\\PROGRAMMING 2\\Assignment\\Customer Information.txt");
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
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(226, 270, 131, 41);
		panel_2.add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						nameText.getText(),
						buttonGroupGender.getSelection().getActionCommand(),
						phoneText.getText(),
						emailText.getText(),
						homeText.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBackground(new Color(255, 192, 203));
		btnAdd.setBounds(423, 463, 131, 41);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				
				nameText.setText(model.getValueAt(i, 0).toString());
				phoneText.setText(model.getValueAt(i, 2).toString());
				
				String tableGender = model.getValueAt(i, 1).toString();
				if (tableGender.equals("Male")) {
					rdbtnMale.setSelected(true);
				}
				else if(tableGender.equals("Female")) {
					rdbtnFemale.setSelected(true);
				}
				
				emailText.setText(model.getValueAt(i, 3).toString());
				homeText.setText(model.getValueAt(i, 4).toString());
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(nameText.getText(), i, 0);
			    	model.setValueAt(phoneText.getText(), i, 2);
			    	model.setValueAt(buttonGroupGender.getSelection().getActionCommand(), i, 1);
			    	model.setValueAt(emailText.getText(), i, 3);
			    	model.setValueAt(homeText.getText(), i, 4);
			    	
					JOptionPane.showMessageDialog(null, "Updated Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First");
			    }
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBackground(new Color(255, 192, 203));
		btnUpdate.setBounds(708, 463, 131, 41);
		contentPane.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText.setText("");
				phoneText.setText("");
				buttonGroupGender.clearSelection();
				emailText.setText("");
				homeText.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBackground(new Color(255, 192, 203));
		btnReset.setBounds(851, 463, 131, 41);
		contentPane.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBackground(new Color(255, 192, 203));
		btnDelete.setBounds(565, 463, 131, 41);
		contentPane.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (Exception e) {
					System.err.format("No printer is found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrint.setBackground(new Color(255, 192, 203));
		btnPrint.setBounds(565, 566, 131, 41);
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
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBackground(new Color(255, 192, 203));
		btnExit.setBounds(851, 566, 131, 41);
		contentPane.add(btnExit);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sales s=new Sales();
				s.setModalExclusionType(null);
				s.setVisible(true);
				dispose();
			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNext.setBackground(new Color(255, 192, 203));
		btnNext.setBounds(708, 566, 131, 41);
		contentPane.add(btnNext);
		
		setTitle("Online Customer Registration");
	}
}
