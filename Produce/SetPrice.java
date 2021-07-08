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

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetPrice extends JFrame {

	private JPanel contentPane;
	private JTextField appleText;
	private JTextField melonText;
	private JTextField potatoText;
	private JTextField yamText;
	private JTextField lettuceText;
	private JTextField spinachText;
	static double apple;
	static double melon;
	static double potato;
	static double yam;
	static double lettuce;
	static double spinach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetPrice frame = new SetPrice();
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
	public SetPrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new LineBorder(new Color(255, 192, 203), 4, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 192, 203), 5, true));
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(27, 31, 407, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SET PRICE");
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 38));
		lblNewLabel.setBounds(75, 0, 252, 80);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 192, 203), 5));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(27, 128, 643, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(40, 25, 269, 64);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FRUITS");
		lblNewLabel_1.setFont(new Font("Bungee Inline", Font.BOLD, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 269, 64);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apple");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(342, 25, 116, 41);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblMelon = new JLabel("Melon");
		lblMelon.setForeground(Color.BLACK);
		lblMelon.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblMelon.setBounds(342, 73, 116, 41);
		panel_1.add(lblMelon);
		
		appleText = new JTextField();
		appleText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		appleText.setBounds(423, 25, 170, 35);
		panel_1.add(appleText);
		appleText.setColumns(10);
		
		melonText = new JTextField();
		melonText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		melonText.setColumns(10);
		melonText.setBounds(423, 73, 170, 35);
		panel_1.add(melonText);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 192, 203), 5));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(27, 272, 643, 257);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setBounds(40, 25, 269, 64);
		panel_3.add(panel_4);
		
		JLabel lblVegetables = new JLabel("VEGETABLES");
		lblVegetables.setHorizontalAlignment(SwingConstants.CENTER);
		lblVegetables.setFont(new Font("Bungee Inline", Font.BOLD, 33));
		lblVegetables.setBounds(0, 0, 269, 64);
		panel_4.add(lblVegetables);
		
		JLabel lblPotato = new JLabel("Potato");
		lblPotato.setForeground(Color.BLACK);
		lblPotato.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPotato.setBounds(321, 25, 116, 41);
		panel_3.add(lblPotato);
		
		JLabel lblYam = new JLabel("Yam");
		lblYam.setForeground(Color.BLACK);
		lblYam.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblYam.setBounds(321, 72, 116, 41);
		panel_3.add(lblYam);
		
		potatoText = new JTextField();
		potatoText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		potatoText.setColumns(10);
		potatoText.setBounds(423, 25, 170, 35);
		panel_3.add(potatoText);
		
		yamText = new JTextField();
		yamText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		yamText.setColumns(10);
		yamText.setBounds(423, 79, 170, 35);
		panel_3.add(yamText);
		
		JLabel lblLettuce = new JLabel("Lettuce");
		lblLettuce.setForeground(Color.BLACK);
		lblLettuce.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblLettuce.setBounds(321, 126, 116, 41);
		panel_3.add(lblLettuce);
		
		JLabel lblSpinach = new JLabel("Spinach");
		lblSpinach.setForeground(Color.BLACK);
		lblSpinach.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSpinach.setBounds(321, 180, 116, 41);
		panel_3.add(lblSpinach);
		
		lettuceText = new JTextField();
		lettuceText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lettuceText.setColumns(10);
		lettuceText.setBounds(423, 126, 170, 35);
		panel_3.add(lettuceText);
		
		spinachText = new JTextField();
		spinachText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		spinachText.setColumns(10);
		spinachText.setBounds(423, 180, 170, 35);
		panel_3.add(spinachText);
		
		JButton btnNewButton = new JButton("Set Price");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apple = Double.parseDouble(appleText.getText());
				melon = Double.parseDouble(melonText.getText());
				potato = Double.parseDouble(potatoText.getText());
				yam = Double.parseDouble(yamText.getText());
				lettuce = Double.parseDouble(lettuceText.getText());
				spinach = Double.parseDouble(spinachText.getText());
				
				JOptionPane.showMessageDialog(null, "Price set done");
			}
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(682, 486, 164, 43);
		contentPane.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(682, 13, 352, 460);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel image = new JLabel("image");
		image.setBounds(0, 0, 352, 460);
		panel_5.add(image);
		image.setIcon(new ImageIcon("C:\\Users\\MAY NG\\Downloads\\pink-home.jpg"));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage admin = new AdminHomePage();
				admin.setModalExclusionType(null);
				admin.setVisible(true);
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 182, 193));
		btnExit.setBounds(870, 486, 164, 43);
		contentPane.add(btnExit);
		
		setTitle("Set Price");
	}
}
