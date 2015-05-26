package oop01.encapusle;

public class PayC {
	private String name;
	private int salary; //급여
	public static final double tax=0.1; //세율 0.1  --->상수
	private int taxVal;
	private int income; //실급여 = salary - salary*0.1
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
	public int getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(int taxVal) {
		this.taxVal = salary - (salary*taxVal);
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	
}
