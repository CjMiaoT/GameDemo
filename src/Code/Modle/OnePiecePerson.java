package Code.Modle;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @全局变量
 */
public class OnePiecePerson implements Serializable{

	String lever;
	String name;// ����
	int blood = 100;// Ѫ��
	String sex;// �Ա�
	String camp;// ��Ӫ
	String job;// ְ��
	String skill;// ����


	/*
	 * ���췽��
	 */
	public OnePiecePerson() {
	}

	/*
	 * ���캯��
	 */
	public OnePiecePerson(String lever,String name, int blood, String sex, String camp, String job, String skill) {
		super();
		this.lever=lever;
		this.name = name;
		this.blood = blood;
		this.sex = sex;
		this.camp = camp;
		this.job = job;
		this.skill = skill;
	}

	public String getLever() {
		return lever;
	}

	public void setLever(String lever) {
		this.lever = lever;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCamp() {
		return camp;
	}

	public void setCamp(String camp) {
		this.camp = camp;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}


}
