package Code.Modle;

import java.io.Serializable;
import java.util.List;

/*
 * 用户ID/帐号
 */
public class NameId implements Serializable{

	String id;// �û���
	String sec="123";//����
	String camp;//��Ӫ
	List<OnePiecePerson> role;// ������ɫ

	public NameId() {

	}

	public NameId(String id, String sec, String camp, List<OnePiecePerson> role) {
		super();
		this.id = id;
		this.sec = sec;
		this.camp = camp;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getCamp() {
		return camp;
	}

	public void setCamp(String camp) {
		this.camp = camp;
	}

	public List<OnePiecePerson> getRole() {
		return role;
	}

	public void setRole(List<OnePiecePerson> role) {
		this.role = role;
	}


}
