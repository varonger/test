package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginGUI {

	public static void main(String[] args) {
		JFrame f = new JFrame("µÇÂ¼Æ÷");
		f.setSize(400,120);
		f.setLocation(200,200);	
		f.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setBounds(50,50,300,60);
		
		JLabel lName = new JLabel("ÕËºÅ£º");
		
		JTextField tfName = new JTextField("");
		tfName.setText("");
		tfName.setPreferredSize(new Dimension(100,30));
		
		JLabel lPassword = new JLabel("ÃÜÂë£º");
        // ÊäÈë¿ò
        JPasswordField tfPassword = new JPasswordField("");
        tfPassword.setText("");
        tfPassword.setPreferredSize(new Dimension(100, 30));
        
        p1.add(lName);
		p1.add(tfName);
		p1.add(lPassword);
        p1.add(tfPassword);
        
        
        JButton dl = new JButton("µÇÂ¼");
        dl.setBounds(50,50,50,30);
		
        
		f.add(p1,BorderLayout.NORTH);
        f.add(dl,BorderLayout.CENTER);
        
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
