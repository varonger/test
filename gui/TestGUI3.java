package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI3 {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //������
		f.setSize(800,600);//���������ô�С
		f.setLocationRelativeTo(null);//����������λ��
		f.setLayout(null); //�������е��������Ϊ���Զ�λ
		
		
		final JLabel l =new JLabel();
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(375,275,i.getIconWidth(),i.getIconHeight());
		
		f.add(l); //�ѱ�ǩ���뵽������
		
		l.addMouseListener(new MouseAdapter() {
            // ������  ʹ�������� ֻ��Ҫ��д�õ��ķ��� û���õ��Ͳ���д
            public void mouseEntered(MouseEvent e) {
  
                Random r = new Random();
  
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
  
                l.setLocation(x, y); 
            }
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ����ʱ���˳�����
		f.setVisible(true);//�ô����ÿɼ�

	}

}
