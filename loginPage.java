import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class loginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel message = new JLabel();
	
	HashMap<String, String> info = new HashMap<String, String>();
	
	loginPage(HashMap<String, String> logInMap) {
		info = logInMap;
		
		userLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		message.setBounds(125, 250, 250, 35);
		message.setFont(new Font(null, Font.ITALIC, 25));
		
		userField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		
		frame.add(userLabel);
		frame.add(userPasswordLabel);
		frame.add(message);
		frame.add(userField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == resetButton) {
			userField.setText("");
			userPasswordField.setText("");
		}
		
		if (e.getSource() == loginButton) {
			String userID = userField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if (info.containsKey(userID)) {
				if (info.get(userID).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Login successful");
					frame.dispose();
					welcome welcomePage = new welcome(userID);
				} else {
					message.setForeground(Color.red);
					message.setText("Wrong password");
				}
			} else {
				message.setForeground(Color.red);
				message.setText("Username is invalid");
			}
		}
	}
}

