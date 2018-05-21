package com.lib.management.sys.dto;

import java.util.Date;

/*
create table issue_book(
usr_id varchar(32) not null,
book_id varchar(32) not null,
issue_date timestamp,
Constraint issue_book_fk1 foreign key(usr_id) references usr(id),
Constraint issue_book_fk2 foreign key(book_id) references book(id)
);
 */

public class IssueBookDTO {

	private String id;

	private String userId;

	private String bookId;

	private Date loggedTS;
	private Date submitTS;

	public void setId(String id) {
		this.id = id;
	}

	public void setSubmitTS(Date submitTS) {
		this.submitTS = submitTS;
	}

	public Date getSubmitTS() {
		return submitTS;
	}

	public String getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Date getLoggedTS() {
		return loggedTS;
	}

	public void setLoggedTS(Date loggedTS) {
		this.loggedTS = loggedTS;
	}

}
