package WorkerInheritence;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SalariedEmployee extends Employee{
	private double annualSalary;
	private boolean isRetired = false;
	public SalariedEmployee(String name, String birthDate, String endDate, double salary, double accountNumber,
			long employeeId, String hireDate,double annualSalary,boolean isRetired) {
		super(name, birthDate, endDate, salary, accountNumber, employeeId, hireDate);
		this.isRetired= isRetired;
		this.annualSalary = annualSalary;
		// TODO Auto-generated constructor stub
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public boolean isRetired() {
		int age = SalariedEmployee.super.getAge(getBirthDate());
		if(age >60) {
			isRetired = true;
			return isRetired;
		}else {
			return isRetired;
		}
	}

	
}
