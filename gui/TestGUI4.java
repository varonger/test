package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUI4 {

	public static void main(String[] args) {
		JFrame f = new JFrame("¼Ó·¨¼ÆËãÆ÷");
		f.setSize(450,250);
		f.setLocation(200,200);
		
		f.setLayout(new GridLayout(3,4));
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton bj = new JButton("+");
		JButton bd = new JButton("=");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(bj);
		f.add(bd);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

}
