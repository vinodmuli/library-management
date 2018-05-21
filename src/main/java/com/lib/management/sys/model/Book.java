package com.lib.management.sys.model;

import java.util.Date;
import java.util.List;

public class Book extends Entity {

	private String id;
	private String title;
	private String author;
	private Date createTs;
	private int quantity;

	public Book(List<String> idAttNames, List<String> idAttValues, EntityType type) {
		super(idAttNames, idAttValues, type);
		this.id = idAttValues.get(0);
	}

	@Override
	public EntityType getEntityType() {
		// TODO Auto-generated method stub
		return EntityType.Book;
	}

	public String getId() {
		return id;
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
