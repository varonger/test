package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI2 {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //主窗体
		f.setSize(400,450);//主窗体设置大小
		f.setLocation(580,200);//主窗体设置位置
		f.setLayout(null); //主窗体中的组件设置为绝对定位
		
		
		final JLabel l =new JLabel();
		
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		f.addKeyListener(new KeyListener() { //增加键盘监听		
			public void keyReleased(KeyEvent e) {		// 按键被弹起
				if(e.getKeyCode()==40) {  //38 代表按 上键
					l.setLocation(l.getX(),l.getY()+10); //图片向上移动
				}
				
				if(e.getKeyCode()==38) {  //40 代表按 下键
					l.setLocation(l.getX(),l.getY()-10); //图片向下移动
				}
				
				if(e.getKeyCode()==37) {  //37 代表按  左键
					l.setLocation(l.getX()-10,l.getY()); //图片向左移动
				}
				
				if(e.getKeyCode()==39) {  //39 代表按 右键
					l.setLocation(l.getX()+10,l.getY()); //图片向右移动
				}
		
			}

			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		f.add(l); //把标签加入到主窗体
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体的时候，退出程序
		f.setVisible(true);//让窗体变得可见

	}

}
