package org.sha2001.hr.domain;

import lombok.Getter;
import lombok.Setter;
import org.sha2001.common.domain.IdentifiedObject;

@Getter
@Setter
public class Employee extends IdentifiedObject {

	
	private String fullname;
	private Boolean active;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
}
