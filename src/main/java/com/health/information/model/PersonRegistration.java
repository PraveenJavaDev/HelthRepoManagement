package com.health.information.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

@SuppressWarnings("deprecation")
@Entity
public class PersonRegistration {
	@NotNull
	private String name;
	@Email
	@NotNull
	@Id
	private String email;
	@NotNull
	private String pass;
	@NotNull
	private String re_pass;
	@NotNull
	private String contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRe_pass() {
		return re_pass;
	}

	public void setRe_pass(String re_pass) {
		this.re_pass = re_pass;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "PersonRegistration [name=" + name + ", email=" + email + ", pass=" + pass + ", re_pass=" + re_pass
				+ ", contact=" + contact + "]";
	}

}
