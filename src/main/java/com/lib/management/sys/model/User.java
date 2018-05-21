package com.lib.management.sys.model;

import java.util.Date;
import java.util.List;

public class User extends Entity {

	private String id;
	private String login;
	private String firstName;
	private String lastName;
	private Date createTs;
	private String emailId;

	public User(List<String> idAttNames, List<String> idAttValues, EntityType type) {
		super(idAttNames, idAttValues, type);
		this.id = idAttValues.get(0);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public EntityType getEntityType() {
		return EntityType.User;
	}

}
