import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

public class editGUI extends JFrame{
	private JTextField username_Field;
	private JPasswordField password_Field;
	private JTextField name_Field;
	private JTextField limit_Field;
	
	public editGUI(User aUser) {
		
		this.setVisible(true);
		this.setSize(540, 360);
		getContentPane().setLayout(null);
		
		JLabel edit_Profile = new JLabel("Επεξεργασία Προφίλ");
		edit_Profile.setBounds(6, 6, 150, 16);
		getContentPane().add(edit_Profile);
		
		JLabel profile = new JLabel("Προφίλ");
		profile.setBounds(16, 34, 61, 16);
		getContentPane().add(profile);
		
		JLabel user = new JLabel("Χρήστης");
		user.setBounds(16, 130, 61, 16);
		getContentPane().add(user);
		
		JLabel username = new JLabel("Όνομα");
		username.setBounds(60, 62, 61, 16);
		getContentPane().add(username);
		
		JLabel password = new JLabel("Κωδικός");
		password.setBounds(60, 97, 61, 16);
		getContentPane().add(password);
		
		username_Field = new JTextField();
		username_Field.setEditable(false);
		username_Field.setBounds(150, 57, 130, 26);
		getContentPane().add(username_Field);
		username_Field.setColumns(10);
		username_Field.setText(aUser.getUsername());
		
		password_Field = new JPasswordField();
		password_Field.setEditable(false);
		password_Field.setBounds(150, 92, 130, 26);
		getContentPane().add(password_Field);
		
		JButton save_Profile_Btn = new JButton("Αποθήκευση");
		JButton edit_Profile_Btn = new JButton("Επεξεργασία");
		save_Profile_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username_Field.setEditable(false);
				password_Field.setEditable(false);
				edit_Profile_Btn.setVisible(true);
				save_Profile_Btn.setVisible(false);
			}
		});
		save_Profile_Btn.setBounds(350, 74, 117, 29);
		getContentPane().add(save_Profile_Btn);
		save_Profile_Btn.setVisible(false);
		
		
		edit_Profile_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username_Field.setEditable(true);
				password_Field.setEditable(true);
				edit_Profile_Btn.setVisible(false);
				save_Profile_Btn.setVisible(true);
			}
		});
		edit_Profile_Btn.setBounds(350, 74, 117, 29);
		getContentPane().add(edit_Profile_Btn);
		
		JLabel name = new JLabel("Ονομ/μο");
		name.setBounds(60, 158, 70, 16);
		getContentPane().add(name);
		
		JLabel vehicles = new JLabel("Οχήματα");
		vehicles.setBounds(60, 193, 61, 16);
		getContentPane().add(vehicles);
		
		JLabel estates = new JLabel("Ακίνητα");
		estates.setBounds(60, 228, 61, 16);
		getContentPane().add(estates);
		
		JLabel limit = new JLabel("Όριο Εξόδων");
		limit.setBounds(60, 263, 90, 16);
		getContentPane().add(limit);
		
		name_Field = new JTextField();
		name_Field.setBounds(150, 153, 130, 26);
		getContentPane().add(name_Field);
		name_Field.setColumns(10);
		name_Field.setEditable(false);
		
		limit_Field = new JTextField();
		limit_Field.setBounds(150, 258, 130, 26);
		getContentPane().add(limit_Field);
		limit_Field.setColumns(10);
		limit_Field.setEditable(false);
		
		JComboBox estates_Field = new JComboBox();
		estates_Field.setModel(new DefaultComboBoxModel(new String[] {"spiti 1", "spiti 2"}));
		estates_Field.setSelectedIndex(-1);
		estates_Field.setBounds(150, 224, 130, 27);
		getContentPane().add(estates_Field);
		
		JComboBox vehicles_Field = new JComboBox();
		vehicles_Field.setModel(new DefaultComboBoxModel(new String[] {"karo 1", "karo 2"}));
		vehicles_Field.setSelectedIndex(-1);
		vehicles_Field.setBounds(150, 189, 130, 27);
		getContentPane().add(vehicles_Field);
		
		JButton end_Btn = new JButton("Τέλος");
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
			}
		});
		end_Btn.setBounds(417, 303, 117, 29);
		getContentPane().add(end_Btn);
		
		
		JButton save_User_Btn = new JButton("Αποθήκευση");
		JButton edit_User_Btn = new JButton("Επεξεργασία");
		save_User_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name_Field.setEditable(false);
				limit_Field.setEditable(false);
				edit_User_Btn.setVisible(true);
				save_User_Btn.setVisible(false);
			}
		});
		save_User_Btn.setBounds(350, 205, 117, 29);
		getContentPane().add(save_User_Btn);
		save_User_Btn.setVisible(false);
		
		
		edit_User_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name_Field.setEditable(true);
				limit_Field.setEditable(true);
				edit_User_Btn.setVisible(false);
				save_User_Btn.setVisible(true);
			}
		});
		edit_User_Btn.setBounds(350, 205, 117, 29);
		getContentPane().add(edit_User_Btn);
		
		JButton add_Veh_Btn = new JButton("+");
		add_Veh_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_VehicleGUI();
			}
		});
		add_Veh_Btn.setBounds(290, 192, 20, 20);
		getContentPane().add(add_Veh_Btn);
		
		JButton add_Estate_Btn = new JButton("+");
		add_Estate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_EstateGUI();
			}
		});
		add_Estate_Btn.setBounds(290, 227, 20, 20);
		getContentPane().add(add_Estate_Btn);
		
	}

	protected void close_GUI() {
		this.dispose();
	}
}
