package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class IdentifiedObject {


	private UUID uuid;
	private Date createdDate;
	private Date modifiedDate;
	private Date deletedDate;
	
	public IdentifiedObject() {
		uuid = UUID.randomUUID();
		createdDate = new Date();
	}

}
