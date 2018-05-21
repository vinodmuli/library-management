package com.lib.management.sys.dto;

import java.util.Date;

/*
 create table Usr(
id varchar(32) not null,
login varchar(32) not null,
first_name varchar(32) not null,
last_name varchar(32),
email_id varchar(64) not null,
create_ts timestamp,
Constraint usr_pk primary key(id),
Constraint usr_uk1 unique(login),
Constraint usr_uk2 unique(email_id)
);
 */
public class UserDTO {

	private String id;
	private String login;
	private String firstName;
	private String lastName;
	private Date createTs;
	private String emailId;

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

}
