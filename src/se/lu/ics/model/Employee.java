package se.lu.ics.model;

import java.util.ArrayList;

// Employee.java
public class Employee {
	private String employeeId;
	private String name;
	private int salary;
	private Department responsible;
	private Department safetyOfficerFor;
	private ArrayList<Department> workDepartments;
	private ArrayList<Affiliation> affiliations;
	
	public Employee(String employeeId, String name, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.workDepartments = new ArrayList<Department>();
		this.affiliations = new ArrayList<Affiliation>();
	}
	
	public void addAffiliation(Affiliation affiliation) {
		affiliations.add(affiliation);
	}
	
	public void removeAffiliation(Affiliation affiliation) {
		affiliations.remove(affiliation);
	}
	
	public ArrayList<Affiliation> getAffiliations() {
		return affiliations;
	}

	public void addWorkDepartment(Department department) {
		workDepartments.add(department);
	}
	
	public void removeWorkDepartment(Department department) {
		workDepartments.remove(department);
	}
	
	public Department findWorkingDepartment(String name) {
		for(Department department : workDepartments) {
			if(department.getName().equals(name)) {
				return department;
			}
		}
		return null;
	}
	
	public ArrayList<Department> getWorkDepartments() {
		return workDepartments;
	}

	public Department getResponsible() {
		return responsible;
	}

	public void setResponsible(Department responsible) {
		this.responsible = responsible;
	}
	
	public Department getSafetyOfficerFor() {
		return safetyOfficerFor;
	}

	public void setSafetyOfficerFor(Department safetyOfficerFor) {
		this.safetyOfficerFor = safetyOfficerFor;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}





}
