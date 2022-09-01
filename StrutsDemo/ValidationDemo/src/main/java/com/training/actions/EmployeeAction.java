package com.training.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.training.model.Employee;

public class EmployeeAction  extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		if(employee.getName().equals("akash"))
			return SUCCESS;
		return ERROR;
	}

	/*
	 * @Override public void validate() { if(employee.getName().length()<=0)
	 * addFieldError("employee.name","Name is required"); if(employee.getAge()<20 ||
	 * employee.getAge()>70)
	 * addFieldError("employee.age","age should be between 21 and 70");
	 * 
	 * if(employee.getCity().length()<=0)
	 * addFieldError("employee.city","city is required");
	 * 
	 * if(employee.getSalary()<=0)
	 * addFieldError("employee.salary","salary should be greater than zero");
	 * 
	 * 
	 * if(employee.getEmail().length()<=0)
	 * addFieldError("employee.email","email is required");
	 * 
	 * if(!employee.getEmail().contains("@"))
	 * addFieldError("employee.email","email is not valid");
	 * 
	 * 
	 * super.validate(); }
	 * 
	 * 
	 */
	
	
	
	 

}
