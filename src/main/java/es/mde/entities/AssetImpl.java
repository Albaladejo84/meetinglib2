package es.mde.entities;

import java.util.ArrayList;
import java.util.Collection;

public class AssetImpl implements Asset{


	private String name;
	private String mail;
	private String phone;
	private Collection<Task> taskAble = new ArrayList<Task>();
	
	public AssetImpl() {
	}
	
	public AssetImpl(String name, String mail, String phone) {
		super();
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;	
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String email) {
		this.mail = email;
	}

	@Override
	public boolean isCapableOfTask(TaskImpl task) {
		boolean able = false;
		for (Task taskAbleItem : taskAble) {
			if (taskAbleItem.equals(task)) {
				able = true;
			}
		}
		return able;
	}
	
}
