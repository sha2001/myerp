package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
abstract public class IdentifiedObject {

	@Id
	private UUID id;
	private Date createdDate;
	private Date modifiedDate;
	private Date deletedDate;
	
	public IdentifiedObject() {
		id = UUID.randomUUID();
		createdDate = new Date();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IdentifiedObject)) {
			return false;
		}
		IdentifiedObject other = (IdentifiedObject) obj;
		return id.equals(other.id);
	}
}
