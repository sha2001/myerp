package org.sha2001.hr.web;

import java.util.List;

import org.sha2001.hr.domain.Employee;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class EmployeeController {

	@RequestMapping("/employees")
	List<Employee> getEmployees() {
		return null;
	}

}
