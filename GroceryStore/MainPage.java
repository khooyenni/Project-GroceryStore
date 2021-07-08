package GroceryStore;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;


public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("UUM Grocery Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 582);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/GroceryStoreIcons/grocery.png"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		//contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGroceryStore = new JLabel("UUM Grocery Store");
		lblGroceryStore.setBounds(222, 41, 478, 65);
		contentPane.add(lblGroceryStore);
		lblGroceryStore.setForeground(new Color(255, 250, 250));
		lblGroceryStore.setFont(new Font("Gabriola", Font.BOLD, 60));
		lblGroceryStore.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblWhereWouldYou = new JLabel("Where would you like to shop ?");
		lblWhereWouldYou.setForeground(new Color(255, 250, 250));
		lblWhereWouldYou.setBounds(307, 163, 309, 29);
		contentPane.add(lblWhereWouldYou);
		lblWhereWouldYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhereWouldYou.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		
		JLabel lblWelcome = new JLabel("Welcome !");
		lblWelcome.setForeground(new Color(255, 250, 250));
		lblWelcome.setBounds(412, 130, 107, 29);
		contentPane.add(lblWelcome);
		lblWelcome.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//_______________________________ BAKERY _______________________________//
		
		JButton btnBakery = new JButton("Bakery");
		btnBakery.setBounds(151, 263, 171, 51);
		btnBakery.setForeground(new Color(139, 69, 19));
		btnBakery.setBackground(new Color(255, 250, 240));
		btnBakery.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnBakery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling LoginPage from package Bakery
				Bakery.LoginPage frame = new Bakery.LoginPage(); 
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		Image bakeryIcon = new ImageIcon(MainPage.class.getResource("/GroceryStoreIcons/bakery.png")).getImage();
		Image bakery = bakeryIcon.getScaledInstance(30, 30, 1);
		btnBakery.setIcon(new ImageIcon(bakery));
		contentPane.add(btnBakery);
		
		
		//______________________________ BEVERAGES _____________________________//
		
		JButton btnBeverages = new JButton("Beverages");
		btnBeverages.setBounds(380, 263, 171, 51);
		btnBeverages.setForeground(new Color(139, 69, 19));
		btnBeverages.setBackground(new Color(255, 250, 240));
		btnBeverages.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnBeverages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling Main from package Beverages
				Beverages.Main frame = new Beverages.Main(); 
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		Image beveragesIcon = new ImageIcon(MainPage.class.getResource("/GroceryStoreIcons/beverages.png")).getImage();
		Image beverages = beveragesIcon.getScaledInstance(30, 30, 1);
		btnBeverages.setIcon(new ImageIcon(beverages));
		contentPane.add(btnBeverages);
		
		
		//___________________________ PERSONAL CARE ___________________________//
		
		JButton btnPersonalCare = new JButton("Personal Care");
		btnPersonalCare.setBounds(209, 371, 224, 51);
		btnPersonalCare.setForeground(new Color(139, 69, 19));
		btnPersonalCare.setBackground(new Color(255, 250, 240));
		btnPersonalCare.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnPersonalCare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling MainMenu from package PreparedFood
				PersonalCare.MainMenu frame = new PersonalCare.MainMenu(); 
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		Image personalCareIcon = new ImageIcon(MainPage.class.getResource("/GroceryStoreIcons/personal care.png")).getImage();
		Image personalCare = personalCareIcon.getScaledInstance(30, 30, 1);
		btnPersonalCare.setIcon(new ImageIcon(personalCare));
		contentPane.add(btnPersonalCare);
		
		
		//_____________________________ PRODUCE ______________________________//
		
		JButton btnProduce = new JButton("Produce");
		btnProduce.setBounds(609, 263, 171, 51);
		btnProduce.setForeground(new Color(139, 69, 19));
		btnProduce.setBackground(new Color(255, 250, 240));
		btnProduce.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnProduce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling Main from package Produce
				Produce.Main frame = new Produce.Main(); 
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		Image prodcueIcon = new ImageIcon(MainPage.class.getResource("/GroceryStoreIcons/produce.png")).getImage();
		Image produce = prodcueIcon.getScaledInstance(30, 30, 1);
		btnProduce.setIcon(new ImageIcon(produce));
		contentPane.add(btnProduce);
		
		
		//___________________________ PREPARED FOOD ___________________________//
		
		JButton btnPreparedFood = new JButton("Prepared Food");
		btnPreparedFood.setBounds(496, 371, 224, 51);
		btnPreparedFood.setForeground(new Color(139, 69, 19));
		btnPreparedFood.setBackground(new Color(255, 250, 240));
		btnPreparedFood.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnPreparedFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//calling Login from package PreparedFood
				PreparedFood.Login frame = new PreparedFood.Login(); 
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		Image preparedFoodIcon = new ImageIcon(MainPage.class.getResource("/GroceryStoreIcons/prepared food.png")).getImage();
		Image preparedFood = preparedFoodIcon.getScaledInstance(30, 30, 1);
		btnPreparedFood.setIcon(new ImageIcon(preparedFood));
		contentPane.add(btnPreparedFood);
		
	}
}
