package com.nadhem.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	private String passwordUser;
	private String firstNameUser;
	private String lastNameUser;
	private String emailUser;

	public User() {
		super();
	}

	public User(Long idUser, String passwordUser, String firstNameUser, String lastNameUser,
			String emailUser) {
		super();
		this.idUser = idUser;
		this.passwordUser = passwordUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.emailUser = emailUser;
	}

	public Long getidUser() {
		return idUser;
	}

	public void setidUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getpasswordUser() {
		return passwordUser;
	}

	public void setpasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getfirstNameUser() {
		return firstNameUser;
	}

	public void setfirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getlastNameUser() {
		return lastNameUser;
	}

	public void setlastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public String getemailUser() {
		return emailUser;
	}

	public void setemailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", passwordUser=" + passwordUser
				+ ", firstNameUser=" + firstNameUser + ", lastNameUser=" + lastNameUser
				+ ", emailUser=" + emailUser + "]";
	}

}
