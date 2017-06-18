package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Code.CallInformation;
import Code.Modle.NameId;
import Code.Modle.OnePiecePerson;

public class fightView extends JFrame {

	public NameId loginInfo;// ��½�˺�
	public List<OnePiecePerson> rolInfo;// ��ɫ
	static final int WIDTH = 800;
	static final int HIGTH = 600;
	String str = "";
	String ste = "";

	public fightView() {
		//���ö�������
		setSize(WIDTH, HIGTH);
		setResizable(false);
		//���ñ���
		setTitle("��ʼ��Ϸ");
		setSize(WIDTH, HIGTH);
		// ����ҳ�������ʾλ�ã��̶���ʽ��
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSiz = kit.getScreenSize();
		int width = screenSiz.width;
		int heigth = screenSiz.height;
		int x = (width - WIDTH) / 2;
		int y = (heigth - HIGTH) / 2;
		setLocation(x, y);
		//������������
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, WIDTH, HIGTH);
		//�����ı���ʾ����
		JTextArea field = new JTextArea();
		field.setBounds(180, 0, 400, 200);
		field.setOpaque(false);
		field.setBorder(null);
		JTextArea field2 = new JTextArea();
		field2.setBounds(180, 285, 400, 200);
		field2.setOpaque(false);
		field2.setBorder(null);

		add(panel);
		//���ð�ť
		JButton choose1 = new JButton("��ʼս��");
		JButton choose2 = new JButton("��������");
		JButton refresh = new JButton("ˢ������");
		//��ʼս����ť�����¼�
		choose1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				rolInfo = new CallInformation().getRole();
				boolean die = false;
				int index = (int) (1 + Math.random() * loginInfo.getRole().size());
				int index1 = (int) (1 + Math.random() * rolInfo.size());
				int blood = (int) (20 + Math.random() * 40);
				int blood1 = (int) (20 + Math.random() * 40);
				int nameBlood = loginInfo.getRole().get(index).getBlood();
				int nameBlood1 = rolInfo.get(index1).getBlood();
				do {
					ste += loginInfo.getRole().get(index).getName() + "��" + rolInfo.get(index1).getName()
							+ "�����" + blood + "���˺�\n";
					nameBlood = nameBlood - blood;
					ste += rolInfo.get(index1).getName() + "��" + loginInfo.getRole().get(index).getName()
							+ "�����" + blood1 + "���˺�\n";
					nameBlood1 = nameBlood1 - blood;
					if (nameBlood <= 0) {
						ste += "��Ķ���go die�ˣ�";
						die = false;
					} else if (nameBlood1 <= 0) {
						ste += "�� go die�ˣ�";
						die = false;
					} else {
						die = true;
					}
				} while (die);
				field2.setText(ste);
				ste = null;
			}
		});
		//������һ������¼�
		choose2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainView mv = new MainView(loginInfo);
			}
		});
		//ˢ���б�����¼�
		refresh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (loginInfo.getRole().size() == 0) {
					str = "kong";
				} else {
					for (int i = 0; i < loginInfo.getRole().size(); i++) {
						str += loginInfo.getRole().get(i).getName() + "\n";
					}
				}
				field.setText(str);
			}
		});

		choose1.setBounds(180, 250, 100, 25);
		choose2.setBounds(300, 250, 100, 25);
		refresh.setBounds(420, 250, 100, 25);

		panel.add(field);
		panel.add(field2);
		panel.add(choose1);
		panel.add(choose2);
		panel.add(refresh);

		setVisible(true);
	}

}
