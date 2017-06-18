package Code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Code.Modle.NameId;
import Code.Modle.OnePiecePerson;

public class CallInformation {

	/**
	 * �û����·��
	 */
	final String userInfoPath = "/Code/Data/userInfo.txt";
	/**
	 * ��ɫ���·��
	 */
	final String OnePiecePersonPath = "/Code/Data/OnePiecePerson.txt";

	/**
	 * �����û���Ϣ��¼��txt
	 */
	public void OutPutRole() {
		ObjectOutputStream oop = null;
		try {
			String site = CallInformation.class.getResource(OnePiecePersonPath).getFile();
			File file = new File(site);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			List<OnePiecePerson> role = new ArrayList<OnePiecePerson>();
			role.add(new OnePiecePerson("SSS��", "���桤D��·��", 100, "��Ƥ��", "��ñ������", "����", "�𽺹�ʵ"));
			role.add(new OnePiecePerson("SSS��", "����ŵ�ǡ���¡", 100, "·��", "��ñ������", "��ʿ", "����������"));
			role.add(new OnePiecePerson("SSS��", "��˹���ء�D����˹", 100, "������֮��", "�׺��Ӻ�����", "�����Ӷӳ�", "���չ�ʵ"));
			role.add(new OnePiecePerson("SSS��", "����һ��", 100, "����֮��", "����", "�s��ͥ����Ա", "ն��"));
			role.add(new OnePiecePerson("SSS��", "��Ⱦ���ҽ�", 100, "����֮��", "�s��ͥ", "�巬�Ӷӳ�", "����ˮ��"));
			role.add(new OnePiecePerson("SSS��", "�ڶ������������", 100, "����", "��Ȧ", "ʮ��֮��", "�����ħ�����ι��У�"));
			role.add(new OnePiecePerson("SSS��", "��������", 100, "��β����", "��֮��", "����", "��֮�ܾ�"));
			role.add(new OnePiecePerson("SSS��", "���ǲ�������", 100, "������ת��", "��֮��", "����", "д����"));
			role.add(new OnePiecePerson("SSS��", "������", 100, "����", "��֮��", "��Ӣ����", "Ѫ���޽�"));
			role.add(new OnePiecePerson("SS��", "����", 100, "С��è", "��ñ������", "����ʿ", "����"));
			role.add(new OnePiecePerson("SS��", "�㼪ʿ", 100, "ɱ�ּ���", "��ñ������", "����", "����"));
			role.add(new OnePiecePerson("SS��", "��ƽ", 100, "����", "̫��������", "ԭ���亣", "������"));
			role.add(new OnePiecePerson("SS��", "�ݿɡ��ޱ�", 100, "��ħ֮��", "��ñ������", "��ʷѧ��", "������ʵ"));
			role.add(new OnePiecePerson("SS��", "��ľ¶����", 100, "��ľ��Ů", "�s��ͥ", "ʮ�����Ӹ��ӳ�", "���ѩ"));
			role.add(new OnePiecePerson("SS��", "������", 100, "��", "�s��ͥ", "�����Ӷӳ�", "��ǹ"));
			role.add(new OnePiecePerson("SS��", "��ľ����", 100, "ս������", "�s��ͥ", "ʮһ���Ӷӳ�", "ǳ���޽⣩"));
			role.add(new OnePiecePerson("SS��", "��ԭϲ��", 100, "��ԭ�̵�", "����", "�곤", "�켧"));
			role.add(new OnePiecePerson("SS��", "�ķ�Ժҹһ", 100, "�ķ�Ժ�ҵڶ�ʮ�����峤", "�s��ͥ", "���ػ����Ӷӳ�", "����"));
			role.add(new OnePiecePerson("SS��", "ɽ��Ԫ�����ع�", 100, "�s��ͥԪ��", "�s��ͥ", "һ���Ӷӳ�", "��������"));
			role.add(new OnePiecePerson("SS��", "��ľ����", 100, "��ľ�ҵڶ�ʮ�˴��峤", "�s��ͥ", "�����Ӷӳ�", "ǧ��ӣ"));
			role.add(new OnePiecePerson("SS��", "ʯ������", 100, "��ȴʦ", "����", "һ������", "�鹭��ȸ"));
			role.add(new OnePiecePerson("SS��", "���̩��", 100, "һ������", "����", "������", "�����ұ�/��ħ���"));
			role.add(new OnePiecePerson("SS��", "����֯��", 100, "һ������", "����", "��֮����", "��˴����"));
			role.add(new OnePiecePerson("SS��", "��Ұ��ӣ", 100, "ҽ������", "��֮��", "����", "�ٺ�֮ӡ"));
			role.add(new OnePiecePerson("SS��", "��������", 100, "�������", "��֮��", "����", "�����ƻ���"));
			role.add(new OnePiecePerson("SS��", "�Ұ���", 100, "ɳ֮�غ�", "ɳ֮��", "����", "��ɰ��"));
			role.add(new OnePiecePerson("SS��", " �����", 100, "��Ѫ", "��֮��", "����", "���Ŷݼ�"));
			role.add(new OnePiecePerson("S��", "�������ᡤ�ǰ�", 100, "ѱ¹", "��ñ������", "��ҽ", "���˹�ʵ"));
			role.add(new OnePiecePerson("S��", " ������", 100, "������", "��ñ������", "����", "����������"));
			role.add(new OnePiecePerson("S��", " ��³��", 100, "�׹�", "��ñ������", "���ּ�", "��Ȫ��ʵ"));
			role.add(new OnePiecePerson("S��", "����Ҳ", 100, "����", "��֮��", "��Ӣ����", "ͨ��֮��"));
			role.add(new OnePiecePerson("S��", "������", 100, "����", "��֮��", "��Ӣ����", "ͨ��֮��"));
			role.add(new OnePiecePerson("S��", "����", 100, "����", "��֮��", "��Ӣ����", "ͨ��֮��"));
			role.add(new OnePiecePerson("S��", "ȸ��������", 100, "����", "�s��ͥ", "һ���Ӹ��ӳ�", "������"));
			role.add(new OnePiecePerson("SS��", "���", 100, "��ҵھŴ�����", "�s��ͥ", "�����Ӷӳ�", "ȸ��"));
			role.add(new OnePiecePerson("S��", "��ǰ��ϣǧ��", 100, "�Ի�", "�s��ͥ", "���ӷ����ӳ�", "����ͷ"));
			role.add(new OnePiecePerson("A��", "�������Q", 100, "Զ����", "�s��ͥ", "���ӷ����ӳ�", "����"));
			role.add(new OnePiecePerson("SS��", "î֮����", 100, "Ů������Э�����³�", "�s��ͥ", "�ķ��Ӷӳ�", "���~����ˮ���£�"));
			role.add(new OnePiecePerson("S��", "��������", 100, "Ů������Э������", "�s��ͥ", "�ķ��Ӹ��ӳ�", "����"));
			role.add(new OnePiecePerson("A��", "��ɭ��", 100, "����", "�s��ͥ", "�巬�Ӹ��ӳ�", "��÷"));
			role.add(new OnePiecePerson("SS��", "��������", 100, "����", "�s��ͥ", "�߷��Ӷӳ�", "��Ǵ"));
			role.add(new OnePiecePerson("A��", "���������䳡", 100, "Т��", "�s��ͥ", "�߷��Ӹ��ӳ�", "����"));
			role.add(new OnePiecePerson("SS��", "���ִ�ˮ", 100, "��������", "�s��ͥ", "�˷��Ӷӳ�", "������"));
			role.add(new OnePiecePerson("A��", "��������", 100, "ѧ��Ů", "�s��ͥ", "�˷��Ӹ��ӳ�", "����"));
			role.add(new OnePiecePerson("SS��", "����Ҫ", 100, "Ϲ��", "�s��ͥ", "�ŷ��Ӷӳ�", "���-��ħ��"));
			role.add(new OnePiecePerson("S��", "����ľ�ޱ�", 100, "����", "�s��ͥ", "�ŷ��Ӹ��ӳ�", "����"));
			role.add(new OnePiecePerson("SSS��", "�շ��ȶ�ʨ��", 100, "С��", "�s��ͥ", "ʮ���Ӷӳ�", "�����������"));
			role.add(new OnePiecePerson("A��", "�ɱ��Ҿ�", 100, "����", "�s��ͥ", "ʮ���Ӹ��ӳ�", "��è"));
			role.add(new OnePiecePerson("SS��", "��¹��ǧ��", 100, "��ͥʮ������ǿ�ĸ��ӳ�", "�s��ͥ", "ʮһ���Ӹ��ӳ�", "��δ�ε�"));
			role.add(new OnePiecePerson("SS��", "������", 100, "��ѧ����", "�s��ͥ", "ʮ�����Ӷӳ�", "��ɱ�ز�"));
			role.add(new OnePiecePerson("A��", "������", 100, "������", "�s��ͥ", "ʮ�����Ӹ��ӳ�", "���"));
			role.add(new OnePiecePerson("SS��", "����ʮ����", 100, "����", "�s��ͥ", "ʮ�����Ӷӳ�", "˫����"));
			role.add(new OnePiecePerson("S��", "��Ŀһ��", 100, "ս������", "�s��ͥ", "ʮһ���ӵ���ϯ", "���ƹ����"));
			role.add(new OnePiecePerson("A��", "���������", 100, "����", "�s��ͥ", "ʮһ���ӵ���ϯ", "������ȸ"));
			role.add(new OnePiecePerson("B��", "ɽ�ﻨ̫��", 100, "��С", "�s��ͥ", "�ϼ��Ȼ���೤", "���"));
			role.add(new OnePiecePerson("S��", "����̩��ʷ����", 100, "�¶�", "��Ȧ", "ʮ��֮һ", "Ⱥ��"));
			role.add(new OnePiecePerson("S��", "���ոڡ�³��ɭ��", 100, "˥��", "��Ȧ", "ʮ��֮��", "���ô��"));
			role.add(new OnePiecePerson("A��", "���š���������", 100, "����", "��Ȧ", "ʮ��֮��", "���޺�"));
			role.add(new OnePiecePerson("A��", "ŵ��������������", 100, "����", "��Ȧ", "ʮ��֮��", "ʥ�����"));
			role.add(new OnePiecePerson("SS��", "����ķ�ǡ��ֿ��ܿ�", 100, "�ƻ�", "��Ȧ", "ʮ��֮��", "����"));
			role.add(new OnePiecePerson("S��", "����", 100, "��ŭ", "��Ȧ", "ʮ��֮��", "����"));
			role.add(new OnePiecePerson("SS��", "�����", 100, "������", "", "", ""));
			role.add(new OnePiecePerson("", "", 100, "", "", "", ""));
			role.add(new OnePiecePerson("", "", 100, "", "", "", ""));
			role.add(new OnePiecePerson("", "", 100, "", "", "", ""));
			role.add(new OnePiecePerson("", "", 100, "", "", "", ""));
			role.add(new OnePiecePerson("A��", "������", 100, "��ԭ�̵�", "����", "��Ա", "����֮ȭ"));
			role.add(new OnePiecePerson("A��", "����⟔�", 100, "��ԭ�̵�", "����", "��Ա", "����99"));
			role.add(new OnePiecePerson("B��", "С����̫��", 100, "��ɤ��", "����", "��͢ʮ����ʮ�����ӵ���ϯ", "��"));
			role.add(new OnePiecePerson("B��", "����⟔�", 100, "��ԭ�̵�", "����", "��Ա", "����99"));
			// ʵ����������
			oop = new ObjectOutputStream(new FileOutputStream(file));
			// ���л�д��
			oop.writeObject(role);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oop.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

	public void OutPutUesr() {
		ObjectOutputStream oop = null;
		try {
			String site = CallInformation.class.getResource(userInfoPath).getFile();
			File file = new File(site);
			if (!file.exists()) {
				file.createNewFile();
			}
			List<NameId> uesrName = new ArrayList<NameId>();
			oop = new ObjectOutputStream(new FileOutputStream(file));
			List<OnePiecePerson> role = new ArrayList<OnePiecePerson>();

			role.add(new OnePiecePerson("SSS��", "����ŵ�ǡ���¡", 100, "·��", "��ñ������", "��ʿ", "����������"));
			role.add(new OnePiecePerson("SS��", "��ľ����", 100, "ս������", "�s��ͥ", "ʮһ���Ӷӳ�", "ǳ���޽⣩"));

			uesrName.add(new NameId("����ǿ", "hage", "����", role));

			oop.writeObject(uesrName);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oop.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

	/**
	 * ��txt��ȡ��ɫ
	 */
	public List<OnePiecePerson> getRole() {
		ObjectInputStream oos = null;
		List<OnePiecePerson> role = null;
		try {
			oos = new ObjectInputStream(
					new FileInputStream(CallInformation.class.getResource(OnePiecePersonPath).getFile()));
			// �����л���ǿ��ת��
			role = (List<OnePiecePerson>) oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return role;

	}

	/**
	 * ��txt��ȡ�û���Ϣ
	 */
	public List<NameId> getName() {
		ObjectInputStream oos = null;
		List<NameId> uesr = null;

		try {
			oos = new ObjectInputStream(new FileInputStream(CallInformation.class.getResource(userInfoPath).getFile()));
			// �����л���ǿ��ת��
			uesr = (List<NameId>) oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return uesr;
	}

	/**
	 * �޸Ľ�ɫ��Ϣ��txt
	 */
	public void setRole(List<OnePiecePerson> role) {
		ObjectOutputStream oop = null;
		try {
			String site = CallInformation.class.getResource(OnePiecePersonPath).getFile();
			File file = new File(site);
			if (!file.exists()) {
				file.createNewFile();
			}
			oop = new ObjectOutputStream(new FileOutputStream(file));
			oop.writeObject(role);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oop != null) {
					oop.close();
				}
			} catch (Exception e2) {
			}
		}
	}

	/**
	 * �޸��û���Ϣ��txt
	 */
	public void setName(List<NameId> uesr) {
		ObjectOutputStream oop = null;
		try {
			String site = CallInformation.class.getResource(userInfoPath).getFile();
			File file = new File(site);
			if (!file.exists()) {
				file.createNewFile();
			}
			oop = new ObjectOutputStream(new FileOutputStream(file));
			oop.writeObject(uesr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oop != null) {
					oop.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		CallInformation test = new CallInformation();
		test.OutPutRole();
		test.OutPutUesr();
	}
}
