package es.mde.entities;

public class AssetImpl{

	private String name;
	private String mail;
	private String phone;
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AssetImpl() {
	}
	
	public AssetImpl(String name, String mail, String phone, String description) {
		super();
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.description = description;
	
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


}
