package Produce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StoreBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreBackground frame = new StoreBackground();
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
	public StoreBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 732);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(38, 13, 667, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STORE BACKGROUND");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bungee Inline", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 643, 68);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(59, 121, 635, 279);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name: Nature Paradise Grocery Store");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 13, 611, 55);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblEstablishedYear = new JLabel("Established year: 2021");
		lblEstablishedYear.setForeground(new Color(255, 255, 255));
		lblEstablishedYear.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblEstablishedYear.setBounds(12, 61, 611, 55);
		panel_1.add(lblEstablishedYear);
		
		JLabel lblContactNumber = new JLabel("Contact number: 04-5648975");
		lblContactNumber.setForeground(new Color(255, 255, 255));
		lblContactNumber.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblContactNumber.setBounds(12, 117, 611, 55);
		panel_1.add(lblContactNumber);
		
		JLabel lblAddress = new JLabel("Address: Sintok, 06011 Bukit Kayu Hitam, Kedah");
		lblAddress.setForeground(new Color(255, 255, 255));
		lblAddress.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblAddress.setBounds(12, 173, 611, 55);
		panel_1.add(lblAddress);
		
		JLabel lblOperatingHoursam = new JLabel("Operating hours: 8.00am - 6.00pm");
		lblOperatingHoursam.setForeground(new Color(255, 255, 255));
		lblOperatingHoursam.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		lblOperatingHoursam.setBounds(12, 224, 611, 55);
		panel_1.add(lblOperatingHoursam);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage user=new UserHomePage();
				user.setModalExclusionType(null);
				user.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(626, 629, 113, 43);
		contentPane.add(btnNewButton);
		
		JLabel image = new JLabel("image");
		image.setBounds(214, 413, 332, 259);
		contentPane.add(image);
		image.setIcon(new ImageIcon(StoreBackground.class.getResource("/ProduceIcons/location (2).jpg")));
		
		setTitle("Store Background");
	}

}
