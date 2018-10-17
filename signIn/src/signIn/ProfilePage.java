package signIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Scrollbar;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;

public class ProfilePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilePage frame = new ProfilePage();
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
	public ProfilePage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 224, 715);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 32, 131, 31);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Kristen ITC", Font.BOLD, 16));
		lblEmail.setBounds(22, 76, 131, 31);
		panel.add(lblEmail);
		
		Button AddDevice = new Button("Add Device");
		AddDevice.setForeground(new Color(0, 0, 0));
		AddDevice.setFont(new Font("Dialog", Font.PLAIN, 15));
		AddDevice.setBounds(29, 613, 166, 31);
		panel.add(AddDevice);
		AddDevice.setBackground(new Color(250, 128, 114));
		
		Button Import = new Button("Import");
		Import.setFont(new Font("Dialog", Font.PLAIN, 15));
		Import.setForeground(new Color(0, 0, 0));
		Import.setBackground(new Color(250, 128, 114));
		Import.setBounds(29, 662, 166, 31);
		panel.add(Import);
		
		JLabel lblSearchFriends = new JLabel("Search Friends");
		lblSearchFriends.setForeground(new Color(0, 0, 0));
		lblSearchFriends.setFont(new Font("Arial", Font.BOLD, 15));
		lblSearchFriends.setBounds(0, 244, 131, 24);
		panel.add(lblSearchFriends);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBounds(0, 269, 212, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		Button Search = new Button("Search");
		Search.setForeground(Color.BLACK);
		Search.setFont(new Font("Dialog", Font.PLAIN, 15));
		Search.setBackground(new Color(250, 128, 114));
		Search.setBounds(0, 306, 117, 31);
		panel.add(Search);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ProfilePage.class.getResource("/images/2345.jpg")));
		lblNewLabel_1.setBounds(-301, 0, 525, 715);
		panel.add(lblNewLabel_1);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(224, 0, 663, 156);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Button Walking = new Button("Walking");
		Walking.setBounds(32, 21, 102, 99);
		panel_1.add(Walking);
		Walking.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		Walking.setBackground(new Color(255, 228, 181));
		
		Button Biking = new Button("Biking");
		Biking.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		Biking.setBackground(new Color(255, 228, 181));
		Biking.setBounds(165, 21, 102, 99);
		panel_1.add(Biking);
		
		Button AddActivity = new Button("+");
		AddActivity.setFont(new Font("Kristen ITC", Font.BOLD, 23));
		AddActivity.setBackground(new Color(255, 228, 181));
		AddActivity.setBounds(300, 21, 102, 99);
		panel_1.add(AddActivity);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setOrientation(Scrollbar.HORIZONTAL);
		scrollbar.setBounds(0, 135, 663, 21);
		panel_1.add(scrollbar);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ProfilePage.class.getResource("/images/666.jpg")));
		lblNewLabel_2.setBounds(-132, 0, 827, 155);
		panel_1.add(lblNewLabel_2);
	}
}
