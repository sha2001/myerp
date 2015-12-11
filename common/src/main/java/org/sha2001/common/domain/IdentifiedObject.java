package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
abstract public class IdentifiedObject implements Serializable {

	@Id
	@org.hibernate.annotations.Type(type="pg-uuid")
	private UUID id;
	@Column(name="createddate")
	private Date createdDate;
	@Column(name="modifieddate")
	private Date modifiedDate;
	@Column(name="deleteddate")
	private Date deletedDate;
	
	public IdentifiedObject() {
		id = UUID.randomUUID();
		createdDate = new Date();
		modifiedDate = new Date();
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
