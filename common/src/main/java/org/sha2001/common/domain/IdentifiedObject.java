package org.sha2001.common.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

abstract public class IdentifiedObject implements Serializable {

	private static final long serialVersionUID = 6784696017292435072L;
	@Id
	@org.hibernate.annotations.Type(type="pg-uuid")
	private UUID id;
	@Column(name="createddate")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date createdDate;
	@Column(name="modifieddate")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date modifiedDate;
	@Column(name="deleteddate")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
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
