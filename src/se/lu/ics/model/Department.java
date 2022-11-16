package se.lu.ics.model;

import java.util.ArrayList;

// Department.java
public class Department {
	private String name;
	private int budget;
	private Employee responsible;
	private ArrayList<Employee> safetyOfficers;
	private ArrayList<Employee> workingEmployees;
	private ArrayList<Affiliation> employeeAffiliations;
	
	public Department(String name, int budget) {
		this.name = name;
		this.budget = budget;
		this.safetyOfficers = new ArrayList<Employee>();
		this.workingEmployees = new ArrayList<Employee>();
		this.employeeAffiliations = new ArrayList<Affiliation>();
	}
	
	public void addAffiliation(Affiliation affiliation) {
		employeeAffiliations.add(affiliation);
	}
	
	public void removeAffiliation(Affiliation affiliation) {
		employeeAffiliations.remove(affiliation);
	}
	
	public ArrayList<Affiliation> getEmployeeAffiliations() {
		return employeeAffiliations;
	}
	
	public Employee findSafetyOfficer(String employeeId) {
		for(Employee safetyOfficer : safetyOfficers) {
			if(safetyOfficer.getEmployeeId().equals(employeeId)) {
				return safetyOfficer;
			}
		}
		
		return null;
	}
	
	public void addWorkingEmployee(Employee employee) {
		this.workingEmployees.add(employee);
	}
	
	public void removeWorkingEmployee(Employee employee) {
		workingEmployees.remove(employee);
	}
	
	public Employee findWorkingEmployee(String employeeId) {
		for(Employee employee : workingEmployees) {
			if(employee.getEmployeeId().equals(employeeId)) {
				return employee;
			}
		}
		
		return null;
	}
	
	public ArrayList<Employee> getWorkingEmployees() {
		return workingEmployees;
	}

	public void addSafetyOfficer(Employee safetyOfficer) {
		this.safetyOfficers.add(safetyOfficer);
	}
	
	public void removeSafetyOfficer(Employee safetyOfficer) {
		safetyOfficers.remove(safetyOfficer);
	}
	
	public ArrayList<Employee> getSafetyOfficers() {
		return safetyOfficers;
	}

	public Employee getResponsible() {
		return responsible;
	}

	public void setResponsible(Employee responsible) {
		this.responsible = responsible;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
		
}
