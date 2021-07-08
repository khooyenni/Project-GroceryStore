package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvertisementnMarketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementnMarketing frame = new AdvertisementnMarketing();
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
	public AdvertisementnMarketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 646);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5));
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(196, 13, 551, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADVERTISEMENT AND MARKETING");
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 536, 73);
		panel.add(lblNewLabel);
		
		JLabel image = new JLabel("image");
		image.setBounds(12, 109, 172, 184);
		contentPane.add(image);
		image.setIcon(new ImageIcon(AdvertisementnMarketing.class.getResource("/ProduceIcons/fb.png")));
		
		JLabel image1 = new JLabel("image");
		image1.setBounds(12, 338, 172, 175);
		contentPane.add(image1);
		image1.setIcon(new ImageIcon(AdvertisementnMarketing.class.getResource("/ProduceIcons/twitter-removebg-preview.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(196, 117, 683, 175);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("We're holding a giveaway event !!");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 13, 343, 43);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblAnAppleA = new JLabel("AN APPLE A DAY KEEPS THE DOCTOR AWAY");
		lblAnAppleA.setForeground(new Color(0, 0, 0));
		lblAnAppleA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnAppleA.setBounds(12, 69, 343, 43);
		panel_1.add(lblAnAppleA);
		
		JLabel lblBuyUpTo = new JLabel("Buy up to RM100 apple from our shop and stand a chance to win the new Apple iPhone");
		lblBuyUpTo.setForeground(new Color(0, 0, 0));
		lblBuyUpTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBuyUpTo.setBounds(12, 125, 677, 43);
		panel_1.add(lblBuyUpTo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(196, 334, 531, 164);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblWereGoingLive = new JLabel("We're going live on Twitter tonight on 9pm !!");
		lblWereGoingLive.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWereGoingLive.setForeground(new Color(0, 0, 0));
		lblWereGoingLive.setBounds(12, 13, 507, 43);
		panel_2.add(lblWereGoingLive);
		
		JLabel lblDoJoinUs = new JLabel("Do join us to win mysterious prizes during livestream");
		lblDoJoinUs.setForeground(new Color(0, 0, 0));
		lblDoJoinUs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDoJoinUs.setBounds(12, 56, 507, 43);
		panel_2.add(lblDoJoinUs);
		
		JLabel lblTheWinnerWill = new JLabel("The winner will be announced during the livestream");
		lblTheWinnerWill.setForeground(new Color(0, 0, 0));
		lblTheWinnerWill.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTheWinnerWill.setBounds(12, 112, 507, 43);
		panel_2.add(lblTheWinnerWill);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage user=new UserHomePage();
				user.setModalExclusionType(null);
				user.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(757, 522, 122, 49);
		contentPane.add(btnNewButton);
		
		setTitle("Advertisement and Marketing");
	}
}
