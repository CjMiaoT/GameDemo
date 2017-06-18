package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Code.CallInformation;
import Code.Modle.NameId;
import Code.Modle.OnePiecePerson;

public class RegisterView extends JFrame {
	static final int WIDTH=280;
	static final int HIGTH=230;
	
	public RegisterView(){
		//����ע���ǩ�������������
		setTitle("ע����Ҷ�");
		setSize(WIDTH, HIGTH);
		setResizable(false);
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, WIDTH, HIGTH);
		//������ʾ
		JLabel NameId=new JLabel("�û�����");
		JLabel pwd = new JLabel("�ܡ��룺");
		JLabel secondpwd=new JLabel("ȷ�����룺");
		JLabel campLable=new JLabel("ѡ����Ӫ��");
		
		JLabel vrNameId =new JLabel();
		JLabel vrpwd =new JLabel();
		JLabel vrsecondpwd =new JLabel();
		//���������б�
		JComboBox camp=new JComboBox();
		camp.addItem("��η��");
		camp.addItem("��˽��");
		camp.addItem("��ʵ��");
		camp.addItem("�Ѻ���");
		camp.addItem("��ѧ��");
		//�����ı��������
		JTextField idName = new JTextField();
		JPasswordField idPassword=new JPasswordField();
		JPasswordField idPassword2=new JPasswordField();
		//���ð�ť
		JButton zhuce=new JButton("ע��");
		// ����ҳ�������ʾλ�ã��̶���ʽ��
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width = screenSize.width;
		int heigth = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (heigth - HIGTH) / 2;
		setLocation(x, y);
		
		// ����������panel�������
		NameId.setBounds(25, 20, 80, 30);
		pwd.setBounds(25, 50, 80, 30);
		secondpwd.setBounds(25, 80, 80, 30);
		campLable.setBounds(25, 110, 80, 30);
		
		// ��ʾ��
		vrNameId.setBounds(200, 20, 80, 30);
		vrpwd.setBounds(200, 50, 80, 30);
		vrsecondpwd.setBounds(200, 80, 80, 30);
		// �����
		idName.setBounds(85, 25, 120, 25);
		idPassword.setBounds(85, 55, 120, 25);
		idPassword2.setBounds(85, 85, 120, 25);
		// ��ť
		zhuce.setBounds(100, 160, 80, 20);
		//ѡ����Ӫ
		camp.setBounds(85, 115, 120, 20);

		idName.setColumns(16);
		idPassword.setColumns(16);
		
		panel.add(NameId);
		panel.add(idName);
		panel.add(secondpwd);
		panel.add(vrNameId);
		panel.add(vrpwd);
		panel.add(pwd);
		panel.add(vrsecondpwd);
		panel.add(idPassword);
		panel.add(idPassword2);
		panel.add(zhuce);
		panel.add(campLable);
		panel.add(camp);
		
		panel.setVisible(true);
		setVisible(true);
		//ע�����ʱ��
		zhuce.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				vrNameId.setText("");
				vrpwd.setText("");
				vrsecondpwd.setText("");
				//�ж�ע����Ϣ���������л�
				CallInformation data = new CallInformation();
				List<NameId> userInfo = new ArrayList<NameId>();
				userInfo = data.getName();
				boolean isHave = false;
				
				if(idName.getText().trim().length()==0){
					vrNameId.setText("�������û���");
				}else{
					for(int i=0;i<userInfo.size();i++){
						if(userInfo.get(i).getId().equals(idName.getText())){
							vrNameId.setText("�û�����ռ��");
							isHave = true;
							break;
						}
					}
					if(!isHave){
						vrNameId.setText("");
						String pwd1=new String(idPassword.getPassword());
						String pwd2=new String(idPassword2.getPassword());
						if(pwd1.length()==0){
							vrsecondpwd.setText("����������");
						}else if(!pwd1.endsWith(pwd2)){
							vrsecondpwd.setText("�����������벻һ��");
						}else{
							//�������л�������
							NameId addName = new NameId();
							addName.setId(idName.getText());
							addName.setSec(pwd1);
							addName.setCamp(camp.getSelectedItem().toString());
							//���û���ʼ��ɫ���
							List<OnePiecePerson> role = new ArrayList<OnePiecePerson>();
							role.add(new OnePiecePerson("SSS��", "��˹���ء�D����˹", 100, "������֮��", "�׺��Ӻ�����", "�����Ӷӳ�", "���չ�ʵ"));
							addName.setRole(role);
							MainView mainLogin = new MainView(addName);
							//������ǰ��¼�û���д�����ݿ�
							userInfo.add(addName);
							data.setName(userInfo);
							setVisible(false);
						}
					}
				}
			}
		});
	}
	
}
