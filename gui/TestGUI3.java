package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI3 {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //主窗体
		f.setSize(800,600);//主窗体设置大小
		f.setLocationRelativeTo(null);//主窗体设置位置
		f.setLayout(null); //主窗体中的组件设置为绝对定位
		
		
		final JLabel l =new JLabel();
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(375,275,i.getIconWidth(),i.getIconHeight());
		
		f.add(l); //把标签加入到主窗体
		
		l.addMouseListener(new MouseAdapter() {
            // 鼠标进入  使用适配器 只需要重写用到的方法 没有用到就不用写
            public void mouseEntered(MouseEvent e) {
  
                Random r = new Random();
  
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
  
                l.setLocation(x, y); 
            }
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体的时候，退出程序
		f.setVisible(true);//让窗体变得可见

	}

}
