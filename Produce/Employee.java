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
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField ageText;
	private JTextField phoneText;
	private JTextField addressText;
	private JTextField positionText;
	private JTextField salaryText;
	private JTable table;
	static double totalSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 646);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(221, 160, 221), 5));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(192, 13, 657, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE MANAGEMENT");
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 638, 91);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(221, 160, 221), 4));
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(12, 117, 417, 346);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(27, 13, 106, 45);
		panel_1.add(lblNewLabel_1);
		
		nameText = new JTextField();
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameText.setBounds(146, 20, 259, 35);
		panel_1.add(nameText);
		nameText.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(27, 60, 106, 45);
		panel_1.add(lblAge);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhoneNumber.setBounds(12, 118, 127, 45);
		panel_1.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(27, 176, 106, 45);
		panel_1.add(lblAddress);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPosition.setBounds(27, 234, 106, 45);
		panel_1.add(lblPosition);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSalary.setBounds(27, 286, 106, 45);
		panel_1.add(lblSalary);
		
		ageText = new JTextField();
		ageText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ageText.setColumns(10);
		ageText.setBounds(146, 68, 259, 35);
		panel_1.add(ageText);
		
		phoneText = new JTextField();
		phoneText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneText.setColumns(10);
		phoneText.setBounds(146, 118, 259, 35);
		panel_1.add(phoneText);
		
		addressText = new JTextField();
		addressText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addressText.setColumns(10);
		addressText.setBounds(146, 176, 259, 35);
		panel_1.add(addressText);
		
		positionText = new JTextField();
		positionText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		positionText.setColumns(10);
		positionText.setBounds(146, 234, 259, 35);
		panel_1.add(positionText);
		
		salaryText = new JTextField();
		salaryText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		salaryText.setColumns(10);
		salaryText.setBounds(146, 284, 259, 35);
		panel_1.add(salaryText);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 192, 203), 5));
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(441, 119, 639, 344);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "HP No.", "Address", "Position", "Salary"
			}
		));
		table.setBounds(12, 13, 615, 261);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton("Upload");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\MAY NG\\Documents\\UUM\\SEMESTER 2 A202\\PROGRAMMING 2\\Assignment\\Employee.txt");
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
						JOptionPane.showMessageDialog(null, "Data Uploaded Successfully");
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						totalSalary=0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double salary = Double.parseDouble(model.getValueAt(i, 8).toString());
							totalSalary = salary+totalSalary;
						}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(218, 112, 214));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(266, 287, 127, 44);
		panel_2.add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						nameText.getText(),
						ageText.getText(),
						phoneText.getText(),
						addressText.getText(),
						positionText.getText(),
						salaryText.getText()
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Registered Successfully", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBackground(new Color(218, 112, 214));
		btnAdd.setBounds(536, 476, 127, 44);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}	
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBackground(new Color(218, 112, 214));
		btnDelete.setBounds(675, 476, 127, 44);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(nameText.getText(), i, 0);
			    	model.setValueAt(ageText.getText(), i, 1);
			    	model.setValueAt(phoneText.getText(), i, 2);
			    	model.setValueAt(addressText.getText(), i, 3);
			    	model.setValueAt(positionText.getText(), i, 4);
			    	model.setValueAt(salaryText.getText(), i, 5);
			    	
					JOptionPane.showMessageDialog(null, "Updated Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(218, 112, 214));
		btnUpdate.setBounds(814, 476, 127, 44);
		contentPane.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText.setText("");
				ageText.setText("");
				phoneText.setText("");
				addressText.setText("");
				positionText.setText("");
				salaryText.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBackground(new Color(218, 112, 214));
		btnReset.setBounds(953, 476, 127, 44);
		contentPane.add(btnReset);
		
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
		btnExit.setBackground(new Color(218, 112, 214));
		btnExit.setBounds(953, 536, 127, 44);
		contentPane.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (Exception e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBackground(new Color(218, 112, 214));
		btnPrint.setBounds(814, 536, 127, 44);
		contentPane.add(btnPrint);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				nameText.setText(model.getValueAt(i, 0).toString());
				ageText.setText(model.getValueAt(i, 1).toString());
				phoneText.setText(model.getValueAt(i, 2).toString());
				addressText.setText(model.getValueAt(i, 3).toString());
				positionText.setText(model.getValueAt(i, 4).toString());
				salaryText.setText(model.getValueAt(i, 5).toString());
				
			}
	});
		
		setTitle("Employee Management");
		}
}
