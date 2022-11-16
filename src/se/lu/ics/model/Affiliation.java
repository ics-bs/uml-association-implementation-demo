package se.lu.ics.model;

import java.time.LocalDate;
// Affiliation.java
public class Affiliation {
	private LocalDate date;
	private Employee employee;
	private Department department;
	
	public Affiliation(LocalDate date, Employee employee, Department department) {
		this.date = date;
		this.employee = employee;
		this.department = department;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
