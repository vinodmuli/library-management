/**
 * 
 */
package com.lib.management.sys.model;

import java.util.Date;
import java.util.List;

/**
 * @author vinod
 *
 */
public class IssueBook extends Entity {

	private String id;

	private String userId;

	private String bookId;

	private Date loggedTS;
	private Date submitTS;

	public IssueBook(List<String> idAttNames, List<String> idAttValues, EntityType type) {
		super(idAttNames, idAttValues, type);
		this.id = idAttValues.get(0);
	}

	@Override
	public EntityType getEntityType() {
		return EntityType.IssueBook;
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

	public Date getSubmitTS() {
		return submitTS;
	}

	public void setSubmitTS(Date submitTS) {
		this.submitTS = submitTS;
	}

}
