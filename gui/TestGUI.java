package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //主窗体
		f.setSize(400,450);//主窗体设置大小
		f.setLocation(580,200);//主窗体设置位置
		f.setLayout(null); //主窗体中的组件设置为绝对定位
		
		
		final JLabel l =new JLabel();
		
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("隐藏图片");//按钮组件
		b.setBounds(150,200,100,30);//同时设置组件大小和位置		
		
		b.addActionListener(new ActionListener(){  //给按钮增加 监听
			public void actionPerformed(ActionEvent e) { //当按钮被点击时，就会触发ActionEvent事件
				if(l.isVisible()==true) {
					l.setVisible(false);
					b.setText("显示图片");
				}else {
					l.setVisible(true);
					b.setText("隐藏图片");
				}
			}
		});
		
		
		f.add(b); //把按钮加入到主窗体
		f.add(l); //把标签加入到主窗体
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体的时候，退出程序
		f.setVisible(true);//让窗体变得可见

	}

}
