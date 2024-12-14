package WorkerInheritence;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class Worker {

	private String name;
	private String birthDate;
	private String endDate;
	private double salary;
	private double accountNumber;
	private double accountBalance;
	private boolean notAWorkerAnymore= false;
	
	public int getAge(String birthDate) {
		LocalDate ld = java.time.LocalDate.now();
		String localD = ld.toString();
		String[] yearFormat = localD.split("-");
		int currentYear = Integer.parseInt(yearFormat[0]);
		String[] birthFormat = birthDate.split("-");
		int birthYear = Integer.parseInt(birthFormat[0]);
		return currentYear - birthYear;
	}
	public void collectPay() {
		 if (notAWorkerAnymore = false) {
			return;
		}
		 LocalDate today = LocalDate.now();
		 LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
		 String lastMonth = lastDayOfMonth.toString();
		 String[] monthFormat = lastMonth.split("-");
		 int currentMonth = Integer.parseInt(monthFormat[1]);
		 int currentYear = Integer.parseInt(monthFormat[0]);
		 
		 String[] endDateMonth = endDate.split("-");
		 int endDateMonthAsInt = Integer.parseInt(endDateMonth[1]);
		 int endDateYearAsInt = Integer.parseInt(endDateMonth[0]);
		 if(today.equals(lastDayOfMonth) && (currentMonth != endDateMonthAsInt && endDateYearAsInt != currentYear ) ) {
			 accountBalance += salary;
			 
		 }
	}
	public String terminate() {
		LocalDate today = LocalDate.now();
		String todayDate = today.toString();
		if(todayDate.equals(endDate)) {
			notAWorkerAnymore = true;
		}
		return "Workers time ended, contract terminated";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public Worker(String name, String birthDate, String endDate, double salary, double accountNumber) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
		this.salary = salary;
		this.accountNumber = accountNumber;
	}
	
	 
	
}
