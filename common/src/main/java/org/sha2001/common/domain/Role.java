package org.sha2001.common.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema="common")
@Getter
@Setter
public class Role extends IdentifiedObject implements Serializable {
	
	private String role;
	
}
