package com.lib.management.sys.dto;

import java.util.Date;

/*
create table Book(
id varchar(32) not null,
title varchar(32) not null,
author varchar(32) not null,
quantity int,
create_ts timestamp,
Constraint book_pk primary key(id)
);
*/
public class BookDTO {

	private String id;
	private String title;
	private String author;
	private Date createTs;
	private int quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
