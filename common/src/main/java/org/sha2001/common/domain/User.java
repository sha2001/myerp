package org.sha2001.common.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.util.comparator.InvertibleComparator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "userinfo", schema = "common")
@Getter
@Setter
public class User extends IdentifiedObject implements Serializable {

	String username;
	String password;
	Boolean active;
	Date lastLogin;
	Date activeFrom;
	Date activeTo;
	@OneToMany
	@JoinTable(name = "userrole", schema="common", joinColumns = {
		@JoinColumn(name = "userid", referencedColumnName = "id") }, inverseJoinColumns = {
		@JoinColumn(name = "roleid", referencedColumnName = "id", unique = true) })
	List<Role> roles;

}
