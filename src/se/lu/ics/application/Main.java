package se.lu.ics.application;
import java.time.LocalDate;

import se.lu.ics.model.Affiliation;
import se.lu.ics.model.Department;
import se.lu.ics.model.Employee;
// Main.java
public class Main {

	public static void main(String[] args) {
		Department department1 = new Department("Informatics", 400000);
		Department department2 = new Department("Economics", 250000);
		Employee employee1 = new Employee("E1", "Gary Stu", 50000);
		Employee employee2 = new Employee("E2", "Mary Sue", 65000);
		
		LocalDate startDate1 = LocalDate.of(2022, 11, 15);
		Affiliation affiliation1 = new Affiliation(startDate1, employee1, department1);
		employee1.addAffiliation(affiliation1);
		department1.addAffiliation(affiliation1);
		
		LocalDate startDate2 = LocalDate.of(2022, 11, 16);
		Affiliation affiliation2 = new Affiliation(startDate2, employee2, department1);
		employee2.addAffiliation(affiliation2);
		department1.addAffiliation(affiliation2);
		
		System.out.println("Informatics affiliated employees: ");
		for(Affiliation affiliation : department1.getEmployeeAffiliations()) {
			LocalDate startDate = affiliation.getDate();
			Employee tmpEmployee = affiliation.getEmployee();
			String employeeName = tmpEmployee.getName();
			String output = employeeName + " has been affiliated since " + startDate;
			System.out.println(output);
		}
	}
}
