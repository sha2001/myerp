package org.sha2001.hr.domain;

import java.util.Date;
import java.util.UUID;

public class IdentifiedObject {

	
	private UUID uuid;
	private Date createdDate;
	private Date modifiedDate;
	private Date deletedDate;
	
	public IdentifiedObject() {
		uuid = UUID.randomUUID();
		createdDate = new Date();
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public UUID getUuid() {
		return uuid;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	

}
