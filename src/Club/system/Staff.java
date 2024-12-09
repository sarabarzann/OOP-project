
package Club.system;

import java.time.LocalDate;


public abstract class Staff extends Member {
	private LocalDate hireDate;
	private double salary;
	
	
	public Staff(int memberId, String name, String mobileNo, String nationality, String gender, double salary, LocalDate hireDate) {
		
		super(memberId, name, mobileNo, nationality, gender);
		this.setHiredate(hireDate);
		this.setSalary(salary);
	}
	
	public LocalDate getHiredate() {
		return hireDate;
	}

	
	public void setHiredate(LocalDate hiredate) {
		this.hireDate = hiredate;
	}

	
	public double getSalary() {
		return salary;
	}

	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return String.format("\n%-15sStaff hire date: %-15s", super.toString(), hireDate) ;
	}

	
	
	
	

	
}
