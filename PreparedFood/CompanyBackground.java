package PreparedFood;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel1.setLayout(null);
		panel1.setBackground(new Color(245, 255, 250));
		panel1.setBounds(0, 0, 815, 561);
		contentPane.add(panel1);
		
		JLabel GroceryStoreLabel = new JLabel("YBK Prepared Food Store");
		GroceryStoreLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
		GroceryStoreLabel.setBounds(176, 27, 493, 43);
		panel1.add(GroceryStoreLabel);
		
		JLabel CustomerPageLabel = new JLabel("");
		CustomerPageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CustomerPageLabel.setIcon(new ImageIcon(CompanyBackground.class.getResource("/PreparedFoodIcons/CompanyBackgroud.jpg.png")));
		CustomerPageLabel.setForeground(new Color(30, 144, 255));
		CustomerPageLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 21));
		CustomerPageLabel.setBounds(58, 80, 695, 366);
		panel1.add(CustomerPageLabel);
		
		JTextArea txtrAYbkGrocery = new JTextArea();
		txtrAYbkGrocery.setRows(5);
		txtrAYbkGrocery.setForeground(new Color(100, 149, 237));
		txtrAYbkGrocery.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD | Font.ITALIC, 18));
		txtrAYbkGrocery.setColumns(5);
		txtrAYbkGrocery.setText("YBK Prepared Food Store is a self-service shop offering a wide variety of packaged \r\nand frozen food products, and it organized into many sections. YBK Prepared Food \r\nStore opened in 2016 in Kulim, Kedah. Our contact number is 04-4916716.");
		txtrAYbkGrocery.setBounds(44, 456, 734, 78);
		panel1.add(txtrAYbkGrocery);
		
		JButton BackButton = new JButton("Back");
		BackButton.setIcon(new ImageIcon(CompanyBackground.class.getResource("/PreparedFoodIcons/Back1.png")));
		BackButton.setBounds(694, 10, 111, 36);
		panel1.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		BackButton.setForeground(new Color(0, 0, 0));
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BackButton.setBackground(new Color(240, 255, 255));
	}
}