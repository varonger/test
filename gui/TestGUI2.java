package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI2 {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //������
		f.setSize(400,450);//���������ô�С
		f.setLocation(580,200);//����������λ��
		f.setLayout(null); //�������е��������Ϊ���Զ�λ
		
		
		final JLabel l =new JLabel();
		
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		f.addKeyListener(new KeyListener() { //���Ӽ��̼���		
			public void keyReleased(KeyEvent e) {		// ����������
				if(e.getKeyCode()==40) {  //38 ���� �ϼ�
					l.setLocation(l.getX(),l.getY()+10); //ͼƬ�����ƶ�
				}
				
				if(e.getKeyCode()==38) {  //40 ���� �¼�
					l.setLocation(l.getX(),l.getY()-10); //ͼƬ�����ƶ�
				}
				
				if(e.getKeyCode()==37) {  //37 ����  ���
					l.setLocation(l.getX()-10,l.getY()); //ͼƬ�����ƶ�
				}
				
				if(e.getKeyCode()==39) {  //39 ���� �Ҽ�
					l.setLocation(l.getX()+10,l.getY()); //ͼƬ�����ƶ�
				}
		
			}

			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		f.add(l); //�ѱ�ǩ���뵽������
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ����ʱ���˳�����
		f.setVisible(true);//�ô����ÿɼ�

	}

}
