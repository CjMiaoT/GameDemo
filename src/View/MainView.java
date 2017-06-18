package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Code.Modle.NameId;

public class MainView extends JFrame {
	public NameId loginUserInfo;//��½�˺�
	static final int WIDTH=800;
	static final int HIGTH=600;

	
	public MainView(NameId loginUserInfo){
		//���������
		setSize(WIDTH, HIGTH);
		setResizable(false);
		//���ñ���
		setTitle("��ӭ"+loginUserInfo.getId()+"���붯�����Ҷ����磡");
		setSize(WIDTH,HIGTH);
		//����ҳ�������ʾλ��
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSiz = kit.getScreenSize();
		int width = screenSiz.width;
		int heigth = screenSiz.height;
		int x = (width - WIDTH) / 2;
		int y = (heigth - HIGTH) / 2;
		setLocation(x, y);
		//���������������������������
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, WIDTH, HIGTH);
		add(panel);
		//���ð�ť������
		JButton one1=new JButton("����������");
		one1.setOpaque(false);
		JButton one2=new JButton("����������");
		one2.setOpaque(false);
		JButton one3=new JButton("����������");
		one3.setOpaque(false);
		JButton one4=new JButton("����������");
		one4.setOpaque(false);
		//�ҵ�ͼƬ·��������
		Icon ic=new ImageIcon("C:\\Users\\lenovo\\Desktop\\����\\����.jpg");
		JLabel jl=new JLabel();
		jl.setIcon(ic);
		jl.setBounds(0, 0, WIDTH, HIGTH);
		//���ý���
		one1.setBounds(325, 375, 140, 25);
		one2.setBounds(325, 409, 140, 25);
		one3.setBounds(325, 443, 140, 25);
		one4.setBounds(325, 477, 140, 25);
		
		
		panel.add(jl);
		panel.add(one1);
		panel.add(one2);
		panel.add(one3);
		panel.add(one4);
		//��ʼս����ť�����¼�
		one1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				fightView InfoUser=new fightView();
				InfoUser.loginInfo=loginUserInfo;
			}
		});
		//��ɫ��������¼�
		one2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RoleManage rm=new RoleManage();
				rm.loginInfo=loginUserInfo;
			}
		});
		//�˳���ť�����¼�
		one4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				firstView first=new firstView();
				first.Login();
			}
		});
		//�رյ�ǰҳ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
