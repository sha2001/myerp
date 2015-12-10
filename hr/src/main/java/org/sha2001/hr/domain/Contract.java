package org.sha2001.hr.domain;

import lombok.Getter;
import lombok.Setter;
import org.sha2001.common.domain.IdentifiedObject;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
public class Contract extends IdentifiedObject {

	private Date start;
	private Date end;
	private BigDecimal rate;
	
	public Contract() {
		// TODO Auto-generated constructor stub
	}

}
