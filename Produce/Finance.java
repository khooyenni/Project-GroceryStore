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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField fruitsText;
	private JTextField veggieText;
	private JTextField maintainanceText;
	private JTextField wagesText;
	private JTextField advertisementText;
	private JTextField miscellaneousText;
	private JTextField totalExpenseText;
	private JTextField netProfitText;
	private JTextField totalIncomeText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 581);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 192, 203), 6));
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(210, 13, 599, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FINANCE");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 573, 54);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(12, 109, 672, 152);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_2.setBackground(new Color(255, 218, 185));
		panel_2.setBounds(12, 13, 192, 46);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Income");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 180, 46);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fruits sales");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(230, 13, 235, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblVegetablesSales = new JLabel("Vegetables sales");
		lblVegetablesSales.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVegetablesSales.setBounds(230, 60, 235, 34);
		panel_1.add(lblVegetablesSales);
		
		fruitsText = new JTextField();
		fruitsText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fruitsText.setBounds(409, 13, 197, 30);
		panel_1.add(fruitsText);
		fruitsText.setColumns(10);
		
		veggieText = new JTextField();
		veggieText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		veggieText.setColumns(10);
		veggieText.setBounds(409, 60, 197, 30);
		panel_1.add(veggieText);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalIncome.setBounds(230, 105, 235, 34);
		panel_1.add(lblTotalIncome);
		
		totalIncomeText = new JTextField();
		totalIncomeText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		totalIncomeText.setColumns(10);
		totalIncomeText.setBounds(409, 103, 197, 30);
		panel_1.add(totalIncomeText);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(12, 274, 672, 248);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_4.setBackground(new Color(255, 218, 185));
		panel_4.setBounds(12, 13, 192, 46);
		panel_3.add(panel_4);
		
		JLabel lblExpense = new JLabel("Expense");
		lblExpense.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpense.setForeground(Color.WHITE);
		lblExpense.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExpense.setBounds(0, 0, 180, 46);
		panel_4.add(lblExpense);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStock.setBounds(230, 13, 235, 34);
		panel_3.add(lblStock);
		
		JLabel lblEmployeesWages = new JLabel("Employees wages");
		lblEmployeesWages.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployeesWages.setBounds(230, 60, 235, 34);
		panel_3.add(lblEmployeesWages);
		
		maintainanceText = new JTextField();
		maintainanceText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		maintainanceText.setColumns(10);
		maintainanceText.setBounds(409, 13, 197, 30);
		panel_3.add(maintainanceText);
		
		wagesText = new JTextField();
		wagesText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		wagesText.setColumns(10);
		wagesText.setBounds(409, 60, 197, 30);
		panel_3.add(wagesText);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdvertisement.setBounds(230, 107, 235, 34);
		panel_3.add(lblAdvertisement);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous");
		lblMiscellaneous.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMiscellaneous.setBounds(230, 154, 235, 34);
		panel_3.add(lblMiscellaneous);
		
		JLabel lblTotalExpense = new JLabel("Total Expense");
		lblTotalExpense.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalExpense.setBounds(230, 201, 235, 34);
		panel_3.add(lblTotalExpense);
		
		advertisementText = new JTextField();
		advertisementText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		advertisementText.setColumns(10);
		advertisementText.setBounds(409, 107, 197, 30);
		panel_3.add(advertisementText);
		
		miscellaneousText = new JTextField();
		miscellaneousText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		miscellaneousText.setColumns(10);
		miscellaneousText.setBounds(409, 154, 197, 30);
		panel_3.add(miscellaneousText);
		
		totalExpenseText = new JTextField();
		totalExpenseText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		totalExpenseText.setColumns(10);
		totalExpenseText.setBounds(409, 201, 197, 30);
		panel_3.add(totalExpenseText);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel_5.setBackground(new Color(255, 222, 173));
		panel_5.setBounds(696, 108, 257, 140);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NET PROFIT");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(-18, 13, 283, 66);
		panel_5.add(lblNewLabel_3);
		
		netProfitText = new JTextField();
		netProfitText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		netProfitText.setBounds(40, 75, 179, 32);
		panel_5.add(netProfitText);
		netProfitText.setColumns(10);
		
		JButton btnNewButton = new JButton("Caclculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double fruitsIncome = Double.parseDouble(fruitsText.getText());
					double veggieIncome = Double.parseDouble(veggieText.getText());
					
					double totalIncome = fruitsIncome+veggieIncome;
					totalIncomeText.setText(String.format("%.2f", totalIncome));
					
					double maintainance = Double.parseDouble(maintainanceText.getText());
					double ads = Double.parseDouble(advertisementText.getText());
					double wages = Double.parseDouble(wagesText.getText());
					double miscellaneous =Double.parseDouble(miscellaneousText.getText());
					
					double totalExpense = maintainance+ads+wages+miscellaneous;
					totalExpenseText.setText(String.format("%.2f", totalExpense));
					
					double netProfit = totalIncome-totalExpense;
					netProfitText.setText(String.format("%.2f", netProfit));
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(706, 261, 153, 53);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fruitsText.setText("");
				veggieText.setText("");
				totalIncomeText.setText("");
				maintainanceText.setText("");
				wagesText.setText("");
				advertisementText.setText("");
				miscellaneousText.setText("");
				totalExpenseText.setText("");
				netProfitText.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBackground(new Color(255, 182, 193));
		btnReset.setBounds(706, 327, 153, 53);
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
		btnExit.setBackground(new Color(255, 182, 193));
		btnExit.setBounds(706, 456, 153, 53);
		contentPane.add(btnExit);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalIncomeText.setText(String.format("%.2f", Sales.totalSales));
				wagesText.setText(String.format("%.2f", Employee.totalSalary));
			}
		});
		btnShow.setForeground(Color.WHITE);
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShow.setBackground(new Color(255, 182, 193));
		btnShow.setBounds(706, 393, 153, 53);
		contentPane.add(btnShow);
		
		setTitle("Finance");
	}

}
