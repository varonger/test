package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI {

	public static void main(String[] args) {
			
		JFrame f = new JFrame("Tiger year happy");  //������
		f.setSize(400,450);//���������ô�С
		f.setLocation(580,200);//����������λ��
		f.setLayout(null); //�������е��������Ϊ���Զ�λ
		
		
		final JLabel l =new JLabel();
		
		ImageIcon i = new ImageIcon("d:/test/123.jpg");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("����ͼƬ");//��ť���
		b.setBounds(150,200,100,30);//ͬʱ���������С��λ��		
		
		b.addActionListener(new ActionListener(){  //����ť���� ����
			public void actionPerformed(ActionEvent e) { //����ť�����ʱ���ͻᴥ��ActionEvent�¼�
				if(l.isVisible()==true) {
					l.setVisible(false);
					b.setText("��ʾͼƬ");
				}else {
					l.setVisible(true);
					b.setText("����ͼƬ");
				}
			}
		});
		
		
		f.add(b); //�Ѱ�ť���뵽������
		f.add(l); //�ѱ�ǩ���뵽������
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ����ʱ���˳�����
		f.setVisible(true);//�ô����ÿɼ�

	}

}
