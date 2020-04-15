package org.nrj.app.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_details")
@Embeddable
public class PersonalDetails {

	@Id
	private Integer id;
	private String name;
	private String phone;
	private String emailId;

	public PersonalDetails() {
	}

	public PersonalDetails(String name, String phone, String emailId) {
		this.name = name;
		this.phone = phone;
		this.emailId = emailId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
